package com.michaelahern;

class MaxStack {

    int index = 0;
    int maxIndex = 0;
    int max = Integer.MIN_VALUE;
    int[] stack;
    int[] maxStack;

    /** initialize your data structure here. */
    public MaxStack() {
        stack = new int[10010];
        maxStack = new int[10010];
    }

    public void push(int x) {
        stack[index] = x;
        index++;

        if(x >= max) {
            maxStack[maxIndex] = x;
            max = x;
            maxIndex++;
        }
    }

    public int pop() {
        index--;
        int val = stack[index];
        if(val == max) {
            maxIndex--;
            if(maxIndex == 0) {
                max = Integer.MIN_VALUE;
            } else {
                max = maxStack[maxIndex - 1];
            }
        }
        return val;
    }

    public int top() {
        return stack[index - 1];
    }

    public int peekMax() {

        if(maxIndex == 0) {
            max = Integer.MIN_VALUE;
            return 0;
        }

        return maxStack[maxIndex - 1];
    }

    public int popMax() {

        int val = maxStack[maxIndex - 1];
        maxIndex--;
        if(maxIndex > 0) max = maxStack[maxIndex - 1]; else max = Integer.MIN_VALUE;
        int baseIndex = index;

        if(val == stack[index - 1]) {
            index--;
        } else {
            while(val != stack[index - 1]) {
                index--;
            }
            // Having found the max shift everything in the stack down by one.
            if (index < baseIndex) {
                for(int i = index; i < baseIndex; i++) {
                    stack[i - 1] = stack[i];
                    if(stack[i] >= max) {
                        maxStack[maxIndex] = stack[i];
                        max = stack[i];
                        maxIndex++;
                    }
                }
            }
            index = baseIndex - 1;
        }


        if(maxIndex == 0) {
            max = Integer.MIN_VALUE;
            for(int i = 0; i < index; i++)
                if(max <= stack[i]) {
                    max = stack[i];
                    maxStack[maxIndex++] = max;
                }
        } else {
            max = maxStack[maxIndex - 1];
        }

        return val;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */
