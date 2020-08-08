package com.michaelahern;

public class TimeFormatter {
    private static final int SECONDS = 60;

    private static final int[] divisors = {60, 60, 24, 365};
    public static String formatDuration(int seconds) {

        int remaining = seconds;
        int[] values = new int[5];
        values[0] = seconds % 60;
        remaining = remaining - values[0];

        values[1] = remaining / 60;
        int minutes = values[1];
        if(values[1] > 60) {
            values[1] = values[1] % 60;
        }
        minutes = minutes - values[1];
        int hours = minutes / 60;
        if(hours > 24) {
            values[2] = values[2] % 24;
        }
        values[3] = hours - values[2];
        int days = values[3];
        if(days > 364) {
            days = values[3] % 365;
        }
        int years = values[3] - days;

        StringBuilder str = new StringBuilder();
        if(years > 0) {
            str.append(years);
            str.append(" year");
            if(years > 1) str.append("s");
        }

        if(days > 0 ) {
            str.append(days);
            str.append(" year");
            if(days > 1) str.append("s");
        }

        if(hours > 0 ) {
            str.append(hours);
            str.append(" hour");
            if(days > 1) str.append("s");
        }

        if(minutes > 0 ) {
            str.append(minutes);
            str.append(" minute");
            if(minutes > 1) str.append("s");
        }

        if(values[0] > 0 ) {
            str.append(values[0]);
            str.append(" minute");
            if(values[0] > 1) str.append("s");
        }

        return str.toString();
    }

}
