package PastExamQuestions;

public class EIP22_3_Q4 {
    public static void main(String[] args) {
        int[] result = new int[5];
        int[] arr = {77, 32, 10, 99, 50};
        for (int i = 0; i < 5; i++) {
            result[i] = 1;
            for (int j = 0; j < 5; j++) {
                if (arr[i] < arr[j]) {
                    result[i]++;
                }
            }
        }
        for (int k = 0; k < 5; k++) {
            System.out.print(result[k]); // 24513
        }
    }
}
/*
 * i=0,
 * arr[0] (77)이 arr[j]보다 작은 경우는 1가지
 * result[0]=2;
 *
 * i=1,
 * arr[1] (32)이 arr[j]보다 작은 경우는 3가지
 * result[1]=4;
 *
 * i=2,
 * arr[2] (10)이 arr[j]보다 작은 경우는 4가지
 * result[2]=5;
 *
 * i=3,
 * arr[3] (99)이 arr[j]보다 작은 경우는 0가지
 * result[3]=1;
 *
 * i=4,
 * arr[4] (50)이 arr[j]보다 작은 경우는 2가지
 * result[4]=3;
 * */