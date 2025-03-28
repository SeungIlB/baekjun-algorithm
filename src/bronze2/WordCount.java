package bronze2;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();  // 앞뒤 공백 제거

        if (str.isEmpty()) {  // 빈 문자열이면 0 출력
            System.out.println(0);
        } else {
            String[] words = str.split("\\s+");  // 연속된 공백을 하나의 구분자로 처리
            System.out.println(words.length);
        }

        sc.close();
    }
}
