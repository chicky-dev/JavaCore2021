package com.ngoc;


import com.ngoc.lesson.DivisorMultiple;
import com.ngoc.lesson.Prime;

public class Main {
    //class Prime    doi tuong: program    :: static goi tu prime  ::k static goi tu doi tuong
    //doi tuong la 1 the hien, 1 dai dien cho class
    public static void main(String[] args) {
        Prime program = new Prime();
        program.input();
        program.print();
        DivisorMultiple program2 = new DivisorMultiple();
        program2.input();
        program2.print();
    }
}
