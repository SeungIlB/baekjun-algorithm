package silver5;

import java.util.Scanner;

public class CroatiaAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        // 크로아티아 알파벳 목록
        String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 일반 for문 사용
        for (int i = 0; i < croatiaAlphabet.length; i++) {
            input = input.replace(croatiaAlphabet[i], "*");
        }

        // 변환된 문자열 길이가 곧 크로아티아 알파벳 개수
        System.out.println(input.length());
    }
}
