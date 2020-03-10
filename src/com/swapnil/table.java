// To print table of any number
package src.com.swapnil;

import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int i,n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        in.close();
        for(i=1;i<=10;i++)
        {
           System.out.println( n*i);
        }
        System.out.println();
        }
    
}