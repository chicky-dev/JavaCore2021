package com.ngoc.practice;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.*;

public class Collection {
    public static void main(String[] args) {
        //arrayList();
        //hashSet();
        hashMap();
    }

    private static void hashMap() {
        //key k được trùng
        Map<String, Integer> students = new TreeMap<>();
        //HashMap<String, Integer> students = new HashMap<>();
        students.put("Ngoc", 20);
        students.put("Hoa", 21);
        students.put("Mai", 22);
        students.put("Hoa", 20); //update value
        students.putIfAbsent("Mai", 29); //keep old value
        System.out.println(students);
    }

    private static void hashSet() {
        //HashSet<String> students = new HashSet<>();
        Set<String> students = new TreeSet<>();//sx theo từ điển, các phần tử k trùng nhau

        students.add("Hoa");
        students.add("Lan");
        students.add("Hong");
        students.add("Ly");
        students.add("Ngoc");
        students.add("Tulip");
        students.add("Cuc");
        students.add("Ngoc");
        students.add("Sunflower");
        System.out.println("Danh sách ban đầu: " + students);
    }

    private static void arrayList() {
        ArrayList<String> students = new ArrayList<>();
        students.add("Hoa");
        students.add("Lan");
        students.add("Hong");
        students.add("Ly");
        students.add("Ngoc");
        students.add("Tulip");
        students.add("Cuc");
        students.add("Ngoc");
        students.add("Sunflower");
        System.out.println("Danh sách ban đầu: " + students);

        students.add(2, "Mai");
        System.out.println("Thêm phần tử ở vị trí số 2: " + students);

        students.remove(0);
        System.out.println("Xóa phần tử ở vị trí số 0: " + students);

        students.remove("Lan");
        System.out.println("Xóa phần tử giá trị = Lan: " + students);

        String student = students.get(3);
        System.out.println("Tìm phần tử ở vị trí số 3: " + student);

        int index1 = students.indexOf("Lee");
        int index2 = students.indexOf("Ngoc");
        int index3 = students.lastIndexOf("Ngoc");
        System.out.println("Vị trí của phần tử đầu tiên bằng Lee, Ngoc: " + index1 + " " + index2);
        System.out.println("Vị trí của phần tử cuối cùng bằng Ngoc: " + index3);

        boolean isExist = students.contains("Ly");
        System.out.println("Kiểm tra phần tử có tồn tại trong danh sách không: " + isExist);

        for (String stu : students) {
            System.out.printf("%s ", stu);
        }
        System.out.println();

        students.removeIf(stud -> stud.startsWith("N"));
        System.out.println("Xóa các phần tử theo điều kiện (bắt đầu bằng chữ N): " + students);

        Collections.sort(students);
        System.out.println("Sắp xếp ds theo từ điển: " + students);
    }
}


//cách khởi tạo 1 arraylist
//        ArrayList<Integer> inputUser = new ArrayList<>();
//        inputUser.add(3);
//        inputUser.add(4);
//        inputUser.add(5);
//        inputUser.add(1,10); //them so 10 vao vi tri 1
//        ArrayList<Integer> pasteList = new ArrayList<>(inputUser);
//        System.out.println(pasteList);
//        System.out.println(inputUser);
//        //xoa so vi tri 2
//        //inputUser.remove(2);
//        //xoa so 3
//        inputUser.remove(Integer.valueOf(3));
//        System.out.println(inputUser);
