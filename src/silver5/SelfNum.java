package silver5;

public class SelfNum {
    public static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10; // 각 자릿수를 더함
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean[] isSelfNumber = new boolean[10001]; // 셀프 넘버 여부를 저장하는 배열

        // d(n)을 계산하여 생성된 숫자를 표시
        for (int i = 1; i < 10001; i++) {
            int dn = d(i);
            if (dn <= 10000) {
                isSelfNumber[dn] = true; // 생성자가 있는 숫자는 셀프 넘버가 아님
            }
        }

        // 셀프 넘버 출력
        for (int i = 1; i < 10001; i++) {
            if (!isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }
}
