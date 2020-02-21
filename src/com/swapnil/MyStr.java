package com.swapnil;

import java.util.Scanner;

public class MyStr {
    public static void main(String[] args)
    {   String str="";
        Scanner myName=new Scanner(System.in);
        System.out.println("Enter the string:");
        str=myName.nextLine();
        System.out.println("Your name is "+str);
        myName.close();
        
    }
}
