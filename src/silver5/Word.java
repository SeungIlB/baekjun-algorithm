package silver5;

import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordCount = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        Set<String> wordSet = new HashSet<>(); // 중복 제거를 위한 HashSet

        for (int i = 0; i < wordCount; i++) {
            wordSet.add(sc.nextLine()); // 중복된 단어는 자동으로 제거됨
        }

        // HashSet -> List 변환 후 정렬
        List<String> words = new ArrayList<>(wordSet);

        // 정렬 기준 적용 (길이순 정렬 후, 같은 길이면 사전순 정렬)
        words.sort((a, b) -> {
            if (a.length() != b.length()) return a.length() - b.length(); // 길이순 정렬
            return a.compareTo(b); // 사전순 정렬
        });

        // 출력
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
