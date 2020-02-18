package com.swapnil;

import java.util.Scanner;

public class loop {
    public static void main(String[]args)
    {
        int i,j,n;
        Scanner loop =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n=loop.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
