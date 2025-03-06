package bronze1;

import java.util.Scanner;

public class ProtectCastle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 세로 크기
        int M = sc.nextInt(); // 가로 크기
        sc.nextLine(); // 개행 문자 소비

        char[][] guard = new char[N][M];
        boolean[] rowCheck = new boolean[N]; // 각 행에 경비원이 있는지 체크
        boolean[] colCheck = new boolean[M]; // 각 열에 경비원이 있는지 체크

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine(); // 한 줄 입력받기
            for (int j = 0; j < M; j++) {
                guard[i][j] = line.charAt(j);
                if (guard[i][j] == 'X') {
                    rowCheck[i] = true; // 해당 행에 경비원 존재
                    colCheck[j] = true; // 해당 열에 경비원 존재
                }
            }
        }

        // 경비원이 없는 행과 열 개수 세기
        int rowCount = 0, colCount = 0;
        for (boolean row : rowCheck) {
            if (!row) rowCount++; // 경비원이 없는 행 카운트 증가
        }
        for (boolean col : colCheck) {
            if (!col) colCount++; // 경비원이 없는 열 카운트 증가
        }

        // 더 큰 값을 출력 (최소 추가 경비원 수)
        System.out.println(Math.max(rowCount, colCount));

        sc.close();
    }
}
