package com.habit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@SpringBootTest
class HabitApplicationTests {
//    @Test
//    public void test(){
//        int[]answers={1,3,2,4,2};
//
//        int[]num1={1,2,3,4,5};
//        int[]num2={2,1,2,3,2,4,2,5};
//        int[]num3={3,3,1,1,2,2,4,4,5,5};
//
//        int length= answers.length;
//
//        int[]numCount = new int[3];
//
//        for(int i=0;i<length;i++){
//            if(num1[i%num1.length] == answers[i])
//                numCount[0]++;
//            else if(num2[i%num2.length] == answers[i])
//                numCount[1]++;
//            else if(num3[i%num3.length] == answers[i])
//                numCount[2]++;
//
//        }
//
//        List<Integer> list = new ArrayList<>();
//
//        int maxValue = Arrays.stream(numCount).max().orElse(0);
//        for(int i=0;i<numCount.length;i++){
//            if(numCount[i]==maxValue){
//                list.add(i+1);
//            }
//        }
//
//        Arrays.stream(list)
//
//        list.sort((o1, o2) -> o1.intValue() > o2.intValue() ? o1.intValue():o2.intValue());
//        list.sort(Integer::compareTo);
//
//
//
//    }
}
