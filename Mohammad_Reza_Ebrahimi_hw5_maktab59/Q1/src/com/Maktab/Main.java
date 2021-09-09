package com.Maktab;

public class Main {

    public static void main(String[] args) {
        int number = 18;
        isPrime(number, 2);
        isPrime(number, 22);
    }

    public static void isPrime(int number, int i) {
        if (i < number - 1) {
            if (number % i == 0) {
                System.out.println("No");
            } else isPrime(number, i + 1);
        } else {
            System.out.println("Yes");
        }
    }
}
