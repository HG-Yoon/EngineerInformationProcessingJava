package PastExamQuestions;

public class EIP22_2_Q7 {
    public static void main(String[] args) {
        int i = 3, k = 1;
        switch (i) {
            case 1:
                k += 1;
            case 2:
                k++;
            case 3:
                k = 0; // k = 0;
            case 4:
                k += 3; // k = 0 + 3 = 3;
            case 5:
                k -= 10; // k = 3 - 10 = -7;
            default:
                k--;
        }
        System.out.print(k); // -8
    }
}
