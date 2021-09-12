package lesson01;

import java.util.Scanner;

public class DayOfMonth {

    static final int JANUARY = 1, FEBRUARY = 2, MARCH = 3, APRIL = 4, MAY = 5, JUNE = 6,
            JULY = 7, AUGUST = 8, SEPTEMBER = 9, OCTOBER = 10, NOVEMBER = 11, DECEMBER = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        while (true) {
            try {
                month = inputOfUser(sc);
                printDaysOfMonth(month);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Tháng phải là một số!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int inputOfUser(Scanner sc) throws NumberFormatException {
        System.out.print("Vui long nhap mot thang : ");
        return Integer.parseInt(sc.nextLine());
    }

    private static void printDaysOfMonth(int month) throws IllegalArgumentException {
        switch (month) {
            case JANUARY -> System.out.println("Tháng một có ba mươi mốt ngày.");
            case FEBRUARY -> System.out.println("Tháng hai có hai mươi tám ngày.");
            case MARCH -> System.out.println("Tháng ba có ba mươi mốt ngày.");
            case APRIL -> System.out.println("Tháng bốn có ba mươi ngày.");
            case MAY -> System.out.println("Tháng năm có ba mươi mốt ngày.");
            case JUNE -> System.out.println("Tháng sáu có ba mươi ngày.");
            case JULY -> System.out.println("Tháng bảy có ba mươi mốt ngày.");
            case AUGUST -> System.out.println("Tháng tám có ba mươi mốt ngày.");
            case SEPTEMBER -> System.out.println("Tháng chín có ba mươi ngày.");
            case OCTOBER -> System.out.println("Tháng mười có ba mươi mốt ngày.");
            case NOVEMBER -> System.out.println("Tháng mười một có ba mươi ngày.");
            case DECEMBER -> System.out.println("Tháng mười hai có ba mươi mốt ngày.");
            default -> throw new IllegalArgumentException("Tháng phải nằm trong khoảng [1..12]");
        }
    }
}
