package com.swapnil;

import java.util.Scanner;

class ArrayNegative {
    public static void main(String[] args) {
        int n, i;
        System.out.println("Enter the number of elements: ");
        Scanner array = new Scanner(System.in);
        n = array.nextInt();
        int[] Array = new int[n];
        System.out.println("Enter the array elements");
        for (i = 0; i < n; i++) {
            Array[i] = array.nextInt();
        }
        System.out.println("Negative elements are");
        for (i = 0; i < n; i++) {
            if (Array[i] < 0) {
                System.out.println(Array[i]);
            }
        }

    }
}