package QuestionBank;

class IntClass {
    int a;
    int b;
    int c;
}

public class Q35 {
    public static void main(String[] args) {
        IntClass myVar = new IntClass();
        myVar.a = 10;
        myVar.b = 20;
        prnt(myVar);
        /*
         * prnt(myVar)
         * myVar.a = 10 + 30 = 40;
         * myVar.b = 20 - 30 = -10;
         * 40 <= -10 <- false
         * myVar.c = myVar.a - myVar.b
         * myVar.c = 40 - (-10) = 50
         * */
        System.out.printf("a=%d, b=%d, c=%d\n", myVar.a, myVar.b, myVar.c);
        // a=40, b=-10, c=50
    }

    static void prnt(IntClass myVar) {
        myVar.a += 30;
        myVar.b -= 30;
        if (myVar.a <= myVar.b) {
            myVar.c = myVar.a + myVar.b;
        } else {
            myVar.c = myVar.a - myVar.b;
        }
    }
}
