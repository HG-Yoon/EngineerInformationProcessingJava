package QuestionBank;

public class Q20 {
    public static void main(String[] args) {
        int i = 0, hap = 0;
        do {
            ++i;
            hap += i;
        } while (i < 5);
        System.out.printf("%d, %d\n", i, hap); // 5, 15
    }
}
/*
 * 1+2+3+4+5=15
 * */
