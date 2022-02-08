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

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class querydslTest {

    @Test
    public void querydsl_기본_테스트() {
        String test = "ababcdcdababcdcd";
        int mediumNumber=test.length()/2;
        int maxLength = test.length();
        int leastNum=1;
        int startNum = 0;
        String mixed = "";
        for(int i=2;i<=mediumNumber;i++){
            String beforeTemp=null;
            int repeatNumber = 1;
            boolean repeatedBoolean = false;
            for(int j=0;j<maxLength;j+=i){
                if(beforeTemp==null) {
                    beforeTemp = test.substring(j,i+j);
                    continue;
                }
                String temp = test.substring(j,i+j);
                if(temp.equals(beforeTemp)){
                    repeatedBoolean=true;
                    beforeTemp = temp;
                    repeatNumber++;
                }else{
                    if(repeatedBoolean){
                        mixed+=repeatNumber+beforeTemp;
                        mixed+=temp;
                    }else{
                        mixed+=temp;
                    }
                    repeatedBoolean=false;
                    repeatNumber=1;
                }




            }
        }
        System.out.println(mixed);
        System.out.println("zcvcxvvcxv");


    }

}
