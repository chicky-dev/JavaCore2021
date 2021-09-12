package com.ngoc.practice;

import java.util.Scanner;

/**
 * Input and print
 */
public class Hello {
    private static java.lang.String name;

    public static void main(String[] args) {
        input();
        print();
    }
    public static void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
        name = input.nextLine();
        input.close();
    }

    public static void inputWithCondition() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input your name: ");
            name = input.nextLine();
        } while (!name.equals("Nguyen Bich Ngoc"));
        input.close();
    }

    public static void print() {
        System.out.println("Hello " + name);
    }

}
