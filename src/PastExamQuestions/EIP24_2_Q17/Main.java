package PastExamQuestions.EIP24_2_Q17;

public class Main {
    public static void main(String[] args) {
        String str = "abacabcd";
        boolean[] seen = new boolean[256];
        System.out.print(calculFn(str, str.length() - 1, seen));
    }

    static String calculFn(String str, int index, boolean[] seen) {
        if (index < 0) {
            return "";
        }
        char c = str.charAt(index);
        String result = calculFn(str, index - 1, seen);
        if (!seen[c]) {
            seen[c] = true;
            return c + result;
        }
        return result;
    }
}

/*
 * index=7;
 * char c=d;
 * result=d
 * result=calculFn(str, 6, seen);
 *
 * index=6;
 * char c=c;
 * result=dc;
 * result=calculFn(str, 5, seen);
 *
 * index=5;
 * char c=b;
 * result=dcb;
 * result=calculFn(str, 4, seen);
 *
 * index=4;
 * char c=a;
 * result=dcba;
 * result=calculFn(str, 3, seen);
 *
 * index=3;
 * char c=c;
 * seen=true;
 * result=dcba;
 *
 * 실행결과
 * dcba
 * */