package org.Assignment.Assignment3And4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Assignment4 {

    public static void main(String[] args) {

        System.out.println("******************Start Task 1**********************************");
        //Task 1: Create a list of String and print the values in reverse order
        //Input – Java, Selenium, TestNG, Git, Github
        //	Output- Github, Git, TestNG, Selenium, Java

        List<String>boo = Arrays.asList("Java","Selenium","TestNG","Git","Github");

        for (int i=4;i>-1;i--){
            System.out.println(boo.get(i));
        }
        System.out.println("******************Start Task 2**********************************");
        //Task 2: Write a program which will accept List of String and produce another List of string of which will have only values which starts with git
        //Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
        //Output- Git, Github, Gitlab, GitBash

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Git");
        list1.add("Github");
        list1.add("GitLab");
        list1.add("GitBash");
        list1.add("Selenium");
        list1.add("Java");
        list1.add("Maven");
        System.out.println(list1);
        for (int i =0; i< list1.size()-3;i++)
            System.out.println(list1.get(i));



        System.out.println("******************Start Task 3**********************************");
        //Task 3: Write a program that will remove duplicate values from List
        //Input – Java, TestNG, Maven, Java,
        //Output – Java, TestNG, Maven

        List<String> l2= Arrays.asList("Java","TestNG","Maven","Java");

        System.out.println(l2);
        //l2.remove(0).

        //System.out.println(l2.remove(3));

        System.out.println("******************Start Task 4**********************************");
        //Task 4: Create a list of values and print the second element, second last element.
        //Input – 10,45, 90,45, 23, 90, 44
        //Output – 45,90

        List<Integer> l3 = Arrays.asList(10,45,90,45,23,90,44);
        System.out.println(l3.get(1));
        System.out.println(l3.get(5));

        System.out.println("******************Start Task 5**********************************");
        //Task 5: Create a list which can accept another list as an element.
        //      List 1- 11,22,33
        //	    List 2-  9,19,29
        //	    List 3-  7,17,27

        ArrayList<Integer> dapz= new ArrayList<>();
        dapz.add(11);
        dapz.add(22);
        dapz.add(33);

        ArrayList<Integer> dapz1 = new ArrayList<>(dapz);
        dapz1.add(9);
        dapz1.add(19);
        dapz1.add(29);

        ArrayList<Integer>dapz2 = new ArrayList<>(dapz1);
        dapz2.add(7);
        dapz2.add(17);
        dapz2.add(27);

        System.out.println("I have successfully added all list into "+dapz2);









    }
}
