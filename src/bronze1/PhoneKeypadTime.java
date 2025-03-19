package bronze1;

import java.util.*;

public class PhoneKeypadTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        int p = scanner.nextInt(); // 버튼 한 번 누를 때 걸리는 시간
        int w = scanner.nextInt(); // 같은 버튼을 연속으로 누를 때 기다리는 시간
        scanner.nextLine(); // 개행 문자 제거
        String message = scanner.nextLine(); // 입력 메시지
        scanner.close();

        // 휴대폰 키패드 매핑 설정
        Map<Character, Integer> keyMap = new HashMap<>();
        Map<Character, Integer> pressMap = new HashMap<>();

        String[] keypad = {
                " ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
        };

        // 키패드에 맞춰 맵핑 (버튼 번호 및 몇 번 눌러야 하는지)
        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < keypad[i].length(); j++) {
                keyMap.put(keypad[i].charAt(j), i + 1); // 버튼 번호
                pressMap.put(keypad[i].charAt(j), j + 1); // 눌러야 하는 횟수
            }
        }

        int totalTime = 0;
        int prevKey = -1;

        for (char ch : message.toCharArray()) {
            int key = keyMap.get(ch); // 현재 문자의 버튼 번호
            int pressCount = pressMap.get(ch); // 몇 번 눌러야 하는지

            // 같은 버튼을 연속으로 누를 경우 대기 시간 추가
            if (prevKey == key && key != 1) { // 공백(' ')은 예외
                totalTime += w;
            }

            totalTime += pressCount * p; // 해당 문자 입력 시간 추가
            prevKey = key; // 이전 버튼 갱신
        }

        System.out.println(totalTime);
    }
}
