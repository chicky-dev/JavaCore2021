package lesson01;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        checkNumber(num);
    }
    public static void checkNumber(int number){
        if (number % 2 == 0) System.out.println(number + " là số chẵn");
        else System.out.println(number + " là số lẻ");
    }
}
