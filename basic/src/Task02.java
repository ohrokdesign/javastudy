/*
1 ~ 100000 사이의 정수들 중에 가장 작은 50개의 소수를 찾아 그 합을 구하여 출력하는 프로그램
을 작성하라. 만약 소수의 개수가 50개 미만이라면 모든 소수의 합을 출력하라.
*/

public class Task02 {
    public static void main(String[] args) {
        int count=0,total=0;
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n && isPrime; i++)
                if (n % i == 0){
                    isPrime = false;
                }

                if (isPrime){
                    count++;
                    total = total + n;
                    System.out.println(n);
                    if (count>=5)
                        break;
                }
                //50개를 어떻게 셀 것인가 count/total 
        }
        System.out.println("소수의 합은" + total);
    }
}
