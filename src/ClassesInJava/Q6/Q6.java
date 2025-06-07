package ClassesInJava.Q6;

class Parent {
    int x, y;

    Parent(int x, int y) { // (1)
        this.x = x;
        this.y = y;
    }

    int getX() { // (2)
        return x * y;
    }
}

class Child extends Parent {
    int x;

    Child(int x) { // (3)
        super(x + 1, x);
        this.x = x;
    }

    int getX(int n) { // (4)
        return super.getX() + n;
    }
}

public class Q6 {
    public static void main(String[] args) { // (5)
        Parent parent = new Child(10); // (6)
        System.out.println(parent.getX()); // (7)
    }
}
// 실행 순서 : (5) -> (6) -> (3) -> (1) -> (7) -> (2)
// 실행 결과 : 110