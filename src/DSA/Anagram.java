package DSA;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int i;
//        System.out.println(s1);
//        System.out.println(s2);
        boolean isAnagram = true;
//        boolean[] visited = new boolean[s2.length()];
//        if (s1.length() == s2.length()) {
//            for (i = 0; i < s1.length(); i++) {
//                char c = s1.charAt(i);
//                for (j = 0; j < s2.length(); j++) {
//                    if ((c == s2.charAt(j)) && (!visited[j])) {
//                        visited[j] = true;
//                        isAnagram = true;
//                        break;
//                    } else {
//                        isAnagram = false;
//                    }
//                }
//
//                if (!isAnagram) {
//                    break;
//                }
//
//            }
//        }
        int[] a = new int[256];
        for (char c : s1.toCharArray()) {
            int index = (int) c;
            a[index]++;
        }
        for (char c : s2.toCharArray()) {
            int index = (int) c;
            a[index]--;
        }
        for (i = 0; i < 256; i++) {
            if (a[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }

    }

}