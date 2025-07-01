package PastExamQuestions.EIP20_4_Q19;

class Parent {
    public int compute(int num) {
        if (num <= 1) {
            return num;
        }
        return compute(num - 1) + compute(num - 2);
    }
}

class Child extends Parent {
    public int compute(int num) {
        if (num <= 1) {
            return num;
        }
        return compute(num - 1) + compute(num - 3);
    }
}

public class Main {
    public static void main(String[] args) {
        /* 클래스 Child로 형 변환이 수행된 클래스 Parent의 객체 변수 obj를 선언한다. */
        Parent obj = new Child();
        /* obj.compute()는 obj 객체의 자료형이 Parent 이므로
         *  Parent.compute()라고 생각할 수 있지만
         *  객체 변수 obj 선언에서 클래스 형 변환이 발생하였고,
         *  compute() 메소드가 자식 클래스에서 재정의되었으므로
         *  자식 클래스인 Child의 compute() 메소드가 수행된다.
         *  */
        System.out.println(obj.compute(4)); // 1
    }
}
/*
 * compute(1)=1;
 * compute(2)=compute(1)+compute(-1)=1-1=0;
 * compute(3)=compute(2)+compute(0)=0+0=0;
 * compute(4)=compute(3)+compute(1)=0+1=1;
 * */