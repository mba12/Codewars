package com.michaelahern;

import java.lang.Math.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;


public class Kata
{
    public static long nextBiggerNumber(long n)
    {
        if(n < 10) return -1;
        int nDigits = (int) Math.floor(Math.log10(Math.abs(n))) + 1;

        int[] digits = new int[nDigits];
        long nCopy = n;
        int k = 0;
        while(nCopy > 0) {
            int d = (int) (nCopy % 10);
            digits[k] = d;
            k++;
            nCopy = nCopy / 10;
        }

        for(int i = 0; i < digits.length - 1; i++) {
            if(digits[i] > digits[i+1]) {
                swap(digits, i, i+1);
                // now sort digits betweeen 0 and i inclusive
                if(i > 0) partSort(digits, i+1);

                return createNumber(digits);
            }
        }

        for(int i = 0; i < digits.length; i++) {
            for(int j = i + 1; j < digits.length; j++) {
                if(digits[i] > digits[j]) {
                    swap(digits, i, j);
                    return createNumber(digits);
                }
            }
        }

        return -1;
    }

    private static void swap(int[] digits, int a, int b) {
        int temp = digits[a];
        digits[a] = digits[b];
        digits[b] = temp;
    }

    private static long createNumber(int[] digits) {
        long total = 0;
        for(int i = 0; i < digits.length; i++)
            total += digits[i] * Math.pow(10, i);

        return total;
    }

    static void partSort(int[] arr, int idx)
    {
        int spotDigit = arr[idx - 1];

        // Temporary array 
        int[] temp = new int[idx];
        int j = 0;
        for (int i = 0; i < idx; i++) {
            temp[j] = arr[i];
            j++;
        }

        // Sort the temporary array 
        Arrays.sort(temp);

        // Now find the first digit in the temp array larger than the spotDigit
        for(int i = 0; i < idx; i++) {
            if(temp[i] > spotDigit) {
                int tempDigit = arr[idx];
                arr[idx] = temp[i];
                temp[i] = tempDigit;
                Arrays.sort(temp);
                break;
            }
        }

        // Modifying original array with temporary array elements 
        j = 0;
        for (int i = idx-1; i >= 0; i--) {
            arr[i] = temp[j];
            j++;
        }
    }

    public static int numberOfDigits(long n) {
        int nDigits = (int) Math.floor(Math.log10(Math.abs(n))) + 1;
        return nDigits;
    }

    public static int[] numberToIntArray(long n, int numDigits) {
        int[] digits = new int[numDigits];
        int k = 0;
        while(n > 0) {
            int d = (int) (n % 10);
            digits[k] = d;
            k++;
            n = n / 10;
        }
        return digits;
    }

