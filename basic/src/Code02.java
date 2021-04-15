/*키보드 입력받아 정수 맞추기!*/

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        int num = 212;

        Scanner kb = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");

        int input = kb.nextInt();

        if (num==input){
            System.out.println("정답!");
        } else{
            System.out.println("Wrong!");
        }

    }
}
