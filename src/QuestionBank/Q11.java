package QuestionBank;

public class Q11 {
    public static void main(String[] args) {
        int j, k, L, result;
        j = 10;
        k = 20;
        L = 30;
        result = j < k ? k++ : --L; // result = k++;
        // k++은 후치 연산이므로 20을 result에 저장한 후 1 증가한다.
        System.out.printf("%d %d %d\n", result, k, L); // 20 21 30
    }
}
