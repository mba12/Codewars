package com.michaelahern;

import java.util.Stack;
public class Evaluator {

    public long evaluate(String s) {

        String[] exp = s.split(" ");
        Stack<Long> stack = new Stack<Long>();
        for(String str : exp) {
            if(isNumeric(str)) {
                stack.push(Long.parseLong(str));
            } else {
                if(stack.size() > 1) {
                    long x = stack.pop(); long y = stack.pop();
                    long d = eval(str.charAt(0), x, y);
                    stack.push(d);
                }
            }
        }
        Long r = stack.pop();
        long result = r.longValue();
        return result;
    }

    public static long eval(char operator, long x, long y) {
        long result  = 0l;
        switch(operator) {
            case '*':
                result = x * y;
            break;
            case '/':
                result = y / x;
                break;
            case '-':
                result = y - x;
                break;
            case '+':
                result = x + y;
                break;
            default:
                result = 0l;

        }
        return result;

    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
