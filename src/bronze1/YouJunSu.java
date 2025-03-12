package bronze1;

import java.util.Scanner;

public class YouJunSu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (isYouJunSu(N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /**
     * 유진수인지 판별하는 메서드
     */
    private static boolean isYouJunSu(int N) {
        String str = String.valueOf(N);
        int len = str.length();

        for (int i = 1; i < len; i++) { // 1부터 len-1까지 나누는 위치 선택
            int leftProduct = calculateProduct(str.substring(0, i));
            int rightProduct = calculateProduct(str.substring(i));

            if (leftProduct == rightProduct) {
                return true; // 유진수 조건 충족
            }
        }

        return false; // 조건을 충족하지 않음
    }

    /**
     * 주어진 숫자 문자열의 각 자리수를 곱한 값을 계산
     */
    private static int calculateProduct(String part) {
        int product = 1;
        for (char c : part.toCharArray()) {
            product *= (c - '0'); // 문자에서 숫자로 변환 후 곱셈
        }
        return product;
    }
}
