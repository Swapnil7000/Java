package src.com.swapnil;

import java.util.Scanner;

class Interest {
    public static void main(String[] args) {
        System.out.println("Enter the value of principle amount,rate of interest,time");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        float r = sc.nextFloat();
        int t = sc.nextInt();
        float Interest = p * r * t / 100;
        System.out.println("Simple interest is " + Interest);
    }
}