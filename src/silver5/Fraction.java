package silver5;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();

        int diagonal = 0;  // 현재 몇 번째 대각선인지
        int sum = 0;        // 현재 대각선까지의 총 개수

        // 대각선 그룹을 찾기
        while (sum < X) {
            diagonal++;
            sum += diagonal;
        }

        // 해당 대각선에서 몇 번째 위치인지
        int position = X - (sum - diagonal);

        int numerator, denominator;
        if (diagonal % 2 == 1) { // 홀수 번째 대각선 (↗ 방향)
            numerator = diagonal - (position - 1);
            denominator = position;
        } else { // 짝수 번째 대각선 (↘ 방향)
            numerator = position;
            denominator = diagonal - (position - 1);
        }

        // 결과 출력
        System.out.println(numerator + "/" + denominator);
    }
}
