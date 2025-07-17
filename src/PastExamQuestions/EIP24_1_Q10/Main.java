package PastExamQuestions.EIP24_1_Q10;

class Parent {
    int x, y;

    Parent(int x, int y) { // (가)
        this.x = x;
        this.y = y;
    }

    int getT() { // (나)
        return x * y;
    }
}

class Child extends Parent {
    int x;

    Child(int x) { // (다)
        super(x + 1, x);
        this.x = x;
    }

    int getT(int n) { // (라)
        return super.getT() + n;
    }
}

public class Main {
    public static void main(String[] args) { // (마)
        Parent parent = new Child(3); // (바)
        System.out.println(parent.getT()); // (사)
    }
}
/*
 * 실행순서
 * (마)->(바)->(다)->(가)->(사)->(나)
 * */