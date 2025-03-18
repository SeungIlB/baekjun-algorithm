package bronze1;

import java.util.Scanner;

public class Snail2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // 세로 (행 개수)
        int N = sc.nextInt(); // 가로 (열 개수)

        boolean[][] visited = new boolean[M][N]; // 방문 여부 저장
        int[] dx = {1, 0, -1, 0}; // → ↓ ← ↑ 방향
        int[] dy = {0, 1, 0, -1};

        int x = 0, y = 0, dir = 0, turnCount = 0; // 시작 위치 (0,0), 방향 오른쪽

        for (int i = 0; i < M * N - 1; i++) { // 마지막 칸 방문 후에는 방향 전환 안함
            visited[y][x] = true; // 현재 위치 방문 처리

            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 범위를 벗어나거나 이미 방문한 경우 → 방향 전환
            if (nx < 0 || nx >= N || ny < 0 || ny >= M || visited[ny][nx]) {
                dir = (dir + 1) % 4; // 시계방향 회전
                turnCount++; // 방향을 꺾었으므로 증가
                nx = x + dx[dir]; // 새로운 방향으로 이동
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        System.out.println(turnCount);
    }
}
