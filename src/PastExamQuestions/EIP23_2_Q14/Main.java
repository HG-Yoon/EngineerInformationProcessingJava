package PastExamQuestions.EIP23_2_Q14;

public class Main {
    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "Programming";
        String str3 = new String("Programming");
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
        System.out.print(str2.equals(str3)); // true
    }
}

/*
 * 결과
 * true
 * false
 * true
 * true
 * */