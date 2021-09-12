package com.ngoc.practice;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimeStampEx {
    public static void main(String[] args) {
        //tính từ 1/1/1970 đến ...
        System.out.println(System.currentTimeMillis());
        Timestamp input = new Timestamp(System.currentTimeMillis());
        System.out.println(input);

       SimpleDateFormat input1 = new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss");
    //    SimpleDateFormat input1 = new SimpleDateFormat("HH:mm:ss");
        String save = input1.format(System.currentTimeMillis());
        System.out.println(save);

        try {
            //đoạn code có thể xảy ra lỗi
        }catch (Exception e){
            //đoạn code để xử lí khi xảy ra lỗi, chỉ chạy khi có lỗi xảy ra, có nhiều catch
        }finally {
            //đoạn code luôn luôn thực hiện dù có hay k lỗi, t.hiện khi kết thúc try, có 1 finally
        }
    }
}

//"MM/yyyy, HH:mm:ss"
//"dd/MM/yyyy, HH:mm:ss"
//"dd.MM.yyyy, HH:mm:ss"
