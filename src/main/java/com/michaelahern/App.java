package com.michaelahern;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Kata kata = new Kata();

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

        MathEvaluator eval = new MathEvaluator();
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

        Fibonacci fib = new Fibonacci();

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

        // test 16 invalid solution  Your solution: [[3,2],[1,3],[5,3]]  Bulbs at [3,2] and [1,3] cannot be linked togrther
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

// String[] tests = {test11, test12, test15, test16};
// String[] tests = {test7};
        String[] tests = {test5};


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


        int[] testsFinal = {
                2
                ,3
                ,4
                ,5
                ,13
                ,14
                ,15
                ,16
                ,16
                ,20
                ,21
                ,23
                ,26
                ,34
                ,36
                ,37
                ,37
                ,40
                ,46
                ,47
                ,48
                ,48
                ,49
                ,49
                ,50
                ,50
                ,51
                ,52
                ,53
                ,54
                ,55
                ,56
                ,57
                ,58
                ,59
                ,60
                ,61
                ,61
                ,62
                ,63
                ,64
                ,65
                ,66
                ,67
                ,68
                ,68
                ,69
                ,69
                ,70
                ,71
                ,72
                ,72
                ,73
                ,74
                ,75
                ,76
                ,77
                ,78
                ,79
                ,80
                ,81
                ,81
                ,82
                ,82
                ,83
                ,84
                ,85
                ,86
                ,87
                ,87
                ,88
                ,89
                ,90
                ,91
                ,92
                ,92
                ,93
                ,94
                ,95
                ,96
                ,97
                ,97
                ,98
                ,99
                ,100
                ,101
                ,102
                ,103
                ,103
                ,104
                ,105
                ,106
                ,107
                ,108
                ,109
                ,110
                ,111
                ,112
                ,113
                ,114
                ,115
                ,116
                ,117
                ,118
                ,119
                ,120
                ,121
                ,122
                ,123
                ,123
                ,124
                ,125
                ,126
                ,127
                ,128
                ,129
                ,129
                ,130
                ,131
                ,132
                ,133
                ,134
                ,135
                ,136
                ,137
                ,138
                ,139
                ,140
                ,140
                ,141
                ,142
                ,142
                ,143
                ,144
                ,144
                ,146
                ,155
                ,162
                ,163
                ,173
                ,176
                ,181
                ,184
                ,189
                ,191
                ,200
                ,203
                ,209
                ,213
                ,219
                ,222
                ,226
                ,228
                ,231
                ,232
                ,243
                ,248
                ,252
                ,255
                ,256
                ,258
                ,269
                ,271
                ,291
                ,301
                ,305
                ,308
                ,328
                ,332
                ,334
                ,336
                ,337
                ,351
                ,357
                ,369
                ,372
                ,376
                ,379
                ,382
                ,392
                ,393
                ,394
                ,404
                ,405
                ,406
                ,410
                ,412
                ,422
                ,437
                ,439
                ,441
                ,444
                ,447
                ,450
                ,452
                ,458
                ,462
                ,472
                ,473
                ,476
                ,486
                ,500
                ,504
                ,510
                ,512
                ,514
                ,527
                ,555
                ,556
                ,558
                ,563
                ,573
                ,578
                ,579
                ,587
                ,594
                ,599
                ,601
                ,603
                ,615
                ,617
                ,618
                ,628
                ,638
                ,641
                ,643
                ,647
                ,648
                ,649
                ,653
                ,655
                ,660
                ,661
                ,663
                ,668
                ,670
                ,675
                ,680
                ,686
                ,702
                ,706
                ,709
                ,716
                ,717
                ,718
                ,733
                ,735
                ,736
                ,745
                ,755
                ,760
                ,763
                ,765
                ,769
                ,770
                ,771
                ,774
                ,785
                ,787
                ,790
                ,798
                ,804
                ,805
                ,807
                ,808
                ,810
                ,812
                ,813
                ,820
                ,824
                ,834
                ,838
                ,851
                ,854
                ,862
                ,868
                ,871
                ,886
                ,892
                ,893
                ,894
                ,895
                ,898
                ,901
                ,906
                ,910
                ,929
                ,931
                ,932
                ,937
                ,942
                ,953
                ,954
                ,957
                ,966
                ,967
                ,971
                ,972
                ,975
                ,977
                ,980
                ,983
                ,988
                ,990
                ,1010
                ,1017
                ,1020
                ,1035
                ,1042
                ,1048
                ,1054
                ,1060
                ,1061
                ,1065
                ,1070
                ,1077
                ,1095
                ,1096
                ,1098
                ,1099
                ,1103
                ,1105
                ,1113
                ,1118
                ,1122
                ,1124
                ,1125
                ,1128
                ,1134
                ,1136
                ,1138
                ,1145
                ,1149
                ,1156
                ,1158
                ,1182
                ,1183
                ,1184
                ,1187
                ,1189
                ,1198
                ,1208
                ,1213
                ,1214
                ,1221
                ,1226
                ,1236
                ,1238
                ,1246
                ,1249
                ,1261
                ,1265
                ,1274
                ,1281
                ,1284
                ,1290
                ,1293
                ,1295
                ,1299
                ,1308
                ,1312
                ,1313
                ,1353
                ,1364
                ,1372
                ,1373
                ,1383
                ,1390
                ,1391
                ,1410
                ,1413
                ,1415
                ,1417
                ,1421
                ,1424
                ,1425
                ,1426
                ,1435
                ,1440
                ,1441
                ,1449
                ,1450
                ,1451
                ,1460
                ,1472
                ,1479
                ,1484
                ,1489
                ,1498
                ,1502
                ,1513
                ,1518
                ,1524
                ,1531
                ,1532
                ,1535
                ,1538
                ,1561
                ,1563
                ,1564
                ,1566
                ,1568
                ,1572
                ,1574
                ,1589
                ,1591
                ,1594
                ,1596
                ,1599
                ,1600
                ,91
                ,608
                ,284
                ,1133
                ,804
                ,1526
                ,367
                ,420
                ,1039
                ,1298
                ,1380
                ,365
                ,850
                ,146
                ,1542
                ,390
                ,904
                ,1306
                ,1215
                ,777
                ,409
                ,871
                ,629
                ,1165
                ,1412
                ,613
                ,1536
                ,155
                ,562
                ,1072
                ,954
                ,833
                ,922
                ,873
                ,1415
                ,1591
                ,793
                ,73
                ,1104
                ,88
                ,1031
                ,745
                ,906
                ,1321
                ,970
                ,524
                ,1501
                ,856
                ,643
                ,872
                ,955
                ,245
                ,1195
                ,1057
                ,782
                ,891
                ,481
                ,1257
                ,229
                ,934
                ,1439
                ,1119
                ,946
                ,542
                ,503
                ,653
                ,427
                ,1484
                ,1335
                ,1396
                ,1505
                ,1547
                ,1007
                ,433
                ,182
                ,75
                ,1323
                ,665
                ,10
                ,826
                ,470
                ,184
                ,1243
                ,1142
                ,1094
                ,283
                ,193
                ,1227
                ,740
                ,431
                ,902
                ,539
                ,925
                ,947
                ,1522
                ,1246
                ,1273
                ,370
                ,421

                };

        int[] testSort = {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55};

        Random r = new Random();
        int min = 4; int max = 1600;
        int[] is = new int[501];
        for(int i = 0; i < 501; i++)
            is[i] = r.nextInt((max - min) + 1) + min;
        int[] testNs = {15};
        long start1 = System.currentTimeMillis();
        for(int i = 0; i < testNs.length; i++) {
            List<Integer> answer = SquareSums.buildUpTo( 1563 );

            if(answer == null)
                System.out.println("No answer");
            else
                System.out.println(Arrays.toString(answer.toArray()));


        }
        long endtime = System.currentTimeMillis();
        System.out.println("Total: " + (endtime - start1));


        // int[] arr1 = {1,1,1,1,1};
        // int[] arr2 = {1,0,1};

        /*
        int[] arr1 = {1,0,0,1,1,1,1,0,1,0,1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,1,1,1,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,1,1,0,1,1,0,0,1,0,1,1,0,0,1,0,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,1,0,1,1,1,0,1,1,1,1,1,0,0,1,0,0,1,1,1,1,1,0,1,0,1,0,1,1,0,0,0,1,1,0,0,0,0,0,0,1,0,1,0,1,0,0,1,0,0,0,1,1,1,1,1,0,1,0,1,0,0,0,0,1,0,1,1,1,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,1,0,0,1,1,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,1,0,1,1,0,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,1,0,1,1,1,1,0,0,0,0,0,1,0,0,0,1,1,0,1,1,1,0,1,0,1,0,0,1,0,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,0,1,1,1,1,0,0,0,0,0,0,1,1,1,1,0,0,1,0,1,1,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0,1,0,1,1,1,1,1,0,0,0,1,1,0,1,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,1,1,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,0,1,1,0,0,0,0,0,0,1,1,1,0,1,0,1,1,0,1,1,0,0,0,1,0,1,1,1,0,0,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,1,0,1,1,0,0,1,0,0,1,0,1,0,1,1,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,1,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,0,0,0,1,0,1,1,1,0,0,0,0,0,0,1,1,0,1,0,0,1,1,0,1,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,1,1,1,0,0,0,1,1,0,1,0,1,0,0,0,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,0,1,0,0,0,1,1,1,0,0,0,0,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,0,0,1,1,0,0,0,0,1,1,0,1,0,0,1,0,0,0,0,1,1,1,1,1,0,1,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,1,0,1,1,0,0,1,0,1,0,0,1,1,1,0,0,0,0,0,0,0,1,0,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,0,0,0,1,1,1,0,0,0,0,1,1,0,0,1,1,1,0,1,0,1,1,1,0,0,1,0,1,1,0,0,0,1,0,0,1,1,1,1,0,0,1,0,0,0,0,1,1,1,1,0,0,1,1,0,1,0,0,1,1,1,1,1,1,0,0,1,0,1,1,0,1,0,0,1,0,0,1,1,1,1,1,0,1,0,0,1,1,0,1,1,0,1,1,0,1,1,1,0,0,1,0,1,1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,0,0,0,1,1,0};
        int[] arr2 = {1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,1,1,0,1,1,0,0,1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,1,1,0,0,1,1,1,0,1,1,0,1,0,1,0,0,0,0,1,1,0,1,1,1,0,0,0,1,1,1,0,0,1,0,1,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,1,1,0,0,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,1,1,0,0,0,1,0,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,1,0,0,0,0,1,1,0,0,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,1,0,1,1,0,1,0,0,0,1,1,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,0,1,1,1,0,1,1,1,1,0,1,1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,1,0,0,1,0,1,1,1,1,1,0,0,0,1,1,0,1,1,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,1,0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,1,1,1,0,1,1,1,1,1,0,0,1,0,0,0,0,0,1,1,1,0,1,1,1,1,1,0,0,0,0,1,0,1,1,1,0,1,0,1,1,0,0,0,0,0,0,0,0,1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,1,0,0,1,1,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,1,1,0,1,0,1,1,0,1,1,1,1,1,0,0,1,0,1,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,0,1,1,1,0,0,0,1,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,1,0,1,0,1,0,0,1,1,1,1,1,1,1,0,0,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,0,0,1,1,1,0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,1,0,1,1,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0,1,0,0,0,1,0,0,1,1,0,0,1,1,1,1,0,1,1,0,0,1,0,1,1,1,0,1,1,0,0,0,1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,0,0,0,1,1,0,1,0,1,1,1,0,0,0,0,1,0,1,0,1,1,0,1,1,1,0,0,0,0,1,0,1,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,1,0,1,1,0,1,1,1,0,0,0,0,0,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,0,1,1,1,1,1,0,1,1,0,0,0,1,0,0,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,1,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0,1,1,0,1,0,0,0,1,0,0,1,1,0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,1,1,1,0,0,1,1,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1,1,0,1,1,0,1,1,1,1,0,1,0,0,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0,0,1,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,0,1,0,1,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,0,1,0,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,0,0,0,0,0,1,0,0,0,1,0,1,0,1,1,1,1,0,0,1,1,1,1,0,0,1,0,0,1,0,0,0,0,1,1};


        LeetCode lc = new LeetCode();
        System.out.println(Arrays.toString(lc.addNegabinary(arr1, arr2)));
*/

    }
}
