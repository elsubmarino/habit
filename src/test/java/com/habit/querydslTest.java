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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class querydslTest {

    @Test
    public void querydsl_기본_테스트() {
        int answer = 0;
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        for(int i=-1;i<sizes.length;i++){
            int[][] sizes_ = new int[sizes.length][sizes[0].length];
            if(i == -1){
                sizes_ = sizes;
            }else{
                sizes_ = change(sizes,i);
            }

            int maxLeft = 0;
            int maxRight = 0;
            for(int j=0;j<sizes_.length;j++){
                System.out.println(sizes_[j][0]+": 0");
                System.out.println(sizes_[j][1]+": 1");
                if(maxLeft < sizes_[j][0]){
                    maxLeft = sizes_[j][0];
                }
                if(maxRight < sizes_[j][1]){
                    maxRight = sizes_[j][1];
                }
            }
            int tempAnswer = maxLeft * maxRight;
            if(i == -1){
                answer = tempAnswer;
            }else{
                if(answer > tempAnswer)
                    answer=tempAnswer;
            }
        }

        System.out.println(answer);
    }

    public int[][] change(int[][]sizes,int num){
        int temp1 = sizes[num][0] ;
        int temp2 = sizes[num][1];

        sizes[num][0]=temp2;
        sizes[num][1]=temp1;
        return sizes;
    }

}
