package silver5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while (queue.size() > 1) {
            sb.append(queue.poll()).append(" "); // 첫 번째 카드 버림
            queue.add(queue.poll()); // 그 다음 카드를 맨 뒤로 이동
        }

        System.out.println(sb.toString().trim()); // 버린 카드들 출력
        System.out.println(queue.poll()); // 마지막 남은 카드 출력
    }
}
