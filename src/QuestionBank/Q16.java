package QuestionBank;

public class Q16 {
    public static void main(String[] args) {
        int a, b, c, hap;
        a = b = c = 2;
        hap = ++a | b-- & c--;
        System.out.printf("%d %d %d %d", hap, a, b, c);
        // 3 3 1 1
        /*
         * hap = ++2 | 2-- & 2--;
         * hap = 3 | 2 & 2;
         * 비트 연산자의 우선 순위는
         * &, ^, |
         * 즉 2 & 2를 먼저 구한다.
         * 10진수 2는 0000 0010
         * 10진수 3은 0000 0011
         * 0000 0010 & 0000 0010 = 0000 0010
         * 0000 0011 | 0000 0010 = 0000 0011 (10진수로 3)
         * hap = 3
         * a = 3
         * b = 1
         * c = 1
         * */
    }
}
