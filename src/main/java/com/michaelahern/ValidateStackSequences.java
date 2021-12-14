package com.michaelahern;

import java.util.Stack;

public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int nextPopIdx = 0;
        Stack<Integer> stack = new Stack<>();

        for(int n : pushed) {

            if (n == popped[nextPopIdx]) {
                nextPopIdx++;
                continue;
            }
            while(!stack.isEmpty() && nextPopIdx < popped.length && stack.peek() == popped[nextPopIdx]) {
                stack.pop();
                nextPopIdx++;
            }
            stack.push(n);
        }

        while(!stack.isEmpty() && nextPopIdx < popped.length && stack.peek() == popped[nextPopIdx]) {
            stack.pop();
            nextPopIdx++;
        }
        return nextPopIdx == popped.length;
    }


}
