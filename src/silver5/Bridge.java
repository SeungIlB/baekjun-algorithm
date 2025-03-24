package silver5;

import java.util.Scanner;

public class Bridge {
    public static long combination(int m, int n) {
        long result = 1;
        n = Math.min(n, m - n); // 계산을 줄이기 위해 대칭성 활용
        for (int i = 0; i < n; i++) {
            result *= (m - i);
            result /= (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testSize = sc.nextInt();

        for (int i = 0; i < testSize; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(combination(m, n));
        }
        sc.close();
    }
}
