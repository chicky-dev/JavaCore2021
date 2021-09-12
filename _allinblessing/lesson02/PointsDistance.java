package lesson02;

import java.util.Scanner;

public class PointsDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first point: ");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        System.out.println("Input second point: ");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float distance = (float) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.printf("Print distance between two points: %.2f", (float) Math.sqrt(distance));
    }
}
