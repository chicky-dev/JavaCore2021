package com.test1;

import java.util.Scanner;

public class MatrixHelper {
    public int num;
    public int[][] list;
    Scanner number3 = new Scanner(System.in);

    public void inputString() {
        num = number3.nextInt();
        //khai báo số lượng cho mảng vì dòng 7 chưa có
        list = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                list[i][j] = number3.nextInt();
            }
        }
    }

    public void findRow() {
        for (int i = 0; i < num; i++) {
            int sumRow = 0;
            for (int j = 0; j < num; j++) {
                sumRow += list[i][j];
            }
            System.out.printf("%d\n", sumRow);
        }
    }
//    public void FindDeterminant(){
//
//    }
}
