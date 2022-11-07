package org.Assignment.Assignment2;

import java.net.Socket;

public class Trainer {

    /*Task 1 :Create a class name as “Trainer” which will have 4 fields name, department ,  email, id. Trainer can teach Selenium, DevOps, Web Development.
Note- use method, constructor

Trainer details are
Trainer 1 – “Mukesh” ,”Testing”,mukesh@gmail.com, 1
Trainer 2 – “Hitesh” ,”Dev”,mukesh@gmail.com, 2
Trainer 1 – “Mukesh” ,”DevOps”,mukesh@gmail.com, 3

Trainer 1 can teach Selenium, Trainer 2 can teach Web Development, Trainer 3 can teach DevOps.

    will be method overloading, constructor & constructor overloading
     */
    //task 2 will be using object array to store & maybe pull out each info from the array
    //task 3 will be using scanner class to input

    String name;
    String dep;
    String email;
    int id;

    public Trainer(String trainerName, String department,String emailAddy,int trainerID){
        name=trainerName;
        dep = department;
        email= emailAddy;
        id=trainerID;
    }



    public static void main(String[] args) {
        Trainer trn = new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
        Trainer trn1 = new Trainer("Hitesh", "Dev", "mukesh@gmail.com",2);
        Trainer trn2 = new Trainer("Mukesh", "DevOps", "mukesh@gmail.com",3);

        trn.Trainer1();//This will print all info of Trainer 1
        trn1.Trainer2();//This will print all info of Trainer 2
        trn2.Trainer3(); //This will print all info of Trainer 3
        System.out.println(trn.dep);//This will print Testing
        System.out.println(trn1.id);//This will print 2

        System.out.println("End of task 1  *************");

        //Task 2: Storing all Info into Array

        Object [] trainer1= {"Mukesh","Testing","mukesh@gmail.com",1};
        for (Object obj:trainer1){
            System.out.println(obj);
        }

        Object[]trainer2={"Hitesh","Dev","mukesh@gmail.com",2};
        for (Object obj1:trainer2){
            System.out.println(obj1);
        }

        Object[]trainer3={"Mukehs","DevOps","mukesh@gmail.com",3};
        for (Object obj2:trainer3){
            System.out.println(obj2);
        }

    }

    public  void Trainer1(){
        System.out.println("I Can Teach Selenium");
    }

    public void Trainer2(){
        System.out.println("I can Teach DevOps");
    }

    public void Trainer3(){
        System.out.println("I Can Teach Web Development");
    }


}
