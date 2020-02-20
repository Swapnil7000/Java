//To print the square pattern
package com.swapnil;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[]args)
    {
        int r;
        System.out.println("Enter the number of rows: ");
        Scanner star = new Scanner(System.in);
        r = star.nextInt();
        SquarePattern(r);
    }
    public static void SquarePattern(int rows)
    {
        int i,j;
        for(i=0;i<rows;i++)
        {
            for(j=0;j<rows;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
