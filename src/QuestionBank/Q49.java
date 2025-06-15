package QuestionBank;

class Connection {
    // 유일한 인스턴스를 저장할 정적 변수
    private static Connection _inst = null;
    // 호출 횟수를 저장할 인스턴스 변수
    public int count = 0;

    // Singleton 인스턴스를 반환하는 메서드
    public static Connection get() {
        // 아직 인스턴스가 없다면 새로 생성
        if (_inst == null) {
            _inst = new Connection();
            return _inst;
        }
        // 이미 생성된 인스턴스 있으면 그대로 반환
        return _inst;
    }

    // count 값을 1 증가시키는 메서드
    public void count() {
        count++; // count 필드를 1 증가시킴
    }

    // 현재 count 값을 반환하는 메서드
    public int getCount() {
        return count;
    }
}

public class Q49 {
    public static void main(String[] args) {
        // 첫 번째로 인스턴스를 요청 -> 새로 생성됨
        Connection conn1 = Connection.get();
        conn1.count(); // count = 1

        // 두 번째 인스턴스 요청 -> 이미 있는 인스턴스를 그대로 반환
        Connection conn2 = Connection.get();
        conn2.count(); // 같은 인스턴스이므로 count = 2

        // 세 번째 인스턴스 요청 -> 역시 같은 인스턴스 반환
        Connection conn3 = Connection.get();
        conn3.count(); // count = 3

        // conn1, conn2, conn3는 모드 같은 객체를 참조하므로
        // conn1에서 getCount() 호출해도 count는 3이 됨
        System.out.print(conn1.getCount()); // 출력: 3
    }
}
