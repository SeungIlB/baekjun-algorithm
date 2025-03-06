package bronze1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase(); // 대소문자 구분 없이 처리

        Map<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        char maxChar = '?';

        // 빈도수 계산
        for (char c : word.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            if (freqMap.get(c) > maxFreq) {
                maxFreq = freqMap.get(c);
                maxChar = c;
            }
        }

        // 최빈값이 여러 개인지 확인
        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq == maxFreq) count++;
            if (count > 1) {
                maxChar = '?';
                break;
            }
        }

        System.out.println(maxChar);
        sc.close();
    }
}
