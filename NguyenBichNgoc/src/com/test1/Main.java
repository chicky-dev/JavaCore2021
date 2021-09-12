package com.test1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Nhập vào số nguyên dương n");
        System.out.println("2.Viết ra tổng s=1+2+3+...+n");
        System.out.println("3.Đưa ra dãy số nguyên tố nhỏ hơn và bằng n");
        System.out.println("4.Nhập vào 1 xâu");
        System.out.println("5.Đưa ra độ dài của xâu");
        System.out.println("6.Đưa ra số câu của xâu");
        System.out.println("7.Nhập vào 1 ma trận vuông A");
        System.out.println("8.Đưa ra tổng các hàng của ma trận");
        System.out.println("9.Tính định thức của ma trận A");
        System.out.println("10.Thoát");

        IntegerHelper class01 = new IntegerHelper();
        StringHelper class02 = new StringHelper();
        MatrixHelper class03 = new MatrixHelper();

        do {
            Scanner init = new Scanner(System.in);
            byte option = init.nextByte();
            switch (option) {
                case 1 -> class01.inputInt();
                case 2 -> class01.findSum();
                case 3 -> class01.findPrime();
                case 4 -> class02.inputString();
                case 5 -> class02.findLength();
                case 6 -> class02.sentenceCount();
                case 7 -> class03.inputString();
                case 8 -> class03.findRow();
//                    case9->
                case 10 -> System.exit(0);
            }
        } while (true);
    }
}

