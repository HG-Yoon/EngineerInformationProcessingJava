package QuestionBank;

public class Q48 {
    static String[] x = new String[3];

    static void func(String[] x, int y) {
        for (int i = 1; i < y; i++) {
            if (x[i - 1].equals(x[i])) {
                System.out.print("O");
            } else {
                System.out.print("N");
            }
        }
        for (String z : x) {
            System.out.print(z);
        }
    }

    public static void main(String[] args) {
        x[0] = "A";
        x[1] = "A";
        x[2] = new String("A");
        func(x, 3);
        /*
         * 출력 결과
         * OOAAA
         * */
    }
}
