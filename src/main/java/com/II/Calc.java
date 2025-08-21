package com.II;

public class Calc {
    public static int run(String s) {
        String expr = s.replace(" ",""); //1+1

        for(int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if(c == '+' && i > 0) {
                String left = expr.substring(0, i);
                String right = expr.substring(i+1);
                int leftNum = Integer.parseInt(left);
                int rightNum = Integer.parseInt(right);

                return leftNum + rightNum;
            }
        }
        return 0;
    }
}
