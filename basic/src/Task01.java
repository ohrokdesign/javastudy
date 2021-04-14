/*
1 ~ 100000 사이의 정수들 중 소수의 개수를 세어 출력하는 프로그램을 작성하라.
*/

public class Task01 {
    public static void main(String[] args) {
        for (int n = 2; n <= 100000; n++) {
            boolean isPrime = true;
            int j=0;
            for (int i = 2; i * i <= n && isPrime; i++) {
                if (n%i ==0){
                    isPrime = false;

                }
                if (isPrime){
                    j++;
                }
            }
            System.out.println(j);
        }
    }

}
