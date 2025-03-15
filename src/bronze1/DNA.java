package bronze1;

import java.util.Scanner;

public class DNA {
    // 변환 규칙 테이블
    private static final char[][] TABLE = {
            {'A', 'C', 'A', 'G'},
            {'C', 'G', 'T', 'A'},
            {'A', 'T', 'C', 'G'},
            {'G', 'A', 'G', 'T'}
    };

    // 문자 인덱스 매핑
    private static int getIndex(char base) {
        switch (base) {
            case 'A': return 0;
            case 'G': return 1;
            case 'C': return 2;
            case 'T': return 3;
            default: throw new IllegalArgumentException("Invalid base: " + base);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();
        String dna = sc.next();
        sc.close();

        // 변환 과정
        char result = dna.charAt(N - 1); // 마지막 문자부터 시작
        for (int i = N - 2; i >= 0; i--) {
            char previous = dna.charAt(i);
            result = TABLE[getIndex(previous)][getIndex(result)];
        }

        // 최종 변환된 염기 출력
        System.out.println(result);
    }
}
