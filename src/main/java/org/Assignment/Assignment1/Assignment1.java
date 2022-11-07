package org.Assignment.Assignment1;

import java.lang.reflect.Array;

public class Assignment1 {

    public static void main(String[] args) {

        System.out.println("Hello");

        //Task 1
        int a = 10;
        int b = 20;
        System.out.println(b = a);
        System.out.println(a = b+a);

        //Task 2- Print sum of numbers (10,90.78,111,8989,7876)

        System.out.println(10 + 90.78 + 111 + 8989 + 7876);

        //Task 3
        System.out.println((10 + 90.78 + 111 + 8989 + 7876) / 5);

        //Task 4: A program to print all even numbers from 1 -200

        for (int i = 0; i < 200; i = i + 2) {
            System.out.println(i);
        }
        //Task 5- A program to print all odd numbers from 1-50
        for (int i = 1; i < 50; i = i + 2) {
            System.out.println(i);
        }
        //Task 6- Write a program to print all prime numbers from 1-1000
        /*int i = 0;
        int num2 = 0;
        String primeNumbers = "";
        for (i = 1; i < 1000; i = i++) {
            int counter = 0;
            for (num2 = i; num2 >= 1; num2--) ;
            {
                if (i % num2 == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
         System.out.println("Prime numbers from 1 to 1000 are:");
        System.out.println(primeNumbers);}*/


        //Task 7- Write a program to print below pattern

        for (int i = 0; i <1; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 1; k++) {
                                        for (int l = 0; l < 1; l++) {
                                          for (int m = 0; m <1; m++) {
                                              System.out.println(i);
                                              System.out.println(i + " " + j);
                                              System.out.println(i + " " + j + " " + k);
                                              System.out.println(i + " " + j + " " + k + " " + l);
                                              System.out.println(i + " " + j + " " + k + " " + l + " " + m + " ");
                        }
                    }
                }
            }
        }



                        //Task 8
                        int[] studentmarks = new int[5];
                        studentmarks[0] = 78;
                        studentmarks[1] = 12;
                        studentmarks[2] = 89;
                        studentmarks[3] = 55;
                        studentmarks[4] = 35;
                        System.out.println(studentmarks[0]);
                        System.out.println(studentmarks[2]);

                        //Task 9 Write a program which will break the current execution if it find number 85
                        int[] num1 = {12, 34, 66, 85, 900};{
            System.out.println(num1[3]);


                        int num = 85;
                        switch (num) {
                            case 12:
                                System.out.println("I can break now");
                                break;
                            case 34:
                                System.out.println("Hooray");
                                break;
                            case 66:
                                System.out.println("Hi");
                                break;
                            case 85:
                                System.out.println("I can break");
                                break;
                            case 900:
                                System.out.println("goodluck");
                                break;
                        }


                        //Task 10  Write a program which will break the current execution if it find “Selenium”
                        String[] Ass = {"Java", "JavaScript", "Selenium", "Python", "Mukesh"};

                        for (String str : Ass) {
                            System.out.println(str);

                            String str1 = "Selenium";
                            if (str1 == "Java") {
                                System.out.println("I got it");
                                break;
                            }
                            if (str1 == "JavaScript") {
                                System.out.println("Hurray");
                                break;
                            }
                            if (str1 == "Selenium") {
                                System.out.println("Come out of the loop bcos of Selenium");
                                break;
                            }
                            if (str1 == "Python") {
                                System.out.println("We got it wrong");
                                break;
                            }
                            if (str1 == "Mukesh") {
                                System.out.println("oh no!");
                                break;
                            } else {
                                System.out.println("Wrong ans!");
                                break;
                            }
    }

}

    }

}











