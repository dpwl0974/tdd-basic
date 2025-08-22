package com.II;

public class Calc {
    public static int run(String s) {
        String expr = s.replace(" ",""); //1+1

        for(int i = expr.length() - 1; i >= 0; i--) {
            char c = expr.charAt(i);

            if((c == '+' || c == '-') && i > 0) {
                String left = expr.substring(0, i);
                String right = expr.substring(i+1);
                int leftNum = run(left);
                int rightNum = run(right);

                return c == '+' ? leftNum + rightNum : leftNum - rightNum;
            }
        }
        return Integer.parseInt(expr);
    }
}
