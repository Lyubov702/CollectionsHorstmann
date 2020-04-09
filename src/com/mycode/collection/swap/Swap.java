package com.mycode.collection.swap;

import java.util.ArrayList;
import java.util.List;
/*
5. Implement a method public static void swap(List<?> list, int i, int j) that
        swaps elements in the usual way when the type of list implements the
        RandomAccess interface, and that minimizes the cost of visiting the positions
        at index i and j if it is not.*/

public class Swap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        add(list);
        System.out.println(list);
        swap(list, 6, 9);
        System.out.println(list);
    }

    public static void swap(List<?> list, int i, int j) {
        if (list != null && i > 0 && j > 0) {
            if (i > list.size() || j > list.size()) {
                System.out.println("The entered index is larger than the size of the array");
                return;
            }
        } else {
            System.out.println("index < 0 or list=null");
            return;
        }
        List list1 = list;
        list1.set(i, list1.set(j, list1.get(i)));
    }

    private static void add(List<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }
}
