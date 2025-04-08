package silver5;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < test; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);

            System.out.println(lcm(a, b));
        }
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
