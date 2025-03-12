package bronze1;

import java.util.Scanner;

public class Upside_Down_Addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int reverseX = reverse(X);
        int reverseY = reverse(Y);
        int sum = reverseX + reverseY;
        System.out.println(reverse(sum));

    }
    private static int reverse(int x){
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        String reverse = String.valueOf(sb.reverse());

        return Integer.parseInt(reverse);
    }
}
