package com.michaelahern;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {

/*        System.out.println("Symbols: " + Arrays.toString(commentSymbols));
        char[] textChar = text.toCharArray();
        int[] textInts = new int[textChar.length];
        int x = 0;
        for(char c : textChar) {
            textInts[x] = (int) textChar[x];
            x++;
        }
        System.out.println("Incoming: " + Arrays.toString(textInts));*/


        StringBuilder str = new StringBuilder();

        Map<Character, List<String>> symbolsMap = new HashMap();
        Set<Character> symbolsChar = new HashSet();
        for (String s : commentSymbols) {
            symbolsChar.add(s.charAt(0));
            if (symbolsMap.containsKey(s.charAt(0))) {
                List<String> list = symbolsMap.get(s.charAt(0));
                list.add(s);
                symbolsMap.put(s.charAt(0), list);
            } else {
                List<String> list = new ArrayList();
                list.add(s);
                symbolsMap.put(s.charAt(0), list);
            }
        }

        char[] s = text.toCharArray();
        int position = 0;
        boolean commentOn = false;
        boolean match = false;
        while (position < s.length) {

            if (s[position] == '\n') {
                commentOn = false;
                match = false;
                if(str.length() > 1) {
                    int c = (int) str.charAt(str.length() - 1);
                    while(str.length() > 1 && c < 33 && c > 10) {
                        str.deleteCharAt(str.length() - 1);
                        c = (int) str.charAt(str.length() - 1);
                    }
                }

                str.append('\n');
                position++;
            } else if (commentOn) {
                position++;
            } else {
                if (symbolsChar.contains(s[position])) {
                    List<String> list = symbolsMap.get(s[position]);
                    for (String marker : list) {
                        int count = 0;
                        for (int i = 0; i < marker.length(); i++) {
                            if (s[position + i] != marker.charAt(i)) {
                                break;
                            }
                            count++;
                        }
                        if (count == marker.length()) {
                            position += count;
                            commentOn = true;
                            break;
                        } else {
                            position++;
                        }
                    }
                } else {
                    if (!commentOn)
                        str.append(s[position]);

                    position++;
                }
            }
        }

        if(str.length() > 0) {
            int c = (int) str.charAt(str.length() - 1);
            while(str.length() > 0 && c < 33 && c > 10) {
                str.deleteCharAt(str.length() - 1);
                if(str.length() > 0)
                    c = (int) str.charAt(str.length() - 1);
            }
        }


        String answer = str.toString();

/*        textChar = answer.toCharArray();
        textInts = new int[textChar.length];
        x = 0;
        for(char c : textChar) {
            textInts[x] = (int) textChar[x];
            x++;
        }
        System.out.println("Outgoing: " + Arrays.toString(textInts));*/
        return answer;
    }
}
