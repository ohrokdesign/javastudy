//배열 값 for문으로 출력하기

public class Code06 {
    public static void main(String[] args) {
        int []grades = new int[5];

        grades[0] = 100;
        grades[1] = 10;
        grades[2] = 1;
        grades[3] = 50;
        grades[4] = 100;

        for(int i = 0; i <= grades.length; i++) {
            System.out.println("Grade "+(i+1)+": "+grades[i]);
        // int i =0;
        // for(i=0; i<=grades.length; i++){
        //     System.out.println("grade "+(i+1)+"="+grades[i]);
        //     i++;
        // }
        }
    }
}
