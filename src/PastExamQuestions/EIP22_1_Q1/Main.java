package PastExamQuestions.EIP22_1_Q1;

class A {
    int a;
    int b;
}

public class Main {
    static void func1(A m) {
        m.a *= 10;
    }

    static void func2(A m) {
        m.a += m.b;
    }

    public static void main(String[] args) {
        A m = new A();
        m.a = 100;
        func1(m); // m.a = 100 * 10 = 1000;
        m.b = m.a; // m.b = 1000;
        func2(m); // m.a = 1000 + 1000 = 2000;
        System.out.printf("%d", m.a); // 2000
    }
}
