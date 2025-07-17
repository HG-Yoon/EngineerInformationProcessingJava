package PastExamQuestions.EIP24_2_Q1;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 2, 3, 4};
        int[] c = new int[]{1, 2, 3};

        check(a, b); // N
        check(a, c); // N
        check(b, c); // N
    }

    public static void check(int[] a, int[] b) {
        if (a == b) {
            System.out.print("O");
        } else {
            System.out.print("N");
        }
    }
}
