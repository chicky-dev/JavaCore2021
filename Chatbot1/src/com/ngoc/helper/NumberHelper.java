package com.ngoc.helper;

public class NumberHelper {
    public int divisor(int numb1, int numb2) {
        if (numb1 == 0 || numb2 == 0) return numb1 + numb2;
        else {
            while (numb1 != numb2) {
                if (numb1 > numb2) {
                    numb1 -= numb2;
                } else numb2 -= numb1;
            }
            return numb1;
        }
    }
}
