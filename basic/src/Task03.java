import java.util.Scanner;

/*
사용자로 부터 n개의 정수를 받아서 그 중 모든 짝수를 더한 값에서 모든 홀수를 뺀 값을 계산해 출력하
는 프로그램을 작성하라. 입력 형식은 먼저 n의 값이 주어지고 이어서 n개의 정수들이 주어진다. 예를
들어 n=5이고 입력 정수들이 8, 1, 6, 9, 12라면 답은 26-10=16이다.
*/

public class Task03 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int []data = new int[n];

        for(int i = 0; i<n; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

        int evenSum = 0;
        int oddSum = 0;
        for(int i = 1; i<n; i=i+2){
            evenSum+=data[i];
        }

        for(int i = 0; i<n; i=i+2){
            oddSum+=data[i];
        }

        System.out.println("The result is"+(evenSum - oddSum));
    }
}