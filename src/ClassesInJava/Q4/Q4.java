package ClassesInJava.Q4;

public class Q4 {
    public static void main(String[] args) {
        cond obj = new cond(3);
        obj.a = 5;
        int b = obj.func(); // b = 56
        /*  a = 5이고 b의 초기값은 1
         * |  i  |   a * i  |   b   |
         * |-----|----------|-------|
         * |  1  |     5    |   6   |
         * |  2  |    10    |   16  |
         * |  3  |    15    |   31  |
         * |  4  |    20    |   51  |
         * b = 51
         * 리턴값은 a+b이므로 5+51=56
         * */
        System.out.print(obj.a + b); // 5+56=61
    }
}

class cond {
    int a;

    public cond(int a) {
        this.a = a;
    }

    public int func() {
        int b = 1;
        for (int i = 1; i < a; i++) {
            b += a * i;
        }
        return a + b;
    }
}
