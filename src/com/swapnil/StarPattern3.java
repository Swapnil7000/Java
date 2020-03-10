// To print the star pattern like this
/* Enter the number of rows:
5
      *
     * *
    * * *
   * * * *
  * * * * *   */
package src.com.swapnil;

import java.util.Scanner;
class StarPattern3{
     public static void main(String[] args) {
        int r,i,j,l;
        Scanner star=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        r=star.nextInt();
        for(i=0;i<r;i++)
        {
            for(l=0;l<=r-i;l++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}