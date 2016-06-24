package com.company;
import java.util.*;

public class Main {


    public static void main(String[] args) {


        Scanner question = new Scanner(System.in);


        System.out.println(question1(10));

        sameSpelling("Hello", "Good bye");

        everyLetter("Stewiiiii");

        randomNumber();

        System.out.println(mix("Adventure"));

        greatNumber(6);

        System.out.println(twoNumbers(10, 10));

        System.out.println("what is the country abbrr");
        String answer = question.next();
        countryDomain(answer);


        System.out.println();

        System.out.println("Type letter");
        String answer2 = question.next();
        letterType(answer2);

    }

    public static boolean question1(int num) {

        if ((num % 2) == 0) {

            return true;
        } else return false;

    }


    public static void sameSpelling(String a, String b) {
        if (a.equals(b)) {
            System.out.println("This is True");
        } else System.out.println("This is False");

    }

    public static void everyLetter(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'w')
                break;
            System.out.println(word.charAt(i));
        }

    }


    public static int randomNumber() {
        int num = (int) (Math.random() * 100);
        System.out.println(num);
        if (num > 50) {
            return num;
        } else {
            return -1;
        }
    }

//question 5
    public static String time(int day, int month, int year){

        switch ()


    }


    public static String mix(String word) {
        String s = "";
        for (int i = 0; i < word.length(); i += 2) {
            s = s + word.charAt(i);

        }

        return s;

    }

    public static void greatNumber(int num) {
        if (num <= 5) {
            System.out.println("too low");
            return;
        }

            int i =1;


            while (i <= num){
                if(i != 4){
                    System.out.println(i);
                }

                i++;


        }

    }

    public static int twoNumbers(int num1, int num2) {
        if (num1 == num2) {
            return ((num1 + 2) + (num2 + 2));

        } else {
            return ((num1 + 1) + (num2 + 1));
        }

    }

   public static void countryDomain(String userInput){

       userInput = userInput.toLowerCase();

       switch(userInput){
           case "us":
             System.out.println("United States");
               break;
           case "de":
               System.out.println("Germany");
               break;
           case "hu":
               System.out.println("Hungary");
               break;
           default:
               System.out.println("Unknown");


       }


   }

    public static void letterType(String letters) {


            switch (letters){
                case "a":
                    System.out.println("Vowel");
                    break;
                case "e":
                    System.out.println("Vowel");
                    break;
                case "i":
                    System.out.println("Vowel");
                    break;
                case "o":
                    System.out.println("Vowel");
                    break;
                case "u":
                    System.out.println("Vowel");
                    break;
                case "y":
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");

            }

        }


    }




