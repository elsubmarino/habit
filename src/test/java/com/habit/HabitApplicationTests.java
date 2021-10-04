package com.habit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;
import java.util;
class HabitApplicationTests {
    @Test
    public void test() {

        inner();
    }

    public Boolean inner() {
        //"()()"	true
        //String s ="()()";

        //")()(" false
        //String s =")()(";

        //"(())()" true
        String s ="(())()";
        String[]split = s.split("");
        Stack<String>

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
