package org.example;

import java.util.Scanner;

public class Operator {

    Scanner sc = new Scanner(System.in);


    public void FindMinMax() {
        System.out.print("Enter Value of  a :-");
        int a = sc.nextInt();
        System.out.print("Enter Value of  b :-");
        int b = sc.nextInt();
        System.out.print("Enter Value of  c :-");
        int c = sc.nextInt();
        int result1 = a + b * c;
        int result2 = c + a / b;
        int result3 = a % b + c;
        int result4 = a * b + c;

        if (result1 > result2 && result1 > result3 && result1 > result4) {
            System.out.println("a+b*c = " + result1 + " is Max");
        } else if (result2 > result1 && result2 > result3 && result2 > result4) {
            System.out.println("c+a/b = " + result2 + " is Max");

        } else if (result3 > result1 && result3 > result2 && result3 > result4) {
            System.out.println("a%b+c = " + result3 + " is Max");
        } else {
            System.out.println("a*b+c = " + result4 + " is Max");
        }

        if (result1 < result2 && result1 < result3 && result1 < result4) {
            System.out.println("a+b*c = " + result1 + " is Min");
        } else if (result2 < result1 && result2 < result3 && result2 < result4) {
            System.out.println("c+a/b = " + result2 + " is Min");

        } else if (result3 < result1 && result3 < result2 && result3 < result4) {
            System.out.println("a%b+c = " + result3 + " is Min");
        } else {
            System.out.println("a*b+c = " + result4 + " is Min");
        }

    }

}

