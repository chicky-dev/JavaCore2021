package com.test1;

import java.util.Scanner;

public class IntegerHelper {
    public int n;

    public void inputInt() {
        Scanner number1 = new Scanner(System.in);
        n = number1.nextByte();
    }

    public void findSum() {
        System.out.println((1 + n) * n / 2);
    }

    private boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 2;
    }

    public void findPrime() {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
