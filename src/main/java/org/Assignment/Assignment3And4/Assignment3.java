package org.Assignment.Assignment3And4;


import java.util.*;

public class Assignment3 {


    //Task 1:Write a program which can store List of Integer values and print all the values using for loop.
    public static void main(String[] args) {

        System.out.println("******************Start Task 1**********************************");

        List<Integer> n1 = Arrays.asList(10, 20, 30, 40, 50);

        for (int i = 0; i < 5; i++) {
            System.out.println(n1.get(i));
        }

        System.out.println("******************Start Task 2**********************************");
        //Task 2:Write a program which can store List of Integer values and print all the values using Iterator.

        List<Integer> n2 = Arrays.asList(100, 110, 120, 130, 140, 150);
        Iterator<Integer> daps = n2.iterator();
        while (daps.hasNext()) {
            Integer dee1 = daps.next();
            System.out.println(dee1);
        }
        System.out.println("--------------------------Task 3----------------------------------------");
        //Task 3:Write a program which will print sum of all numbers which is stored in list.


        List<Integer> m1 = Arrays.asList(23, 69, 85, 10, 50);
        //System.out.println(m1);
        int sum = m1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("-------------------------Begin Task 4-------------------------------");
        //Task 4: Write a program which will pick the values from Array and Store them List.
        //String[] value = {"Dapo", "Bade", "Farrukh", "Iqbal", "Don"};
        List<String> value = Arrays.asList("Dapo", "Bade", "Farrukh", "Iqbal", "Don");

        for (String x1 : value) {
            System.out.println(x1);
        }


        //Task 5:Create a list of numbers 33,44,55,66,77,88 and perform below operation
        //	Remove second element from list using index
        //	Remove second element from list using value
        //	Add 90 at index 3
        //	Get the length of list
        //	Print all values from list using any values
        //	Convert List into array.


        LinkedList<Integer> non = new LinkedList<>();
        non.add(33);
        non.add(44);
        non.add(55);
        non.add(66);
        non.add(77);
        non.add(88);

        non.remove(1);
        System.out.println(non);

        non.removeFirstOccurrence(55);
        System.out.println(non);


        //non.removeIf(non==44);

        non.add(3, 90);
        System.out.println(non);

        //Returns length of the list Array
        System.out.println(non.size());

        //Using for each to print the values

        for (Integer p2 : non) {
            System.out.println(p2);
        }
        //Converting to Array
        List<Integer> n5 = Arrays.asList(33, 55, 66, 90, 77, 88);
        System.out.println(n5);

        System.out.println("********************Start Task 6********************");
        //Task 6:Write a program which will display true if list contains Mobile else prints false
        //	List  - Web Automation, API Automation, Mobile Automation.
        //	Output – True

        LinkedList<String> list = new LinkedList<>();
        list.add("Web Automation");
        list.add("API Automation");
        list.add("Mobile Automation");


        // List contains Mobile Automation
        if (list.contains("Mobile Automation")) {
            System.out.println(
                    "True");
        } else {
            System.out.println("False");
        }

        // List contains Mobile
        for (String str : list) {
            if (str.contains("Mobile")) {
                System.out.println("True");
            } else
                System.out.println("False");
        }


        }
    }





