package bronze1;

import java.util.Scanner;

public class MostMultiples {

    // GCD 계산 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // LCM 계산 함수 (두 수에 대해)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // LCM 계산 함수 (세 수에 대해)
    public static int lcmOfThree(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 다섯 개의 수 입력
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // 세 개씩 조합하여 최소공배수 계산
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    // 세 수의 최소공배수를 구하고, 그 중 가장 작은 값을 찾기
                    int currentLCM = lcmOfThree(numbers[i], numbers[j], numbers[k]);
                    result = Math.min(result, currentLCM);
                }
            }
        }
        // 결과 출력
        System.out.println(result);
    }
}
