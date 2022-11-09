package org.example;

import java.util.Scanner;

public class ForLoop {
    public void naturalNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Number :-");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++)
        {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("sum is = "+sum);
    }
}

