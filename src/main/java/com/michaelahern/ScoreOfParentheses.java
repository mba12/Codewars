package com.michaelahern;

import java.util.Stack;

public class ScoreOfParentheses {

    private final String LEFT = "(";
    private final String RIGHT = ")";
    private final String ONE = "1";
    public int scoreOfParentheses(String s) {

        Stack<String> stack = new Stack<>();
        int answer = 0;
        int idx = 0;
        while(idx < s.length()) {
            String x = s.substring(idx, idx + 1);
            switch (x){
                case LEFT:
                    stack.push(x);
                    break;
                case RIGHT:
                    String z = stack.peek();
                    if(z.equals(LEFT)) {
                        stack.pop();
                        stack.push(ONE);
                    } else {
                        stack.push(x);
                    }
            }
            idx++;
        }

        while(!stack.isEmpty()) {

            String x = stack.pop();
            switch (x){
                case LEFT:
                    String y = stack.peek();
                    //if()
                    break;
                case RIGHT:
                    String z = stack.peek();
                    if(z.equals(LEFT)) {
                        stack.pop();
                        stack.push(ONE);
                    } else {
                        stack.push(x);
                    }
            }

        }

        return 0;
    }
}
