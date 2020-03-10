package src.com.swapnil;

import java.util.Scanner;

public class MySum {
    public static void main(String[]args){
        int a,b;
        Scanner mySum = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a = mySum.nextInt();
        b=mySum.nextInt();
        System.out.println("Sum is "+(a+b));
        mySum.close();
    }
}
