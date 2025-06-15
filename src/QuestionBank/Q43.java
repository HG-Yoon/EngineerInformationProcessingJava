package QuestionBank;

public class Q43 {
    public static void check(int[] x, int[] y) {
        if (x == y) {
            System.out.print("O");
        } else {
            System.out.print("N");
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4};
        int b[] = new int[]{1, 2, 3, 4};
        int c[] = new int[]{1, 2, 3};
        check(a, b); // N, a와 b는 값과 관계없이 주소가 다르므로 서로 다른 객체
        check(b, c); // N
        check(a, c); // N
        /*
         * 출력결과
         * NNN
         * */
    }
}
