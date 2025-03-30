package silver5;

import java.util.Scanner;

public class TwoDimensionalArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 크기 입력
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N + 1][M + 1];  // 1-based indexing
        int[][] prefixSum = new int[N + 1][M + 1];

        // 배열 입력 및 누적 합 계산
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                arr[i][j] = sc.nextInt();
                prefixSum[i][j] = arr[i][j]
                        + prefixSum[i - 1][j]
                        + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1];
            }
        }

        // 부분합 질의 처리
        int K = sc.nextInt();
        StringBuilder sb = new StringBuilder(); // 빠른 출력 처리

        for (int q = 0; q < K; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = prefixSum[x][y]
                    - prefixSum[i - 1][y]
                    - prefixSum[x][j - 1]
                    + prefixSum[i - 1][j - 1];

            sb.append(sum).append("\n");
        }

        sc.close();
        System.out.print(sb);
    }
}
