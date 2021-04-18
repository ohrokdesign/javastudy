/*4. 사용자로부터 하나의 양의 정수 n을 입력받는다. 그런 다음 다음과 같이 n줄을 출력하는 프로그램을 작
성하라. */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        kb.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
