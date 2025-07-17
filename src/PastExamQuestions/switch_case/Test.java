package PastExamQuestions.switch_case;

public class Test {
    public static void main(String[] args) {
        int cond = 3;
        int result = 1;
        switch (cond) {
            case 0:
                result++;
            case 1:
                result += cond;
            case 2:
                result *= 3;
            case 3:
                result *= 5; // result=5;
            case 4:
                result++; // result=5;
            case 5:
                result %= 2; // result=6%2=0;
            default:
                result++; // result=0;
        }
        System.out.println(result); // 1
    }
}
/*
 * 결과
 * 1
 * */