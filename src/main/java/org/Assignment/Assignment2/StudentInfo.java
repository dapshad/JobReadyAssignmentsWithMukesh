package org.Assignment.Assignment2;

import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {

        Scanner student = new Scanner(System.in);
        System.out.println("Please Enter Number Of Students");
        student.nextInt();
        int s1 = student.nextInt();

        System.out.println("Please Enter Name");
        student.next();
        String name = student.next();

        System.out.println("Please Enter Email");
        student.next();
        String email = student.next();

        System.out.println("Please Enter Phone Number");
        student.nextLong();
        long s2 = student.nextLong();

        System.out.println("Please Enter Address");
        student.next();
        String address = student.next();

        System.out.println("Please Enter Status");
        student.next();
        String status = student.next();


        System.out.println("Please Enter Name");
        student.next();
        String name1 = student.next();

        System.out.println("Please Enter Email");
        student.next();
        String email1 = student.next();

        System.out.println("Please Enter Phone Number");
        student.nextLong();
        long s4 = student.nextLong();

        System.out.println("Please Enter Address");
        student.next();
        String address1 = student.next();

        System.out.println("Please Enter Status");
        student.next();
        String status1 = student.next();

        System.out.println("Please Enter Name");
        student.next();
        String name2 = student.next();

        System.out.println("Please Enter Email");
        student.next();
        String email2 = student.next();

        System.out.println("Please Enter Phone Number");
        student.nextLong();
        long s5 = student.nextLong();

        System.out.println("Please Enter Address");
        student.next();
        String address2 = student.next();

        System.out.println("Please Enter Status");
        student.next();
        String status2 = student.next();

        System.out.println("Please Enter Which Student Details Are You Looking For");
        student.next();
        String std = student.next();

        student.close();
    }
}
