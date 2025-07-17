package PastExamQuestions.EIP24_3_Q1;

public class Main {
    static String[] s = new String[3];

    static void func(String[] s, int size) {
        for (int i = 1; i < size; i++) {
            if (s[i - 1].equals(s[i])) {
                System.out.print("O");
            } else {
                System.out.print("N");
            }
        }

        for (String m : s) {
            System.out.print("M");
        }
    }

    public static void main(String[] args) {
        s[0] = "A";
        s[1] = "A";
        s[2] = new String("A");

        func(s, 3);
    }
}
/*
 * i |   s[i-1]  |   s[i]
 * =======================
 * 1 |   s[0]="A"|   s[1]="A" // 출력:O
 * 2 |   s[1]="A"|  s[2]="A" // 출력:O
 *==========================================
 *
 * for (String m : s) {
            System.out.print("M");
        } // MMM
 *  출력결과:OOMMM
 *
 *
 * == : 주소의 값을 비교합니다.(Call By Reference)
 * equals() 메소드 : equals() 메소드는 객체끼리 내용 비교합니다.(Call By value)
 *  */