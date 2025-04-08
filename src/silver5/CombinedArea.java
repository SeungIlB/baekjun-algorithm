package silver5;

import java.util.Scanner;

public class CombinedArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 최대 좌표값이 100이므로 101 x 101 배열 사용
        boolean[][] grid = new boolean[101][101];

        for (int i = 0; i < 4; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // 해당 직사각형이 차지하는 영역을 true로 마킹
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    grid[x][y] = true;
                }
            }
        }

        int area = 0;
        // 전체 영역 중 true인 칸 개수를 세면 총 면적
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                if (grid[x][y]) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}

