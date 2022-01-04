package com.michaelahern;

import com.michaelahern.tsp.IsRobotBounded;

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

        // int[] arr = {9,4,2,1,3};
        int[] arr = {4,19,14,5,-3,1,8,5,11,15};
        // int[] arr = {-1,5,3,4,0};
        // int[] arr = {4,2,1,3};

        ListNode head;
        ListNode next = new ListNode(arr[0], null);
        head = next;
        for(int i = 1; i < arr.length; i++) {
            next.next = new ListNode(arr[i], null);
            next = next.next;
        }

        SortList sl = new SortList();
        ListNode answer = sl.sortList(head);
        while(answer != null) {
            System.out.print(answer.val + ", ");
            answer = answer.next;
        }
        System.out.println("\n");


        FindCheapestFlights fcf = new FindCheapestFlights();
        // Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
        // int[][] flights = {{0,1,100}, {1,2,100}, {0,2,500}};
        // int[][] flights = {{0,12,28},{5,6,39},{8,6,59},{13,15,7},{13,12,38},{10,12,35},{15,3,23},{7,11,26},{9,4,65},{10,2,38},{4,7,7},{14,15,31},{2,12,44},{8,10,34},{13,6,29},{5,14,89},{11,16,13},{7,3,46},{10,15,19},{12,4,58},{13,16,11},{16,4,76},{2,0,12},{15,0,22},{16,12,13},{7,1,29},{7,14,100},{16,1,14},{9,6,74},{11,1,73},{2,11,60},{10,11,85},{2,5,49},{3,4,17},{4,9,77},{16,3,47},{15,6,78},{14,1,90},{10,5,95},{1,11,30},{11,0,37},{10,4,86},{0,8,57},{6,14,68},{16,8,3},{13,0,65},{2,13,6},{5,13,5},{8,11,31},{6,10,20},{6,2,33},{9,1,3},{14,9,58},{12,3,19},{11,2,74},{12,14,48},{16,11,100},{3,12,38},{12,13,77},{10,9,99},{15,13,98},{15,12,71},{1,4,28},{7,0,83},{3,5,100},{8,9,14},{15,11,57},{3,6,65},{1,3,45},{14,7,74},{2,10,39},{4,8,73},{13,5,77},{10,0,43},{12,9,92},{8,2,26},{1,7,7},{9,12,10},{13,11,64},{8,13,80},{6,12,74},{9,7,35},{0,15,48},{3,7,87},{16,9,42},{5,16,64},{4,5,65},{15,14,70},{12,0,13},{16,14,52},{3,10,80},{14,11,85},{15,2,77},{4,11,19},{2,7,49},{10,7,78},{14,6,84},{13,7,50},{11,6,75},{5,10,46},{13,8,43},{9,10,49},{7,12,64},{0,10,76},{5,9,77},{8,3,28},{11,9,28},{12,16,87},{12,6,24},{9,15,94},{5,7,77},{4,10,18},{7,2,11},{9,5,41}};


        // int[][] flights = {{4,1,1}, {1,2,3}, {0,3,2}, {0,4,10}, {3,1,1}, {1,4,3}};
        // System.out.println(fcf.findCheapestPrice(4, flights, 0, 3, 1 ));
        // int[][] flights = {{1,2,10}, {2,0,7}, {1,3,8}, {4,0,10}, {3,4,2}, {4,2,10}, {0,3,3}, {3,1,6}, {2,4,5}};
        int[][] flights = {{0,1,1}, {0,2,5}, {1,2,1}, {2,3,1}};
        System.out.println(fcf.findCheapestPrice(4, flights, 0, 3, 1 ));

        // System.out.println(fcf.findCheapestPrice(17, flights, 13, 4, 13 ));
        //int[][] flights = {{0,1,5}, {1,2,5}, {0,3,2}, {3,1,2}, {1,4,1}, {4,2,1}};
        //System.out.println(fcf.findCheapestPrice(5, flights, 0, 2, 2 ));


        TreeNode three = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        three.left = nine;
        three.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        LevelOrder lo = new LevelOrder();
        List<List<Integer>> answer = lo.levelOrder(three);
        for(List<Integer> row : answer) {
            System.out.println(Arrays.toString(row.toArray()));
        }

        int[][] tests = {{1,1,-1,-2},{1,-2,-2,-2}, {5,10,-5}, {8,-8}, {10,2,-5}, {-2,-1,1,2}, {-2,-2,1,-1}};
        // int[] test = {5,10,-5};
        // int[] test = {8,-8};
        AsteroidCollision ac = new AsteroidCollision();

        //int[] test = {10,2,-5};
        //int[] answer = ac.asteroidCollision(test);
        //System.out.println(Arrays.toString(answer));
        // int[] test = {-2,-1,1,2};

        for(int[] test : tests) {
            int[] answer = ac.asteroidCollision(test);
            System.out.println(Arrays.toString(answer));
        }

        ValidateIPAddress vip = new ValidateIPAddress();
        System.out.println(vip.validIPAddress("172.16.204.1"));

        RestoreIPAddress rip = new RestoreIPAddress();
        String s = "25525511135";
        List<String> list = rip.restoreIpAddress(s);
        for(String a:list)
            System.out.println(a);

        RemoveDuplicateLetters rdl = new RemoveDuplicateLetters();
        System.out.println(rdl.removeDuplicateLetters("cbacdcbc"));


        //int[] nums = {2,6,4,8,10,9,15};
        // int[] nums = {1,2,3,4};
        //int[] nums = {2,1};
        //int[] nums = {2,3,3,2,4};
        // int[] nums = {1, 2};
        // int[] nums = {1,3,2,2,2};
        int[] nums = {1,5,2,2,2,3,4};
        // int[] nums = {1,1,1,1,1,1,1,1,1};
        // int[] nums = {1,3,2};

        //int[] nums = {1,2,3,5,4};
        FindUnsortedSubarray fusa = new FindUnsortedSubarray();
        System.out.println(fusa.findUnsortedSubarray(nums));


        // int[][] events = {{1,2}, {1,2}, {3,3}, {1,5}, {1,5}};
        int[][] events = {{1,4}, {4,4}, {2,2}, {3,4}, {1,1}};
        MaxEvents me = new MaxEvents();
        System.out.println(me.maxEvents(events));




        OrangesRotting or = new OrangesRotting();
        int[][] oranges = {{2,1,1}, {1,1,0}, {0,1,1}};
        System.out.println(or.orangesRotting(oranges));

        AmazonAssessment aa = new AmazonAssessment();
        int[] list = {1, 1, 2, 4, 5, 5};
        List<Integer> myList = new ArrayList<>();
        for(int i : list)
            myList.add(i);
        System.out.println(AmazonAssessment.countMaximumTeams(myList,  3, 2));


        int[] list = {1, 2, 3};
        List<Integer> myList = new ArrayList<>();
        for(int i : list)
            myList.add(i);

        SubSets.getTotalImbalance(myList);

        int[] list = {1, 3, 2};
        List<Integer> myList = new ArrayList<>();
        for(int i : list)
            myList.add(i);

        System.out.println(SubSets.getTotalImbalance(myList));

        ScoreOfParentheses sop = new ScoreOfParentheses();
        System.out.println(sop.scoreOfParentheses("(()(()))"));



        int n = 6; int[][] edges = {{3,0}, {3,1}, {3,2}, {3,4}, {5,4}};
        MinimumHeightTree mht = new MinimumHeightTree();
        System.out.println(mht.findMinHeightTrees(n, edges));

        String instructions = "GG";
        IsRobotBounded irb = new IsRobotBounded();
        System.out.println(irb.isRobotBounded(instructions));

        int[] list = {1,2,3,4,5};
        ListNode one   = new ListNode(1);
        ListNode two   = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four  = new ListNode(4);
        ListNode five  = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;


        RemoveNthNode rnn = new RemoveNthNode();
        ListNode result = rnn.removeNthFromEnd(one, 2);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }


        ReverseBetween rb = new ReverseBetween();
        ListNode result = rb.reverseBetween(one, 2, 4);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }


        // int[][] board = {{110,5,112,113,114},{210,211,5,213,214},{310,311,3,313,314},{410,411,412,5,414},{5,1,512,3,3},{610,4,1,613,614},{710,1,2,713,714},{810,1,2,1,1},{1,1,2,2,2},{4,1,4,4,1014}};
        //int[][] board = {{1,3,5,5,2},{3,4,3,3,1},{3,2,4,5,2},{2,4,4,5,5},{1,4,4,1,1}};
        int[][] board = {{2,1,3},{2,2,3},{2,3,3}};

        for (int[] row : board)
            System.out.println(Arrays.toString(row));
        CandyCrush cc = new CandyCrush();
        int[][] zeroes = cc.candyCrush(board);
        System.out.println("***********************");
        for (int[] row : zeroes)
            System.out.println(Arrays.toString(row));

        System.out.println("***********************");

        for (int[] row : board)
            System.out.println(Arrays.toString(row));




        TreeNode root = new TreeNode(1);
        TreeNode gen1Left = new TreeNode(0);
        TreeNode gen1Right = new TreeNode(1);
        root.left = gen1Left; root.right = gen1Right;

        TreeNode gen2LLeft = new TreeNode(0);
        TreeNode gen2LRight = new TreeNode(0);
        gen1Left.left = gen2LLeft;
        gen1Left.right = gen2LRight;

        TreeNode gen2RLeft = new TreeNode(0);
        TreeNode gen2RRight = new TreeNode(0);
        gen1Right.left = gen2RLeft;
        gen1Right.right = gen2RRight;

        PruneTree pt = new PruneTree();
        TreeNode answer = pt.pruneTree(root);
        if(answer.equals(root)) System.out.println("Worked"); else System.out.println("Failed");



        ListNode one   = new ListNode(1);
        ListNode two   = new ListNode(2);
        ListNode three_a = new ListNode(3);
        ListNode three_b = new ListNode(3);
        ListNode four_a  = new ListNode(4);
        ListNode four_b  = new ListNode(4);
        ListNode five  = new ListNode(5);

        one.next = two;
        two.next = three_a;
        three_a.next = three_b;
        three_b.next = four_a;
        four_a.next = four_b;
        four_b.next = five;

        DeleteDuplicates dd = new DeleteDuplicates();
        ListNode node = dd.deleteDuplicates(one);

        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }

        int[] nums = {20,100,10,12,5,13};
        IncreasingTriplet it = new IncreasingTriplet();
        System.out.println(it.increasingTriplet(nums));


        Node zero = new Node(1);
        Node two = new Node(1);
        Node four = new Node(1);
        Node five = new Node(1);

        zero.random = four;
        zero.left = null;
        zero.right = two;

        two.random = zero;
        two.left = null;
        two.right = four;

        four.random = five;
        four.left = five;
        four.right = null;

        five.random = five;
        five.left = null;
        five.right = null;

        CopyRandomBinaryTree cbt = new CopyRandomBinaryTree();
        NodeCopy copy = cbt.copyRandomBinaryTree(zero);
        System.out.println(copy.val);

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
       // ListNode three = new ListNode(3);
       // ListNode four = new ListNode(4);
       // ListNode five = new ListNode(5);

        one.next = two;
        two.next = null;
        //three.next = four;
        //four.next = five;

        SwapPairs sp = new SwapPairs();
        ListNode answer = sp.swapPairs(one);
        while(answer != null) {
            System.out.println(answer.val);
            answer = answer.next;
        }

        OrangesRotting or = new OrangesRotting();
        int[][] oranges = {{2,1,1}, {1,1,0}, {0,1,1}};
        System.out.println(or.orangesRotting(oranges));


        int[] arr = {1,1,1,1,1,1,1,1};
        MinSubArrayLen msal = new MinSubArrayLen();
        System.out.println(msal.minSubArrayLen(11, arr));

        // int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
        // int[][] intervals = {{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};
        // int[][] intervals = {{81,97},{-71,60},{36,97},{76,96},{59,68},{54,88},{-65,40},{83,84},{27,50},{-59,-50},{73,78},{50,57},{-49,81},{-16,90},{-83,-23},{-58,98},{78,99},{-57,81},{-2,85},{-88,45},{85,90},{-64,17},{76,78},{-17,5},{-98,15},{86,100}};

        // int[][] intervals = {{40,70},{56,80},{63,87},{-51,39},{-74,59},{38,41},{-49,17},{6,57},{36,85},{-73,26},{-6,70},{15,70},{66,78},{37,87},{79,96},{46,97},{36,49},{-58,40},{-58,52},{26,83},{-27,43},{15,86},{11,56},{23,34},{-9,73},{-95,-75},{2,30},{-91,26},{88,89},{-83,-43}};
        int[][] intervals = {{-18220,40982},{-43960,-31024},{18797,43662},{2956,18609},{38243,45048},{12746,28757},{-10891,25995},{-49241,9617},{-7857,47361},{-7080,3852},{-24115,-20686},{7384,35669},{-17668,9643},{-29204,28182},{-26068,16726},{-9918,40568},{20196,46770},{21444,30271},{-6582,13139},{19625,34542},{17296,37476},{-47455,2733},{-35828,49833},{-13670,20344},{43770,46295},{-4070,42565},{22846,31837},{35922,46461},{-30714,44139},{-23353,27616},{-10784,-7119},{12179,34858},{-3338,30912},{-48584,35903},{-19769,6933},{34756,49968},{48150,48483},{46243,47847},{-49351,-35146},{47887,49147},{46478,48541},{-39737,21549},{14699,43684},{44023,47003},{20839,31554},{-41111,-39222},{-10723,31352},{-34931,49578},{-28414,-28003},{41718,44610},{-11812,1017},{-13705,11296},{-14942,37221},{-17247,47354},{7472,25442},{34972,43200},{-11203,14545},{44835,49996}};

        EraseOverlapIntervals eoi = new EraseOverlapIntervals();
        System.out.println(eoi.eraseOverlapIntervals(intervals));

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode seven = new ListNode(7);

        two.next = seven; sReven.next = four; four.next = three; three.next = five;
        NextLargerNodes nln = new NextLargerNodes();
        int[] answer = nln.nextLargerNodes(two);
        System.out.println(Arrays.toString(answer));


        BinarySearch bs = new BinarySearch();
        int[] list = {5};
        System.out.println(bs.search(list, 5));

        int[] list = {0,1,0,3,12};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(list);
        System.out.println(Arrays.toString(list));

        LengthOfLongestSubstring llss = new LengthOfLongestSubstring();
        System.out.println(llss.lengthOfLongestSubstring("abcabcbb"));

        CheckInclusion ci = new CheckInclusion();
        System.out.println(ci.checkInclusion("hello",
                "ooolleoooleh"));


        int[][] matrix = new int[][] {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        SetZeroes s = new SetZeroes();
        s.setZeroes(matrix);
        for(int[] row : matrix)
            System.out.println(Arrays.toString(row));


        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        one.left = two;
        one.right = three;
        two.left = four; two.right = five;
        three.left = six; three.right = seven;

        PopulatingNextRightPointers pnrp = new PopulatingNextRightPointers();
        one = pnrp.connect(one);
        System.out.println(one.val);


        Combinations c = new Combinations();
        List<List<Integer>> list = c.combine(4, 2);
        for(List<Integer> l : list)
            System.out.println(Arrays.toString(l.toArray()));


        LetterCasePermutation lcp = new LetterCasePermutation();
        List<String> answer = lcp.letterCasePermutation("a1b2");
        for(String s : answer) System.out.println(s);


        List<Integer> one = new ArrayList<>();
        one.add(2);
        List<Integer> two = new ArrayList<>();
        two.add(3); two.add(4);
        List<Integer> three = new ArrayList<>();
        three.add(5); three.add(6); three.add(7);
        List<Integer> four = new ArrayList<>();
        four.add(4); four.add(1); four.add(8); four.add(3);

        List<List<Integer>> master = new ArrayList<>();
        master.add(one); master.add(two); master.add(three); master.add(four);

        MinimumTotal minimumTotal = new MinimumTotal();
        System.out.println(minimumTotal.minimumTotal(master));
*/
        // int[][] map = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        // int[][] map = {{1,1},{1,1},{1,1}};
        //int[][] map = {{10,10,10},{10,1,10},{10,10,10}};
        /*
        int[][] map = {{1,2,3},{8,9,4},{7,6,5}};
        PacificAtlantic pa = new PacificAtlantic();
        List<List<Integer>> answer = pa.pacificAtlantic(map);
        for(List<Integer> l : answer)
            System.out.println(Arrays.toString(l.toArray()));
*/

        int[] nums = {2700,3607,-1988,-495,2573,2447,-1757,-249,1654,-1452,-1570,2433,1145,3572,-1317,2488,2330,3358,1644,1537,-1992,1401,-1866,2250,2649,2457,3349,-4,-313,-764,3248,1277,1201,-401,-1562,-1536,2084,-1675,-688,1491,1762,820,-1722,-234,2112,1269,588,752,3971,1209,637,3843,1083,1682,2519,-20,2519,3105,3383,960,2291,-1858,-1118,1098,-1934,3737,3218,3475,2068,2395,1931,2882,576,954,1065,-1476,-1280,-264,-1003,2403,2465,-325,2233,2437,533,1752,964,3926,2045,3767,-1623,-1406,1030,1576,1380,2587,3681,1320,-1445,-1692,2552,1016,533,-1960,-1071,3672,1977,3035,-1530,2910,1065,3666,3827,1124,1507,1141,1830,-747,520,-83,953,1418,696,414,2752,-1809,441,3983,2839,2563,-1800,-1614,348,3097,3105,-1914,1334,2208,514,1116,-821,-676,-1595,1952,1440,2011,-1617,3546,813,3959,74,-1307,2669,-1713,2052,3942,-276,2181,-1870,-940,-1813,754,637,3973,3062,-75,3239,1346,-234,1181,-833,3646,-1478,2762,-314,1143,-1712,1326,-192,1820,1676,2748,3916,3384,-778,3253,2754,1712,2199,1719,-632,1014,1061,-1269,3672,2572,3464,-242,-1456,531,3820,-770,1529,-393,1811,3987,1546,2663,3305,1216,3077,966,201,2561,2193,3190,-71,-1961,334,1733,-901,1333,-1720,-1968,875,1686,-918,657,-212,-1671,-610,3347,-714,3365,650,3995,1889,631,782,2606,-339,-1845,1378,3007,3329,2776,1044,-1394,507,3589,3181,-742,3866,2704,-295,1233,2437,-1244,1361,-1406,2245,1207,-72,-624,2143,2962,3061,-1717,29,-1183,-950,1963,-166,369,3983,1987,-1497,-1477,-859,-1798,171,1100,-1776,1546,1560,2469,-766,1189,1220,705,-774,2458,2506,2019,-1171,-89,3626,3879,380,2654,2394,66,3676,-884,-1800,3703,1373,933,-1227,2964,-1817,-1454,-864,679,2662,-513,2067,3683,2288,1987,-1124,248,3462,56,-1384,-1170,-1794,-676,1207,-884,-529,3367,-1210,1810,-1928,2877,-571,-1614,-1764,-206,-828,1310,-785,-1264,2818,1717,301,2950,546,-162,2276,-430,761,2719,2671,347,103,2774,3413,2935,-610,2833,2182,-578,2552,1102,-1023,632,-848,3758,2669,1555,1079,-1756,473,-487,3194,1217,2542,2754,-577,1327,1906,3242,1720,2947,3102,-1047,1000,1046,1398,2652,3720,-1883,3429,675,-730,671,591,-99,3822,-1959,1616,395,2167,2739,2885,-1744,511,1954,-607,1124,-1857,1834,1844,3347,398,-1561,1274,-1402,3062,-1720,3221,3340,3803,1497,524,52,-411,-1591,2855,-608,-22,-335,2768,-617,-1759,1798,2963,-1524,1657,1110,-1639,2863,250,3409,-911,432,55,3437,-802,-1136,2554,3229,3692,1146,-264,590,2894,1557,3107,-1651,-363,315,-16,817,2179,1323,-1176,2107,743,1994,3767,86,-1145,-1212,-224,-1002,705,-1464,-1989,2164,-598,864,3973,3671,3927,-922,-1253,-1549,2975,-859,345,-1106,3029,1559,192,1488,-460,3978,2202,-977,2323,-405,2885,2345,1814,2903,-66,-469,544,-1893,3039,3780,-1194,-1554,1915,2315,-619,-1352,2879,-719,3926,-246,1765,-1544,1022,3461,-804,-1183,3052,1035,870,924,-828,3308,3102,3735,3794,2005,2414,1954,3107,1850,1916,-1105,-1087,-294,-1666,-1536,369,960,-438,1398,-1777,679,3160,3328,-867,1004,3023,-80,2400,-1971,3554,2275,-719,29,1340,230,2702,3991,2180,-1184,-958,1188,-590,821,3271,-942,3019,-196,3508,1017,1031,-1112,833,203,3191,553,315,3019,3004,-657,2151,2502,3528,156,-1135,441,429,1643,873,918,-240,-271,331,1520,1161,675,1250,593,1226,3803,3683,-1570,1748,1167,1039,-75,-983,3793,469,1603,3340,-303,-1003,319,348,3256,-807,1484,-778,-1380,3715,1736,1113,-1781,-1107,601,2497,544,-906,-1903,2487,2768,3329,1528,-1454,-88,967,-1572,-41,-963,3270,1092,2426,1389,3685,-303,-1120,249,2061,-1461,1090,-1348,-1170,3707,1913,-1285,376,385,2897,2151,-360,3732,1489,765,503,2015,2066,3359,-660,-1605,-1428,2430,3399,982,-529,-1104,-268,1745,212,1784,-813,1743,3222,1632,3573,2363,2331,379,-456,-494,-468,3968,2662,1352,-339,-218,395,2308,-195,2037,3083,-1723,-1051,1862,-805,3353,1583,1496,-421,1380,192,-662,2107,1412,1868,1617,352,2521,2515,2303,-826,-409,2285,3616,-276,1585,121,-63,3579,3956,1159,364,1693,115,938,3995,2154,1862,-1903,2872,-1533,-386,550,2403,3479,-800,2537,-940,687,3045,-1271,821,-843,2546,3613,3346,-800,-427,1820,-1645,1503,2560,2400,2083,632,-1201,1505,347,3367,1916,-868,185,2848,3959,195,602,2674,-1159,-466,-893,2529,3859,-982,1544,2702,3999,1641,619,-1963,100,3725,1745,1384,977,-1646,-1494,664,623,-1546,-50,-923,2805,3509,1007,2533,-1403,3308,1282,3573,1214,1365,2205,-770,219,-666,1875,-1396,650,2194,-401,2321,-1666,1545,-1153,-1313,-1954,2685,3285,1142,609,3578,2687,1689,-983,1800,1277,-974,-1443,551,647,2699,-1725,-1639,1318,38,-16,-684,-893,1870,-1850,-1959,2291,1100,2468,3670,-1992,1871,534,-429,2098,-9,2979,-639,2542,3179,-1442,750,1810,1177,-39,1167,2576,230,-1492,1274,212,2790,-1043,-1194,1917,1616,697,3679,1053,-686,2465,213,-1634,-1087,1478,2452,-1014,1130,2020,-357,3473,1494,2808,-1557,3304,2207,3863,3239,1504,-1072,-558,2699,-1910,470,-1001,3609,-773,3190,1974,3674,-850,-864,-1601,3238,2493,569,-182,3865,1472,1485,2245,2890,-1331,-128,2323,-263,839,3855,-1043,1906,836,-88,3148,146,1773,-628,379,1284,1666,21,-1204,3341,8,502,-681,3148,1335,75,-796,3348,2202,2491,1003,1470,-1779,203,532,1585,-1636,-1540,1910,3646,685,3346,3566,1817,2810,-1748,-739,1370,3792,3124,3721,-811,3902,1923,-1340,2871,1488,-1483,972,2123,3195,-1336,688,3270,2994,2804,-583,3082,1996,-1808,-981,3442,1849,1720,-1965,2718,1440,720,2591,346,3794,1083,-1834,-1534,-1501,3714,-634,2019,1017,-1172,1039,728,1141,-1744,-1086,1724,-843,-1435,2607,1528,895,137,951,1485,1541,-279,-1857,156,2520,1958,2848,3484,2863,890,801,-218,-1616,-937,2183,3136,1360,-617,-642,-562,2527,2250,954,-212,2073,313,-1214,1718,-136,1533,1654,-1249,1666,2214,2276,2056,2233,-1883,-1331,-1011,3238,2206,-602,1470,197,617,2297,-1604,1376,2199,1983,3225,-953,3635,-1333,135,2927,-1395,2573,2324,-1045,-1061,1872,3505,3064,1016,3370,3171,2880,-1472,2897,244,1808,1531,-1091,-512,2297,1173,1334,241,-565,-877,3222,2521,1580,-1970,2525,-343,892,2909,2077,575,1588,3657,2436,-1055,2823,-1532,-872,3404,312,-261,-337,2102,911,2711,3997,2037,1826,-468,3413,1566,3685,2570,1418,1775,-599,2688,2117,3160,-183,1988,-1501,3079,-764,-10,789,-977,-1403,3313,-253,3046,1844,-463,2605,-465,-1214,2149,3822,-1150,902,-510,3911,3832,3085,2881,-159,2181,-694,-41,-730,671,-295,2860,2568,1784,-639,833,-300,1382,2210,567,3530,-856,-1866,-1315,2093,186,3999,2384,3114,-1877,3545,1729,-1162,-1247,414,3563,-1396,2820,-1009,-851,2823,2447,-1373,-1171,935,-1002,3826,2164,3374,3777,1883,-923,3365,1560,1351,1507,-1356,-723,3618,3642,330,1223,1996,-1430,111,2649,2475,892,-203,2416,1483,-875,3852,-1799,-1725,3349,2118,155,-128,172,3855,-681,1406,1482,3618,-1494,345,3096,-728,2349,992,-753,-1415,2491,1633,3765,2608,326,2461,-1681,-1398,-1600,-1652,1216,-1598,241,1653,720,-1781,953,1197,1035,1647,1205,1689,2855,-909,2537,3626,-463,550,415,-239,-439,411,571,2962,3716,-367,2628,2430,1155,1006,3997,2116,77,66,-1886,3704,100,3232,1638,-360,-1177,-809,-1532,3070,2741,3298,-532,-1344,-289,1814,3484,3194,608,-1687,2619,3642,-343,-15,1175,591,1165,3410,1304,326,1981,3159,-1270,2692,3700,2818,-683,123,-1105,-83,-1330,2183,-586,458,-420,2987,-1443,1979,1090,3362,-779,3706,2354,-1398,-227,1694,3906,801,-386,458,2020,2052,-1590,3063,3325,37,3680,3077,1353,-1120,-1842,2748,261,252,1849,232,-957,-769,-1478,3285,1252,-1745,3292,3593,-1455,3429,3189,-1609,-1287,2746,1406,250,2825,2123,-913,150,3261,1235,-1531,3449,-1067,1188,582,38,2940,2864,803,958,142,1472,1296,2060,1031,2197,1323,-1355,1327,1785,-84,-91,-1633,-600,3592,3946,656,-607,902,-950,-657,-958,-1561,-731,1697,3540,3291,1169,-1062,532,3034,2810,2860,3609,1743,-1469,1818,-666,-683,2169,2503,2842,2871,874,-1211,1209,-155,2668,3546,2253,2644,2685,2388,-1687,108,3114,2122,3369,3030,-1317,1988,-158,1931,-1673,360,-71,109,1756,836,1048,2084,-201,2375,-421,-1414,609,-190,3119,782,3432,3086,-826,-1483,-1681,693,439,-615,-789,-1925,1973,2821,1169,888,-1895,-1311,-811,3927,-734,752,3357,-650,2076,3832,658,2865,2144,3776,-1893,1400,3831,822,1497,-393,3093,3401,3543,3824,-742,1963,107,-723,702,-1578,-1017,-968,507,525,3085,3798,1394,-1828,2887,913,554,-1137,-686,828,2686,286,639,470,-396,2303,3978,-25,109,3679,1116,-984,-1600,-126,17,-1611,52,2989,1130,-1452,469,-1817,-847,2444,-242,2598,3432,-1711,2746,-1435,959,-356,-1448,-11,2926,-716,2880,2766,1717,-591,3479,1686,37,-587,-1018,-1957,3096,1117,2451,312,2108,117,399,-1546,-1059,-1052,-1391,3952,3418,277,-1394,2383,-565,-635,-1777,2399,2305,-1994,-632,-1695,2420,1070,-318,3670,2873,522,-1967,1019,3777,3068,-300,2711,-1892,3615,-196,3339,2102,1079,364,-388,-1211,3716,1505,-1651,3820,-847,2319,-1716,-904,-23,328,1360,-162,-226,3850,3394,-942,3185,142,1437,-1736,1177,1502,-1456,2408,-1311,3163,576,3091,-981,-901,271,-454,2113,3109,-1867,3195,-1540,3464,503,1793,1214,-957,665,2331,421,2937,646,2520,-757,1365,1811,2828,1776,785,-224,1479,223,3361,3611,765,1461,-1935,2033,2987,1417,868,903,-1908,1199,2378,3745,1415,365,-1059,-1115,-354,-335,-1261,2094,-1591,-1615,844,3007,-1439,-73,-1236,984,3470,-1676,3956,3697,982,3795,959,2162,2337,-824,703,1807,-495,1591,-1201,3185,-1344,2657,301,2498,-1647,-1280,-267,793,3737,3590,2525,2644,1231,-903,-1544,-1430,2795,-183,159,3372,-1082,-867,2742,3964,-207,3555,3728,2346,-1719,3827,-1124,-1277,2056,-157,1708,-262,1486,-363,3543,1451,-806,3423,202,870,-327,239,3214,-1941,2330,1384,3612,1923,1304,-354,-1104,3599,2444,76,-905,623,-733,2184,588,-409,2511,-731,1999,410,164,1171,1340,728,505,3031,-121,941,-978,2490,2228,941,2900,3183,1762,1648,2580,380,849,3094,664,3700,451,-91,1414,3929,-1384,-1919,1521,617,3964,3358,3652,-69,3063,2599,1013,-207,2044,1135,2715,-783,-1601,586,200,557,1197,1873,186,3830,3946,-765,-1269,1463,-1592,3766,3448,-259,963,-271,1135,3259,2032,2820,2086,2375,2586,-356,127,2714,1889,-1658,971,2239,3944,1719,1785,1092,3223,2109,-22,-1960,1806,3911,-766,-1549,2193,3726,601,1638,3795,1483,3590,-1708,-411,2094,3957,-856,91,1252,1348,2211,2353,1223,-1953,3747,319,2228,68,3951,586,911,1300,-1277,3725,1882,-134,2873,368,2415,2236,686,-608,-1797,-974,3641,-552,2394,3198,2416,2994,1961,-951,938,840,1496,325,1013,-576,1913,3198,3735,497,-1389,1663,845,283,678,3315,2798,2097,2108,303,-1845,137,2201,-523,1873,2668,1715,2321,3659,2715,3681,1615,1250,3850,2309,3454,-1945,-721,776,355,2577,-792,2626,346,1397,-226,-48,1644,-1006,2617,-553,1347,1394,3462,-1293,-576,3289,2122,-1086,502,3253,3781,2457,-1657,2926,2934,21,3248,2143,1772,360,1272,-769,-151,-1159,-780,2161,30,-947,1414,-35,2004,3433,-804,2865,11,-1872,170,279,1361,-1928,1048,-178,-205,2067,-1358,-405,3611,-66,3029,108,3555,85,-1894,-1919,2068,2253,1540,176,-757,2452,2628,-1994,3940,570,-642,1151,-1464,2592,2741,-807,930,1397,-590,2136,-259,-1391,-518,1565,-389,1576,3727,-427,-1562,-1615,3721,702,3473,-477,1911,1351,-1172,1694,-581,-1873,946,376,-1988,1176,3097,3266,2288,5,-953,133,3758,1451,1020,-1024,-294,-601,2004,3070,3966,524,1208,547,3461,-159,2967,-875,-571,-523,-1335,2808,-81,-853,3558,2144,2911,1326,3191,1089,2700,575,534,1165,139,-1134,2852,567,-672,-1914,2979,3257,213,-1895,-1917,539,328,3532,3348,-231,-1067,539,3341,-929,-89,1866,-11,-1583,-1399,703,-821,2927,812,3826,3863,-1434,1280,-1329,1158,1226,1707,-413,789,2337,2317,2879,1061,1401,1808,-385,629,1797,3991,2967,1682,3957,3579,1044,3515,3242,-1789,411,3305,-1445,207,1378,3159,2163,-862,2805,139,-84,-1808,2862,-1989,2841,-1373,2109,2902,2163,-1409,-1429,1946,2076,-984,3902,3548,-289,155,224,-1188,-903,1641,-915,-1708,-1797,2663,-1894,618,2305,2136,678,2117,963,812,-1948,-54,-1009,-1858,3163,-862,1189,3504,2714,1236,-1177,-1455,2266,391,-99,-1309,-262,1208,-477,-1757,3905,2608,670,-1370,511,-736,3622,-871,1937,3014,340,3770,-1476,1494,-1208,3607,3453,-1419,3817,-1112,2458,-1082,-1285,3853,3859,3351,-229,1863,-327,-498,-69,1797,3339,384,-1658,2487,1089,-1676,-785,-1634,3657,1272,855,1595,-513,-600,540,1300,648,2015,1489,2169,3599,1437,1979,1537,2568,3265,-126,-1431,3554,202,1756,-1411,-628,-688,-1074,3692,-48,1503,1595,978,-1786,-182,-396,3893,1807,-1414,-1352,2759,-430,-1578,2243,283,2881,2546,2704,1706,2098,2935,-434,-31,3514,-90,-944,-1786,-1842,2149,-1872,924,-968,-1188,2527,2266,2124,-734,939,-487,895,2406,2687,-667,146,1858,-1652,193,2900,2549,-1597,3223,-246,3778,-108,69,-161,-422,2398,-113,1155,-318,-1129,3563,1508,2343,477,725,2890,2503,1663,3039,3971,3383,1884,1883,3370,398,-413,471,1325,612,-90,-177,-877,-1419,1146,1502,781,1800,1339,3968,-1106,-1972,-1137,2940,-1343,2930,2550,252,-1655,1529,-28,2688,3661,-123,1748,1653,2825,385,1631,-456,1132,-1200,-662,-322,1869,164,74,3848,-197,2864,432,967,-74,3126,102,1114,3126,3780,-322,3266,907,1113,-1051,2370,618,1882,-714,329,2060,939,35,-357,2350,-28,3274,3237,3437,107,210,1231,1410,242,2555,179,1559,1818,641,-1834,-602,5,-1957,-1925,-1692,-1154,753,3992,3747,165,-660,-1577,-119,966,-624,3732,-1379,1621,-461,1994,-674,-967,1410,952,3080,1896,-1236,1022,3154,-20,1336,-1954,-1072,1262,3676,907,-1917,930,3589,224,2161,1798,-1264,2285,1530,3853,3851,-619,3276,-1206,2281,1531,-1405,-982,2587,3661,2719,383,2749,451,791,-1583,2426,-1531,2506,1205,-50,-119,-157,658,1066,410,-494,551,3553,-1779,2615,3720,597,-1719,2324,2511,1053,1907,-73,-1153,-1691,-1789,1138,3585,2201,-1848,3766,-1335,2005,1054,-1963,3004,-35,2414,-967,3831,2493,1520,2308,820,-796,3394,244,2911,-1611,2560,-205,-23,-1328,3372,3873,1707,-80,-1813,1765,2627,1868,-1071,1983,1094,725,670,3171,-251,-922,-552,1729,1617,-1715,3715,-1534,1863,-1469,1253,972,1850,-1441,3866,-758,-1356,2187,-1061,3093,1094,313,-700,1027,-929,2469,1817,1830,684,3410,1846,717,1278,3504,3292,-1595,-1967,-136,3778,3575,-1552,3318,2408,-1461,-1644,2657,3932,1310,425,2894,1262,2842,1584,3030,-1411,-1605,-452,1753,1676,1007,1199,3877,3585,3374,484,1030,2664,-1334,-1803,-872,2599,649,688,3929,1247,-970,1870,-1788,-1609,2399,-1759,557,2989,-124,-1426,-249,3547,135,3217,-1402,-253,2131,1947,951,3154,1947,571,890,-261,-333,271,546,355,-915,2943,171,955,-39,-1329,734,-1987,-874,-885,2450,3667,717,-267,813,3362,2180,-1389,918,2016,2766,-1864,3014,-1247,404,1282,-1014,2050,781,2727,2472,115,2436,2924,-1348,1580,2892,3023,1457,1688,647,1320,1161,2902,2724,2079,-963,-461,3259,2383,365,3814,-951,278,-314,-161,102,79,1457,-1431,-502,-61,-1771,2963,1540,1773,1544,2664,-1023,-1379,-124,1775,1074,-429,-1307,-1074,975,-1184,127,3992,-1606,3170,1479,2555,1718,-1358,-1038,-1581,1175,-779,2934,-450,2093,-1405,3328,1143,-1864,-17,3418,3450,750,975,1233,-33,590,3470,-672,11,2490,-527,2619,2550,1046,170,1907,1777,-1717,123,1910,-1654,1555,3798,-240,-1524,2605,582,-17,-1873,608,3448,3403,2924,484,3127,-1204,3098,-1716,-1428,2841,3952,639,-9,2179,1111,-31,2686,2971,3921,-1038,404,3905,-1876,-918,-1606,187,-308,2854,1510,-113,-74,3680,1377,815,2612,-1212,-1206,-263,-4,1353,-667,-760,2561,-1965,3366,-1150,-389,3942,-367,505,2752,477,2769,1158,-460,1003,2032,2350,245,46,3179,3094,1284,-1347,-583,-1650,2884,1461,570,2780,2807,3592,3119,697,2612,-996,-1623,3727,2395,-1309,3502,3612,-677,1557,3659,2309,1680,1217,-174,569,1346,-599,1176,-1208,-251,-817,3091,657,2983,-1426,2909,-1673,3291,2162,133,2045,439,2839,85,3944,3635,-1064,-1227,1793,-1442,-333,195,2767,3127,2591,261,-282,-911,844,1584,-550,3209,-229,-384,476,201,3662,3966,687,1565,1869,-203,2983,1325,-1369,3896,2971,-1336,1545,815,3558,3080,2154,-1064,3442,253,2472,2718,-108,-227,1336,2097,-970,2947,734,1712,2415,1333,-581,1772,-1645,-558,-802,-337,-783,3879,3509,1566,3257,531,-1380,2336,-1722,2807,1491,2086,-1828,303,1633,-1055,2654,1417,3399,1098,3217,1736,1142,-615,1027,-1041,3792,-420,-1616,-1441,-155,187,124,200,2964,-1983,-1006,3508,-1313,2353,864,1708,2727,2675,596,-532,89,3502,-1771,1866,-1552,2915,3232,2050,1596,868,-774,-434,3095,473,3539,-700,2281,-452,1228,1805,2378,-54,547,-805,793,1974,3921,-874,2749,-1968,3776,-1690,903,3271,2576,-1848,2724,-1324,3079,-1654,1541,3068,-1940,2363,-601,-758,245,3714,1643,-1867,656,3353,2563,2214,843,504,761,1990,1220,-937,-1598,629,2617,-1712,2354,3401,-1590,2882,-562,1032,3433,1260,223,2496,3124,3409,1339,1753,3615,-827,978,553,-1333,-1286,3662,3677,1938,3359,1752,2315,1296,-158,2066,1269,-1669,-850,2131,1286,2739,-717,2892,3046,368,91,1826,103,-1655,-1448,-1129,1348,923,-1844,3781,520,2572,3893,35,1338,875,2762,1286,-278,391,1615,3613,-1497,1129,-1253,-1415,286,2529,-1271,3500,-905,3553,-716,2577,-438,-134,791,47,-1877,-313,-1154,-721,-1675,-439,3031,2433,-197,53,3369,-1711,3677,-1282,-865,1469,-1136,-308,2862,2501,-674,3666,3507,3256,-1249,3728,101,-1799,1173,3830,-885,2497,923,665,3351,111,2231,1070,-817,3325,-388,880,3539,1504,1806,1355,2502,352,1463,-717,-436,2206,641,-794,-1011,-1115,2798,840,602,3667,-121,1151,-1983,3225,199,-1399,-736,2877,1621,2828,3548,-906,-691,2124,-1948,2407,1758,383,235,-1647,2026,3274,232,-1690,3403,3514,3272,-1345,1603,279,808,1693,-151,2671,2501,8,176,845,-166,219,3288,3454,-265,-1713,-677,3545,2184,1309,3218,3793,-1910,825,3542,1938,3703,3873,2652,2118,2675,1776,2694,2950,-1876,1917,425,873,3641,-1293,1986,-1370,165,3237,3616,-1324,-1340,3497,1733,3082,-1347,3578,-1972,2112,1171,179,3824,1521,-1270,2210,-1330,2692,-651,1075,-1597,3221,802,86,-1890,1019,-1477,150,-1776,-1244,3765,140,2239,-553,2549,596,-1286,2790,645,1111,1846,-1941,-192,2639,-248,448,2579,1228,1631,3622,2767,2194,2488,-809,3350,597,-498,2887,-518,3877,-1723,514,3189,55,3738,2231,-443,101,-1671,2910,69,3304,1632,-1646,1260,-902,1704,631,1499,-1287,1247,-1041,-1210,1958,207,-1892,593,-578,-385,2197,1004,3540,743,2319,-871,-1890,2026,508,2915,3940,159,1530,1872,1724,540,645,-1492,-1592,2759,3593,-1282,488,-282,-1631,249,2780,-773,3052,3497,1579,2468,1688,-1768,1915,3136,-694,3137,140,47,2852,-747,630,1014,-824,686,3515,888,1478,1236,384,2496,-1961,172,2317,1986,-1764,525,476,1647,-978,1278,75,952,2570,197,685,999,2903,2872,-550,-190,-268,-1987,121,3086,3542,488,-1047,-33,646,1486,-1178,504,-1748,2821,-1669,3500,1159,1648,2152,3315,3987,822,-1145,3674,3697,-1763,-1017,-760,-789,2167,3547,3848,2694,2554,3652,-406,-1250,754,330,-1334,1389,-684,-15,3706,-1763,-1261,2674,977,1335,-1134,3035,-465,2795,1415,1181,3453,-1908,3745,2033,3955,2607,3532,-1604,2079,1347,-650,1704,2833,3572,-1650,-1737,2904,1871,2515,1482,89,46,803,-454,1937,248,2498,1318,415,-1533,1981,-1315,992,2867,2205,3707,-1940,-753,-248,935,-306,-1328,-909,2407,-591,2016,2384,1420,-1434,-195,1253,-1572,1117,-1953,933,-265,1054,-10,1338,1990,1201,399,3704,-1969,1370,3852,1020,508,2975,-586,56,3361,3770,-1395,3229,-177,3181,-972,2406,-1581,-1107,-972,3817,1596,984,-1345,-1429,-865,3738,448,-1472,429,-527,17,-806,-1045,1032,1896,1114,-1809,693,2275,580,2804,2639,2769,1382,3272,-1886,-947,-794,2343,3726,-1644,1280,2475,-25,1309,-853,619,-278,3083,242,2907,-204,1352,1801,2345,-239,3851,253,1235,-1636,522,1680,2083,1484,1110,-206,1801,421,-1052,-739,2349,-443,329,-1062,1412,239,-469,3350,2606,1508,612,-1991,1400,-1018,955,-1794,-1577,3384,-1737,-1118,-598,-1657,2243,-156,-466,2533,-1969,-450,-1001,-81,-510,3475,3265,3245,3507,-733,325,-854,-72,1499,2187,2867,-1024,-1409,30,-944,3289,-1691,-436,210,-780,2388,193,3575,2113,580,1588,684,1377,-833,3528,-502,-1617,-1935,68,2854,-1439,-765,-1554,874,1373,-728,2930,235,3098,1129,-1135,340,3366,2077,-1715,1977,630,2884,1657,331,825,-577,2385,2598,3357,-848,124,3530,-1736,-512,-123,999,3061,2346,2450,1777,2627,-854,971,-1788,-61,-587,1952,1697,3288,-996,2208,2579,-174,77,-1162,3955,-306,3318,1875,-813,-1178,1758,2742,-178,-1844,-827,334,3896,-1530,-1970,-792,117,338,-651,2420,-279,-1355,-325,2580,2774,1999,843,3906,1858,1145,3137,2073,-63,1911,-1695,2211,3245,-1176,3109,3404,-634,776,-231,-406,-851,3183,3209,-1934,2061,-1745,2398,1591,3045,648,3095,76,2461,1706,958,1132,338,141,278,1006,753,2615,3170,3423,1469,2937,880,913,1961,2586,3865,3951,2385,3064,554,3843,2116,946,3814,1946,-1557,-1803,1074,3449,-1870,1066,141,1715,277,-868,1420,-1631,-691,-913,-1200,-635,808,3276,2370,2207,3916,-384,2592,1355,3298,-1991,185,-904,964,-902,-1091,785,3214,-204,3261,-1756,1102,-156,1973,-1768,-1250,53,2336,2236,1834,1510,1579,2451,855,1583,649,2943,2776,-422,2182,2011,199,471,-1971,79,1000,802,-1369,-1633,2904,696,1075,1805,2152,3671,817,3034,2907,497,828,-1850,1376,2626,-201,3313,1884,2044,-1798,849,1138,3932,3450,839,-1343,3566,3505,1533};
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(nums));
    }
}
