package com.ngoc.lesson;

import java.util.Scanner;

/**
 * Print a rectangle
 */
public class PrintARectangle {
    public int height, width;

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
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
