// Bubble sort

import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }
        kb.close();

        for (int i = n - 1; i > 0; i--) {
            for (int j=0; j<i; j++){
                if (data[j]>data[j+1]){ //만약 앞에부터 순회중이 j가 그 다음 배열인 j+1보다 크면.. 바꾸기 !
                    int tmp = data[j]; //tmp는 임시의 공간 저장소
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }

        System.out.println("Sorted Data: ");
        for (int i=0; i<n; i++){
            System.out.println(data[i]);
        }

    }
}
