package ControlStatement;

/*
 * 변수 n에 저장된 10진수를 2진수로 변환하여 출력하는 프로그램.
 * 10진수를 2진수로 변환하는 방법:
 * 10진수를 2로 나누어 나머지를 구한 후 저장하고,
 * 다시 몫을 2로 나누어 나머지를 구해 저장하는 과정을 반복.
 * 몫이 0이 될 때까지 이 작업을 반복한 후
 * 마지막에 구한 나머지부터 거꾸로 출력.
 * */
public class Q1 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int i = 0;
        int n = 10;
        while (n > 0) {
            a[i++] = n % 2;
            n /= 2;
        }
        for (i = 7; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}
