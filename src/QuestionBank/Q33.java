package QuestionBank;

public class Q33 {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = prnt(a, b); // c = -10
        System.out.printf("a=%d, b=%d, c=%d\n", a, b, c);
        // a=10, b=20, c=-10
    }

    static int prnt(int x, int y) {
        int z;
        if (x == y) {
            z = x + y;
        } else {
            z = x - y;
        }
        return (z);
    }
}
