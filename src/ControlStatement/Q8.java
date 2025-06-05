package ControlStatement;

public class Q8 {
    public static void main(String[] args) {
        int[] result = new int[5];
        int[] arr = {77, 32, 10, 99, 50};
        for (int i = 0; i < 5; i++) {
            result[i] = 1; // result = {1,1,1,1,1};
            for (int j = 0; j < 5; j++) {
                if (arr[i] < arr[j]) {
                    /*
                     * arr[i]=77일 때, arr[i] < arr[j]인 경우 1개, result[0]=2
                     * arr[i]=32일 때, arr[i] < arr[j]인 경우 3개, result[1]=4
                     * arr[i]=10일 때, arr[i] < arr[j]인 경우 4개, result[2]=5
                     * arr[i]=99일 때, arr[i] < arr[j]인 경우 0개, result[3]=1
                     * arr[i]=50일 때, arr[i] < arr[j]인 경우 2개, result[4]=3
                     * */
                    result[i]++;
                }
            }
        }
        for (int k = 0; k < 5; k++) {
            System.out.print(result[k]); // 24513
        }
    }
}
