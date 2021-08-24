package com.michaelahern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
       //  System.out.println( "Hello World!" );

     //    Kata kata = new Kata();

        // long n = Kata.nextBiggerNumber(822418533);
//        List<Long> list = Kata.sumDigPow(1, 500);
//        System.out.println( Arrays.toString(list.toArray()) );
/*
        Spiralizor s = new Spiralizor();
        int[][] test = Spiralizor.spiralize(7);
        for(int[] row : test) {
            System.out.println(Arrays.toString(row));

        }

        Immortal Test Cases
        8, 5, 1, 100
        8, 8, 0, 100007
        25, 31, 0, 100007
        5, 45, 3, 1000007
        31, 39, 7, 2345
        545, 435, 342, 1000007
        28827050410, 35165045587, 7109602, 13719506  
*/

        /*
        long previous = 0;
        long current = 0;
        for(int i = 0; i < 50; i++)
            for(int j = 0; j < 50; j++) {
                current = Immortal.elderAge(i, j, 0, 100);
                System.out.println(i + ", " + j + " :: " + current + " :: " + (current - previous));
                previous = current;
            }
        System.out.println(Immortal.elderAge(28827050410l, 35165045587l, 7109602l, 13719506l));
        */

//        System.out.println(NextSmaller.nextSmaller(907l));
//        System.out.println(NextSmaller.nextSmaller(1027l));
//        System.out.println(NextSmaller.nextSmaller(3049076445l));
//        System.out.println(NextSmaller.nextSmaller(418810464895641280l));
//        System.out.println(NextSmaller.nextSmaller(5213939206l)); // 5213939062
//        System.out.println(NextSmaller.nextSmaller(315l)); // 153

        // System.out.println(StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));


        // int[] text = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
       // Incoming: [10, 10, 100, 97, 97, 10, 10, 102, 10, 10, 97, 101, 99, 10, 36, 10, 10, 10, 102, 10, 10, 10, 99, 10, 10, 97, 98, 100, 10, 10, 98, 101, 10, 10, 98, 10, 10, 97, 101, 36, 10, 10, 101, 10, 10, 100, 10, 10, 10, 97, 10, 10, 36, 100, 10, 10, 97, 10, 10, 99, 10, 10, 101, 101, 10, 10, 102, 10, 10, 102, 10, 99, 101, 98, 36, 98, 10, 10, 97, 10, 10, 101, 10, 10, 102, 10, 10, 99, 102, 100, 99, 10, 10, 10, 98, 10, 10, 99, 10, 10, 36, 36, 10, 10, 100, 10, 10, 100, 102, 10, 10, 100, 10, 10, 100, 99, 10, 10, 36, 99, 97, 10, 10, 98, 101, 10, 10, 10, 99, 102, 10, 98, 99, 102, 10, 10, 97, 97, 10, 10, 101, 36, 10, 10, 101, 10, 10, 10, 98, 101, 97, 10, 101, 100, 10, 10, 102, 10, 10, 97, 10, 100, 100, 10, 10, 98, 10, 10, 102, 99, 10, 10, 10, 100, 10, 10, 10, 97, 10, 10, 99, 10, 10, 100, 10, 10, 10, 98, 10, 10, 102, 10, 10, 98, 10, 10, 98, 36, 10, 10, 101, 102, 36, 36, 10, 10, 101, 100, 10, 10, 36, 10, 10, 100, 101, 98, 10, 10, 10, 10, 10, 97, 10, 10, 10, 10, 10, 10, 99, 10, 10, 98, 97, 10, 10, 99, 102, 10, 10, 100, 99, 10, 10, 101, 10, 10, 101, 98]
       // Outgoing: [10, 100, 97, 97, 10, 102, 10, 97, 101, 99, 10, 10, 102, 10, 10, 99, 10, 97, 98, 100, 10, 98, 101, 10, 98, 10, 97, 101, 10, 101, 10, 100, 10, 10, 97, 10, 10, 97, 10, 99, 10, 101, 101, 10, 102, 10, 102, 10, 99, 101, 98, 10, 97, 10, 101, 10, 102, 10, 99, 102, 100, 99, 10, 10, 98, 10, 99, 10, 10, 100, 10, 100, 102, 10, 100, 10, 100, 99, 10, 10, 98, 101, 10, 10, 99, 102, 10, 98, 99, 102, 10, 97, 97, 10, 101, 10, 101, 10, 10, 98, 101, 97, 10, 101, 100, 10, 102, 10, 97, 10, 100, 100, 10, 98, 10, 102, 99, 10, 10, 100, 10, 10, 97, 10, 99, 10, 100, 10, 10, 98, 10, 102, 10, 98, 10, 98, 10, 101, 102, 10, 101, 100, 10, 10, 100, 101, 98, 10, 10, 10, 97, 10, 10, 10, 99, 10, 98, 97, 10, 99, 102, 10, 100, 99, 10, 101, 10, 101, 98]

