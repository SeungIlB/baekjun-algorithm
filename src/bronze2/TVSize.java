package bronze2;

import java.util.Scanner;

public class TVSize {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int D  = sc.nextInt();  // 대각선 길이
        int H = sc.nextInt();   // 높이 비율
        int W = sc.nextInt();   // 너비 비율
        sc.close();

        // 비율을 고려한 크기 배율 계산
        double scale = D / Math.sqrt(H * H + W * W);

        // 실제 높이와 너비 계산 (소수점 버림)
        int height = (int) Math.floor(H * scale);
        int width = (int) Math.floor(W * scale);

        // 결과 출력
        System.out.println(height + " " + width);
    }
}

