package DSA;

import java.util.Arrays;
import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        int[] Arr = { 1, 2, 34, 35, 36, 37 };
        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        Search(Arr, n);

    }

    public static void Search(int[] A, int x) {
        int y;
        y = A.length;
        int i;
        for (i = 0; i < y; i++) {
            if (A[i] == x) {
                System.out.println("Found at index " + i);
                return;
            }
            System.out.println("Not found ");
            return;

        }

    }
}