package com.swapnil;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        double insem1, insem2, attendance, endsem, assignment, total;
        System.out.println("Enter the marks of insem1,insem2,endsem,assignment,attendance respectively");
        Scanner gpa = new Scanner(System.in);
        insem1 = gpa.nextDouble();
        insem2 = gpa.nextDouble();
        endsem = gpa.nextDouble();
        assignment = gpa.nextDouble();
        attendance = gpa.nextDouble();
        total = 0.3 * insem1 + 0.3 * insem2 + attendance + assignment + 0.5 * endsem;
        if (total >= 35) {

            System.out.println("You crossed the danger zone by " + (total - 35)+" marks");
        }
        else {
            System.out.println("You missed the exam by " + (35-total)+" marks");
        }
        System.out.println("You scored "+(total)+" marks");
        gpa.close();
    }
}