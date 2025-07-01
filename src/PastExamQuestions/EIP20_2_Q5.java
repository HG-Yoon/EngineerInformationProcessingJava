package PastExamQuestions;

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

public class EIP20_2_Q5 {

    public static void main(String[] args) {
        Parent pa = new Child();
        pa.show(); // child
    }
}
