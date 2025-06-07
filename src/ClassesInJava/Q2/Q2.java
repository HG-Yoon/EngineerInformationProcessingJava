package ClassesInJava.Q2;

public class Q2 {
    static int[] arr() {
        int[] a = new int[4];
        int b = a.length;
        for (int i = 0; i < b; i++) {
            a[i] = i;
            /*
             * a[0]=0
             * a[1]=1
             * a[2]=2
             * a[3]=3
             * */
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = arr();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            // 0 1 2 3
        }
    }
}
