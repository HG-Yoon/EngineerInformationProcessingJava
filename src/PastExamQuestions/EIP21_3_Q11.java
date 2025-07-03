package PastExamQuestions;

public class EIP21_3_Q11 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 3, d = 5;
        if ((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d)) {
            a = b + c; // a = 4 + 3 = 7;
            if (7 == b ^ c != a) { // 7 == 4 ^ 3 != 7
                // 0 ^ 1
                // 1
                System.out.println(a); // 7
            } else {
                System.out.println(b);
            }
        } else {
            a = c + d;
            if (7 == c ^ d != a) {
                System.out.println(a);
            } else {
                System.out.println(d);
            }
        }
    }
}
/*
 * ((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d))
 * ((0 | 1) & !(0) & (0 ^ 1))
 * 1 & 1 & 1
 * 1 & 1
 * 1
 * */

/*
 * 출력 결과
 * 7
 * */