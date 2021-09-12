package com.ngoc.practice;

import java.util.Scanner;

/**
 * Print a rectangle
 */
public class PrintARectangle {
    private int height, width;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        height = input.nextInt();
        width = input.nextInt();
        input.close();
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();;
        }
    }
}
