package com.swapnil;

import java.util.Scanner;

public class IsOddEven {
    public static void main(String[]args)
    {
        Scanner No=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=No.nextInt();
        if(x%2==0)
        {
            System.out.println("Number entered is even");
        }
        else
        {
            System.out.println("Number entered is odd");
        }
    }
}
