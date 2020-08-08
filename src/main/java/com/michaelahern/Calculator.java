package com.michaelahern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public static double calculate(double n1, double n2, String operand) {
        double answer = 0.0;
        switch(operand) {
            case "/":
                return n1 / n2;
            case "*":
                return n1 * n2;

            case "+":
                return n1 + n2;

            case "-":
                return n1 - n2;

        }
        return answer;
    }

    public static Double evaluate(String expression) {

        StringBuilder str = new StringBuilder(expression);

        List<Double> numbers = new ArrayList();
        List<String> numbersStr = new ArrayList();
        Pattern p;
        if (expression.indexOf('E') > 0) {
            p = Pattern.compile("\\b-?[1-9](?:\\.\\d+)?[Ee][-+]?\\d+\\b");
        } else {
            p = Pattern.compile("\\b-?[1-9](?:\\.\\d+)?[Ee][-+]?\\d+\\b|[+-]?(([1-9][0-9]*)?[0-9](\\.[0-9]*)?|\\.[0-9]+)");
        }
        // Pattern p = Pattern.compile("\\b-?[1-9](?:\\.\\d+)?[Ee][-+]?\\d+\\b|[+-]?(([1-9][0-9]*)?[0-9](\\.[0-9]*)?|\\.[0-9]+)");
        // Pattern p = Pattern.compile("\\b-?[1-9](?:\\.\\d+)?[Ee][-+]?\\d+\\b");

        Matcher m = p.matcher(expression);
        while (m.find()) {
            String n = m.group();
            numbersStr.add(n);
            numbers.add(Double.valueOf(n));
        }

        if(numbers.size() == 1) {
            BigDecimal bd = new BigDecimal(expression);
            double x = bd.doubleValue();
            return x;
        }

        int index = 0;
        while(numbers.size() > 1 && (str.indexOf("/") > 1 || str.indexOf("*") > 1)) {
            String n1 = numbersStr.get(index);
            int startIdx = str.indexOf(n1);
            String n2 = numbersStr.get(index + 1);
            int endIdx = str.indexOf(n2, startIdx + n1.length());
            String operand = str.substring(startIdx + n1.length(), endIdx).trim();
            if(operand.equals("/") || operand.equals("*")) {
                double val = calculate(numbers.get(index), numbers.get(index + 1), operand);
                str.replace(startIdx, endIdx + n2.length(), String.valueOf(val));
                numbers.remove(index); numbersStr.remove(index);
                numbers.remove(index); numbersStr.remove(index);
                numbers.add(index, val); numbersStr.add(index, String.valueOf(val));
            } else {
                index++;
            }
        }

        index = 0;
        while(numbers.size() > 1 && (str.indexOf("+") > 1 || str.indexOf("- ") > 1)) {
            String n1 = numbersStr.get(index);
            int startIdx = str.indexOf(n1);
            String n2 = numbersStr.get(index + 1);
            int endIdx = str.indexOf(n2, startIdx + n1.length());
            String operand = str.substring(startIdx + n1.length(), endIdx).trim();
            if(operand.equals("+") || operand.equals("-")) {
                double val = calculate(numbers.get(index), numbers.get(index + 1), operand);
                str.replace(startIdx, endIdx + n2.length(), String.valueOf(val));
                numbers.remove(index); numbersStr.remove(index);
                numbers.remove(index); numbersStr.remove(index);
                numbers.add(index, val); numbersStr.add(index, String.valueOf(val));
            }

        }
        return numbers.get(0);
    }


}
