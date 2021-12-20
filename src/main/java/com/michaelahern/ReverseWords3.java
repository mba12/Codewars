package com.michaelahern;

public class ReverseWords3 {

    public String reverseWords(String s) {

        String[] list = s.split("\\s+");
        StringBuilder str = new StringBuilder();
        for(String l : list) {
            str.append(new StringBuilder(l).reverse());
            str.append(" ");
        }

        return str.toString().trim();
    }
}
