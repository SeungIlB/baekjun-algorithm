package bronze1;

import java.util.Scanner;

public class AverageOver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < c; i++) {
            int subject = sc.nextInt(); // 학생 수
            int[] scores = new int[subject];
            int sum = 0;

            for (int j = 0; j < subject; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j]; // 총합 계산
            }

            double avg = (double) sum / subject; // 평균 계산
            int count = 0;

            for (int score : scores) {
                if (score > avg) {
                    count++; // 평균 초과 학생 수 계산
                }
            }

            double percentage = (double) count / subject * 100;
            System.out.printf("%.3f%%\n", percentage);
        }

        sc.close();
    }
}
