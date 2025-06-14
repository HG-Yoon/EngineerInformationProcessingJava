package QuestionBank;

public class Q38 {
    static int Stack[] = new int[5];
    static int Top = -1;

    public static void main(String[] args) {
        push(100); // {100,0,0,0,0}
        push(110); // {110,100,0,0,0}
        push(120); // {120,110,100,0,0}
        pop(); // 120제거
        push(130); // {130,110,100,0,0}
        push(140); // {140,130,110,100,0}
        pop(); // 140제거
        /*
         * 출력 결과
         * 120제거
         * 140제거
         * */
    }

    static void push(int i) {
        Top++;
        if (Top >= 5) {
            System.out.printf("overFlow");
        } else {
            Stack[Top] = i;
        }
    }

    static void pop() {
        if (Top < 0) {
            System.out.printf("underflow");
        } else {
            System.out.printf("%d제거\n", Stack[Top--]);
        }
    }
}
