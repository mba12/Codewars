package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public List<String> letterCasePermutation(String s) {
        List<String> answer = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(char c : arr) {
            if(Character.isDigit(c)) {
                if(answer.size() == 0) {
                    answer.add(String.valueOf(c));
                } else {
                    List<String> temp = new ArrayList<>();
                    for(String str : answer) {
                        String upper = str + c;
                        temp.add(upper);
                    }
                    answer.clear(); answer.addAll(temp);
                }

            } else if(Character.isLetter(c)) {
                List<String> temp = new ArrayList<>();
                if(answer.size() == 0) {
                    answer.add(String.valueOf(Character.toUpperCase(c)));
                    answer.add(String.valueOf(Character.toLowerCase(c)));
                } else {
                    for(String str : answer) {
                        String upper = str + Character.toUpperCase(c);
                        temp.add(upper);
                        String lower = str + Character.toLowerCase(c);
                        temp.add(lower);
                    }
                    answer.clear(); answer.addAll(temp);
                }
            }
        }
        return answer;
    }
}
