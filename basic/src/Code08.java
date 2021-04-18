import java.util.Scanner;

public class Code08 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // 배열의 개수 먼저 선정
        int arrayS = kb.nextInt();
        int[] data = new int[arrayS];

        // 정수 입력 (for문 이용)
        for (int i = 0; i < arrayS; i++) {
            data[i] = kb.nextInt();
        }
        kb.close();

        // 합,최대값 구하기
        int sum=0;
        int max=data[0];

        for(int i=0; i<arrayS; i++){
            sum+=data[i];
            if (max<data[i]){
                max = data[i];
            }
        }

        System.out.print("sum is"+ sum);
        System.out.println("Max data is" + max);
    }
}
