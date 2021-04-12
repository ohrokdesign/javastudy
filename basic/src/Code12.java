/*
배열되어 있는 리스트 중에서 최대 값을 찾기 위해 임의로 범위를 설정하여 최대값 구하는 코드
*/

import java.util.Scanner;

public class Code12 {
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
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += data[k];
                }
                System.out.println((" i= " + i) + (" j= " +j)); //i와 j의 순회를 보기 위한 나의 코드..
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}


/*
본 코드는 i의 값에 따른 j의 전 순회 과정이 있으므로 가장 최적화된 코드는 아님
*/