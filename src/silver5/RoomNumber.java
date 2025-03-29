package silver5;

import java.util.Scanner;

public class RoomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wantNumber = sc.nextInt();
        sc.close();

        int[] count = new int[10]; // 0~9 숫자 개수 저장

        // 숫자별 개수 세기
        while (wantNumber > 0) {
            int digit = wantNumber % 10;
            count[digit]++;
            wantNumber /= 10;
        }

        // 6과 9를 같은 그룹으로 처리
        int sixNineCount = (count[6] + count[9] + 1) / 2;
        count[6] = count[9] = sixNineCount;

        // 최대 필요한 세트 개수 찾기
        int maxSet = 0;
        for (int i = 0; i < 10; i++) {
            maxSet = Math.max(maxSet, count[i]);
        }

        System.out.println(maxSet);
    }
}
