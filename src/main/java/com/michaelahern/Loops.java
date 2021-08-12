package com.michaelahern;

public class Loops {

    public void runTest() {

        int height = 7;
/*
             *    0
            * *   1
           *   *  3
          *     * 5
         *       * 7
          *     *
           *   *
            * *
             *
*/
        // top
        for(int i = height / 2; i > -1 ; i++) {
            for(int x = 0; x < i; x++) {
                System.out.print(" ");
            }
        }



    }


}
