package com.habit;

import org.junit.jupiter.api.Test;

import java.security.acl.NotOwnerException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class querydslTest {

    @Test
    public void querydsl_기본_테스트() throws NotOwnerException {
        //String test = "aabbaccc"; //8
        //String test = "ababcdcdababcdcd"; //9
        String test = "abcabcdede"; //8
        //String test = "abcabcabcabcdededededede"; //14
        //String test = "ababcdcdababcdcd"; //17
        int mediumNumber=test.length()/2;
        int maxLength = test.length();
        int leastNum=1;
        int startNum = 0;
        List<String> stringArray = new ArrayList<>();
        for(int i=2;i<mediumNumber;i++) {
            String mixed = "";
            String beforeTemp = null;
            int repeatNumber = 1;
            boolean repeatedBoolean = false;
            for (int j = 0; j < maxLength; j += i) {
                if (j > maxLength) break;
                if (beforeTemp == null) {
                    beforeTemp = test.substring(j, i + j);
                    continue;
                }
                int sum = i + j;
                if (sum > maxLength) sum = maxLength;
                String temp = test.substring(j, sum);
                if (temp.equals("")) break;
                if (temp.equals(beforeTemp)) {
                    repeatedBoolean = true;
                    beforeTemp = temp;
                    repeatNumber++;
                } else if(temp.equals("")){

                } else {
                    if (repeatedBoolean) {
                        mixed += repeatNumber + beforeTemp;
                    } else {
                        if(mixed.equals("")){
                            mixed += beforeTemp+temp;
                        }else{
                            mixed += temp;
                        }
                    }
                    repeatedBoolean = false;
                    beforeTemp = temp;
                    repeatNumber = 1;
                }
            }
            char[] chars = mixed.toCharArray();
            boolean containsDigit = false;
            for (char c : chars) {
                if (Character.isDigit(c)) {
                    containsDigit = true;
                }
            }
            if (!containsDigit && mixed.length() != maxLength) continue;
            stringArray.add(mixed);
        }

        System.out.println(stringArray);
        int cnt = 0;
        if(stringArray.size() == 0){ cnt = maxLength;
        }else {
            cnt = stringArray.stream().min(Comparator.comparing(d -> d.length())).orElseThrow(NotOwnerException::new).length();
        }
        System.out.println("zcvcxvvcxvff");
        System.out.println("하하호호아줌마");
        System.out.println("우리꼬꼬 아줌마");
        System.out.println("develop에서 자격이 있었음");

    }

}
