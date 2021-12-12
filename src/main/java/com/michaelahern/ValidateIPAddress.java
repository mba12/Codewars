package com.michaelahern;

public class ValidateIPAddress {

    private String NEITHER = "Neither";
    private String HEX = "[0-9A-Fa-f]{1,4}";
    private String OLD = "[1-9][\\d]|[\\d]|[1]([\\d]{2})|[2][0-4][\\d]|[2][5][0-5]";
    private String IPV6 = "IPv6";
    private String IPV4 = "IPv4";

    public String validIPAddress(String IP) {

        if(IP.length() < 7) return NEITHER;
        char last = IP.charAt(IP.length() - 1);
        if(last == '.' || last == ':') return NEITHER;

        String[] split = IP.split("\\.|:");

        if(split.length == 4) {
            for(String s : split) {
                if(!s.matches(OLD)) return NEITHER;
            }
            return IPV4;
        } else if(split.length == 8) {
            for(String s : split) {
                if(!s.matches(HEX)) return NEITHER;
            }
            return IPV6;
        }
        return NEITHER;
    }


}
