package silver5;

import java.util.Scanner;

public class Shom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // N 입력 받기
        int count = 0;         // 종말의 수 개수 카운트
        int number = 666;      // 첫 번째 종말의 수부터 시작

        while (true) {
            if (String.valueOf(number).contains("666")) {  // "666"이 포함된 경우
                count++;
                if (count == n) {  // N번째 종말의 수 찾음
                    System.out.println(number);
                    break;
                }
            }
            number++;  // 다음 숫자로 이동
        }

        sc.close();
    }
}