/*
        char[] c = new char[text.length];
        for(int i = 0; i < text.length; i++)
            c[i] = (char) text[i];

        String input = String.valueOf(c);
        // Outgoing: [10, 10, 101, 10, 100, 10, 98, 10, 99, 10, 97, 10, 97, 10, 101, 100, 98, 98, 10, 100, 99, 99, 100, 100, 10, 101, 101, 101, 100, 10, 10, 10, 97, 10, 98, 101, 10, 100, 10, 98, 10, 10, 98, 99, 10, 100, 10, 102, 10, 10, 98, 99, 100, 10, 102, 10, 98, 97, 98, 102, 10, 99, 10, 101, 99, 100, 10, 102, 10, 10, 99, 10, 10, 10, 98, 10, 10, 101, 10, 101, 10, 10, 10, 101, 10, 10, 100, 10, 99, 10, 10, 102, 10, 102, 10, 98, 99, 10, 10, 10, 98, 10, 98, 10, 10, 101, 10, 98, 102, 10, 98, 10, 99, 10, 98, 101, 10, 101, 100, 101, 10, 98, 10, 101, 10, 98, 10, 100, 102, 100, 101, 10, 98, 100, 100, 10, 10, 102, 101, 97, 10, 10, 10, 100, 10, 99, 10, 101, 10, 99, 100, 10, 99, 10, 99, 10, 101, 98, 10, 10, 102, 10, 102, 10, 102]
        String answer = StripComments.stripComments( input, new String[] { "#", "$", "!", "-" } );
        char[] xxx = answer.toCharArray();
        char[] o = new char[xxx.length];
        int[] nums = new int[xxx.length];
        for(int i = 0; i < xxx.length; i++)
            nums[i] = (int) xxx[i];

        System.out.println("Output: " + Arrays.toString(nums));
        System.out.println(answer);


        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.toString(Snail.snail(array)));



        System.out.println(Kata.triangle("B"));  //B
        System.out.println(Kata.triangle("GB")); // R
        System.out.println(Kata.triangle("RRR")); // R
        System.out.println(Kata.triangle("RGBG")); // B
        System.out.println(Kata.triangle("RBRGBRB")); // G
        System.out.println(Kata.triangle("RBRGBRBGGRRRBGBBBGG")); // G


        List<Point> list = KataHelper.testVeryLarge();

        for(int i = 5; i < 1000; i+=5) {
            long start = System.currentTimeMillis();
            List<Point> result = Kata.closestPair(list, i);
            long end = System.currentTimeMillis();
            System.out.println("Test: " + i  + "  " + Arrays.toString(result.toArray()));
            System.out.println("Test: " + i  + "  " + (end - start));

        }
*/
        //List<Point> list = KataHelper.testVeryLarge();
        //List<Point> result = Kata.closestPair(list);
        //System.out.println("Test 1: " + Arrays.toString(result.toArray()));
        /*
        // Test 1
        List<Point> points = Arrays.asList(
                new Point(2, 2), //A
                new Point(2, 8), //B
                new Point(5, 5), //C
                new Point(6, 3), //D
                new Point(6, 7), //E
                new Point(7, 4), //F
                new Point(7, 9)  //G
        );

        List<Point> result = Kata.closestPair(points);
        // List<Point> expected = Arrays.asList(new Point(6, 3), new Point(7, 4));
        System.out.println("Test 1: " + Arrays.toString(result.toArray()));

        // Test 2
        points = Arrays.asList(
                new Point(2, 2),
                new Point(6, 3)
        );

        result = Kata.closestPair(points);
        System.out.println("Test 2: " + Arrays.toString(result.toArray()));
        // List<Point> expected = Arrays.asList(new Point(6, 3), new Point(2, 2));

        // Test 3
        points = Arrays.asList(
                new Point(2, 2), //A
                new Point(2, 8), //B
                new Point(5, 5), //C
                new Point(5, 5), //C
                new Point(6, 3), //D
                new Point(6, 7), //E
                new Point(7, 4), //F
                new Point(7, 9)  //G
        );
        result = Kata.closestPair(points);
        // List<Point> expected = Arrays.asList(new Point(5, 5), new Point(5,5));
        System.out.println("Test 3: " + Arrays.toString(result.toArray()));


        System.out.println(java.lang.Math.random());
        System.out.println(java.lang.Math.random());
        System.out.println(java.lang.Math.random());
        System.out.println(java.lang.Math.random());
        System.out.println(java.lang.Math.random());

1.1 + 2.2 + 3.3
-1778059894 + -1914255789
10 * 5 / 2
2 / 2 + 3 * 4 - 6

        System.out.println(Calculator.evaluate("2.2 / 2.5 + 3.0 * -4.5 - 6.0"));
        System.out.println(Calculator.evaluate("7.7 - 3.3 - 4.4"));
        System.out.println(Calculator.evaluate("1.1 + 2.2 + 3.3"));
        System.out.println(Calculator.evaluate("-1778059894 + -1914255789"));
        System.out.println(Calculator.evaluate("10 * 5 / 2"));
        System.out.println(Calculator.evaluate("2 / 2 + 3 * 4 - 6"));
        System.out.println(Calculator.evaluate("-2.06690858E8"));
         */
        // System.out.println(SquareRoot.sqrt(345, 0.002));

        // System.out.println(SquareRoot.longDivision("178", 25));

/*
        System.out.println(SquareRoot.subtract("5206", "318"));
        String a = "500000000000000000000007";
        String b = "969857458";
        String x = SquareRoot.subtract(a, b);
        System.out.println(x);
        String y = SquareRoot.sum(x, b);
        System.out.println(y);
        System.out.println(SquareRoot.multiply("12", "100"));
        System.out.println(SquareRoot.multiply("1201", "125"));

        System.out.println(SquareRoot.longDivision("1000", "10"));
        System.out.println(SquareRoot.longDivision("1000", "5"));
        System.out.println(SquareRoot.longDivision("23569874", "6"));
        System.out.println(SquareRoot.longDivision("1212", "12"));
        System.out.println(SquareRoot.longDivision("1212121212", "12"));
        System.out.println(SquareRoot.longDivision("1212121212", "121212"));
        System.out.println(SquareRoot.longDivision("25000000000000000000000000000000000000000000000000000000000", "250"));
        System.out.println(SquareRoot.longDivision("25000000000000000000000000000000000000000000000000000000250", "250"));
        System.out.println(SquareRoot.longDivision("25000000000000000000000000000000000000000000000000000000250", "250000000"));




        Random random = new Random();
        for(int i = 0; i < 100; i++) {
            long x = Math.abs(random.nextLong());
            int y = Math.abs(random.nextInt());

            long larger = x > y? x : y;
            long small  = x > y? y : x;
            BigInteger bx = BigInteger.valueOf(larger);
            BigInteger by = BigInteger.valueOf(small);
            BigInteger ba = bx.multiply(by);


            System.out.print(larger + " * " + small + " = ");
            String result = SquareRoot.multiply(String.valueOf(larger), String.valueOf(small));

            if(result.equals(ba.toString())) {
                System.out.println(result);
            } else {
                System.out.println("Error: " + larger + " * " + small + " = " + result);
            }
        }
*/
        // System.out.println(SquareRoot.integerSquareRoot(35));
        // String[] tests = {"5", "34", "133", "201", "4567"};
        // System.out.println("152421548093487868711992623730429930751178496967");
        // String[] tests = {"23232328323215435345345345343458098856756556809400840980980980980809092343243243243243098799634", "12323309809809534545458098709854808654685688665486860956865654654654324238000980980980"};
//        for(String s : tests) {
//            long start = System.currentTimeMillis();
//            String answer = SquareRoot.floorSqrt(s);
//            long end = System.currentTimeMillis();
//            System.out.println("time: " + (end - start));
//            System.out.println(answer);
//            /*
//            String square = SquareRoot.multiply(answer, answer);
//            String plusOne = SquareRoot.sum(answer, "1");
//            String square2 = SquareRoot.multiply(plusOne, plusOne);
//              System.out.println(answer);


   //     }
/*
        assertEquals("152421548093487868711992623730429930751178496967",
                Kata.integerSquareRoot("23232328323215435345345345343458098856756556809400840980980980980809092343243243243243098799634"));
        assertEquals("3510457208086937291253621317073222057793129",
                Kata.integerSquareRoot("12323309809809534545458098709854808654685688665486860956865654654654324238000980980980"));
*/

        // System.out.println(SquareRoot.sqrt("133"));
        // SquareRoot.integerSquareRoot("5");
      // System.out.println(SquareRoot.longDivision("1212", "6"));

    //     MathEvaluator eval = new MathEvaluator();
        /*

        /-
        *-
        +-

        -(
        )-(  special case
        */


