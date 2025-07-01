package PastExamQuestions;

public class EIP20_4_Q8 {
    public static void main(String[] args) {
        int[][] ary = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                ary[i][j] = j * 3 + (i + 1);
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
            /*
             * 출력 결과
             * 1 4 7 10 13
             * 2 5 8 11 14
             * 3 6 9 12 15
             * */

        }
    }
}
