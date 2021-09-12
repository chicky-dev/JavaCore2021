package com.ngoc.practice;

import java.util.Scanner;

public class StringExam {
    public static void main(String[] args) {
        String input = "  Nguyen Bach Ngoc ";
        String input2 = "Nguyen Bich Ngoc";
        System.out.println(input);
        System.out.println(input.equals(input2)); //compare
        System.out.println(input.concat("2k1"));  //nối chuỗi
        System.out.println(input.substring(2, 5)); //lấy chuỗi con [2,5)
        System.out.println(input.trim()); //bỏ khoảng trắng 2 đầu
        System.out.println(input.endsWith("Ngoc"));
        System.out.println(input2.startsWith("Nguyen"));
    }
}
