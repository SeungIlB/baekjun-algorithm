package silver5;

import java.util.Scanner;

public class PronouncePassWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String password = sc.nextLine();
            if (password.equals("end")) break;

            if (isAcceptable(password)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }
    }

    public static boolean isAcceptable(String password) {
        boolean hasVowel = false;
        int vowelCount = 0;
        int consonantCount = 0;
        char prev = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // 모음 체크
            if (isVowel(ch)) {
                hasVowel = true;
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }

            // 모음 or 자음 3개 연속
            if (vowelCount >= 3 || consonantCount >= 3) {
                return false;
            }

            // 같은 글자 연속 (ee, oo는 허용)
            if (i > 0 && ch == prev && !(ch == 'e' || ch == 'o')) {
                return false;
            }

            prev = ch;
        }

        return hasVowel;
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
