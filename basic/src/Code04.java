import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        String name = null;
        int age;
        String gender;

        Scanner kb = new Scanner(System.in);
        System.out.print("이름 나이 성별: ");
        
        name = kb.next();
        age = kb.nextInt();
        gender = kb.next();

        if(gender.equals("male")){
            System.out.println((name+"님,")+ (age + "세 남성"));
        } else if(gender.equals("female")){
            System.out.println(name+"님,"+ age + "세 여성");
        } else {
            System.out.println("o-ho interesting");
        }

        kb.close();
    }
}
