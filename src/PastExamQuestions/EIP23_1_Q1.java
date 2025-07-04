package PastExamQuestions;

class Static {
    public int a = 20;
    static int b = 0;
}

public class EIP23_1_Q1 {

    public static void main(String[] args) {
        int a = 10;
        Static.b = a; // Static.b = 10;
        Static st = new Static();
        System.out.println(Static.b++); // 10
        System.out.println(st.b); // 11
        System.out.println(a); // 10
        System.out.print(st.a); // 20
    }
}
