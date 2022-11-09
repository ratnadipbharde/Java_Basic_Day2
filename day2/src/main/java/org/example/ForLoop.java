package org.example;

import java.util.Scanner;

public class ForLoop {
    Scanner sc = new Scanner(System.in);

    public void naturalNumber()
    {
        System.out.print("enter Number :-");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++)
        {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("sum is = " + sum);
    }

    public void toReverse()
    {
        System.out.println("Enter number to Reverse :- ");
        int number = sc.nextInt();
        int N = number;
        int reverse = 0;
        for (int i = N; N > 0; N = N / 10)
        {
            int reminder = N % 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println("in reverse order:- "+reverse);
    }


}

