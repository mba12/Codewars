package com.michaelahern;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
public class SquareSumLinear {

    private static Set<Integer> perfectSquares = new HashSet<Integer>();

    private static void generatePerfectSquareSet() {
        for(int i = 1; i < 1601; i++) {
            perfectSquares.add(i * i);
        }
    }

    public List<Integer> findNext(List<Integer> list, Integer nextNumber) {

        int size = list.size() - 1;
        int firstNumber, secondNumber;
        for(int i = 0; i < size; i++) {
            firstNumber = list.get(i) + nextNumber;
            if(!perfectSquares.contains(firstNumber)) continue;
            secondNumber = list.get(i + 1) + nextNumber;
            if(perfectSquares.contains(secondNumber)) {
                list.add(i + 1, nextNumber);
                return list;
            }
        }
        return list;
    }
}
