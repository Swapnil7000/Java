package com.swapnil;
class Array2{
    public static void main(String[]args) {
        int[] Myarray={12,34,56,77,91};
        System.out.println("Array elements are ");
        for(int index=0;index<Myarray.length;index++)
        {
            System.out.println(Myarray[index]);
        }
        System.out.println("Array elements are ");//By another method
        for(int element:Myarray)
        {
            System.out.println(element);
        }
    }
}