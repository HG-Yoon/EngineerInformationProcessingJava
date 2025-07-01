package PastExamQuestions;

/*
 * 변수 n에 저장된 10진수를 2진수로 변환하여 출력하는 프로그램
 * */
public class EIP20_4_Q7 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int i = 0;
        int n = 10;
        while (n > 0) {
            a[i++] = n % 2;
            n /= 2;
        }
        for (i = 7; i >= 0; i--) {
            System.out.print(a[i]); // 00001010
        }
    }
}
