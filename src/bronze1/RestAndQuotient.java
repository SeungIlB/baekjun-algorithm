package bronze1;

import java.math.BigInteger;
import java.util.Scanner;

public class RestAndQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // BigInteger 사용
        BigInteger result = BigInteger.ZERO;

        // 1부터 n-1까지 반복하면서 계산
        for (int i = 1; i < n; i++) {
            BigInteger value = BigInteger.valueOf(i).multiply(BigInteger.valueOf(n + 1));
            result = result.add(value);
        }

        System.out.println(result);
    }
}
