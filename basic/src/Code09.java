//배열 제일 뒤에 있는 숫자를front로 옮기고 모든 배열 한칸씩 뒤로 이동하기

import java.util.Scanner;

/**
 * Code09
 */
public class Code09 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // 배열의 개수 먼저 선정
        int n = kb.nextInt();
        int[] data = new int[n];

        // 정수 입력 (for문 이용)
        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }
        kb.close();

        int tmp = data[n-1];
        for(int i=n-2; i>=0; i--){
            data[i+1] = data[i];
        }
        data[0]=tmp;

        for(int i=0;i<n;i++){
            System.out.println(data[i]);
        }
    }
}