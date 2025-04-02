package bronze1;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 참가자 수
        int[][] scores = new int[N][3]; // N명의 3게임 점수 저장
        int[] totalScores = new int[N]; // 각 플레이어의 최종 점수

        // 점수 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = sc.nextInt();
            }
        }

        // 각 게임(1~3번째)에 대해 중복 체크 후 점수 계산
        for (int game = 0; game < 3; game++) {
            Map<Integer, Integer> countMap = new HashMap<>();

            // 숫자 빈도 계산
            for (int i = 0; i < N; i++) {
                countMap.put(scores[i][game], countMap.getOrDefault(scores[i][game], 0) + 1);
            }

            // 중복되지 않은 숫자만 점수로 인정
            for (int i = 0; i < N; i++) {
                if (countMap.get(scores[i][game]) == 1) { // 중복이 없을 경우
                    totalScores[i] += scores[i][game];
                }
            }
        }

        // 결과 출력
        for (int score : totalScores) {
            System.out.println(score);
        }

        sc.close();
    }
}
