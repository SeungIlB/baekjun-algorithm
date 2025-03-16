package bronze1;

import java.util.Scanner;

public class PrimeKeyChecker {
    private static final int LIMIT = 1_000_000;

    public static boolean isValidKey(long S) {
        for (int i = 2; i <= LIMIT; i++) {
            if (S % i == 0) {
                return false; // 작은 소인수가 존재하면 적절하지 않은 키
            }
        }
        return true; // 작은 소인수가 없음 → 적절한 키
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        for(int i = 0; i < n; i++){
            long S = sc.nextLong();
            if (isValidKey(S)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
