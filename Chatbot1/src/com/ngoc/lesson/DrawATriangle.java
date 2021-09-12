package com.ngoc.lesson;

import java.util.Scanner;

/**
 * Print a triangle when knowing a height
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
            int tmp = i + 1, m = 0;
            for (int j = 1; j <= 2 * height - 1; j++) {
                if (j <= height + i && j >= height) {
                    System.out.printf("%d ", tmp);
                    --tmp;
                } else if (j >= height - i && j < height) {
                    m++;
                    System.out.printf("%d ", m);
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
