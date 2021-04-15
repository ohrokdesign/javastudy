import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        String str = "Hello";
        String input = null;

        Scanner kb = new Scanner(System.in);
        System.out.print("type str:");

        input = kb.next();

        if (str.equals(input)) {
            System.out.println("정답!");
        }

        kb.close();
    }
}
