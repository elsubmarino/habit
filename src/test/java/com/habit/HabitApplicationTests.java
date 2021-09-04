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

        //int[][]arr1={{3,1},{-2,4}};
        //int[][]arr2={{2,0},{1,-2}};

        //int[][]arr1={{2,0},{1,-2}};
        //int[][]arr2={{3,1},{-2,4}};

        //int[][] arr1 = {{5, -2}, {3, 1}};
        //int[][] arr2 = {{0, 6, 1}, {3, 5, 2}};
        //[[-6,20,1],[3,23,5]]

        int[][]arr1 = {{3,5},{4,2},{5,7}};
        int[][]arr2= {{3,8,2},{2,4,6}};
        //19 44 36
        //16 40 20
        //29 68 52
        int[][] answer;
        boolean rightGreater = false;
        if (arr1.length > arr2.length) {
            answer = new int[arr1.length][arr1[0].length];
        } else {
            answer = new int[arr2.length][arr2[0].length];
            rightGreater = true;
        }

        for (int i = 0; i < answer.length; i++) {
            for (int k = 0; k < answer[i].length; k++) {
                for (int j = 0; j < arr2.length; j++) {
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        System.out.println(answer);
    }
}
