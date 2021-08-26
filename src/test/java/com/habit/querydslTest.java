package com.habit;

import com.habit.domain.Login;
import com.habit.repository.LoginRepository;
import com.habit.repository.LoginRepositorySupport;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class querydslTest {

    @Test
    public void querydsl_기본_테스트() {
        String patternString="((([0-9]*D)|([0-9]*S)|([0-9]*T)){1,2}[*?])|((([0-9]*D)|([0-9]*S)|([0-9]*T)){1}[#?])";
        String dartResult="1S*2D*3T*";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(dartResult);
        int sum = 0;
        int count = 0;
        StringBuffer sb = new StringBuffer();
        ArrayList<String> str = new ArrayList<>();
        while(matcher.find()){
            sb.append(matcher.group(0));
            String result = matcher.group(0);
            String patternSubString = "[0-9]*[S|D|T][*|#]?";
            Pattern patternSub = Pattern.compile(patternSubString);
            Matcher matcherSub = patternSub.matcher(result);
            while(matcherSub.find()){
                str.add(matcherSub.group(0));
            }
        }
        Collections.reverse(str);
        Iterator itr = str.iterator();
        int countOfAsterik = 0;
        while(itr.hasNext()){
            String result = (String)itr.next();
            String patternSubString = "[0-9]*[S|D|T]";
            Pattern patternSub = Pattern.compile(patternSubString);
            Matcher matcherSub = patternSub.matcher(result);
            int currentSum = 0;
            int naturalScore = 0;
            while(matcherSub.find()){
                String resultSub = matcherSub.group(0);
                naturalScore = Integer.parseInt(resultSub.substring(0,resultSub.length()-1));
                switch(resultSub.substring(resultSub.length()-1,resultSub.length())){
                    case "S":
                        currentSum += naturalScore;
                        break;
                    case "D":
                        currentSum += naturalScore * naturalScore;
                        break;
                    case "T":
                        currentSum += naturalScore * naturalScore * naturalScore;
                        break;
                }
            }
            if(result.lastIndexOf("#") == -1){
                if(result.lastIndexOf("*") != -1){
                    count++;
                }
                int temp = currentSum * 2;
                if(count > 1) {
                    temp *= 2;
                    count=0;
                }
                sum += temp;

           }else if(result.lastIndexOf("#") != -1){
                if(count>0) {
                    sum += currentSum * -2;
                    count=0;
                }else{
                    sum += currentSum * -1;
                }
            }
        }

        if(sb.length() != 0){
            dartResult = dartResult.replace(sb.toString(),"");
        }

        patternString = "[0-9]*[S|D|T]";
        pattern = Pattern.compile(patternString);
        matcher = pattern.matcher(dartResult);
        while(matcher.find()){
            String resultSub = matcher.group(0);
            int naturalScore = Integer.parseInt(resultSub.substring(0,resultSub.length()-1));
            switch(resultSub.substring(resultSub.length()-1,resultSub.length())){
                case "S":
                    sum += naturalScore;
                    break;
                case "D":
                    sum += naturalScore * naturalScore;
                    break;
                case "T":
                    sum += naturalScore * naturalScore * naturalScore;
                    break;
            }
        }
        System.out.println(sum);
    }

}
