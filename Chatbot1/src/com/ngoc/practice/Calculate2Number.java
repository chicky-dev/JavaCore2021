package com.ngoc.practice;

import java.util.Scanner;

/**
 * Calculate two numbers
 */
public class Calculate2Number {
    public int a, b;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        input.close();
    }

    public void sum() {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void sub() {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }

    public void mul() {
        System.out.printf("%d x %d = %d\n", a, b, a * b);
    }

    public void div() {
        System.out.printf("%d : %d = %d\n", a, b, a / b);
    }
}
