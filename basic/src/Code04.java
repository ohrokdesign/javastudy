import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        String name = null;
        int age;
        String gender;

        Scanner kb = new Scanner(System.in);
        System.out.print("male 나이 성별: ");
        
        name = kb.next();
        age = kb.nextInt();
        gender = kb.next();

        if(name.equals("male")){
            System.out.println("당신은 남성");
        }

    }
}
