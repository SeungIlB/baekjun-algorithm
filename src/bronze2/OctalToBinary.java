package bronze2;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();  // 8진수 입력
        sc.close();

        StringBuilder binary = new StringBuilder();

        // 첫 번째 숫자는 앞자리 0이 나오지 않도록 변환
        binary.append(Integer.toBinaryString(octal.charAt(0) - '0'));

        // 나머지 숫자들은 항상 3자리로 변환
        for (int i = 1; i < octal.length(); i++) {
            String bin = Integer.toBinaryString(octal.charAt(i) - '0');
            while (bin.length() < 3) {
                bin = "0" + bin;  // 3자리로 맞춤
            }
            binary.append(bin);
        }

        System.out.println(binary);
    }
}
