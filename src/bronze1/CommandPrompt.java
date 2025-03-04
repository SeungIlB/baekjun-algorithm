package bronze1;

import java.util.Scanner;

public class CommandPrompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSize = sc.nextInt();
        String[] inputString = new String[inputSize];

        for (int i = 0; i < inputSize; i++) {
            inputString[i] = sc.next();
        }


        String result = findPrincipal(inputString);
        System.out.println(result);
    }

    public static String findPrincipal(String[] inputString) {
        StringBuilder answer = new StringBuilder();
        int length = inputString[0].length();

        for (int i = 0; i < length; i++) {
            char currentChar = inputString[0].charAt(i);
            boolean isCommon = true;

            for (int j = 1; j < inputString.length; j++) {
                if (inputString[j].charAt(i) != currentChar) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                answer.append(currentChar);
            } else {
                answer.append("?");
            }
        }
        return answer.toString();
    }
}
