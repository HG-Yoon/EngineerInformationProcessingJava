package PastExamQuestions.EIP21_2_Q19;

public class ovr1 {
    public static void main(String[] args) {
        ovr1 a1 = new ovr1();
        ovr2 a2 = new ovr2();
        System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
    }

    int sun(int x, int y) {
        return x + y;
    }
}

class ovr2 extends ovr1 {
    int sun(int x, int y) {
        return x - y + super.sun(x, y);
    }
}
/*
 * a1.sun(3,2)=3+2=5;
 * a2.sun(3,2)=3-2+5=6;
 * 5+6=11
 *
 * 출력 결과
 * 11
 * */
