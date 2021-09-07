package com.Maktab;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 8, 4, 50};
        IntArray intArray = new IntArray(numbers);
        intArray.add(10);
        intArray.add(77);
        intArray.add(20);
        intArray.add(30);
        intArray.add(77);
        intArray.add(77);
        intArray.add(40);
        intArray.add(50);
        intArray.add(77);
        intArray.addAt(60, 2);
        intArray.removeAt(1);
        System.out.println(intArray.indexOf(40));
        System.out.println(intArray.lastIndexOf(50));
        System.out.println(intArray.indexOf(77));
        System.out.println(intArray.contains(10) ? "Yes" : "No");
        intArray.remove(77);
        System.out.println(intArray.indexOf(77));
        intArray.print();
        System.out.println(Arrays.toString(intArray.getSortedArrayLowToHigh()));
        System.out.println(Arrays.toString(intArray.getSortedArrayHighToLow()));
    }
}