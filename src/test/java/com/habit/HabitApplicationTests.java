package com.habit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class HabitApplicationTests {
    @Test
    public void test() {

        System.out.println(inner());
    }

    public Boolean inner() {
        //"()()"	true
        //String s ="()()";

        //")()(" false
        //String s =")()(";

        //"(())()" true
        //String s ="(())()";

        //"((()()))" true
        //String s = "((()()))";

        String s = "())";
        Pattern pattern = Pattern.compile("\\(");
        Pattern pattern2 = Pattern.compile("\\)");
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()){
            System.out.println(matcher.groupCount());
        }
        if(matcher.find()){
            System.out.println(matcher.groupCount());
        }

        String[]split = s.split("");
        int open = 0;
        int close = 0;
        Stack<String> stackList = new Stack<>();
        if(split[0].equals(")"))
            return false;
        for(int i=0; i <split.length;i++){
            if(split[i].equals("(")){
                //open++;
                stackList.push("opened");
            }else if(split[i].equals(")")) {
                //close++;
                if(stackList.size()>=1)
                    stackList.pop();
                else
                    return false;
            }
        }
//        if(open == close){
//            return true;
//        }else{
//            return false;
//        }
        if(stackList.size()==0) return true;
        return false;

        //"(())()"	true
        //")()("	false
        //"(()("	false

    }

//    for (int i = 0; i < answer.length; i++) {
//        for (int k = 0; k < answer[i].length; k++) {
//            for (int j = 0; j < (arr1.length>arr2.length?arr2.length:arr1.length); j++) {
//                answer[i][k] += arr1[i][j] * arr2[j][k];
//            }
//        }
//    }


//    int k =0;
//    int z=0;
//    int y=0;
//        for(int i=0;i<arr1.length;i++){
//        for(int j=0;j<arr1[i].length;j++){
//            while(k<arr2[0].length){
//                int l =0;
//                while(l<arr2.length){
//                    answer[y][z]+=arr1[i][j]*arr2[l][k];
//                    l++;
//                }
//                k++;
//                z=0;
//                z++;
//            }
//            y=0;
//        }
//        k=0;
//    }
}
