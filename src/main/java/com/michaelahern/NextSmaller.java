package com.michaelahern;
import java.util.Arrays;

public class NextSmaller {

    public static long nextSmaller(long n)
    {
        if(n < 10) return -1;
        int nDigits = (int) Math.floor(Math.log10(Math.abs(n))) + 1;

        // convert number to array of digits
        int[] digits = new int[nDigits];
        long nCopy = n;
        int k = 0;
        while(nCopy > 0) {
            int d = (int) (nCopy % 10);
            digits[k] = d;
            k++;
            nCopy = nCopy / 10;
        }

        // look for the first digit that is smaller than its neighbor
        for(int i = 0; i < digits.length - 1; i++) {
            if(digits[i] < digits[i+1]) {
                swap(digits, i, i+1);
                // now sort digits betweeen 0 and i inclusive
                if(digits[digits.length - 1] == 0) {
                    zeroSort(digits, i);
                    if (digits[digits.length - 1] == 0)
                        return - 1;
                    else
                        return createNumber(digits);
                }
                if(i > 0) partSort(digits, i+1);
                long answer = createNumber(digits);
                return answer;
            }
        }

        return -1;
    }

    private static void zeroSort(int[] arr, int idx) {
        int spotDigit = arr[idx]; // 097

        // Temporary array
        int[] temp = new int[idx];
        int j = 0;
        for (int i = 0; i < idx; i++) {
            temp[j] = arr[i];
            j++;
        }
        // Sort the temporary array
        Arrays.sort(temp);

        // Now find the largest digit in the temp array smaller than the spotDigit
        int max = -1;
        int maxIdx = -1;
        for(int i = 0; i < idx; i++) {
            if(temp[i] < spotDigit && temp[i] > max) {
                max = temp[i];
                maxIdx = i;
            }
        }

        if(max > -1) {
            // swap the max value with the zero
            int tempDigit = temp[maxIdx];
            temp[maxIdx] = arr[idx+1];
            arr[idx+1] = tempDigit;

            Arrays.sort(temp);

            // Modifying original array with temporary array elements
            j = 0;
            for (int i = 0; i < idx; i++) {
                arr[i] = temp[j];
                j++;
            }
        }

    }

    private static void swap(int[] digits, int a, int b) {
        int temp = digits[a];
        digits[a] = digits[b];
        digits[b] = temp;
    }

    private static long createNumber(int[] digits) {
        long total = 0;
        long zeros = 1;
        for(int i = 0; i < digits.length; i++) {
            total += digits[i] * zeros;
            zeros = zeros * 10l;
        }

        return total;
    }

    static void partSort(int[] arr, int idx)
    {
        int spotDigit = arr[idx - 1];
        int swappedDigit = arr[idx];

        // Temporary array
        int[] temp = new int[idx];
        int j = 0;
        for (int i = 0; i < idx; i++) {
            temp[j] = arr[i];
            j++;
        }

        // Sort the temporary array
        Arrays.sort(temp);

        // Now find the largest digit in the temp array smaller than the spotDigit
        int max = -1;
        int maxIdx = -1;
        for(int i = 0; i < idx; i++) {
            if(temp[i] < spotDigit && temp[i] > swappedDigit) {
                max = temp[i];
                maxIdx = i;
            }
        }
        if(max > -1) {
            arr[idx] = max;
            temp[maxIdx] = swappedDigit;
        }

        Arrays.sort(temp);
        // Modifying original array with temporary array elements
        j = 0;
        for (int i = 0; i < idx; i++) {
            arr[i] = temp[j];
            j++;
        }
    }

}
