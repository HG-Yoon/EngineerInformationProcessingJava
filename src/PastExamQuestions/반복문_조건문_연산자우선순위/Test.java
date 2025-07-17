package PastExamQuestions.반복문_조건문_연산자우선순위;

public class Test {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                result = result + i; // 3+9=12
            }
        }
        System.out.println(result);
    }
}

/*
 * 결과
 * 12
 * */
