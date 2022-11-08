package org.example;


import java.util.Scanner;

public class IfElse {
    Scanner sc=new Scanner(System.in);
    public void digitToWord(){
        System.out.print("Enter Digit(0 to 9) :-");

        int number=sc.nextInt();
        if(number==0) {
            System.out.println("Zero");
        }
        else if (number==1) {
            System.out.println("One");
        }
        else if(number==2) {
            System.out.println("Two");
        }
        else if (number==3) {
            System.out.println("Three");
        }
        else if (number==4) {
            System.out.println("Four");
        }
        else if(number==5) {
            System.out.println("Five");
        }
        else if (number==6) {
            System.out.println("Six");
        }
        else if (number==7) {
            System.out.println("Seven");
        }
        else if(number==8) {
            System.out.println("Eight");
        }
        else if (number==9) {
            System.out.println("Nine");
        }
        else {
            System.out.println("invalid Input");
        }
    }

    public Void displayUnit(){

        System.out.print("Enter Digit for display Unit(1,10,100,1000):-");
        int digit = sc.nextInt();
            if (digit == 1)
            {
                System.out.println("Unit");
            }
            else if (digit == 10)
            {
                System.out.println("Ten");
            }
            else if (digit == 100)
            {
                System.out.println("Hundred");
            }
            else if (digit == 1000)
            {
                System.out.println("Thousand");
            }
            else {
                System.out.println("Invalid input");
            }
        return null;
    }
}
