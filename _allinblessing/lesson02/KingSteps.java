package lesson02;

import java.util.Scanner;

public class KingSteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input current position: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.println("Input destination: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        System.out.printf("Print the minimum number of steps of the king: %d steps", Math.abs(x1 - x2) + Math.abs(y1 - y2));
    }
}
