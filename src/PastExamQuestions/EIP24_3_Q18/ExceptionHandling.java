package PastExamQuestions.EIP24_3_Q18;

public class ExceptionHandling {
    public static void main(String[] args) {
        int sum = 0;
        try {
            func();
        } catch (NullPointerException e) {
            sum = sum + 1; // sum=1;
        } catch (Exception e) {
            sum = sum + 10;
        } finally {
            sum = sum + 100; // sum=101
        }
        System.out.print(sum);
    }

    static void func() throws Exception {
        throw new NullPointerException();
    }
}
// 실행결과
// 101