package com.michaelahern;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Utility {



   // public static IntStream generateFibonacciSequence() {
        // To be implemented: Proper implementation.
        //IntSupplier fibonacciSupplier = Utility::fibonacci;
        //IntStream infiniteStreamOfFibonacci = IntStream.generate(fibonacciSupplier);
        //return infiniteStreamOfFibonacci;
  //  }
    private static Integer fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

}
