package bronze1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSubject = sc.nextInt();
        int[] subjectScore = new int[totalSubject];

        for (int i = 0; i < totalSubject; i++) {
            subjectScore[i] = sc.nextInt();
        }

        double newAverage = calculate(subjectScore);
        System.out.printf("%.2f", newAverage);
    }

    private static double calculate(int[] subjectScore) {
        OptionalInt max = Arrays.stream(subjectScore).max();
        if (max.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (int score : subjectScore) {
            sum += (score / (double) max.getAsInt()) * 100;
        }

        return sum / subjectScore.length;
    }
}
