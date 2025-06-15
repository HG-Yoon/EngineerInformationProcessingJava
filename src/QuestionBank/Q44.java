package QuestionBank;

interface Number {
    int sum(int[] a, boolean odd);
}

public class Q44 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        OENumber OE = new OENumber();
        System.out.print(OE.sum(a, true) + ", " + OE.sum(a, false));
        /*
         * OE.sum(a, true)
         * = 1 + 3 + 5 + 7 + 9
         * = 25
         *
         * OE.sum(a, false)
         * = 2 + 4 + 6 + 8
         * = 20
         *
         * 출력 결과
         * 25, 20
         * */
    }
}

class OENumber implements Number {
    public int sum(int[] a, boolean odd) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if ((odd && a[i] % 2 != 0) || (!odd && a[i] % 2 == 0)) {
                result += a[i];
            }
        }
        return result;
    }
}
