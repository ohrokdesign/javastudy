import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int Math;

        System.out.print("이름? : ");
        name = sc.nextLine();

        System.out.print("점수? : ");
        Math = sc.nextInt();

        System.out.println(name+" : "+Math);

        sc.close();
    }
}
