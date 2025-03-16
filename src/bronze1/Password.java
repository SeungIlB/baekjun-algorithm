package bronze1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 열(col)의 개수 입력 받기
        int col = sc.nextInt();
        String str = sc.next();

        // 행(row)의 개수는 문자열 길이를 열 수로 나눈 값
        int row = str.length() / col;

        // 복호화된 문자열 출력
        System.out.println(decrypt(str, row, col));
    }

    public static String decrypt(String str, int row, int col) {
        StringBuilder result = new StringBuilder();
        char[][] c = new char[row][col];
        int idx = 0;

        // 2D 배열에 암호화된 문자열을 지그재그로 채우기
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {  // 짝수 행은 왼쪽에서 오른쪽으로 채우기
                for (int j = 0; j < col; j++) {
                    c[i][j] = str.charAt(idx++);
                }
            } else {  // 홀수 행은 오른쪽에서 왼쪽으로 채우기
                for (int j = col - 1; j >= 0; j--) {
                    c[i][j] = str.charAt(idx++);
                }
            }
        }

        // 2D 배열을 세로로 읽어서 원래의 문자열 복원
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                result.append(c[j][i]);  // 세로 방향으로 읽기
            }
        }

        return result.toString();
    }
}
