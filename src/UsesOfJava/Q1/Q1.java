package UsesOfJava.Q1;

class Parent {
    void show() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("child");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Parent pa = new Child();
        pa.show();
        // 실행결과: child
    }
}
