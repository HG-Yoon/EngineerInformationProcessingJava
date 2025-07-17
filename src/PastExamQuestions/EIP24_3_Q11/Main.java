package PastExamQuestions.EIP24_3_Q11;

public class Main {
    public static void main(String[] args) {
        Base a = new Derivate();
        Derivate b = new Derivate();

        System.out.println(a.getX() + a.x + b.getX() + b.x);
    }
}

class Base {
    int x = 3;

    int getX() {
        return x * 2;
    }
}

class Derivate extends Base {
    int x = 7;

    int getX() {
        return x * 3;
    }
}
/*
 * a.getX()=21;
 * a.x=3;
 * b.getX()=21;
 * b.x=7;
 * 21+3+21+7=24+21+7=45+7=52;
 * 실행결과
 * 52
 * */