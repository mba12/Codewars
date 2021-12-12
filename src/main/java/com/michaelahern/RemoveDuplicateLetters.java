package com.michaelahern;

import java.util.Stack;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {

        int[] count = new int[123];
        boolean[] contains = new boolean[123];
        char[] charS = s.toCharArray();

        for(char charValue : charS) {
            count[ charValue ]++;
        }

        Stack<Character> stack = new Stack<>();

        for(char c : charS) {

            count[ c ]--;
            if(stack.empty()) {
                stack.push(c);
                contains[c] = true;
            } else {
                char peek = stack.peek();

                if(!contains[c] && count[c] == 0 && count[ (int) stack.peek()] == 0) {
                    stack.push(c);
                    contains[c] = true;
                } else {
                    while(!stack.empty() && !contains[c] && count[(int) stack.peek()] > 0 && c < stack.peek() ) {
                        if(count[ (int) stack.peek()] != 0) {
                            contains[stack.pop()] = false;
                        }

                    }

                    if(!contains[c]) {
                        stack.push(c);
                        contains[c] = true;
                    }
                }
            }
        }

        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty())
            str.append(stack.pop());

        return str.reverse().toString();
    }
}
