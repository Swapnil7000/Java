package com.swapnil;

public class SubarrayWithSumZero {
    public static void main(String[] args) {
        int[] a = {2, 1, 3, -4};
        int i, j;
        boolean found = false;
        for (i = 0; i < a.length; i++) {
            int sum = 0;
            for (j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == 0) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        System.out.println(found);

    }
}
