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

    public Boolean inner() {
        String s = "())(";
        if (s.length() % 2 != 0) return false;
        int countLeft = s.replaceAll("\\)", "").length();
        int countRight = s.replaceAll("\\(", "").length();
        if (countLeft != countRight) return false;
        String[] split = s.split("");
        Stack<String> stackList = new Stack<>();
        if (split[0].equals(")"))
            return false;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("(")) {
                stackList.push("opened");
            } else if (split[i].equals(")")) {
                if (stackList.size() >= 1)
                    stackList.pop();
                else
                    return false;
            }
        }
        if (stackList.size() == 0) return true;
        return false;
    }
}
