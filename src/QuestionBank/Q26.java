package QuestionBank;

public class Q26 {
    public static void main(String[] args) {
        int i, hap = 0;
        for (i = 0; i <= 10; ++i, hap += i) ;
        System.out.printf("%d, %d\n", i, hap); // 11 66
    }
}
