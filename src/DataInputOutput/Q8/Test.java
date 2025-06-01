package DataInputOutput.Q8;

public class Test {
    public static void main(String[] args) {
        int w = 3, x = 4, y = 3, z = 5;
        // 논리곱 (AND; ∧)
        // 두 명제가 모두 참이어야 참값을 돌려준다.
        // 즉, 두 명제가 모두 1이어야 1이 됨.
        if ((w == 2 | w == y) & !(y > z) & (1 == x ^ y != z)) {
            // ((3 == 2 | 3 == 3) & (3 > 5) & (1 == 4 ^ 3 != 5))
            // 1 & 0 & (0 ^ 1)
            // 1 & 0 & 0
            // 1 & 0
            // 1 (참)
            w = x + y; // w = 4 + 3 = 7
            if (7 == x ^ y != y) { // 7 == 4 ^ 3 != 3
                // 0 ^ 0
                // 0 (거짓)
                System.out.println(w);
            } else {
                System.out.println(x); // 4 출력
            }
        } else {
            w = y + z;
            if (7 == y ^ z != w) {
                System.out.println(w);
            } else {
                System.out.println(z);
            }
        }
    }
}
