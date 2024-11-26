package com.habit;

import org.junit.jupiter.api.Test;

public class Super {
    String[] friends;
    int answer;

    @Test
    public void test(){
        int n=  2;
        int n=  3;
        String[] data = {"N~F=0", "R~T>2"};
        answer = 0;
        friends = new String[] { "A", "C", "F"};

        boolean[] isInLine = new boolean[3];
        DFS(data, isInLine, "");
    }

    public void DFS(String[] data, boolean[] isInLine, String inputNames) {
         if (inputNames.length() == 3) {
            if (checkCondition(inputNames, data)) {
                answer++;
            }
            return;
        }
        // 모든 경우의 수 다 구하기
           for (int i = 0; i < isInLine.length; i++) {
               if (!isInLine[i]) {
                isInLine[i] = true;
                String name = inputNames + friends[i];
                DFS(data, isInLine, name);
                isInLine[i] = false;
            }
        }
    }

    public boolean checkCondition(String inputNames, String[] data) {
        boolean flag = true;

        for (String condition : data) {
            int n = inputNames.indexOf(condition.charAt(0));
            int m = inputNames.indexOf(condition.charAt(2));
               if(condition.charAt(3) == '=') {
                if(Math.abs(n - m) != (Character.getNumericValue(condition.charAt(4)) + 1))
                    flag = false;
            }
            else if(condition.charAt(3) == '<') {
                if(Math.abs(n - m) >= (Character.getNumericValue(condition.charAt(4)) + 1))
                    flag = false;
            }
            else if(condition.charAt(3) == '>') {
                if(Math.abs(n - m) <= (Character.getNumericValue(condition.charAt(4)) + 1))
                    flag = false;
            }
        }

        return flag;
    }
}
