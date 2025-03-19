package bronze1;

import java.util.Scanner;

public class CuttingChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 초콜릿의 세로 크기
        int m = sc.nextInt(); // 초콜릿의 가로 크기
        sc.close();

        // 최소 쪼개기 횟수 계산 및 출력
        System.out.println((n * m) - 1);
    }
}
