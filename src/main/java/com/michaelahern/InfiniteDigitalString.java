package com.michaelahern;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class InfiniteDigitalString {

    public static final Map<Integer, Long> digitsMap = new HashMap<>();
    static {
        digitsMap.put(1,   9l);
        digitsMap.put(2,   2*90l);
        digitsMap.put(3,   3*900l);
        digitsMap.put(4,   4*9000l);
        digitsMap.put(5,   5*90000l);
        digitsMap.put(6,   6*900000l);
        digitsMap.put(7,   7*9000000l);
        digitsMap.put(8,   8*90000000l);
        digitsMap.put(9,   9*900000000l);
        digitsMap.put(10, 10*9000000000l);
        digitsMap.put(11, 11*90000000000l);
        digitsMap.put(12, 12*900000000000l);
        digitsMap.put(13, 13*9000000000000l);
        digitsMap.put(14, 14*90000000000000l);
        digitsMap.put(15, 15*900000000000000l);
        digitsMap.put(16, 16*9000000000000000l);
        digitsMap.put(17, 17*90000000000000000l);
        digitsMap.put(18, 18*900000000000000000l);
    }

    public static long findPositionOfNumber(long n) {

        if(n < 10) return n;

        String num = String.valueOf(n);  // 58257860625    11 digits
        int length = num.length();

        long position = 0;
        int digit = 1;
        long previous = 0;
        while(position < n) {
            previous = position;
            position += digitsMap.get(digit);
            digit++;
        }

        digit--;
        position = previous;
        int nextNumber = (int) Math.pow(10, digit - 1);

        long numberOfNumbers = n - (position + 1);
        long numNumbers = numberOfNumbers / digit;
        long remainder = numberOfNumbers % digit;
        return 100l;  // NOTE: fix

    }


    public static int[] convertNumberToIntArray(long number) {

        String num = String.valueOf(number);
        int length = num.length();
        int[] digits = new int[length];
        int end = length - 1;
        byte[] charBytes = num.getBytes(StandardCharsets.US_ASCII);
        for(int i = 0; i < charBytes.length; i++) {
            digits[i] = ((int) charBytes[i]) - 48;
        }
        return digits;
    }

    public static int findNthDigit(int n) {

        if(n < 10) return n;

        long position = 0;
        int digit = 1;
        long previous = 0;
        while(position < n) {
            previous = position;
            position += digitsMap.get(digit);
            digit++;
        }

        digit--;
        position = previous;
        int nextNumber = (int) Math.pow(10, digit - 1);

        long numberOfNumbers = n - (position + 1);
        long numNumbers = numberOfNumbers / digit;
        long remainder = numberOfNumbers % digit;

        long finalNumber = nextNumber + numNumbers;
        int [] next = convertNumberToIntArray(finalNumber);
        return next[(int) remainder];
    }


    public static int[] sum(int[] longer, int[] shorter) {

        int digit = 0, carry = 0;
        int j = longer.length - 1;
        for(int i = shorter.length - 1; i >= 0; i--, j--) {

            digit = longer[j] + shorter[i] + carry;
            if(digit > 9) {
                carry = 1;
                digit = digit - 10;
            } else {
                carry = 0;
            }
            longer[j] = digit;
        }

        while ( j >= 0) {
            digit = longer[j]  + carry;
            if(digit > 9) {
                carry = 1;
                digit = digit - 10;
            } else {
                carry = 0;
            }
            longer[j] = digit;
            j--;
        }

        if(carry == 1) {
            int[] newLonger = new int[longer.length + 1];
            newLonger[0] = 1;
            longer = newLonger;
        }
        return longer;
/*
        int end = longer.length - 1;
        int temp;
        for(int i = 0; i < longer.length / 2; i++) {
            temp = longer[i];
            longer[i] = longer[end - i];
            longer[end - i] = temp;
        }

        return longer;


        Collections.reverse(answer);

        int[] primitive = answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return primitive;

 */
    }


    public static long findPosition(final String s) {

        long position = 0;
        int length = s.length();
        int[] digits = new int[length];
        int end = length - 1;
        byte[] charBytes = s.getBytes(StandardCharsets.US_ASCII);
        for(int i = 0; i < charBytes.length; i++) {
            digits[i] = ((int) charBytes[i]) - 48;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        int[] next = {1};
        final int[] one = {1};
        int maxSize = length + 10;
        int count = 0;
        queue.add(1);

        while(position < length) {
            next = sum(next, one);
            for(int i : next) {
                queue.add(i);
                position++;
                if(i == digits[end]) {
                    if(checkMatch(queue, digits))
                        return position - length + 1;
                }

                if(queue.size() > maxSize)
                    queue.remove(0);
            }
            count++;
        }

        int size = queue.size();
        int front = queue.get(size - length + 1);

        while(true) {
            next = sum(next, one);
            for(int i : next) {
                queue.add(i);
                position++;
                if(i == digits[end]) {
                    if(checkMatch(queue, digits))
                        return position - length + 1;
                }
                queue.remove(0);
            }
            count++;
        }
    }

    public static long baseNumber(String n) {
        int digits = n.length(); // 3
        long baseSameDigits = (long) Math.pow(10, digits - 1);
        long position = 0l;

        for(int i = 1; i < digits; i++) {
            //System.out.println(i + " :: " + digitsMap.get(i));
            position += digitsMap.get(i);
        }
        //System.out.println("Position: " + position + " digits: " + digits);
        long number = Long.valueOf(n);
        // System.out.println(number - baseSameDigits);
        position += (number - baseSameDigits) * digits;
        //System.out.println("Final: " + position);
        return position;

    }

    public static boolean checkMatch(LinkedList<Integer> queue, int[] digits) {
        boolean match = true;
        Iterator<Integer> iter = queue.descendingIterator();
        int index = digits.length - 1;
        while(index > -1 && iter.hasNext()) {
            Integer i = iter.next();
            if(digits[index] != i) {
                match = false;
                break;
            }
            index--;
        }

        return match;

    }







}
