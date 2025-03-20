package bronze1;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }

        Long[] a = new Long[n+1];
        a[0] = 0L;
        a[1] = 1L;

        for(int i = 2; i <= n; i++){
            a[i] = a[i - 2] + a[i - 1];
        }
        System.out.println(a[n]);
    }
}
