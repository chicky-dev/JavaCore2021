package com.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringHelper {
    public String s;

    public void inputString() {
        Scanner number2 = new Scanner(System.in);
        s = number2.nextLine();
    }

    public void findLength() {
        System.out.println(s.length());
    }

    public void sentenceCount() {
        //tách từ ngăn bởi dấu chấm
        String[] array = s.split("\\.");
        //khởi tạo ds từ 1 mảng có sẵn (vì kb số lượng) array->arraylist
        ArrayList<String> sentences = new ArrayList<>(Arrays.asList(array));
        //System.out.println(sentences);
//        for (String x : sentences) {
//            if (x == "." || x == "")
//                sentences.remove(x);
//        }
        sentences.removeIf(s -> s.equals(".") || s.equals(""));
        System.out.println(sentences.size());
    }
}
//nguyen...bich..ngoc.a  :: nguyen, , , ,bich, ,ngoc,a