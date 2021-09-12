package com.ngoc.lesson;

import java.util.Scanner;

//Sum of 1, 1/2,..., 1/n
public class SumFrom1To1DivN {
    public int n;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        n = input.nextInt();
        input.close();
    }

    public void print() {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            //sum += (float) 1 / i;
        }
        System.out.println(sum);
    }
}
