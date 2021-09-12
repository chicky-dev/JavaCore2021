package com.ngoc.practice;

import java.util.Scanner;

/**
 * Print a tringle when knowing a height
 */
public class DrawATriangle {
    public int height;

    public void input() {
        System.out.println("Input a height: ");
        Scanner input = new Scanner(System.in);
        height = input.nextInt();
        input.close();
    }
    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 1; j <= 2 * height - 1; j++) {
                if (j <= height + i && j >= height - i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

