package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
//        char littleChar = 'a';
//        char bigChar = 'A';
//        System.out.println(littleChar > bigChar);
        boolean isSchoolStudent = true;
        boolean isLibraryMember = false;
        int age1 = 10;

        System.out.println(isSchoolStudent || (isLibraryMember && age1 > 18));

        String name = "Farhan";
        int age = 27;

        String formattedString = String.format("My name is %s and I'm %d years old.", name, age);
        System.out.println(formattedString);

        String name1 = "Farhan";

        if (name.isEmpty()) {
            System.out.println("There is no name mentioned here");
        } else {
            System.out.println(String.format("Okay, I'll take care of %s.", name1));
        }

        String nameA = "Farhan Hasin Chowdhury";
        System.out.println(Arrays.toString(nameA.split(" ")));


        String nameA1 = "Farhan Hasin Chowdhury";
        String substrings[] = nameA1.split(" ");
        String joinedName = String.join(" ", substrings);
        System.out.println(joinedName); // Farhan Hasin Chowdhury

        System.out.println(String.join(" ", "Farhan", "Hasin", "Chowdhury")); // Farhan Hasin Chowdhury

        String loremIpsumStd = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.";
        System.out.println(String.format("Standard lorem ipsum text: %s", loremIpsumStd));
        String loremIpsumHalfTranslated = loremIpsumStd.replace("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium", "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system");
        System.out.println(String.format("Translated lorem ipsum text: %s", loremIpsumHalfTranslated));


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What's your name? ");
//        String namee = scanner.nextLine();
//        System.out.printf("So %s. How old are you? ", namee);
//        int agee = scanner.nextInt();
//
//        System.out.printf("Cool! %d is a good age to start programming.", agee);
//
//        scanner.close();


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What's your name? ");
//        String namew = scanner.nextLine();
//        System.out.printf("So %s. How old are you? ", namew);
//        int agew = scanner.nextInt();
//        scanner.nextLine();
//        System.out.printf("Cool! %d is a good age to start programming. \nWhat language would you prefer? ", agew);
//        String language = scanner.nextLine();
//
//        System.out.printf("Ah! %s is a solid programming language.", language);
//
//        scanner.close();


        int ageIf = 20;

        if (ageIf >= 18 && ageIf <= 40) {
            System.out.println("you can use the program");
        } else {
            System.out.println("you can not use the program");
        }

        

    }
}
