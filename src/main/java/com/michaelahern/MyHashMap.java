package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

class MyHashMap {

    int size = 997;
    ArrayList<Integer[]>[] array = new ArrayList[size];
    /** Initialize your data structure here. */
    public MyHashMap() {
        for (int i = 0; i < size; i++) {
            array[i] = new ArrayList<Integer[]>();
        }
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        Integer[] obj = new Integer[2];
        obj[0] = key; obj[1] = value;
        int hashCode = Integer.valueOf(key).hashCode();

        hashCode = hashCode % size;
        System.out.println("HashCode: " + hashCode);
        ArrayList<Integer[]> slotList = (ArrayList<Integer[]>) array[hashCode];
        if(slotList == null) {
            slotList = new ArrayList<Integer[]>();
            slotList.add(obj);
            array[hashCode] = slotList;
        } else {
            boolean found = false;
            for(int i = 0; i < slotList.size(); i++) {
                if(slotList.get(i)[0] == key) {
                    slotList.set(i, obj);
                    found = true;
                }
            }
            if(!found) {
                slotList.add(obj);
            }
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hashCode = Integer.valueOf(key).hashCode();
        hashCode = hashCode % size;
        List<Integer[]> slotList = array[hashCode];
        if(slotList == null || slotList.size() == 0) {
            return -1;
        } else {
            for(int i = 0; i < slotList.size(); i++) {
                if(slotList.get(i)[0] == key) {
                    return slotList.get(i)[1];
                }
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hashCode = Integer.valueOf(key).hashCode();
        hashCode = hashCode % size;
        List<Integer[]> slotList = array[hashCode];
        if(slotList == null || slotList.size() == 0) {
            return;
        } else {
            for(int i = 0; i < slotList.size(); i++) {
                if(slotList.get(i)[0] == key) {
                    slotList.remove(i);
                }
            }
        }
    }
}
