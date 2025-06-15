package QuestionBank;

import java.util.Collection;

class Printer {
    void print(Integer a) {
        System.out.print("A" + a);
    }

    void print(Object a) {
        System.out.print("B" + a);
    }

    void print(Number a) {
        System.out.print("C" + a);
    }
}

public class Q47 {
    public static void main(String[] args) {
        // 메소드에서 사용할 자료형이 메소드를 선언하는 시점이 아니라
        // 호출하는 시점에서 정해지는 제너릭(Generic) 기법이 적용
        // 제너릭 기법은 컴파일 과정에서만 적용되므로,
        // 실행 과정에서는 컴파일 때 결정된 자료형이 제거되고
        // 기본 자료형인 Object 형으로 변환되는
        // 타입 소거(Type Erasure)가 발생
        // 이로 인해 컴파일 과정에서
        // 제너릭 Collection 클래스의 자료형이 Integer로 결정되어
        // 호출되는 메소드가 print(Integer a)라고 생각할 수 있지만
        // 타입 소거로 인해 실행 과정에서
        // 제너릭 Collection 클래스의 자료형이
        // Object로 인식되므로 print(Object a)가 호출되어
        // 결과적으로 B0이 출력되게 됨.
        new Collection<>(0).print();
    }

    public static class Collection<T> {
        T value;

        public Collection(T t) {
            value = t;
        }

        public void print() {
            new Printer().print(value);
        }
    }
}
