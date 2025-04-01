package silver5;

import java.util.Scanner;

public class Bulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람 수 입력

        int[][] people = new int[N][2]; // 사람들의 몸무게와 키 저장
        int[] ranks = new int[N]; // 덩치 등수 저장

        // 데이터 입력
        for (int i = 0; i < N; i++) {
            people[i][0] = sc.nextInt(); // 몸무게
            people[i][1] = sc.nextInt(); // 키
            ranks[i] = 1; // 초기 등수는 모두 1등
        }

        // 덩치 비교
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    ranks[i]++; // 자신보다 더 큰 사람이 있으면 등수 증가
                }
            }
        }

        // 결과 출력
        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
        sc.close();
    }
}
