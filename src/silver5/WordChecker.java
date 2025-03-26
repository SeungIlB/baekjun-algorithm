package silver5;

import java.util.Scanner;

public class WordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();  // 단어의 개수
        int result = 0;  // 그룹 단어의 개수를 저장할 변수

        for(int i = 0; i < count; i++){
            String word = sc.next();
            if(isGroupWord(word)){
                result++;
            }
        }

        System.out.println(result); // 결과 출력
        sc.close();
    }

    private static boolean isGroupWord(String word){
        boolean[] seen = new boolean[26]; // 알파벳 방문 여부
        char prev = word.charAt(0); // 첫 번째 문자

        for(int i = 0; i < word.length(); i++){
            char current = word.charAt(i);
            if(current != prev) { // 이전 문자와 다를 때
                if(seen[current - 'a']) { // 이미 나온 적 있는 문자라면 그룹 단어가 아님
                    return false;
                }
                seen[prev - 'a'] = true; // 이전 문자를 방문했음을 기록
            }
            prev = current;
        }
        return true;
    }
}
