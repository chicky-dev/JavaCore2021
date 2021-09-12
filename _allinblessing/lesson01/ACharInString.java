package lesson01;
import java.util.Scanner;
public class ACharInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // nhập chuoi
        String inputString = input.nextLine();
        char inputChar = input.next().charAt(0);
        input.close();
        System.out.println(check(inputString, inputChar));
    }

    /**
     *
     * @param inputString
     * @param inputChar
     * @return
     */
    private static boolean check(String inputString, char inputChar) {
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) return true;
        }
        return false;
    }
}
