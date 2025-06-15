package QuestionBank;

public class Q45 {
    // 재귀 함수: 문자열 str을 뒤에서부터 순회하면서
    // 중복되지 않은 문자만 골라냄
    public static String rf(String str, int index, boolean[] seen) {
        if (index < 0) {
            return ""; // 인덱스가 0보다 작으면
            // 빈 문자열 반환 (재귀 종료 조건)
        }
        char c = str.charAt(index); // 현재 위치의 문자
        String result = rf(str, index - 1, seen); // 이전 문자들에 대해 재귀 호출
        // seen[c]는 해당 문자가 이전에 이미 결과 문자열에 포함되었는지를 추적
        // !seen[c]는 해당 문자가 아직 결과 문자열에 들어가지 않았다는 뜻
        // 그래서 그 문자를 결과 문자열에 처음 추가하는 순간에 seen[c] = true로 표시하여,
        // 이후 중복해서 들어가지 않도록 하는 것
        if (!seen[c]) { // 이 문자가 결과 문자열에 아직 들어간 적이 없다면 
            seen[c] = true; // 이 문자를 결과 문자열에 넣지 않도록 표시
            return c + result; // 현재 문자를 앞에 붙여서 결과 문자열 생성
        }
        return result; // 이미 본 문자는 추가하지 않고 이전 결과 그대로 반환
    }

    public static void main(String[] args) {
        String str = "abacabcd";
        int len = str.length();
        boolean[] seen = new boolean[256];
        // 재귀 호출 시작: 맨 마지막 인덱스부터 시작하여 중복되지 않은 문자 추출
        System.out.print(rf(str, len - 1, seen)); // 출력 결과: dcba
    }
}
