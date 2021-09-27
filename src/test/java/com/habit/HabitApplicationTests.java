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
//        int n = 2;
//        int t = 4;
//        int m = 2;
//        int p = 1;

        //2	4	5	1	"0100"     0 1 1 0 1 1 1 0 0 1 0 1 1 1 0 1 1 1 1 0 0 0 1 0 0 1
//        int n = 2;
//        int t = 4;
//        int m = 5;
//        int p = 2;

        //16	16	2	1	"02468ACE11111111"  // 0 1 2 3 4 5 6 7 8 9 A B C D E F 1 0 1 1 1 2 1 3 1 4 1 5 1 6 1  7/
//        int n = 16;
//        int t = 16;
//        int m = 2;
//        int p = 1;

        //16	16	2	2	"13579BDF01234567" // 0 1 2 3 4 5 6 7 8 9 A B C D E F 1 0 1 1 1 2 1 3 1 4 1 5 1 6 1  7/
        int n = 16;
        int t = 32;
        int m = 2;
        int p = 2;

        //8	16	2	2	"13579BDF01234567" // 0 1 2 3 4 5 6 7 8 9 A B C D E F 1 0 1 1 1 2 1 3 1 4 1 5 1 6 1  7/
        //int n = 8;
        //int t = 16;
        //int m = 2;
        //int p = 2;

        int num = 0;
        int count = 0;
        String result_ = "";
        int limitNumber = t * m - (m-p);
        p = (m==p ? 0 : p);
        while(count < limitNumber){
            String[] split = getNumber(n,num++);
            for(int i=0;i<split.length;i++){
                count++;
                if(count-1 > limitNumber)break;
                if(count%m==p){
                    result_ += split[i];
                }
            }
        }
        System.out.println(result_);

    }

    private String[] getNumber(int jin,int num){
        List<String> array = new ArrayList<>();
        while(num>=jin){
            String mod = Integer.parseInt(num%jin);
            switch(mod){
                case "10":
                    mod="A";
                    break;
                case "11":
                    mod="B";
                    break;
                case "12":
                    mod="C";
                    break;
                case "13":
                    mod="D";
                    break;
                case "14":
                    mod="E";
                    break;
                case "15":
                    mod="F";
                    break;
            }
            array.add(mod);
            num = num/jin;
        }
        String result = "";
        if(num>=10 && num<=15){
            switch(num){
                case 10:
                    result="A";
                    break;
                case 11:
                    result="B";
                    break;
                case 12:
                    result="C";
                    break;
                case 13:
                    result="D";
                    break;
                case 14:
                    result="E";
                    break;
                case 15:
                    result="F";
                    break;
            }
        }else {
            result = String.valueOf(num);
        }
        for(int i=array.size()-1;i>=0;i--){
            result+=array.get(i);
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
