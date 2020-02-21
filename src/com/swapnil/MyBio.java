package com.swapnil;

import java.util.Scanner;

public class MyBio {
    public static void main(String[] args) {
        Scanner bio = new Scanner(System.in);
        System.out.println("Enter your bio details as follows Name,gender,age,MobileNo,cgpa");
        String Name = bio.nextLine();
        char gender = bio.next().charAt(0);
        int age = bio.nextInt();
        long MobileNo = bio.nextLong();
        double cgpa = bio.nextDouble();
        System.out.println("Name:" + Name);
        System.out.println("Gender:" + gender);
        System.out.println("Age:" + age);
        System.out.println("mobile no.:" + MobileNo);
        System.out.println("Cgpa:" + cgpa);
        bio.close();
    }
}
