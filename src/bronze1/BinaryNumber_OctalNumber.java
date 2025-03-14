package bronze1;

import java.util.Scanner;

public class BinaryNumber_OctalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String binary = scanner.next();
        scanner.close();

        int decimal = Integer.parseInt(binary, 2);

        String octal = Integer.toOctalString(decimal);

        System.out.println(octal);
    }
}
