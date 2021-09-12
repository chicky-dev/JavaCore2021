package lesson01;
public class ValueExchange {
    public static void main(String[] args) {
        int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
        System.out.printf("a = %d, b = %d", a, b);
    }
}
