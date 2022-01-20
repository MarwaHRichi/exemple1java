package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	User user1 = new User("Marwa", "Hr", "marwa@gmail", "mmm", 28);
    User user2 = new User("Ahmed", "Hr", "ahmed@yahoo", "123", 5);

    System.out.println(user1);
    System.out.println(user2);
   // System.out.println(user3);
        Scanner scan = new Scanner(System.in);
        String firstname;
        String lastname;
        String email;
        int age;
        System.out.println("Entrer Firstname");
        firstname = scan.nextLine();
        System.out.println("Entrer Lastname");
        lastname = scan.nextLine();
        System.out.println("Entrer email");
        email = scan.nextLine();
        System.out.println("Entrer age");
        age = Integer.parseInt(scan.nextLine());
        User user3 = new User("Meriem", "hr","meriemhr@gmail","1234",25);
        //System.out.println("L'utilisateur est :" +firstname+ " " +lastname+ " son email est :"+email+ " et il a " +age+ " ans");
        System.out.println("L'utilisateur est :" +user3.firstname+ " " +user3.lastname+ " son email est :"+user3.email+ " et il a " +user3.age+ " ans");

        //System.out.println(user3);


    }

}
