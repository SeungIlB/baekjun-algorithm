package bronze1;

import java.util.Scanner;

public class DecideTeamName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String yeonduName = sc.nextLine(); // 연두의 이름
        int teamCount = Integer.parseInt(sc.nextLine()); // 팀 후보 개수
        String bestTeam = "";
        int maxProbability = -1;

        for (int i = 0; i < teamCount; i++) {
            String teamName = sc.nextLine();
            int probability = calculateWinningProbability(yeonduName, teamName);

            // 가장 높은 확률을 가진 팀 찾기 (같으면 사전순 비교)
            if (probability > maxProbability || (probability == maxProbability && teamName.compareTo(bestTeam) < 0)) {
                maxProbability = probability;
                bestTeam = teamName;
            }
        }

        System.out.println(bestTeam);
        sc.close();
    }

    private static int calculateWinningProbability(String yeonduName, String teamName) {
        // 연두의 이름과 팀 이름을 합쳐서 "LOVE" 글자 수 계산
        String combinedName = yeonduName + teamName;
        int L = countCharacter(combinedName, 'L');
        int O = countCharacter(combinedName, 'O');
        int V = countCharacter(combinedName, 'V');
        int E = countCharacter(combinedName, 'E');

        // 공식 적용
        return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
    }

    private static int countCharacter(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) count++;
        }
        return count;
    }
}
