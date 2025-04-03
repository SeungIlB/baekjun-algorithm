package bronze2;

import java.util.Scanner;

public class DispersiveProcessing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for(int i = 0; i < C; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(getLastComputer(a, b));
        }
        sc.close();
    }
    private static int getLastComputer(int a, int b) {
        // 1~10번 컴퓨터로 배정되므로 10으로 나눈 나머지만 필요
        a %= 10;

        // a^b % 10 값을 빠르게 계산 (패턴 반복)
        if (a == 0) return 10; // 10번 컴퓨터로 처리

        int result = 1;
        for (int i = 0; i < b; i++) {
            result = (result * a) % 10;
        }

        return result;
    }
}
