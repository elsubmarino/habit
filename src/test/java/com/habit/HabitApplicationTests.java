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
        //2	4	2	1	"0111"     0 1 1 0 1 1 1 / 0 0 1 0 1 1 1 0
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;

        //16	16	2	1	"02468ACE11111111"  // 0 1 2 3 4 5 6 7 8 9 A B C D E F 1 0 1 1 1 2 1 3 1 4 1 5 1 6 1  7/
        //16	16	2	2	"13579BDF01234567" // 0 1 2 3 4 5 6 7 8 9 A B C D E F 1 0 1 1 1 2 1 3 1 4 1 5 1 6 1  7/

        int num = 0;
        int count = 0;
        String result_ = "";
        String[]splitedJoined ;
        int limitNumber = t * m - (m-p);
        int whosTurn = 0;
        while(count <= limitNumber){
            String[] split = getNumber(n,num++);
            count += split.length;
        }

    }

    private String[] getNumber(int jin,int num){
        List<Integer> array = new ArrayList<>();
        while(num>=jin){
            num = num/jin;
            int mod = num%jin;
            array.add(mod);
        }
        String result = String.valueOf(num);
        for(int i=array.size()-1;i>=0;i--){
            result+=String.valueOf(array.get(i));
        }
        return result.split("");
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
