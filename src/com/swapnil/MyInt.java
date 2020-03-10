package src.com.swapnil;

import java.util.Scanner;

public class MyInt {
    public static void main(String[] args)
    {
        Scanner myAge=new Scanner(System.in);
        System.out.println("Enter your age:");
        int Myage=myAge.nextInt();//To take input from the user
        if(Myage>=18)
        {
            System.out.println("You can vote");

        }
        else
        {
            System.out.println("You cannot vote");
        }
        myAge.close();
    }
}
