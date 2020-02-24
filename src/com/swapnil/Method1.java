package com.swapnil;

import java.util.Scanner;

class Method1{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers");
        Scanner sum = new Scanner(System.in);
        a = sum.nextInt();
        b=sum.nextInt();
        Mysum(a,b);

    }
    public static void Mysum(int x,int y)
    {
        System.out.println(x+y);
    }
}