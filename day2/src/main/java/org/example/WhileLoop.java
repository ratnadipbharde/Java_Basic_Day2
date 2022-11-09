package org.example;

import java.util.Scanner;

public class WhileLoop {
    Scanner sc = new Scanner(System.in);
    public void naturalNumber()
    {
        System.out.print("enter Number :-");
        int N = sc.nextInt();
        int sum = 0;
        int i = 1;
        while ( i <= N )
        {
            sum = sum + i;
            System.out.println(i);
            i++;
        }
        System.out.println("sum is = " + sum);
    }

    public void toReverse()
    {
        System.out.println("Enter number to Reverse :- ");
        int number = sc.nextInt();
        int N = number;
        int reverse = 0;
        int i = N;
        while ( N > 0 )
        {
            int reminder = N % 10;
            reverse = reverse * 10 + reminder;
             N = N / 10;
        }
        System.out.println("in reverse order:- "+reverse);
    }
}
