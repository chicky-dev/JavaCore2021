package com.ngoc.lesson;

import java.util.Scanner;

//Sum odd numbers from 1 to n
public class SumFrom1ToN {
    public int n;

    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        n = input.nextInt();
        System.out.println((n % 2 == 0) ? (n / 2 + 1) * n / 2 : ((n - 1) / 2 + 1) * (n + 1) / 2);
    }
}
