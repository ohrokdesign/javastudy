import java.util.Scanner;

public class Code15 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            int tmp = kb.nextInt();

            int j = i - 1;

            while (j >= 0 && data[j] > tmp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp; // j가 앞을 가리키고 있을 때 그 뒤에 들어가는거임.

            for (int k = 0; k <= i; k++) {
                System.out.print(data[k]+" ");

            }
            System.out.println();
        }

        kb.close();

    }
}
