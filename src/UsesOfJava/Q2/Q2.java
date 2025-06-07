package UsesOfJava.Q2;

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

    public String getName(byte[] val) {
        return "Car name : " + val;
    }
}

public class Q2 {
    public static void main(String[] args) {
        /*
         * Vehicle obj = new Car("Spark");
         * Car 클래스의 생성자를 이용하여
         * Vehicle 클래스의 객체 변수 obj를 선언하고,
         * "Spark"를 인수로 Car 클래스의 생성자를 호출한다.
         * [부모클래스명] [객체변수명] = new [자식클래스생성자()]:
         * 부모 클래스의 객체 변수를 선언하면서
         * 자식 클래스의 생성자를 사용하면 형 변환이 발생한다.
         * 이렇게 형 변환이 발생했을 때
         * 부모 클래스와 자식 클래스에 동일한 속성이나 메소드가 있으면
         * 부모클래스의 속성이나 메소드가 자식 클래스의 속성이나 메소드로
         * 재정의된다.
         * */
        Vehicle obj = new Car("Spark");
        /*
         * System.out.print(obj.getName());
         * 객체 변수 obj의 getName() 메소드를 호출한다.
         * 즉 Vehicle 클래스의 getName() 메소드를 호출한다.
         * 형 변환으로 인해 호출되는 메소드가
         * Car 클래스의 getName()이라고 생각할 수 있지만,
         * 메소드의 이름이 동일해도 '인수의 자료형과 개수'가 다르면
         * 서로 다른 메소드이다.
         * 때문에 getName() 메소드는 Vehicle 클래스와 getName(String val)이나
         * Car 클래스의 getName(Byte[] val) 메소드가 아닌
         * Vehicle 클래스의 getName() 메소드이다.
         * */
        System.out.print(obj.getName());
        // Vehicle name : Spark
    }
}
