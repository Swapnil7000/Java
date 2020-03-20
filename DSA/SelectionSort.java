package DSA;

import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int[] Arr = { 4, 9, 7, 1, 3, 6, 5 };
        Arrays.toString(Arr);
        Arrays.sort(Arr);
        System.out.println(Arrays.toString(Arr));
        Sort(Arr);
    }

    public static void Sort(int[] Arr) {
        int n = Arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Arr[j] > Arr[i]) {
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(Arr));

    }
}