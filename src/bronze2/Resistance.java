package bronze2;

import java.util.HashMap;
import java.util.Scanner;


public class Resistance {
    public static void main(String[] args) {
        // 색상과 숫자 매핑
        HashMap<String, Integer> colorMap = new HashMap<>();
        colorMap.put("black", 0);
        colorMap.put("brown", 1);
        colorMap.put("red", 2);
        colorMap.put("orange", 3);
        colorMap.put("yellow", 4);
        colorMap.put("green", 5);
        colorMap.put("blue", 6);
        colorMap.put("violet", 7);
        colorMap.put("grey", 8);
        colorMap.put("white", 9);

        Scanner sc = new Scanner(System.in);
        String firstColor = sc.nextLine();
        String secondColor = sc.nextLine();
        String thirdColor = sc.nextLine();
        sc.close();

        // 첫 번째, 두 번째 색상 값을 가져오기
        int value1 = colorMap.get(firstColor);
        int value2 = colorMap.get(secondColor);
        int multiplier = (int) Math.pow(10, colorMap.get(thirdColor)); // 10^value3

        // 저항 값 계산
        long result = (long) ((value1 * 10) + value2) * multiplier;
        System.out.println(result);
    }
}

