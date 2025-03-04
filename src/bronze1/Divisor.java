package bronze1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.nextLine();

        String inputData = sc.nextLine();
        System.out.println(findNumber(A, inputData));
    }

    public static int findNumber(int A, String inputData) {
        String[] c = inputData.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            numbers.add(Integer.parseInt(c[i]));
        }

        int N = Collections.min(numbers) * Collections.max(numbers);
        return N;
    }
}

