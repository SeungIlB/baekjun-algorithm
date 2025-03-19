package bronze1;

import java.util.*;

public class SimilarPictures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 그림 개수
        scanner.nextLine(); // 개행 문자 처리

        // N개의 그림을 저장할 리스트
        List<String[]> pictures = new ArrayList<>();

        // 입력 받기
        for (int i = 0; i < N; i++) {
            String[] picture = new String[5];
            for (int j = 0; j < 5; j++) {
                picture[j] = scanner.nextLine();
            }
            pictures.add(picture);
        }
        scanner.close();

        int minDifference = Integer.MAX_VALUE;
        int picture1 = -1, picture2 = -1;

        // 모든 그림 쌍 비교 (Brute Force, O(N^2))
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                int diff = countDifferences(pictures.get(i), pictures.get(j));

                if (diff < minDifference) {
                    minDifference = diff;
                    picture1 = i + 1;
                    picture2 = j + 1;
                }
            }
        }

        // 결과 출력 (작은 번호 먼저)
        System.out.println(picture1 + " " + picture2);
    }

    // 두 그림 간 다른 칸 개수 세기
    private static int countDifferences(String[] pic1, String[] pic2) {
        int count = 0;
        for (int i = 0; i < 5; i++) { // 행(세로) 비교
            for (int j = 0; j < 7; j++) { // 열(가로) 비교
                if (pic1[i].charAt(j) != pic2[i].charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
