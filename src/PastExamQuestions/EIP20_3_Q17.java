package PastExamQuestions;

public class EIP20_3_Q17 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
            /*
             * sum=2+4+6+8+10=30
             * */
        }
        System.out.println(sum); // 30
    }
}
