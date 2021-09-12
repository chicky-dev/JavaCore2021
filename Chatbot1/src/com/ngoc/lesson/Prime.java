package com.ngoc.lesson;

import com.ngoc.helper.NumberHelper;

import java.util.Scanner;
//Cặp nguyên tố cùng nhau
public class Prime {
    public int num1, num2;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        input.close();
    }

    public void print() {
        NumberHelper helper = new NumberHelper();
        for (int i = num1; i < num2; i++) {
            for (int j = i; j <= num2; j++) {
                if (helper.divisor(i,j) == 1) System.out.printf("%d %d\n", i, j);
            }
        }
    }
}

