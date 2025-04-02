package bronze1;

import java.util.Scanner;

public class Camping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNumber = 1; // 케이스 번호

        while (true) {
            int L = sc.nextInt(); // 사용할 수 있는 날
            int P = sc.nextInt(); // 주기
            int V = sc.nextInt(); // 휴가 기간

            if (L == 0 && P == 0 && V == 0) break; // 종료 조건

            int fullCycles = V / P; // 완전한 주기의 개수
            int remainingDays = V % P; // 남은 일수

            // 남은 일수만큼 L을 초과하지 않는 선에서 사용
            int maxDays = (fullCycles * L) + Math.min(remainingDays, L);

            System.out.printf("Case %d: %d\n", caseNumber++, maxDays);
        }

        sc.close();
    }
}
