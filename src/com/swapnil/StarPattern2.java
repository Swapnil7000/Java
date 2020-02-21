/* 
1
22
333
4444
55555 To print the pattern like this */
package com.swapnil;

import java.util.Scanner;

class StarPattern2{
    public static void main(String[] args) {
        int rows,i,j;
        System.out.println("Enter the number of rows:");
        Scanner p = new Scanner(System.in);
        rows = p.nextInt();
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}