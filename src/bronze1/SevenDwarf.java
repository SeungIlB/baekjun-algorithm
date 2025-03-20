package bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int totalSum = 0;

        // 입력 받기 및 전체 합 계산
        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
            totalSum += heights[i];
        }

        // 오름차순 정렬
        Arrays.sort(heights);

        // 두 개의 난쟁이 찾기
        int exclude1 = -1, exclude2 = -1;
        boolean found = false;

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (totalSum - (heights[i] + heights[j]) == 100) {
                    exclude1 = i;
                    exclude2 = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        // 결과 출력 (선택된 7명의 난쟁이 출력)
        for (int i = 0; i < 9; i++) {
            if (i != exclude1 && i != exclude2) {
                System.out.println(heights[i]);
            }
        }
    }
}
