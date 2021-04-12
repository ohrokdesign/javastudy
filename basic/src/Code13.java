// 정수 n개를 받아서 나열된 정수중 특정 나열을 찾아 소수인지 아닌지, 소수라면 가장 큰 소수를 반환하는 코드

import java.util.Scanner;

public class Code13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }
        kb.close();

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // 정수 환산
                int val = 0;
                for (int k = i; k <= j; k++) {
                    val = val * 10 + data[k];
                }

                // 소수인지 아닌지 검사하기
                boolean isPrime = true;
                for (int k = 2; k * k <= val && isPrime; k++) {
                    if (val % k == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime && val > 1 && val > max) {
                    max = val;
                }
            }
        }
        if (max > 0) {
            System.out.println(max);
        } else {
            System.out.println("no number");
        }

    }
}


/*
n의 크기가 10 이상이라면 정상적으로 첫번째 알고리즘이 작동할 것인지에 대해 확실하지 않은 오류가 있다.
*/