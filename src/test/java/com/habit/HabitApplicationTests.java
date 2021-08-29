package com.habit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class HabitApplicationTests {
    @Test
    public void test() {

        inner();
    }

    public void inner() {
        //String s ="3people unFollowed me";
        //"3people Unfollowed Me"

        //String s="for the last week";
        //"For The Last Week"
        //String s="m";
        String s="dASDad  ASDFASFSADF asfdasdfa      ";

        String[]split = s.split("");
        boolean countForFirstCap = true;
        for(int i=0;i<split.length;i++){
            if(split[i].equals(" ")){
                countForFirstCap=true;
                continue;
            }
            if(countForFirstCap){
                split[i]=split[i].toUpperCase();
                countForFirstCap=false;
            }else{
                split[i]=split[i].toLowerCase();
            }
        }
        System.out.println(String.join(" ",split));
    }
}
