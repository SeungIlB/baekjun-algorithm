package silver5;

import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsNumber = sc.nextInt(); // 학생 수 입력
        sc.nextLine(); // 개행 문자 제거

        String youngestName = "";
        String oldestName = "";
        int youngestYear = 0, youngestMonth = 0, youngestDay = 0;
        int oldestYear = 9999, oldestMonth = 12, oldestDay = 31;

        for (int i = 0; i < studentsNumber; i++) {
            String name = sc.next();
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            // 나이가 적은 사람 찾기 (가장 최신 생일)
            if (year > youngestYear || (year == youngestYear && month > youngestMonth) ||
                    (year == youngestYear && month == youngestMonth && day > youngestDay)) {
                youngestYear = year;
                youngestMonth = month;
                youngestDay = day;
                youngestName = name;
            }

            // 나이가 많은 사람 찾기 (가장 오래된 생일)
            if (year < oldestYear || (year == oldestYear && month < oldestMonth) ||
                    (year == oldestYear && month == oldestMonth && day < oldestDay)) {
                oldestYear = year;
                oldestMonth = month;
                oldestDay = day;
                oldestName = name;
            }
        }

        System.out.println(youngestName);
        System.out.println(oldestName);
        sc.close();
    }
}
