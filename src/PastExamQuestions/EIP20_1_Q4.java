package PastExamQuestions;

public class EIP20_1_Q4 {
    static int[] arr() {
        int[] a = new int[4];
        int b = a.length;
        for (int i = 0; i < b; i++) {
            a[i] = i;
        }
        return a;
        /*
         * int[]a={0,1,2,3};
         * */
    }

    public static void main(String[] args) {
        int[] a = arr();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        /*
         * 출력 결과
         * 0 1 2 3
         * */
    }
}
