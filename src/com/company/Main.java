package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	User user1 = new User("Marwa", "Hr", "marwa@gmail", "mmm", 28);
    User user2 = new User("Ahmed", "Hr", "ahmed@yahoo", "123", 5);
    System.out.println(user1);
    System.out.println(user2);
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

        System.out.println("L'utilisateur est :" +firstname+ " " +lastname+ " son email est :"+email+ " et il a " +age+ " ans");
    }

}
