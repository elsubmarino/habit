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

        //int[][]arr1 = {{1, 4},{3, 2}, {4, 1}};
        //int[][]arr2 = {{3, 3}, {3, 3}};
        //[[15, 15], [15, 15], [15, 15]]

        //int[][] arr1 = {{3, 1}, {-2, 4}};
        //int[][] arr2 = {{2, 0}, {1, -2}};

        //int[][]arr1={{2,0},{1,-2}};
        //int[][]arr2={{3,1},{-2,4}};
        //

        //int[][]arr1={{-1,1,1},{3,-3,3},{-1,2,1}};
        //int[][]arr2={{-2,3,-3},{0,-1,2},{3,-2,-1}};
        //{{5,-6,4},{3,6,-18},{5,-7,6}}

        int[][]arr1={{2,-3,-3},{-3,-2,0}};
        int[][]arr2={{3,-1},{2,-2},{3,0}};
        //{{-9,4},{-13,7}}

        //int[][] arr1 = {{5, -2}, {3, 1}};
        //int[][] arr2 = {{0, 6, 1}, {3, 5, 2}};
        //[[-6,20,1],[3,23,5]]

        //int[][] arr1 = {{3, 5}, {4, 2}, {5, 7}};
        //int[][] arr2 = {{3, 8, 2}, {2, 4, 6}};
        //19 44 36
        //16 40 20
        //29 68 52
        int[][] answer = new int[arr1.length > arr2.length ? arr1.length : arr2.length]
                [arr1[0].length > arr2[0].length ? arr1[0].length : arr2[0].length];



        int z=0;
        int y=0;
        int x=0;
        int w=0;
        int i=0;
        int k=0;
        while(z<arr1.length){
            while(y<arr1[0].length){
                while(x<arr2[0].length){
                    while(w<arr2.length){
                        answer[i][k]+=arr1[z][y]*arr2[w][x];
                        w++;
                        y++;
                    }
                    w=0;
                    y=0;
                    k++;
                    x++;
                }
                break;
            }
            z++;
            x=0;
            i++;
            k=0;
        }


        System.out.println(answer);
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
