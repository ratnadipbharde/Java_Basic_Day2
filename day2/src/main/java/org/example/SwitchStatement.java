package org.example;

import java.util.Scanner;

public class SwitchStatement {
    Scanner sc=new Scanner(System.in);
    public void checkVowel(){
        System.out.println("Enter Charactor to to Check Vowel or Consonant :- ");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case 'a': System.out.println(ch + " is vowel");
                break;
            case 'e': System.out.println(ch + " is vowel");
                break;
            case 'i': System.out.println(ch + " is vowel");
                break;
            case 'o': System.out.println(ch + " is vowel");
                break;
            case 'u': System.out.println(ch + " is vowel");
                break;
            case 'A': System.out.println(ch + " is vowel");
                break;
            case 'E': System.out.println(ch + " is vowel");
                break;
            case 'I': System.out.println(ch + " is vowel");
                break;
            case 'O': System.out.println(ch + " is vowel");
                break;
            case 'U': System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }

    public void monthName(){
        System.out.println("Enter number to month name :- ");
        int number=sc.nextInt();
        switch (number) {
            case 1 : System.out.println(number + " is January");
                break;
            case 2 : System.out.println(number + " is February");
                break;
            case 3 : System.out.println(number + " is March");
                break;
            case 4 : System.out.println(number + " is April");
                break;
            case 5 : System.out.println(number + " is May");
                break;
            case 6 : System.out.println(number + " is June");
                break;
            case 7 : System.out.println(number + " is July");
                break;
            case 8 : System.out.println(number + " is August");
                break;
            case 9 : System.out.println(number + " is September");
                break;
            case 10: System.out.println(number + " is October");
                break;
            case 11 : System.out.println(number + " is November");
                break;
            case 12 : System.out.println(number + " is December");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
