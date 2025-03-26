package silver5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortInside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        // 숫자를 문자 배열로 변환 후 정렬
        Character[] numList = new Character[num.length()];
        for (int i = 0; i < num.length(); i++) {
            numList[i] = num.charAt(i); // 숫자가 문자 형태로 저장됨
        }

        // 내림차순 정렬
        Arrays.sort(numList, Collections.reverseOrder());

        // 출력
        for (char c : numList) {
            System.out.print(c);
        }
        sc.close();
    }
}
