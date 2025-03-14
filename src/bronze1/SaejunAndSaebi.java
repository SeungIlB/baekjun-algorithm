package bronze1;

import java.util.Scanner;

public class SaejunAndSaebi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine().trim()); // 테스트 케이스 개수

        for (int t = 0; t < T; t++) {
            // 빈 줄이 있을 경우 건너뛰기
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) { // 빈 줄이 아닐 때만 처리
                    String[] nm = line.split(" ");
                    int N = Integer.parseInt(nm[0]);
                    int M = Integer.parseInt(nm[1]);

                    // 세준이 병사들 중 최강 병사 찾기
                    int maxS = Integer.MIN_VALUE;
                    String[] sPower = scanner.nextLine().trim().split(" ");
                    for (String s : sPower) {
                        maxS = Math.max(maxS, Integer.parseInt(s));
                    }

                    // 세비 병사들 중 최강 병사 찾기
                    int maxB = Integer.MIN_VALUE;
                    String[] bPower = scanner.nextLine().trim().split(" ");
                    for (String b : bPower) {
                        maxB = Math.max(maxB, Integer.parseInt(b));
                    }

                    // 승자 판별 (세준이가 무승부일 때 이기도록 수정)
                    if (maxS >= maxB) { // 무승부인 경우에도 S가 승리!
                        System.out.println("S");
                    } else {
                        System.out.println("B");
                    }
                    break; // 한 테스트 케이스 처리 후 종료
                }
            }
        }
        scanner.close();
    }
}
