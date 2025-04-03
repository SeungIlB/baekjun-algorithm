package bronze2;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        sc.close();

        // N의 마지막 두 자리를 00으로 초기화
        int modifiedN = (N / 100) * 100;

        // F로 나누어 떨어지는 가장 작은 수 찾기
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if ((modifiedN + i) % F == 0) {
                result = i;
                break;
            }
        }

        // 결과를 두 자리 숫자로 출력 (한 자리일 경우 앞에 0 추가)
        System.out.printf("%02d\n", result);
    }
}