/*

 Log
(1 - 2) + -(-(-(-4)))
expected:<3.0> but was:<4.0>

 Log
((2.33 / (2.9+3.5)*4) - -6)
expected:<7.45625> but was:<6.0>

 Log
123.45*(678.90 / (-2.5+ 11.5)-(80 -19) *33.25) / 20 + 11
expected:<-12042.760875> but was:<-155.52526639344262>

        String[] test = {
        "12* 123/-(-5 + 2)",
        "1 - -(-(-(-4)))",
        "(123.45*(678.90 / (-2.5+ 11.5)-(((80 -(19))) *33.25)) / 20) - (123.45*(678.90 / (-2.5+ 11.5)-(((80 -(19))) *33.25)) / 20) + (13 - 2)/ -(-11)"};
        for(String s : test) {
            System.out.println(eval.calculate(s));
        }
*/

        // System.out.println(eval.calculate("2 / (2 + 3) * 4.33 - -6"));
        // System.out.println(eval.calculate("1 + 2*3/(5- -6)"));
        // System.out.println(eval.calculate("12* 123/-(-5 + 2)"));
       // System.out.println(eval.calculate("123.45*(678.90 / (-2.5+ 11.5)-(80 -19) *33.25) / 20 + 11"));
        // System.out.println(eval.calculate("(123.45*(678.90 / (-2.5+ 11.5)-(((80 -(19))) *33.25)) / 20) - (123.45*(678.90 / (-2.5+ 11.5)-(((80 -(19))) *33.25)) / 20) + (13 - 2)/ -(-11)"));

    //    Fibonacci fib = new Fibonacci();

//        long start = System.currentTimeMillis();
//        BigInteger y = fib.fib(new BigInteger("2000000"));
//        long end = System.currentTimeMillis();
//        System.out.println("Fib y: " + y.toString().length() + " :: " + (end - start));

//        start = System.currentTimeMillis();
//        BigInteger z = fib.fibMatrix(2000000);
//        end = System.currentTimeMillis();
//        System.out.println("Fib Matrix: " + z.toString().length() + " :: " + (end - start));
//
//        System.out.println("Equal: " + y.equals(z));
        // System.out.println("Negative: "  + fib.fibNegative(BigInteger.valueOf(-6l)));
        //System.out.println("Negative: "  + fib.fibNegativeRecursive(BigInteger.valueOf(-3l)));


        //9223372036854775807
        //6817091959060941595

        // LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        // System.out.println(lcs.longestCommonSubsequence("AGGTAB", "GXTXAYB"));
        // x:anothertest:y:notatest
        // System.out.println(lcs.longestCommonSubsequence("anothertest", "notatest"));

        // long x = 9 + 2*90 + 3*900 + 4*9000 + 5*90000 + 6*900000 + 7*9000000 + 8 * 52716855;
        // System.out.println(x);
/*        long start = System.currentTimeMillis();
        long pos = InfiniteDigitalString.findPosition("949225100");
        long end = System.currentTimeMillis();
        System.out.println(end - start + " POS: " + pos);

        long start1 = System.currentTimeMillis();
        long pos1 = InfiniteDigitalString.findPosition("3999589058124");
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1 + " POS: " + pos1);

*/

        // System.out.println(RailFenceCipher.encode("WEAREDISCOVEREDFLEEATONCE", 3));
        // System.out.println(RailFenceCipher.decode("WECRLTEERDSOEEFEAOCAIVDEN", 3));

        // H !e,Wdloollr
        // H !e,Wdloollr
        // WECRLTEERDSOEEFEAOCAIVDEN
        // WECRLTEERDSOEEFEAOCAIVDEN



        // System.out.println(RailFenceCipher.decode("WECRLTEERDSOEEFEAOCAIVDEN", 3));



      //  System.out.println("Digit: " + InfiniteDigitalString.findNthDigit(1000));

//        490623729
//        1718 POS: 123733910
//        0 POS: 490623729
      //  7029 POS:  382689688
      //  0 POS:    8431914789

     //   629725355764
     //    24674951477

      //  50883546644501
      //   6957586376885

      //  8227388285006859
      //  1686722738828503





//
//        int[] longer = {9, 9, 9};
//        int[] one = {1};
//
//        int [] answer = InfiniteDigitalString.sum(longer, one);
//        System.out.println(Arrays.toString(answer));


