package com.swapnil;

import java.util.Scanner;

public class StockAvg {
    public static void main(String[]args)
    {
        int i,e;
        System.out.println("Enter the number of enteries");
        Scanner stock=new Scanner(System.in);
        e= stock.nextInt();
        double Total=0,Qty=0,Avg;
        double []stockPrize =new double[e] ;
        double []stockQty=new double[e];
        System.out.println("Enter the share prize and share Quantity respectively");
        for (i=0;i<e;i++)
        {
            stockPrize[i]=stock.nextDouble();
            stockQty[i]=stock.nextDouble();
        }
        for(i=0;i<e;i++)
        {
            Total+=stockPrize[i]*stockQty[i];
            Qty+=stockQty[i];
        }
        Avg=Total/Qty;
        System.out.println("Your total shares are "+(Qty));
        System.out.println("Your average of share is "+(Avg));
        System.out.println("Your total share amount is "+(Total));
    }
}
