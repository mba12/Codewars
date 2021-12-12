package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {

    private String OLD = "[1-9][\\d]|[\\d]|[1]([\\d]{2})|[2][0-4][\\d]|[2][5][0-5]";
    public List<String> restoreIpAddress(String s) {
        List<String> answer = new ArrayList<>();

        if(s.length() > 12 || s.length()<4 )return answer;

        for(int i = 0; i <= s.length() - 3; i++)
            for(int j = i + 1; j < i + 4 && j <= s.length() - 2; j++) {
                if(s.substring(i, j).matches(OLD)) {
                    for(int k = j + 1; k < j + 4  && k <= s.length() - 2; k++) {
                        if(s.substring(j, k).matches(OLD)) {
                            for(int m = k + 1; m < k + 4  && m <= s.length() - 1; m++) {
                                if(s.substring(k, m).matches(OLD)) {
                                    for(int n = m + 1; n < m + 4  && n <= s.length(); n++) {
                                        if(s.substring(m, n).matches(OLD)) {
                                           if((j - i) + (k - j) + (m - k) + (n - m) == s.length()) {
                                                StringBuilder str = new StringBuilder();
                                                str.append(s.substring(i, j));
                                                str.append('.');
                                                str.append(s.substring(j, k));
                                                str.append('.');
                                                str.append(s.substring(k, m));
                                                str.append('.');
                                                str.append(s.substring(m, n));
                                                answer.add(str.toString());
                                           }

                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }

        return answer;
    }
}
