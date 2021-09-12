package lesson01;
import java.util.Scanner;
public class MinByTernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        input.close();
        System.out.printf("%d", findMin(num1, num2, num3));
    }
    public static int findMin(int num1, int num2, int num3) {
        int min = (num1 <= num2) ? num1 : num2;
        return ((min < num3) ? min : num3);
    }
}
