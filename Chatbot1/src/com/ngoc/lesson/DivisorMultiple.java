package com.ngoc.lesson;

import com.ngoc.helper.NumberHelper;

import java.util.Scanner;

public class DivisorMultiple {
    public int num1, num2;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        input.close();
    }

    /*
           int temp;
            while (b != 0) {
                temp = a % b;
                a = b;
                b = temp;
            }
            return a;*/
    public void print() {
        NumberHelper helper = new NumberHelper();
        int div = helper.divisor(num1, num2);
        System.out.printf("%d %d", div, num1 * num2 / div);
    }
}