/*
        -6
        expected:<-8> but was:<-6>

            -96
        expected:<-51680708854858323072> but was:<-96>

            -64
        expected:<-10610209857723> but was:<-64>

            -3
        expected:<2> but was:<-3>
            -33
        expected:<3524578> but was:<-33>

            -84
        expected:<-160500643816367088> but was:<-84>

            -29
        expected:<514229> but was:<-29>
            -41
        expected:<165580141> but was:<-41>
            -2
        expected:<-1> but was:<-2>

            -58
        expected:<-591286729879> but was:<-58>



String test1 =
"+--------+\n" +
"|........|\n" +
"|...B....|\n" +
"|........|\n" +
"|........|\n" +
"|........|\n" +
"|...B....|\n" +
"|........|\n" +
"|........|\n" +
"+--------+\n";

int[][] answer1 = {{1,3}, {5,3}};

String test2 =
"+--------+\n" +
"|........|\n" +
"|...B....|\n" +
"|........|\n" +
"|.....B..|\n" +
"|........|\n" +
"|...B....|\n" +
"|........|\n" +
"|........|\n" +
"+--------+\n";
int[][] answer2 = {{1,3}, {3,5},{5,3}};

String test3 =
"+--------+\n" +
"|........|\n" +
"|...B....|\n" +
"|........|\n" +
"|........|\n" +
"|........|\n" +
"|...B....|\n" +
"|........|\n" +
"|.....B..|\n" +
"+--------+\n";
int[][] answer3 = {{1,3}, {5,3},{7,5}};

String test4 =
"+--------+\n" +
"|........|\n" +
"|...B....|\n" +
"|.B......|\n" +
"|........|\n" +
"|........|\n" +
"|...B....|\n" +
"|........|\n" +
"|.B...B..|\n" +
"+--------+\n";
int[][] answer4 = {{1,3}, {5,3}, {7,5}, {7,1}, {2,1}};

String test5 =
"+--------+\n" +
"|........|\n" +
"|...B....|\n" +
"|.B......|\n" +
"|........|\n" +
"|........|\n" +
"|...BB...|\n" +
"|........|\n" +
"|.B...B..|\n" +
"+--------+";

int[][] answer5 = {{1,3}, {5,3}, {7,5}, {7,1}, {2,1}, {5,4}};

        String test7 =
                "+--------+\n" +
                "|...B....|\n" +
                "|........|\n" +
                "|.B......|\n" +
                "|......B.|\n" +
                "|......B.|\n" +
                "|.B......|\n" +
                "|......BB|\n" +
                "|BB......|\n" +
                "+--------+\n";

// test 11   java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 32
        String test11 =
                "+--------+\n" +
                        "|........|\n" +
                        "|.BBBBBB.|\n" +
                        "|.BBBBBB.|\n" +
                        "|.BBBBBB.|\n" +
                        "|.BBBBBB.|\n" +
                        "|.BBBBBB.|\n" +
                        "|.BBBBBB.|\n" +
                        "|........|\n" +
                        "+--------+\n";

        // test 12  java.lang.OutOfMemoryError: Java heap space at BulbGrid.solve(BulbGrid.java:228)
        String test12 =
        "+---------+\n" +
                "|.........|\n" +
                "|.B.B.B.B.|\n" +
                "|..B.B.B..|\n" +
                "|.B.B.B.B.|\n" +
                "|..B.B.B..|\n" +
                "|.B.B.B.B.|\n" +
                "|..B.B.B..|\n" +
                "|.B.B.B.B.|\n" +
                "|.........|\n" +
                "+---------+";

// test 15  java.lang.OutOfMemoryError: Java heap space
//	at BulbGrid.solve(BulbGrid.java:228)
//	at BulbGrid.getTour(BulbGrid.java:218)
//	at BulbGrid.switchBulbs(BulbGrid.java:181)
*/
        /*
        String test15 =
                "+----------------+\n" +
                "|B.............B.|\n" +
                "|.B..........B...|\n" +
                "|................|\n" +
                "|..B........B....|\n" +
                "|....B.....B.....|\n" +
                "|.....B..B.......|\n" +
                "|.......B........|\n" +
                "|......B.........|\n" +
                "|......B.B.......|\n" +
                "|.....B....B.....|\n" +
                "|................|\n" +
                "|....B......B....|\n" +
                "|..B.........B...|\n" +
                "|.B............B.|\n" +
                "|................|\n" +
                "|B..............B|\n" +
                "+----------------+";
*/
        // test 16 invalid solution  Your solution: [[3,2],[1,3],[5,3]]  Bulbs at [3,2] and [1,3] cannot be linked togrther
        /*
        String test16 = "+--------+\n" +
                "|........|\n" +
                "|...B....|\n" +
                "|........|\n" +
                "|..B.....|\n" +
                "|........|\n" +
                "|...B....|\n" +
                "|........|\n" +
                "|........|\n" +
                "+--------+";

        String test5 =
                "+--------+\n" +
                        "|........|\n" +
                        "|...B....|\n" +
                        "|.B......|\n" +
                        "|........|\n" +
                        "|........|\n" +
                        "|...BB...|\n" +
                        "|........|\n" +
                        "|.B...B..|\n" +
                        "+--------+";

        int[][] answer5 = {{1,3}, {5,3}, {7,5}, {7,1}, {2,1}, {5,4}};
*/
// String[] tests = {test11, test12, test15, test16};
// String[] tests = {test7};
  //       String[] tests = {test5};


/*
int count = 1;
for(String s : tests) {
    System.out.println("Test " + count + ":\n");
    List<Point> ans = BulbGrid.switchBulbs(s);
    if(ans == null)
        System.out.println("No Solution");
    else {
        System.out.println(Arrays.toString(ans.toArray()));
        System.out.println("****************************\n");
    }
    count++;

}
*/


// int[][] matrix = GFG.createMatrix();
// GFG.solve(matrix);

        // SquareSums.testAll(15);
        // AllPermutation.run(23);

       // 18 7 9 16 20 5 11 14 2 23 13 12 4 21 15 10 6 19 17 8 1 3 22
       // 5:	No answer
       //  15:	[8, 1, 15, 10, 6, 3, 13, 12, 4, 5, 11, 14, 2, 7, 9]

        // int[] testNs = {5, 15, 16, 23, 37, 1600, 92};

