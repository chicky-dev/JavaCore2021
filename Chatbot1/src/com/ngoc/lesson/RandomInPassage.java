package com.ngoc.lesson;

import java.util.Random;
import java.util.Scanner;

/**
 * Compare two numbers
 */
public class RandomInPassage {
    public byte a;

    public void input() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input a number from 10 to 99: ");
            a = input.nextByte();
        } while (a < 10 || a > 99);
        input.close();
    }

    public void print() {
        java.util.Random random = new java.util.Random();
        int count = 0, tmp;
        do {
            count++;
            tmp = random.nextInt(90) + 10;
            System.out.printf("%d ", tmp);
        } while (a != tmp);
        System.out.printf("\n%d steps", count);
    }
}
