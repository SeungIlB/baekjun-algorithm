package bronze1;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FourthPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {
            double[] points = new double[8];
            for (int i = 0; i < 8; i++) {
                points[i] = scanner.nextDouble();
            }

            double[] fourthPoint = findFourthPoint(points);
            System.out.printf("%.3f %.3f%n", fourthPoint[0], fourthPoint[1]);  // 정확한 출력 형식 유지
        }

        scanner.close();
    }

    public static double[] findFourthPoint(double[] points) {
        double[][] coords = new double[4][2];

        for (int i = 0; i < 4; i++) {
            coords[i][0] = points[i * 2];
            coords[i][1] = points[i * 2 + 1];
        }

        int duplicateIdx1 = -1, duplicateIdx2 = -1;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (coords[i][0] == coords[j][0] && coords[i][1] == coords[j][1]) {
                    duplicateIdx1 = i;
                    duplicateIdx2 = j;
                    break;
                }
            }
            if (duplicateIdx1 != -1) break;
        }

        int uniqueIdx1 = -1, uniqueIdx2 = -1;
        for (int i = 0; i < 4; i++) {
            if (i != duplicateIdx1 && i != duplicateIdx2) {
                if (uniqueIdx1 == -1) uniqueIdx1 = i;
                else uniqueIdx2 = i;
            }
        }

        double x5 = coords[uniqueIdx1][0] + coords[uniqueIdx2][0] - coords[duplicateIdx1][0];
        double y5 = coords[uniqueIdx1][1] + coords[uniqueIdx2][1] - coords[duplicateIdx1][1];

        return new double[]{x5, y5};
    }
}
