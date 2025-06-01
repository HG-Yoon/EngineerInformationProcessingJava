package ControlStatement.Q4;

public class Test {
    public static void main(String[] args) {
        int a = 0, sum = 0;
        while (a < 10) {
            a++; // a는 1부터 시작하게 됨
            // a는 1부터 10까지 반복
            if (a % 2 == 1) {
                continue; // a가 홀수면 아래 sum += a는 실행되지 않음
            }
            sum += a; // a가 짝수일 때만 실행됨

        }
        System.out.println(sum); // 30
    }
}
