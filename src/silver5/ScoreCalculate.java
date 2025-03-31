package silver5;

import java.util.*;

public class ScoreCalculate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> nums = new HashMap<>();

        // 입력 받기 (index: 점수)
        for (int i = 0; i < 8; i++) {
            nums.put(i + 1, sc.nextInt());  // 1-based index 사용
        }

        // 점수를 리스트로 변환하여 정렬
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(nums.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue()); // 점수 기준 내림차순 정렬

        // 상위 5개 점수 합계 계산 및 인덱스 저장
        int sum = 0;
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sum += entryList.get(i).getValue();
            indices.add(entryList.get(i).getKey());
        }

        // 인덱스를 오름차순 정렬
        Collections.sort(indices);

        // 결과 출력
        System.out.println(sum);
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }
}
