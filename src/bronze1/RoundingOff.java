package bronze1;

import java.util.Scanner;

public class RoundingOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int roundUnit = 10; // 반올림 단위 (10, 100, 1000, ...)

        while (N >= roundUnit) {
            int remainder = N % roundUnit; // 현재 자리의 값
            N -= remainder; // 일단 0으로 만든다

            if (remainder >= roundUnit / 2) { // 반올림 조건 (5 이상이면 올림)
                N += roundUnit;
            }

            roundUnit *= 10; // 다음 자리로 이동
        }

        System.out.println(N);
    }
}
