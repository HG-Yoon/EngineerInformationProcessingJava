package PastExamQuestions.EIP23_3_Q1;

public class Main {

    public static void main(String[] args) {
        A b = new B();
        b.paint();
        b.draw();
    }
}

class A {
    public void paint() {
        System.out.print("A");
        draw();
    }

    public void draw() {
        System.out.print("B");
        draw();
    }
}

class B extends A {
    public void paint() {
        super.draw(); // BD
        System.out.print("C"); // BDC
        this.draw(); // BDCD
    }

    public void draw() {
        System.out.print("D"); // BDCDD
    }
}

/*
 *  결과
 *  BDCDD
 * */