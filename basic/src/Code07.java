public class Code07 {
    public static void main(String[] args) {
        int []grades = new int[5];

        grades[0] = 100;
        grades[1] = 10;
        grades[2] = 1;
        grades[3] = 50;
        grades[4] = 100;

        int i = 0;
        while (i < grades.length) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
            i++;
        }
        //반복의 횟수가 정해져 있으면 for문, 아니라면 while문을 추천 한다고 합니다.
    }
}
