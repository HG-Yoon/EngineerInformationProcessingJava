package PastExamQuestions.EIP23_3_Q14;

class Parent {
    int compute(int num) {
        if (num <= 1)
            return num;
        return compute(num - 1) + compute(num - 2);
    }
}

class Child extends Parent {
    int compute(int num) {
        if (num <= 1) {
            return num;
        }
        return compute(num - 1) + compute(num - 3);
    }
}

/*
 * compute(1)=1;
 * compute(2)=compute(1)+compute(-1)=1-1=0;
 * compute(3)=compute(2)+compute(0)=0+0=0;
 * compute(4)=compute(3)+compute(1)=0+1=1;
 * compute(5)=compute(4)+compute(2)=1+0=1;
 * compute(6)=compute(5)+compute(3)=1+0=1;
 * compute(7)=compute(6)+compute(4)=1+1=2;
 * */
public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.print(obj.compute(7));
    }
}
/*
 * 2
 * */