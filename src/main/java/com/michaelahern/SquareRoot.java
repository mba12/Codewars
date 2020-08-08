package com.michaelahern;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SquareRoot {


    public static String createNumberString(int digits) {
        StringBuilder str = new StringBuilder();
        str.append("1");
        for(int i=0; i < digits; i++) {
            str.append("0");
        }
        return str.toString();
    }

    public static String integerSquareRoot(String x)
    {
        // Base Cases
        if (x.equals("0") || x.equals("1"))
            return x;

        int length = x.length();
        String start = createNumberString(length / 2 - 2);
        String end = createNumberString(length / 2 + 2);

        // Do Binary Search for floor(sqrt(x))
        String ans="0";
        while (compareStringNumbers(start, end) <= 0)
        {
            String mid = longDivision(sum(start, end), "2");

            // If x is a perfect square
            String square = multiply(mid, mid);
            if (square.equals(x))
                return mid;

            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            if (compareStringNumbers(square, x) < 0)
            {
                start = sum(mid, "1");
                ans = mid;
            }
            else   // If mid*mid is greater than x
                end = subtract(mid, "1");
        }
        return ans;
    }
/*
    public static String integerSquareRoot(String c) {
        if (compareStringNumbers(c, "0") < 0) return "";
        String  t = new String(c);
        String val = longDivision(c, "1000");
        String check = subtract(t, longDivision(c, t));
        //System.out.println(check + " :: " + t);
        while (compareStringNumbers(check,val) > 0) {
            check = subtract(t, longDivision(c, t));
            t = longDivision(sum(longDivision(c, t), t), "2");
            String square = multiply(t, t);
            //System.out.println(square + " :: " + c + " :: " + check + " :: " + t);
            int compareVal = compareStringNumbers(square, c);
            if(compareVal < 0) return t;

        }
        return t;
    }
*/
    public static int compareStringNumbers(String a, String b) {
        if(a.length() > b.length()) {
            return 1;
        } else if (b.length() > a.length()) {
            return -1;
        } else return a.compareTo(b);

    }

    public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) return "0";

        String longer, shorter;
        if(num1.length() > num2.length()) {
            longer = num1;
            shorter = num2;
        } else {
            longer = num2;
            shorter = num1;
        }

        char[] longS = longer.toCharArray();
        char[] shortS = shorter.toCharArray();

        StringBuilder total = new StringBuilder();
        int sum;
        int place = 0;
        int carry, digit;
        for(int j = shortS.length - 1; j >= 0; j--) {
            carry = 0;
            StringBuilder row = new StringBuilder();
            row.append(String.join("", Collections.nCopies(place, "0")));

            for(int i = longS.length - 1; i >= 0; i--) {

                sum = (((int) shortS[j]) - 48) * (((int) longS[i]) - 48) + carry;

                digit = sum % 10;
                carry = sum/10;
                row.append(digit);
            }
            if(carry > 0) row.append(carry);
            row.reverse();
            String rowSum = sum(total.toString(), row.toString());
            total = new StringBuilder(rowSum);
            place++;
        }

        return total.toString();
    }

    public static String sum(String num1, String num2) {

        if(num1.length() == 0) return num2;
        if(num2.length() == 0) return num1;

        StringBuilder str = new StringBuilder();
        String longer, shorter;
        if(num1.length() > num2.length()) {
            longer = num1;
            shorter = num2;
        } else {
            longer = num2;
            shorter = num1;
        }

        char[] longS = longer.toCharArray();
        char[] shortS = shorter.toCharArray();

        int digit = 0, carry = 0;
        int j = longS.length - 1;
        for(int i = shortS.length - 1; i >= 0; i--, j--) {

            digit = (((int) longS[j]) - 48) + (((int) shortS[i]) - 48) + carry;
            if(digit > 9) {
                carry = 1;
                digit = digit - 10;
            } else {
                carry = 0;
            }
            str.append(digit);
        }

        while ( j >= 0) {
            digit = (((int) longS[j--]) - 48)  + carry;
            if(digit > 9) {
                carry = 1;
                digit = digit - 10;
            } else {
                carry = 0;
            }
            str.append(digit);
        }
        if(carry == 1) str.append(1);
        return str.reverse().toString();
    }

    public static int[] sum(int[] num1, int[] num2) {

        if(num1.length == 0) return num2;
        if(num2.length == 0) return num1;

        List<Integer> answer = new ArrayList();
        int[] longer;
        int[] shorter;
        if(num1.length > num2.length) {
            longer = num1;
            shorter = num2;
        } else {
            longer = num2;
            shorter = num1;
        }

        int digit = 0, carry = 0;
        int j = longer.length - 1;
        for(int i = shorter.length - 1; i >= 0; i--, j--) {

            digit = longer[j] - 48 + shorter[i] - 48 + carry;
            if(digit > 9) {
                carry = 1;
                digit = digit - 10;
            } else {
                carry = 0;
            }
            answer.add(digit + 48);
        }

        while ( j >= 0) {
            digit = longer[j--] - 48  + carry;
            if(digit > 9) {
                carry = 1;
                digit = digit - 10;
            } else {
                carry = 0;
            }
            answer.add(digit + 48);
        }
        if(carry == 1) answer.add(49);
        Collections.reverse(answer);

        int[] primitive = answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return primitive;
    }

    public static String subtract(String higher, String sub) {

        if(higher.length() == 0) return higher;
        if(sub.length() == 0) return higher;

        StringBuilder str = new StringBuilder();
        String longer, shorter;
        if(higher.length() > sub.length()) {
            longer = higher;
            shorter = sub;
        } else if( sub.length() > higher.length()){
            longer = sub;
            shorter = higher;
        } else {
            if(sub.compareTo(higher) <= 0) {
                longer = higher;
                shorter = sub;
            } else {
                longer = sub;
                shorter = higher;
            }
        }

        int[] longS = new int[longer.length()];
        int[] shortS = new int[shorter.length()];

        byte[] longSBytes = longer.getBytes(StandardCharsets.US_ASCII);
        byte[] shortSBytes = shorter.getBytes(StandardCharsets.US_ASCII);
        for(int i = 0; i < longS.length; i++)
            longS[i] = (int) longSBytes[i];

        for(int i = 0; i < shortS.length; i++)
            shortS[i] = (int) shortSBytes[i];


        int digit = 0;
        int j = longS.length - 1;
        for(int i = shortS.length - 1; i >= 0; i--, j--) {

            if ( longS[j] < shortS[i] )  {

                int x = 1;
                while(longS[j-x] == 48) { // '0'
                    x++;
                }
                longS[j-x] = longS[j-x] - 1;

                while(x > 1) {
                    longS[j-x+1] = 57;
                    x--;
                }
                digit = longS[j] + 10 - shortS[i] + 48;
            } else {
                digit = longS[j] - shortS[i] + 48;
            }

            str.append(Character.toString((char) digit));
        }

        while ( j >= 0) {
            str.append(Character.toString((char) longS[j--]));
        }
        return str.reverse().toString();
    }

    public static int[] subtract(int[] higher, int[] sub) {

        sub = removeLeadingZeros(sub);
        higher = removeLeadingZeros(higher);
        if(higher.length == 0) return higher;
        if(sub.length == 0) return higher;

        if(higher.length == 1 && higher[0] == 48) return higher;
        if(sub.length == 1 && sub[0] == 48) return higher;

        List<Integer> answer = new ArrayList<>();
        int[] longer;
        int[] shorter;
        if(higher.length >= sub.length) {
            longer = higher;
            shorter = sub;
        } else {
            longer = sub;
            shorter = higher;
        }

        int digit = 0;
        int j = longer.length - 1;
        for(int i = shorter.length - 1; i >= 0; i--, j--) {

            if ( longer[j] < shorter[i] )  {

                int x = 1;
                while(longer[j-x] == 48) { // '0'
                    x++;
                }
                longer[j-x] = longer[j-x] - 1;

                while(x > 1) {
                    longer[j-x+1] = 57;
                    x--;
                }
                digit = longer[j] + 10 - shorter[i] + 48;
            } else {
                digit = longer[j] - shorter[i] + 48;
            }

            answer.add(digit);
        }

        while ( j >= 0) {
            answer.add(longer[j--]);
        }

        Collections.reverse(answer);
        // Remove any leading zeros
        for(int x = 0; x < answer.size(); x++) {
            if(answer.size() > 1 && answer.get(0) == 48)
                answer.remove(0);
            else if (answer.get(0) > 48)
                break;
        }

        int[] primitive = answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return primitive;
    }

    public static int compareArrays(int[] dividend, int[] divisor) {

        dividend = removeLeadingZeros(dividend);
        if(dividend.length < divisor.length) return -1;
        if(dividend.length > divisor.length) return 1;

        for(int i = 0; i < dividend.length; i++) {
            if(dividend[i] < divisor[i])
                return -1;
            else if (dividend[i] > divisor[i])
                return 1;
        }
        return 0;
    }

    public static int[] removeLeadingZeros(int[] a) {
        if(a.length == 1) return a;

        if(a.length > 1 && a[0] > 48) return a; // no leading zeros

        int count = 0;
        while(count < a.length - 1 && a[count] == 48) { count++; }
        int[] newA = new int[a.length - count];
        int j = 0;
        for(int i = count; i < a.length; i++)
            newA[j++] = a[i];

        return newA;

    }

    public static int[][] divideByAddition(int[] divisor, int[] dividend) {
        dividend = removeLeadingZeros(dividend);

        int[][] answer = new int[2][];
        answer[0] = new int[1]; // [0] is the number of times divisor goes into dividend
        if(dividend.length == 1 && dividend[0] == 48) {
            answer[0][0] = 0;
            answer[1] = new int[1];
            answer[1][0] = 48; // [1] is divisor times the value in [0]
            return answer;
        }

        int[] d = Arrays.copyOf(divisor, divisor.length);
        int compareValue = compareArrays(d, dividend);
        if (compareValue == 0) {
            answer[0][0] = 1;
            answer[1] = new int[1];
            answer[1] = divisor;
            return answer;
        } else if (compareValue == 1) { // case divisor is 6 and first digit is < 6
            answer[0][0] = 0;
            answer[1] = new int[1];
            answer[1][0] = 48;
            return answer;
        }
        int count=0;
        int[] previous = null;
        while(compareValue <= 0){
            ++count;
            previous = Arrays.copyOf(d, d.length);
            d = sum(d, divisor);
            compareValue = compareArrays(d, dividend);
        }
        answer[0] = new int[1];
        answer[0][0] = count;
        answer[1] = previous;

        return answer;
    }

    public static String longDivision(String dividend, String divisor) {

        StringBuilder result = new StringBuilder();
        List<Integer> answer = new ArrayList();
        int divisorLength = divisor.length();

        if(divisorLength > dividend.length()) return "0";

        int[] dividendAscii = new int[dividend.length()];
        int[] divisorAscii = new int[divisor.length()];

        byte[] dividendBytes = dividend.getBytes(StandardCharsets.US_ASCII);
        byte[] divisorBytes = divisor.getBytes(StandardCharsets.US_ASCII);
        for(int i = 0; i < dividendAscii.length; i++)
            dividendAscii[i] = (int) dividendBytes[i];

        for(int i = 0; i < divisorAscii.length; i++)
            divisorAscii[i] = (int) divisorBytes[i];

        int length = divisorLength;
        int start = 0;
        int[] newSubTotal = Arrays.copyOfRange(dividendAscii, 0, length);
        while(compareArrays(newSubTotal, divisorAscii) < 0) {
            length++;
            newSubTotal = Arrays.copyOfRange(dividendAscii, 0, length);
        }

        while(length <= dividendAscii.length) {
            int[][] response = divideByAddition(divisorAscii, newSubTotal);
            answer.add(response[0][0]);

           // if (length == dividendAscii.length) break;

            newSubTotal = subtract(newSubTotal, response[1]);
            if(length == dividendAscii.length) break;

            int subTotalLength = newSubTotal.length;

            int count = 0;
            while(compareArrays(newSubTotal, divisorAscii) < 0 && length < dividendAscii.length) {
                int[] temp = Arrays.copyOf(newSubTotal, newSubTotal.length);
                int comp = compareArrays(newSubTotal, divisorAscii);
                if(comp < 0 && count > 0) answer.add(0);

                subTotalLength = temp.length + 1;
                newSubTotal = new int[subTotalLength];
                for(int i = 0; i < temp.length; i++) {
                    newSubTotal[i] = temp[i];
                }
                if(length <= dividendAscii.length) {
                    // Now we have one extra space for an additional digit to pull down from the dividend
                    newSubTotal[newSubTotal.length - 1] = dividendAscii[length];
                    length++;
                    count++;
                }
            }
        }

        // Strip leading zeros from the answer
        while(answer.size() > 1 && answer.get(0) == 0) {
             answer.remove(0);
        }

        int[] primitive = answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        StringBuilder str = new StringBuilder();
        for(int i: primitive){
            str.append(i);
        }
        return str.toString();

    }

}
