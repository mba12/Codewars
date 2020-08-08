package com.michaelahern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
public class AllPermutation {

    // The input array for permutation
    private final int Arr[];

    // Index array to store indexes of input array
    private int Indexes[];

    // The index of the first "increase"
    // in the Index array which is the smallest
    // i such that Indexes[i] < Indexes[i + 1]
    private int Increase;

    // Constructor
    public AllPermutation(int arr[])
    {
        this.Arr = arr;
        this.Increase = -1;
        this.Indexes = new int[this.Arr.length];
    }

    // Initialize and output
    // the first permutation
    public int[] GetFirst()
    {

        // Allocate memory for Indexes array
        this.Indexes = new int[this.Arr.length];

        // Initialize the values in Index array
        // from 0 to n - 1
        for (int i = 0; i < Indexes.length; ++i)
        {
            this.Indexes[i] = i;
        }

        // Set the Increase to 0
        // since Indexes[0] = 0 < Indexes[1] = 1
        this.Increase = 0;

        // Output the first permutation
        return this.Output();
    }

    // Function that returns true if it is
    // possible to generate the next permutation
    public boolean HasNext()
    {

        // When Increase is in the end of the array,
        // it is not possible to have next one
        return this.Increase != (this.Indexes.length - 1);
    }

    // Output the next permutation
    public int[] GetNext()
    {

        // Increase is at the very beginning
        if (this.Increase == 0)
        {

            // Swap Index[0] and Index[1]
            this.Swap(this.Increase, this.Increase + 1);

            // Update Increase
            this.Increase += 1;
            while (this.Increase < this.Indexes.length - 1
                    && this.Indexes[this.Increase]
                    > this.Indexes[this.Increase + 1])
            {
                ++this.Increase;
            }
        }
        else
        {

            // Value at Indexes[Increase + 1] is greater than Indexes[0]
            // no need for binary search,
            // just swap Indexes[Increase + 1] and Indexes[0]
            if (this.Indexes[this.Increase + 1] > this.Indexes[0])
            {
                this.Swap(this.Increase + 1, 0);
            }
            else
            {

                // Binary search to find the greatest value
                // which is less than Indexes[Increase + 1]
                int start = 0;
                int end = this.Increase;
                int mid = (start + end) / 2;
                int tVal = this.Indexes[this.Increase + 1];
                while (!(this.Indexes[mid]<tVal&& this.Indexes[mid - 1]> tVal))
                {
                    if (this.Indexes[mid] < tVal)
                    {
                        end = mid - 1;
                    }
                    else
                    {
                        start = mid + 1;
                    }
                    mid = (start + end) / 2;
                }

                // Swap
                this.Swap(this.Increase + 1, mid);
            }

            // Invert 0 to Increase
            for (int i = 0; i <= this.Increase / 2; ++i)
            {
                this.Swap(i, this.Increase - i);
            }

            // Reset Increase
            this.Increase = 0;
        }
        return this.Output();
    }

    // Function to output the input array
    private int[] Output()
    {
        int[] output = new int[this.Arr.length];
        for (int i = 0; i < this.Indexes.length; ++i)
        {


            // Indexes of the input array
            // are at the Indexes array
            // System.out.print(this.Arr[this.Indexes[i]]);
            // System.out.print(" ");
            output[i] = this.Arr[this.Indexes[i]];
        }
        return output;
    }

    // Swap two values in the Indexes array
    private void Swap(int p, int q)
    {
        int tmp = this.Indexes[p];
        this.Indexes[p] = this.Indexes[q];
        this.Indexes[q] = tmp;
    }

    public static void run(int n)
    {

        int[] myArr = new int[n];
        for(int i = 0; i < n; i++) {
            myArr[i] = i + 1;
        }

        Set<Integer> squaresSet = SquareSums.setupSquareSet(n);
        AllPermutation perm = new AllPermutation(myArr);
        int[] first = perm.GetFirst();
        if(SquareSums.checkAnswer(first, squaresSet))
            System.out.println(Arrays.toString(first));

        while (perm.HasNext())
        {
            int[] next = perm.GetNext();
            if(SquareSums.checkAnswer(next, squaresSet))
                System.out.println(Arrays.toString(next));

        }
    }

    private static void printArray(Integer[] input) {
        System.out.print('\n');
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
    }

    private static boolean checkAnswer(Integer[] elements, Set<Integer> squaresSet) {
        if (elements == null || elements.length == 0) return false;

        int[] test = new int[elements.length];
        int index = 0;
        for(Integer i : elements)
            test[index++] = i.intValue();

        return checkAnswer(test, squaresSet);

    }

    public static boolean checkAnswer(int[] answer, Set<Integer> squaresSet) {
        if (answer == null || answer.length == 0) return false;

        for(int i = 0; i < answer.length - 1; i++) {
            if(answer[i] == 0 || answer[i+1] == 0) return false;
            int sum = answer[i] + answer[i + 1];
            if(!squaresSet.contains(sum)) return false;
        }
        return true;
    }

    public static void printAllOrdered(Integer[] elements, Set<Integer> squaresSet) {

        Arrays.sort(elements);
        boolean hasNext = true;
        long total = (long) Math.pow(2, elements.length);
        System.out.println("Total combinations: " + total);
        long count = 0l;
        while(hasNext) {

            count++;
            if(count % 10000 == 0)
                System.out.print(count + " ");

            if(checkAnswer(elements, squaresSet))
                printArray(elements);

            int k = 0, l = 0;
            hasNext = false;
            for (int i = elements.length - 1; i > 0; i--) {
                if (elements[i].compareTo(elements[i - 1]) > 0) {
                    k = i - 1;
                    hasNext = true;
                    break;
                }
            }

            for (int i = elements.length - 1; i > k; i--) {
                if (elements[i].compareTo(elements[k]) > 0) {
                    l = i;
                    break;
                }
            }

            swap(elements, k, l);
            Collections.reverse(Arrays.asList(elements).subList(k + 1, elements.length));
        }
    }



    public static void testAll(int n) {

        Set<Integer> startSet = new HashSet<>();
        List<Integer> startList = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            startList.add(i);
            startSet.add(i);
        }

        Set<Integer> squaresSet = setupSquareSet(n);
        Integer[] finalResult = startList.toArray(new Integer[startList.size()]);
        System.out.println(Arrays.toString(Arrays.stream(finalResult).toArray()));
        printAllOrdered(finalResult, squaresSet);

    }

    public static Set<Integer> setupSquareSet(int n) {
        int largestSquare = n + n - 1;
        Set<Integer> squares = new HashSet<>();
        int square = 0;
        int c = 2;
        while(square <= largestSquare) {
            square = c * c;
            squares.add(square);
            c++;
        }
        squares.remove(square);
        return squares;
    }



}

// Driver code
class AppDriver
{
    public static void main(String args[])
    {
        int[] arr = { 0, 1, 2 };

        AllPermutation perm = new AllPermutation(arr);
        perm.GetFirst();
        while (perm.HasNext())
        {
            perm.GetNext();
        }
    }
}
*/