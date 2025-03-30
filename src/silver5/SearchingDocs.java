package silver5;

import java.util.Scanner;

public class SearchingDocs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine(); // 전체 문서 입력
        String word = sc.nextLine(); // 검색할 단어 입력
        sc.close();

        int count = 0;
        int index = 0;

        while ((index = document.indexOf(word, index)) != -1) { // 단어 찾기
            count++;
            index += word.length(); // 겹치지 않게 이동
        }

        System.out.println(count);
    }
}
