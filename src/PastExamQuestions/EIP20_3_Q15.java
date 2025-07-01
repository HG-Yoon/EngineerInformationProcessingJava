package PastExamQuestions;

abstract class Vehicle {
    String name;

    abstract public String getName(String val);

    public String getName() {
        return "Vehicle name : " + name;
    }
}

class Car extends Vehicle {
    private String name;

    public Car(String val) {
        name = super.name = val;
    }

    public String getName(String val) {
        return "Car name : " + val;
    }

    public String getName(byte val[]) {
        return "Car name : " + val;
    }
}

public class EIP20_3_Q15 {
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");
        System.out.println(obj.getName());
        /*
         * 형 변환으로 인해 호출되는 메소드가
         * Car 클래스의 getName()이라고 생각할 수 있지만,
         * 메소드의 이름이 동일해도 '인수의 자료형과 개수'가 다르면 서로 다른 메소드이다.
         * 때문에 getName() 메소드는 Vehicle 클래스와 Car 클래스의 getName(String val)이나
         * Car 클래스의 getName(Byte[] val) 메소드가 아닌
         * Vehicle 클래스의 getName() 메소드이다.
         * 출력 결과
         * Vehicle name : Spark
         * */
    }
}
