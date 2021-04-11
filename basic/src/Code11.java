//사용자로부터 정수의 개수 n개를 받아서 순서대로 배열에 저장. 그런다음 중복된 정수 쌍의 개수를 카운트 해서 출력하기.

import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }
        kb.close(); // 키보드에 입력하는

        // 처음은 먼저 모든 쌍을 검사하는 것이다.

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                // data i와 j를 검사하는 과정이다.
                if (data[i] == data[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