/*
        int[] testsFinal = {
                5
                ,15
                ,16
                ,23
                ,37
                ,60
                ,58
                ,88
                ,50
                ,142
                ,66
                ,135
                ,94
                ,67
                ,1600
                ,55
                ,77
                ,82
                ,92
                ,124
                ,81
                ,57
                ,56
                ,112
                ,53
                ,99
                ,118
                ,52
                ,84
                ,73
                ,132
                ,117
                ,103
                ,131
                ,62
                ,105
                ,71
                ,79
                ,133
                ,69
                ,109
                ,49
                ,101
                ,136
                ,85
                ,47
                ,108
                ,61
                ,137
                ,106
                ,123
                ,129
                ,98
                ,119
                ,48
                ,90
                ,130
                ,110
                ,87
                ,46
                ,116
                ,104
                ,78
                ,144
                ,91
                ,59
                ,86
                ,127
                ,128
                ,95
                ,140
                ,113
                ,126
                ,138
                ,89
                ,96
                ,74
                ,75
                ,125
                ,65
                ,134
                ,139
                ,143
                ,100
                ,54
                ,64
                ,102
                ,122
                ,97
                ,51
                ,121
                ,72
                ,93
                ,68
                ,76
                ,63
                ,107
                ,114
                ,115
                ,120
                ,111
                ,70
                ,80
                ,141
                ,83
                ,1228
                ,697
                ,1231
                ,1545
                ,578
                ,1544
                ,1083
                ,1476
                ,637
                ,1057
                ,311
                ,382
                ,943
                ,1450
                ,761
                ,315
                ,416
                ,450
                ,1342
                ,841
                ,656
                ,19
                ,377
                ,788
                ,69
                ,1380
                ,136
                ,957
                ,1542
                ,1596
                ,1089
                ,25
                ,745
                ,35
                ,1215
                ,1564
                ,103
                ,418
                ,654
                ,48
                ,360
                ,1180
                ,1351
                ,1295
                ,650
                ,65
                ,985
                ,653
                ,928
                ,1250
                ,11
                ,782
                ,508
                ,181
                ,839
                ,645
                ,386
                ,26
                ,37
                ,1578
                ,477
                ,830
                ,123
                ,754
                ,1597
                ,505
                ,61
                ,1538
                ,211
                ,138
                ,1157
                ,1272
                ,1461
                ,318
                ,16
                ,813
                ,1389
                ,341
                ,460
                ,1136
                ,663
                ,1021
                ,1020
                ,861
                ,1576
                ,1428
                ,1493
                ,1237
                ,1586
                ,686
                ,487
                ,1162
                ,1010
                ,337
                ,1091
                ,1394
                ,485
                ,623
                ,847
                ,660
                ,406
                ,115
                ,205
                ,362
                ,1053
                ,1501
                ,1184
                ,869
                ,945
                ,326
                ,114
                ,997
                ,1220
                ,461
                ,881
                ,107
                ,1401
                ,1373
                ,1129
                ,470
                ,908
                ,14
                ,1265
                ,1224
                ,880
                ,199
                ,259
                ,13
                ,620
                ,33
                ,617
                ,766
                ,627
                ,581
                ,140
                ,1143
                ,695
                ,1536
                ,148
                ,920
                ,462
                ,296
                ,1191
                ,122
                ,334
                ,798
                ,394
                ,1003
                ,1399
                ,992
                ,530
                ,978
                ,1172
                ,810
                ,1540
                ,1521
                ,981
                ,1479
                ,153
                ,135
                ,1533
                ,1123
                ,720
                ,676
                ,1251
                ,1581
                ,905
                ,1372
                ,399
                ,358
                ,1473
                ,892
                ,592
                ,890
                ,516
                ,54
                ,609
                ,1514
                ,678
                ,999
                ,15
                ,753
                ,80
                ,694
                ,294
                ,1196
                ,1242
                ,862
                ,807
                ,1005
                ,1548
                ,170
                ,385
                ,132
                ,81
                ,447
                ,1130
                ,858
                ,1119
                ,993
                ,1551
                ,1347
                ,366
                ,265
                ,1182
                ,854
                ,110
                ,612
                ,1466
                ,146
                ,737
                ,1000
                ,1213
                ,457
                ,59
                ,868
                ,1011
                ,398
                ,1046
                ,898
                ,554
                ,168
                ,1035
                ,34
                ,223
                ,1040
                ,1386
                ,1227
                ,55
                ,1392
                ,228
                ,1523
                ,1366
                ,1448
                ,1275
                ,1458
                ,484
                ,536
                ,797
                ,261
                ,667
                ,1260
                ,539
                ,413
                ,1406
                ,585
                ,57
                ,570
                ,937
                ,84
                ,1145
                ,1169
                ,915
                ,100
                ,77
                ,506
                ,551
                ,275
                ,130
                ,670
                ,538
                ,434
                ,21
                ,409
                ,78
                ,954
                ,1280
                ,783
                ,112
                ,1029
                ,897
                ,400
                ,1140
                ,756
                ,482
                ,1015
                ,684
                ,936
                ,857
                ,914
                ,1013
                ,946
                ,139
                ,1426
                ,1322
                ,1284
                ,1433
                ,1500
                ,577
                ,730
                ,732
                ,1121
                ,1076
                ,1560
                ,1475
                ,472
                ,790
                ,1135
                ,917
                ,772
                ,961
                ,446
                ,162
                ,1573
                ,282
                ,1291
                ,1517
                ,1575
                ,378
                ,425
                ,90
                ,210
                ,877
                ,1465
                ,1330
                ,1247
                ,1343
                ,1319
                ,467
                ,1240
                ,838
                ,1410
                ,710
                ,750
                ,703
                ,639
                ,1111
                ,643
                ,769
                ,491
                ,718
                ,519
                ,202
                ,1490
                ,190
                ,756
                ,482
                ,1015
                ,684
                ,936
                ,857
                ,914
                ,1013
                ,946
                ,139
                ,1426
                ,1322
                ,1284
                ,1433
                ,1500
                ,577
                ,730
                ,732
                ,1121
                ,1076
                ,1560
                ,1475
                ,472
                ,790
                ,1135
                ,917
                ,772
                ,961
                ,446
                ,162
                ,1573
                ,282
                ,1291
                ,1517
                ,1575
                ,378
                ,425
                ,90
                ,210
                ,877
                ,1465
                ,1330
                ,1247
                ,1343
                ,1319
                ,467
                ,1240
                ,838
                ,1410
                ,710
                ,750
                ,703
                ,639
                ,1111
                ,643
                ,769
                ,491
                ,718
                ,519
                ,202
                ,1490
                ,190

                };
*/
        // int[] testSort = {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55};
       // int[] testSort = {5,15,16,23,37};

        // SquareSums.createGraphJSON(1600);
       // List<Integer> result = SquareSumsN5.buildUpTo(15);
      // List<Integer> result = SquareSums.buildUpTo(15);
      //  System.out.println(result);

        /*
        Random r = new Random();
        int min = 4; int max = 1600;
        int[] is = new int[501];
        for(int i = 0; i < 501; i++)
            is[i] = r.nextInt((max - min) + 1) + min;
        int[] testNs = {15};
*/

