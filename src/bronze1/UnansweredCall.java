package bronze1;

import java.util.Scanner;

public class UnansweredCall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 곡 개수
        int L = sc.nextInt(); // 곡 길이 (초)
        int D = sc.nextInt(); // 전화벨 주기 (초)

        int earliestRingTime = findEarliestRingTime(N, L, D);
        System.out.println(earliestRingTime);
    }

    /**
     * 가장 빠르게 전화벨을 들을 수 있는 시간을 찾는 메서드
     */
    private static int findEarliestRingTime(int N, int L, int D) {
        int totalPlayTime = calculateTotalPlayTime(N, L);
        int ringTime = 0;

        while (ringTime < totalPlayTime) {
            if (!isSongPlaying(N, L, ringTime)) {
                return ringTime; // 전화를 받을 수 있는 가장 빠른 순간 반환
            }
            ringTime += D;
        }
        return ringTime; // 모든 노래가 끝난 후 전화를 받을 수 있는 시간 반환
    }

    /**
     * 전체 앨범의 재생 시간을 계산하는 메서드
     */
    private static int calculateTotalPlayTime(int N, int L) {
        return N * L + (N - 1) * 5;
    }

    /**
     * 특정 시간에 노래가 재생 중인지 확인하는 메서드
     */
    private static boolean isSongPlaying(int N, int L, int time) {
        for (int i = 0; i < N; i++) {
            int songStart = i * (L + 5);
            int songEnd = songStart + L;
            if (songStart <= time && time < songEnd) {
                return true; // 노래가 재생 중이면 true 반환
            }
        }
        return false; // 노래가 재생 중이 아니면 false 반환
    }
}
