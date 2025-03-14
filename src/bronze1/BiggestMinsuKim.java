package bronze1;

import java.util.Scanner;

public class BiggestMinsuKim {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = N; i >= 4; i--) {
            if (isLucky(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    // 숫자가 4와 7로만 이루어졌는지 확인하는 함수
    private static boolean isLucky(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}