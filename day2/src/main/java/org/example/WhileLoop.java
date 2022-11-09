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

   
}
