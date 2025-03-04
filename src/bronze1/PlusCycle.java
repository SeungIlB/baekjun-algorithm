package bronze1;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int original = n;
        int count = 0;

        while (true) {
            int left = n / 10;
            int right = n % 10;
            int sum = left + right;
            n = (right * 10) + (sum % 10);
            count++;

            if (n == original) {
                break;
            }
        }

        System.out.println(count);
    }
}