//        long start1 = System.currentTimeMillis();
//        int failCount = 0; int goodCount = 0;
//        for(int i = 0; i < 12; i++) {
//        // for(int i = 3; i < 1600; i++) {
//        // for(int i = 3; i < 1600; i++) {
//            List<Integer> answer = SquareSums.buildUpTo( testsFinal[i] );
//            // List<Integer> answer = SquareSumsDFS.SquareSumsSolve( testsFinal[i] );
//            //List<Integer> answer = SquareSums.buildUpTo( i );
//            // List<Hamiltonian.Node> answer = Hamiltonian.solve(i);
//            // List<Hamiltonian.Node> answer = Hamiltonian.solve( 20);
//            if(answer == null)
//                failCount++;
//            else
//                goodCount++;
//
//            if(answer == null)
//                System.out.println("No answer: " + testsFinal[i]);
//            // else
//            //    System.out.println(Arrays.toString(answer.toArray()));
////            No answer: 5
////            No answer: 19
////            No answer: 11
////            No answer: 14
////            No answer: 13
////            No answer: 21
//
//        }
//        long endtime = System.currentTimeMillis();
//        System.out.println("Total time: " + (endtime - start1));
//        System.out.println("FailCount: " + failCount);
//        System.out.println("GoodCount: " + goodCount);

        // int[] arr1 = {1,1,1,1,1};
        // int[] arr2 = {1,0,1};



        /*
        int[] arr1 = {1,0,0,1,1,1,1,0,1,0,1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,1,1,1,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,1,1,0,1,1,0,0,1,0,1,1,0,0,1,0,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,1,0,1,1,1,0,1,1,1,1,1,0,0,1,0,0,1,1,1,1,1,0,1,0,1,0,1,1,0,0,0,1,1,0,0,0,0,0,0,1,0,1,0,1,0,0,1,0,0,0,1,1,1,1,1,0,1,0,1,0,0,0,0,1,0,1,1,1,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,1,0,0,1,1,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,1,0,1,1,0,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,1,0,1,1,1,1,0,0,0,0,0,1,0,0,0,1,1,0,1,1,1,0,1,0,1,0,0,1,0,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,0,1,1,1,1,0,0,0,0,0,0,1,1,1,1,0,0,1,0,1,1,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0,1,0,1,1,1,1,1,0,0,0,1,1,0,1,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,1,1,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,0,1,1,0,0,0,0,0,0,1,1,1,0,1,0,1,1,0,1,1,0,0,0,1,0,1,1,1,0,0,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,1,0,1,1,0,0,1,0,0,1,0,1,0,1,1,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,1,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,0,0,0,1,0,1,1,1,0,0,0,0,0,0,1,1,0,1,0,0,1,1,0,1,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,1,1,1,0,0,0,1,1,0,1,0,1,0,0,0,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,0,1,0,0,0,1,1,1,0,0,0,0,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,0,0,1,1,0,0,0,0,1,1,0,1,0,0,1,0,0,0,0,1,1,1,1,1,0,1,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,1,0,1,1,0,0,1,0,1,0,0,1,1,1,0,0,0,0,0,0,0,1,0,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,0,0,0,1,1,1,0,0,0,0,1,1,0,0,1,1,1,0,1,0,1,1,1,0,0,1,0,1,1,0,0,0,1,0,0,1,1,1,1,0,0,1,0,0,0,0,1,1,1,1,0,0,1,1,0,1,0,0,1,1,1,1,1,1,0,0,1,0,1,1,0,1,0,0,1,0,0,1,1,1,1,1,0,1,0,0,1,1,0,1,1,0,1,1,0,1,1,1,0,0,1,0,1,1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,0,0,0,1,1,0};
        int[] arr2 = {1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,1,1,0,1,1,0,0,1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,1,1,0,0,1,1,1,0,1,1,0,1,0,1,0,0,0,0,1,1,0,1,1,1,0,0,0,1,1,1,0,0,1,0,1,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,1,1,0,0,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,1,1,0,0,0,1,0,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,1,0,0,0,0,1,1,0,0,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,1,0,1,1,0,1,0,0,0,1,1,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,0,1,1,1,0,1,1,1,1,0,1,1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,1,0,0,1,0,1,1,1,1,1,0,0,0,1,1,0,1,1,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,1,0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,1,1,1,0,1,1,1,1,1,0,0,1,0,0,0,0,0,1,1,1,0,1,1,1,1,1,0,0,0,0,1,0,1,1,1,0,1,0,1,1,0,0,0,0,0,0,0,0,1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,1,0,0,1,1,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,1,1,0,1,0,1,1,0,1,1,1,1,1,0,0,1,0,1,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,0,1,1,1,0,0,0,1,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,1,0,1,0,1,0,0,1,1,1,1,1,1,1,0,0,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,0,0,1,1,1,0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,1,0,1,1,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0,1,0,0,0,1,0,0,1,1,0,0,1,1,1,1,0,1,1,0,0,1,0,1,1,1,0,1,1,0,0,0,1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,0,0,0,1,1,0,1,0,1,1,1,0,0,0,0,1,0,1,0,1,1,0,1,1,1,0,0,0,0,1,0,1,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,1,0,1,1,0,1,1,1,0,0,0,0,0,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,0,1,1,1,1,1,0,1,1,0,0,0,1,0,0,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,1,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0,1,1,0,1,0,0,0,1,0,0,1,1,0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,1,1,1,0,0,1,1,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1,1,0,1,1,0,1,1,1,1,0,1,0,0,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0,0,1,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,0,1,0,1,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,0,1,0,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,0,0,0,0,0,1,0,0,0,1,0,1,0,1,1,1,1,0,0,1,1,1,1,0,0,1,0,0,1,0,0,0,0,1,1};


        LeetCode lc = new LeetCode();
        //System.out.println(Arrays.toString(lc.addNegabinary(arr1, arr2)));
        // int[][] points = {{3,2}, {-2,2}};
        // int[][] points = {{1,1}, {3,4}, {-1,0}};
        // 49088
        int[][] points = {{559,511},{932,618},{-623,-443},{431,91},{838,-127},{773,-917},{-500,-910},{830,-417},{-870,73},{-864,-600},{450,535},{-479,-370},{856,573},{-549,369},{529,-462},{-839,-856},{-515,-447},{652,197},{-83,345},{-69,423},{310,-737},{78,-201},{443,958},{-311,988},{-477,30},{-376,-153},{-272,451},{322,-125},{-114,-214},{495,33},{371,-533},{-393,-224},{-405,-633},{-693,297},{504,210},{-427,-231},{315,27},{991,322},{811,-746},{252,373},{-737,-867},{-137,130},{507,380},{100,-638},{-296,700},{341,671},{-944,982},{937,-440},{40,-929},{-334,60},{-722,-92},{-35,-852},{25,-495},{185,671},{149,-452}};
        // int[][] points = {{559,511},{932,618}};
        System.out.println(lc.minTimeToVisitAllPoints(points));


        MyHashMap map = new MyHashMap();
        map.put(1,1);
        map.put(2,2);
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        map.put(2,1);
        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map.get(2));
*/
     //   LeetCode lc = new LeetCode();
        // int[] arr = {1,2,2,6,6,6,6,7,10};
        // int[] arr = {1,1,2,2,3,3,3,3};
        // int[][] moves = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        // int[][] moves = {{1,0},{2,0},{0,1}};
        // System.out.println(lc.tictactoe(moves));

        // String s = "codeleet"; int[] indices = {4,5,6,7,0,2,1,3};
        // System.out.println(lc.restoreString(s, indices));

        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // System.out.println(lc.maxSubArray2(arr));

     //   System.out.println(lc.repeatedStringMatch("a", "aa"));

//        TreeNode root = new TreeNode(1);
//        TreeNode l2 = new TreeNode(2);
//        TreeNode l3 = new TreeNode(3);
//        TreeNode l4 = new TreeNode(4);
//
//        TreeNode r2 = new TreeNode(2);
//        TreeNode r3 = new TreeNode(3);
//        TreeNode r4 = new TreeNode(4);
//
//        root.left = l2;
//        root.right = r2;
//        // l2.left = l3;
//        l2.right = l3;
//        // r2.left = r4;
//        r2.right = r3;
//
//        System.out.println(lc.isSymmetric(root));

//        System.out.println("\n Left: ");
//        lc.printInorderLeft(l2);
//        System.out.println("\n Right: ");
//        lc.printInorderRight(r2);

        /*
        LeetCode lc = new LeetCode();
        System.out.println("S: " + lc.repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaa",
                "bacbacbac"));
*/

