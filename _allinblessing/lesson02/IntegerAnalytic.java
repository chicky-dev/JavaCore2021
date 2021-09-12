package lesson02;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerAnalytic {
    public static void main(String[] args) {
        String number;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Input an integer: ");
            number = input.next();
        } while (!checkInput(number));
        System.out.println("Digits = " + Arrays.toString(getDigits(number)));
        System.out.println("Sum = " + findSumDigits(number));
    }

    public static boolean checkInput(String number) {
        if (number.length() > 25) return false;
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            if ((digit > 9) || (digit < 0)) return false;
        }
        return true;
    }

    public static char[] getDigits(String number) {
        return number.toCharArray();
    }

    public static int findSumDigits(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++)
            sum += number.charAt(i) - '0';
        return sum;
    }
}
