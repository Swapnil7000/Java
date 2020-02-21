package com.swapnil;

import java.util.Scanner;

public class IsPositive {
    public static void main(String[]args)
    {
        Scanner no= new Scanner(System.in);
        System.out.println("Enter the number:");
        int i=no.nextInt();
        if(i>0)
        {
            System.out.println("Number is positive");
        }
        else if(i==0)
        {
            System.out.println("Number is zero");
        }
        else
        {
            System.out.println("Number is negative");
        }
        no.close();
    }
}
