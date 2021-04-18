/*
1 ~ 100000 사이의 정수들 중 소수의 개수를 세어 출력하는 프로그램을 작성하라.
*/

public class Task01 {
    public static void main(String[] args) {
        // int x = 0;
        for (int n = 2; n < 100; n++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= n && isPrime; i++) {
                if (n % i == 0) {
                    isPrime = false;

                }
                if (isPrime) {
                    System.out.println(n);
                }

            }
        }
        // System.out.println("소수의 개수는"+x);
    }

}


// 하나하나 출력을 해보니까 특정 소수가 불규칙하게 몇번 씩 출력되는 것을 확인 할 수 있었음.