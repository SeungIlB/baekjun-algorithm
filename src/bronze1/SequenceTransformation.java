package bronze1;

import java.util.Scanner;

public class SequenceTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, K 입력
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        // 수열 입력 및 ',' 기준으로 분할
        String[] input = sc.nextLine().split(",");
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(input[i]);
        }

        // K번 변형 수행
        for (int k = 0; k < K; k++) {
            int[] newSequence = new int[sequence.length - 1];
            for (int i = 0; i < newSequence.length; i++) {
                newSequence[i] = sequence[i + 1] - sequence[i];
            }
            sequence = newSequence; // 업데이트
        }

        // 결과 출력
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i]);
            if (i < sequence.length - 1) {
                System.out.print(",");
            }
        }
    }
}
