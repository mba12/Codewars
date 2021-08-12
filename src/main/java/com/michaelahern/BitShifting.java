package com.michaelahern;

public class BitShifting {

    public void shiftTests() {
        for(int i = 0; i < 42; i++) {
            System.out.println("1 << " + i + " :" + Integer.toBinaryString(1 << i));
        }
    }
}
