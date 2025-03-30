package silver5;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong(); // S는 최대 4,294,967,295이므로 long 사용

        long sum = 0;
        int N = 0;

        for (int i = 1; sum + i <= S; i++) { // 1부터 차례로 더함
            sum += i;
            N++;
        }

        System.out.println(N);
    }
}