// ["MaxStack","push","popMax","push","push","push","pop","peekMax","push","pop","pop","push","peekMax","peekMax","push","peekMax","push","peekMax"]
// [[],[-2],[],[-45],[-82],[29],[],[],[40],[],[],[66],[],[],[-61],[],[98],[]]
   //["MaxStack","push[69]","top","popMax","push[-92]","pop","push[-83]","peekMax","push[-26]","pop","push[69]","pop","pop","push[92]","top","popMax","push[74]","push[-37]","pop","push[-86]","push[29]"]

     //[[],[69],[],[],[-92],[],[-83],[],[-26],[],[69],[],[],[92],[],[],[74],[-37],[],[-86],[29]]

     //[null,null,69,69,null,-92,null,0,null,-26,null,69,-83,null,92,92,null,null,-37,null,null]
     //[null,null,69,69,null,-92,null,-83,null,-26,null,69,-83,null,92,92,null,null,-37,null,null]

    // ["MaxStack","push[-23]","peekMax","push[-74]","popMax","push[-4]","push[20]","push[68]","top","push[83]","peekMax","push[73]","popMax","peekMax"]
    // [[],[-23],[],[-74],[],[-4],[20],[68],[],[83],[],[73],[],[]]


// ["MaxStack","push","peekMax","push","popMax","push","push","push","top","push","peekMax","push","popMax","peekMax"]
// [[],[-23],[],[-74],[],[-4],[20],[68],[],[83],[],[73],[],[]]

   //     [null,null,-23,null,-23,null,null,null,68,null,83,null,83,68]
   //     [null,null,-23,null,-23,null,null,null,68,null,83,null,83,73]

        /*
        MaxStack ms = new MaxStack();
        ms.push(-23);
        System.out.println(ms.peekMax());
        ms.push(-74);
        System.out.println(ms.popMax());
        ms.push(-4);
        ms.push(20);
        ms.push(68);
        System.out.println(ms.top());
        ms.push(83);
        System.out.println(ms.peekMax());
        ms.push(73);
        System.out.println(ms.popMax());
        System.out.println(ms.peekMax());
*/


        //         System.out.println(ms.peekMax());

        // System.out.println(ms.popMax());
        // System.out.println(ms.top());
        // System.out.println(ms.peekMax());
        //System.out.println(ms.pop());
        //System.out.println(ms.top());

/*
        System.out.println(ms.top());
        System.out.println(ms.popMax());
        System.out.println(ms.top());
        System.out.println(ms.peekMax());
        System.out.println(ms.pop());
        System.out.println(ms.top());
*/
        // char[] x = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        // char[] x = {'a','a','a','b','b','a','a'};
        // char[] x = {'a','a','a','a','a','b'};

        //String A = "abcd";
        //String B = "abcd";
        // String A = "aaaaaaabc"; String B = "aaaaaaacb";
       //  LeetCode lc = new LeetCode();
        // System.out.println(lc.buddyStrings(A, B));
        // System.out.println(lc.trailingZeroes(5));
        // System.out.println(lc.toHex(-1));

/*
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode zero = new TreeNode(0);
        one.left = zero; one.right = two;
        TreeNode node = lc.trimBST(one, 1, 2);
        System.out.println(node.val);
*/

        // int[] nums = {-10,-3,0,5,9};
        // TreeNode node = lc.sortedArrayToBST(nums);
        //System.out.println(node.val);


        // [[3,[4,5,8,2]],[3],[5],[10],[9],[4]]
/*
        int[] nums = {4,5,8,2};
        KthLargest kth = new KthLargest(3, nums);
        System.out.println(kth.add(3));
        System.out.println(kth.add(5));
        System.out.println(kth.add(10));
        System.out.println(kth.add(9));
        System.out.println(kth.add(4));
*/

        // String A = "abac";
        // String B = "abad";
        // String A = "aaaaaaabc"; String B = "aaaaaaacb";
        // LeetCode lc = new LeetCode();
        //System.out.println(lc.buddyStrings(A, B));

        // int[] nums = {1,2,1,2,1};

        //-93

        /*
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        Path filePath = Paths.get(dir + "/src/main/java/com/michaelahern/testData.txt");
        String content = Files.readString(filePath, StandardCharsets.US_ASCII);
        String[] numbers = content.split(",");
        int[] nums = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++)
            nums[i] = Integer.valueOf(numbers[i]);

        System.out.println("Size: " + nums.length);

        System.out.println(lc.subarraySum( nums , -93));

        LeetCode lc = new LeetCode();
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        one.right = two;
        two.right = five;
        five.left = four;
        five.right = six;
        four.left = three;

        System.out.println(Arrays.toString(lc.rightSideView(one).toArray()));
*/
        // int[] nums = {3,2,3,1,2,4,5,5,6};
        //int[] nums = {-1, 2, 0};
        //LeetCode lc = new LeetCode();
        //System.out.println(lc.findKthLargest(nums, 1));
//        BitShifting bitShifting = new BitShifting();
//         bitShifting.shiftTests();
        /*
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println(lcs.lcs( "HPRCFJBD03:H90G?L3>?K8SFQ495G=4R:F7@1;1<", "2F?5ORA0;DB??8K2SSG:BE0:4@8?1NGR?P6;6SMO"));

        int[] one =   {7, 6, 5, 4};
        int[] two =   {4, 0, 1, 2};
        int[] three = {2, 5, 0, 4};
        int[] four =  {4, 1, 4, 2};
        int[][] matrix = {one, two, three, four};


        MatrixPath mp = new MatrixPath();
        mp.findAllPaths(matrix, 0, 0);
*/

        // int eggs = 2, m = 3213;
        // int tries = 3213;
        // int N = 15;
        // Faberge eggDrop = new Faberge();
        // eggDrop.fun2(eggs, 17);
        /*
        System.out.println("Minimum floor in worst"
                + " case with "
                + eggs + "  eggs and "
                + N + " floors is " + eggDrop.superEggDropLCOriginal(eggs, N));  // n eggs
        */
                // Faberge.preCalc();
        //        System.out.println(eggDrop.height(BigInteger.valueOf(80000), BigInteger.valueOf(100000)));  // n eggs


        /*
        Immortal Test Cases
        8, 5, 1, 100
        8, 8, 0, 100007
        25, 31, 0, 100007
        5, 45, 3, 1000007
        31, 39, 7, 2345
        545, 435, 342, 1000007
        28827050410, 35165045587, 7109602, 13719506  
*/
        long previous = 0;
        long current = 0;

        //for(int i = 0; i < 8; i++)
        //    for(int j = 0; j < 8; j++)
        //        System.out.println(i + ", " + j + " :: " + Immortal.rangeSum(i, j));

        // current = Immortal.elder_age(10, 10, 0, 10000);
        // System.out.println("Got: " + current + " Expecting: ?");

        //current = Immortal.elderAge2(10, 10, 1, 100);
        // System.out.println("\n\nGot: " + current + " Expecting: 5");

        // current = Immortal.elder_age(8, 5, 1, 100);
        // System.out.println("Got: " + current + " Expecting: 5");
