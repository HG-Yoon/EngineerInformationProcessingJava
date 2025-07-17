package PastExamQuestions.EIP24_2_Q14;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ODDNumber OE = new ODDNumber();
        System.out.print(OE.sum(a, true) + ", " + OE.sum(a, false));
    }
}

interface Number {
    int sum(int[] a, boolean odd);
}

class ODDNumber implements Number {
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
/*
 * OE.sum(a, true) // 홀수만 더함
 * i |   a[i]    |   result
 * -------------------------
 * 0 |   1       |   1
 * 1 |   2       |   1
 * 2 |   3       |   4
 * 3 |   4       |   4
 * 4 |   5       |   9
 * 5 |   6       |   9
 * 6 |   7       |   16
 * 7 |   8       |   16
 * 8 |   9       |   25
 * --------------------------
 * OE.sum(a, true)=25;
 *
 * OE.sum(a, false) // 찍수만 더함
 * * i |   a[i]    |   result
 * -------------------------
 * 0 |   1       |   0
 * 1 |   2       |   2
 * 2 |   3       |   2
 * 3 |   4       |   6
 * 4 |   5       |   6
 * 5 |   6       |   12
 * 6 |   7       |   12
 * 7 |   8       |   20
 * 8 |   9       |   20
 * --------------------------
 * OE.sum(a, false)=20;
 *
 * 실행결과
 * 25, 20
 * */