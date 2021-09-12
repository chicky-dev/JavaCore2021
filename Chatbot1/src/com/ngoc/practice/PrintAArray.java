package com.ngoc.practice;

import java.util.Scanner;

/**
 * Print an array from 0 to n-1
 */
public class PrintAArray {
    private int n;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        n = input.nextInt();
        input.close();
    }

    public void printEven() {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) System.out.printf("%d", i);
            else System.out.print(" _ ");
        }
    }

    public void printOdd() {
        for (int i = 1; i < n; i += 2) {
            System.out.printf("%d ", i);
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", i);
        }
    }
}
