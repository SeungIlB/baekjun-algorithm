package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumCount {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] numList = new int[n];

        for (int i = 0; i < n; i++) {
            numList[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(numList);

        // 빠른 출력 (StringBuilder 사용)
        StringBuilder sb = new StringBuilder();
        for (int num : numList) {
            sb.append(num).append("\n");
        }

        System.out.print(sb);
    }
}