/*
        current = Immortal.elderAge(8, 5, 1, 100);
        System.out.println("Got: " + current + " Expecting: 5");

        current = Immortal.elderAge(8, 8, 0, 100007);
        System.out.println("Got: " + current + " Expecting: 224");

        current = Immortal.elderAge(25, 25, 0, 100007);
        System.out.println("Got: " + current + " Expecting: 9096");

        current = Immortal.elderAge(25, 31, 0, 100007);
        System.out.println("Got: " + current + " Expecting: 11925");

        current = Immortal.elderAge(5, 45, 3, 1000007);
        System.out.println("Got: " + current + " Expecting: 4323");

        current = Immortal.elderAge(31, 39, 7, 2345);
        System.out.println("Got: " + current + " Expecting: 1586");

        current = Immortal.elderAge(545, 435, 342, 1000007);
        System.out.println("Got: " + current + " Expecting: 808451");

        current = Immortal.elderAge(28827050410L, 35165045587L, 7109602, 13719506);
        System.out.println("Got: " + current + " Expecting: 5456283");
*/
/*
        for(int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++) {
                current = Immortal.elderAge2(i, j, 0, 100);
                // System.out.println(i + ", " + j + " :: " + current + " :: " + (current - previous));
                previous = current;
            }
 */
        // System.out.println(Immortal.elderAge2(28827050410l, 35165045587l, 7109602l, 13719506l));

        /*
        ContiguousArray ca = new ContiguousArray();
        int[] nums = {0,1,1,0,1,0,
                      1,1,0,1,0,0,
                      0,0,1,0,1,1,
                      1,0,1,0,1,0,0,1,1,0,0,1,
                      0};
        int max = ca.longest(nums);
        System.out.println("Max: " + max);

        String s = "(((((()*)(*)*))())())(()())())))((**)))))(()())()";
        CheckValidString cvs = new CheckValidString();
        System.out.println(cvs.checkValidString(s));


        // int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int[][] matrix = {{1}};

        TwoDMatrixSearch search = new TwoDMatrixSearch();
        System.out.println(search.searchMatrix(matrix, 0));


        CoinChange coinChange = new CoinChange();
        int[] coins = {186,419,83,408};
        System.out.println(coinChange.coinChange(coins, 6249));
        System.out.println(coinChange.coinChange2(coins, 6249));
        System.out.println(coinChange.coinChange3(coins, 6249));


        FindItinerary fi = new FindItinerary();
        String[][] tick1 = {{"MUC","LHR"}, {"JFK","MUC"}, {"SFO","SJC"}, {"LHR","SFO"}};
        List<List<String>> tickets = new ArrayList<>();
        for(String[] y : tick1) {
            List<String> l = new ArrayList<>();
            for(String s : y)
                l.add(s);

            tickets.add(l);
        }
        List<String> list = fi.findItinerary(tickets);
        System.out.println(Arrays.toString(list.toArray()));



        PartitionLabels pl = new PartitionLabels();
        pl.partitionLabels("ababcbacadefegdehijhklij");

        TwoSumLessThanK tslk = new TwoSumLessThanK();

        int[] nums = {4,5,6,7,0,1,2};

        System.out.println(tslk.twoSumLessThanK(nums, 6));

        int[] nums = { [5,7,11,13]};
        RotatedSortedArray rsa = new RotatedSortedArray();
        System.out.println(rsa.search(nums, 1));


        MissingNumber mn = new MissingNumber();
        int[] nums = {15,13,12};
        System.out.println(mn.missingNumber(nums));


        DeleteNodes dl = new DeleteNodes();
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        one.left = two;
        one.right = three;
        two.left = four; two.right = five;
        three.left = six; three.right = seven;
        int[] to_delete = {3, 5};
        List<TreeNode> answer = dl.delNodes(one, to_delete);
        for(TreeNode node : answer) {
            System.out.print("[");
            printNode(node);
            System.out.print("], ");
        }
        System.out.print("\n\n");


        ReorganizeString reorg = new ReorganizeString();
        System.out.println(reorg.reorganizeString("zzzcccrrraaabbb"));


        int nums[] = {1,3,5};
        NumArray na = new NumArray(nums);
        System.out.println(na.sumRange(0,2));
        na.update(1,2);
        System.out.println(na.sumRange(0,2));

        int nums[] = {9,-8};
        NumArray na = new NumArray(nums);
        na.update(0,3);
        System.out.println(na.sumRange(1,1));
        System.out.println(na.sumRange(0,1));
        na.update(1,-3);
        System.out.println(na.sumRange(0,1));



        //int nums[] = {0,9,5,7,3};
        int nums[] = {1,3,5};
        NumArray na = new NumArray(nums);
        System.out.println(na.prefixSum(1));
        System.out.println(na.prefixSum(2));
        System.out.println(na.prefixSum(3));

        System.out.println(na.sumRange(0,2));
        na.update(1,2);
        System.out.println(na.sumRange(0,2));
        System.out.println(na.sumRange(3,3));
        na.update(4,5);
        na.update(1,7);
        na.update(0,8);

        System.out.println(na.sumRange(1,2));
        na.update(1,9);

        System.out.println(na.sumRange(4,4));
        na.update(3,4);

        NextGreaterElement nge = new NextGreaterElement();
        System.out.println(nge.nextGreaterElement(123851));

        // int citations[] = {1,3,1};  // [1,3,1]
        int citations[] = {3,0,6,1,5};
        HIndex hi = new HIndex();
        System.out.println(hi.hIndex(citations));

        FindItinerary fi = new FindItinerary();
        // String[][] tick1 = {{"MUC","LHR"}, {"JFK","MUC"}, {"SFO","SJC"}, {"LHR","SFO"}};
        String[][] tick1 = {{"JFK","SFO"}, {"JFK","ATL"}, {"SFO","ATL"}, {"ATL","JFK"}, {"ATL","SFO"}};

        List<List<String>> tickets = new ArrayList<>();
        for(String[] y : tick1) {
            List<String> l = new ArrayList<>();
            for(String s : y)
                l.add(s);

            tickets.add(l);
        }
        List<String> list = fi.findItinerary(tickets);
        System.out.println(Arrays.toString(list.toArray()));
*/
        // int[] arr = {9,4,2,1,3};
        int[] arr = {4,2,1,3};

        ListNode head;
        ListNode next = new ListNode(arr[0], null);
        head = next;
        for(int i = 1; i < arr.length; i++) {
            next.next = new ListNode(arr[i], null);
            next = next.next;
        }

        SortList sl = new SortList();
        ListNode answer = sl.sortList(head);
        while(answer.next != null) {
            System.out.print(answer.val + ", ");
            answer = answer.next;
        }

    }

    private static void printNode(TreeNode node) {
        if(node == null) return;
        System.out.print(node.val); System.out.print(",");
        printNode(node.left); printNode(node.right);
    }


}
