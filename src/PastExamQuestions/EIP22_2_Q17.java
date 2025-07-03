package PastExamQuestions;

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

public class EIP22_2_Q17 {
    public static void main(String[] args) {
        cond obj = new cond(3);
        obj.a = 5;
        int b = obj.func(); // b=56
        System.out.print(obj.a + b); // 5+56=61
        /*
         * 출력 결과
         * 61
         * */
    }
}
/*
 * obj.func(){
 *   b=1;
 *   for(int i=1;i<5;i++){
 *       b+=5*i;
 *   }
 * i=1, b=1+5*1=1+5=6;
 * i=2, b=6+5*2=6+10=16;
 * i=3, b=16+5*3=16+15=31;
 * i=4, b=31+5*4=31+20=51;
 * a+b=5+51=56
 * }
 * */