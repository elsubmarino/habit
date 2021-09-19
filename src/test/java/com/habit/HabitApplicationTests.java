//package com.habit;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//class HabitApplicationTests {
//    @Test
//    public void test() {
//
//        inner();
//    }
//
//    public void inner() {
//        //int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
//        int[][] land = {{50,56,57,60},{100,82,79,60},{1,2,3,4},{4,3,2,1}};
//
//
//        int number = 0;
//        for(int i=0; i< 4;i++){
//            while(number++ < land.length){
//
//            }
//            int[]index = new int[land.length];
//            while(0<index.length){
//
//            }
//
//            for(int j=(i+1)%4;j!=i;j=++j%4){
//                for(int k=(j+1)%4;k!=j;k=++k%4){
//                    int tempMax = land[0][i]+land[1][j]+land[2][k]+land[3][k];
//                    if(tempMax > max){
//                        max = tempMax;
//                    }
//                }
//            }
//
//        }
//        System.out.println(max);
//    }
//
//    public int max(int[]array,int index){
//
//    }
//
//
//
////    for (int i = 0; i < answer.length; i++) {
////        for (int k = 0; k < answer[i].length; k++) {
////            for (int j = 0; j < (arr1.length>arr2.length?arr2.length:arr1.length); j++) {
////                answer[i][k] += arr1[i][j] * arr2[j][k];
////            }
////        }
////    }
//
//
////    int k =0;
////    int z=0;
////    int y=0;
////        for(int i=0;i<arr1.length;i++){
////        for(int j=0;j<arr1[i].length;j++){
////            while(k<arr2[0].length){
////                int l =0;
////                while(l<arr2.length){
////                    answer[y][z]+=arr1[i][j]*arr2[l][k];
////                    l++;
////                }
////                k++;
////                z=0;
////                z++;
////            }
////            y=0;
////        }
////        k=0;
////    }
//}
