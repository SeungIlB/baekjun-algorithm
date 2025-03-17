package bronze1;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i = 0; i < count; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a, b));
        }
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수(LCM) 구하기
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
