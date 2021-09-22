package com.habit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

class HabitApplicationTests {
    @Test
    public void test() {

        inner();
    }

    public void inner() {
        int n = 78;
        String temp = Integer.toBinaryString(n);
        String.
        String[]tempArray = temp.split("");
        int count = 0;
        for(int i=0;i<tempArray.length;i++){
            if(tempArray[i].equals("1")){
                count++;
            }
        }
        int nextCount = 0;
        while(true){
            n++;
            String temp2 = Integer.toBinaryString(n);

            String[]temp2Array = temp2.split("");
            for(int i=0;i<temp2Array.length;i++){
                if(temp2Array[i].equals("1"))
                    nextCount++;
            }
            if(count == nextCount){
                break;
            }
            nextCount = 0;
        }
        System.out.println(n);
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
