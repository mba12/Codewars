package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    Character c = (char) 256;
    Character empty = (char) 257;
    public String encode(List<String> strs) {
        int size = strs.size();
        int len;
        for(String s : strs) {
            len = s.length();
            if(len == 0)
                size += 1;
            else
                size += s.length();
        }


        StringBuilder str = new StringBuilder(size);

        for(String s : strs) {
            if(s.length() == 0)
                str.append(empty);
            else
                str.append(s);

            str.append(c);
        }

        return str.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String[] strs = s.split(c.toString());
        List<String> answer = new ArrayList<>();
        for(String str : strs) {
            if(str.equals(empty.toString()))
                answer.add("");
            else
                answer.add(str);
        }
        return answer;
    }

}
