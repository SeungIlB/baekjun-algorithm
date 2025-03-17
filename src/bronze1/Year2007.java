package bronze1;

import java.util.Scanner;

public class Year2007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();  // 월 입력
        int y = sc.nextInt();  // 일 입력

        // 2007년의 각 월의 일 수 (평년)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        // 1월 1일부터 (x월 y일)까지의 경과 일수 계산
        int totalDays = 0;

        // 1월부터 (x-1)월까지의 모든 일수를 더함
        for (int i = 0; i < x - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // y일을 더함
        totalDays += y;

        // (경과 일수 - 1) % 7을 이용하여 요일 찾기
        System.out.println(dayOfWeek[(totalDays - 1) % 7]);

        sc.close();
    }
}