    public static Long sumOfDigitsSquared(int[] digits) {
        long total = 0;
        int j = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
            total += Math.pow(digits[i], j+1);
            j++;
        }
        return total;
    }

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> answer = new ArrayList();
        for(long i = a; i <=b; i++) {
            int nDigits = numberOfDigits(i);
            int[] digits = numberToIntArray(i, nDigits);
            Long total = sumOfDigitsSquared(digits);

            if (total == i) answer.add(i);
        }
        return answer;

    }

    public static String whoLikesIt(String... names) {
        StringBuilder answer = new StringBuilder();
        if(names.length == 0) {
            answer.append("no one likes this");
        } else if (names.length == 1) {
            answer.append(names[0]);
            answer.append(" likes this");
        } else if (names.length == 2) {
            answer.append(names[0]);
            answer.append(" and ");
            answer.append(names[1]);
            answer.append(" like this");
        } else if (names.length == 2) {
            answer.append(names[0]);
            answer.append(", ");
            answer.append(names[1]);
            answer.append(" and ");
            answer.append(names[2]);
            answer.append(" like this");
        } else if (names.length > 2) {
            answer.append(names[0]);
            answer.append(", ");
            answer.append(names[1]);
            answer.append(" and ");
            answer.append(names.length - 2);
            answer.append(" others like this");
        }

        return answer.toString();
    }

    public static char triangle(final String row) {

        if(row.length() == 1)
            return row.charAt(0);

        int[] nextColor = new int[165];
        nextColor[132] = 66;
        nextColor[142] = 71;
        nextColor[164] = 82;

        nextColor[137] = 82;
        nextColor[148] = 71;
        nextColor[153] = 66;


        char[] previousChar = row.toCharArray();
        int[] previous = new int[previousChar.length];
        for(int i = 0; i < previousChar.length; i++) {
            previous[i] = (int) previousChar[i];
        }
        int[] next = new int[previous.length - 1];
        int newColor = 0;
        while(previous.length > 1) {
            for(int j = 0; j < previous.length - 1; j++) {
                newColor = previous[j] + previous[j+1];
                next[j] = nextColor[newColor];
            }
            previous = null;
            previous = next;
            if(previous.length > 1)
                next = new int[previous.length - 1];
        }

        return (char) previous[0];
    }

    private static class TwoPoints {

        public Point p1;
        public Point p2;
        public double distance;

        public TwoPoints(Point p1, Point p2, double distance) {
            this.p1 = p1;
            this.p2 = p2;
            this.distance = distance;
        }

        public List<Point> getPoints() {
            List<Point> pair = new ArrayList();
            pair.add(p1);
            pair.add(p2);
            return pair;
        }
    }

    public static List<Point> closestPair(List<Point> points, int i) {
        // System.out.println(Arrays.toString(points.toArray()));
        System.out.println("Size: " + points.size());
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return Double.compare(p1.x, p2.x);
            }
        });

        TwoPoints answer = findClosestPair(points, 0, points.size(), i);
        return answer.getPoints();
    }

    private static TwoPoints findClosestPair(List<Point> points, int begin, int end, int i) {
        TwoPoints answer = null;
        if(end - begin <= i) {
            return compareAllPairs(points, begin, end);
        }

        int mid = begin + (end - begin)/2;

        TwoPoints leftSide = findClosestPair(points, begin, mid, i);
        TwoPoints rightSide = findClosestPair(points, mid, end, i);
        TwoPoints closestInSides = leftSide.distance < rightSide.distance? leftSide : rightSide;

        double dist = 0.0;
        double midDist = points.get(mid).x;
        List<Point> alongAxis = new ArrayList();
        for(Point p : points) {
            dist = p.x - midDist;
            if(dist < 0.0) dist = -dist;
            if( dist < closestInSides.distance) {
                alongAxis.add(p);
            }
        }

        TwoPoints middle = findClosestPairAlongAxis(alongAxis, closestInSides.distance);
        if(middle.distance < closestInSides.distance) {
            answer = middle;
        } else {
            answer = closestInSides;
        }

        return answer;
    }

    private static TwoPoints findClosestPairAlongAxis(List<Point> alongAxis, double d) {
        Collections.sort(alongAxis, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return Double.compare(p1.y, p2.y);
            }
        });

        double min = Double.MAX_VALUE;
        Point pointI = null;
        Point pointJ = null;

        for(int i = 0; i < alongAxis.size(); i++) {
            for(int j = i + 1; j < alongAxis.size() && alongAxis.get(j).y - alongAxis.get(i).y < d; j++) {
                double distance = findDistance(alongAxis.get(i), alongAxis.get(j));
                if(distance < min) {
                    min = distance;
                    pointI = alongAxis.get(i);
                    pointJ = alongAxis.get(j);
                }
            }
        }
        return new TwoPoints(pointI, pointJ, min);
    }

    private static TwoPoints compareAllPairs(List<Point> points, int begin, int end) {
        double min = Double.MAX_VALUE;
        Point pointI = null;
        Point pointJ = null;

        for(int i = begin; i < end; i++) {
            for(int j = i + 1; j < end; j++) {
                double distance = findDistance(points.get(i), points.get(j));
                if(distance < min) {
                    min = distance;
                    pointI = points.get(i);
                    pointJ = points.get(j);
                }
            }
        }
        return new TwoPoints(pointI, pointJ, min);
    }

    private static double findDistance(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    public static String integerSquareRoot(String n) {

        return "0";
    }

}