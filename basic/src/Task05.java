//특정 배열 입력하여 최대값에서 최소값 빼기

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int []data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }
        kb.close();

        int max = data[0];
        int min = data[0];

        for(int i=0; i<n; i++){
            if (max<data[i]){
                max=data[i];
            }
            if (min>data[i]){
                max=data[i];
            }
        }

        System.out.println("Max-Min is " + (max-min));
    }
}
