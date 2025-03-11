package bronze1;

import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();

        System.out.println(getSum(start, end));
    }

    private static int getSum(int start, int end) {
        int sum = 0;
        int num = 1;
        int count = 0;

        while (count < end) {
            for (int i = 0; i < num; i++) {
                count++;
                if (count >= start) {
                    sum += num;
                }
                if (count == end) {
                    return sum;
                }
            }
            num++;
        }
        return sum;
    }
}
