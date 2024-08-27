package lk.ijse;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {17, 11, 33, 27};
        int[] sortarray = sortArray(arr);
        System.out.println(Arrays.toString(sortarray));
    }

    private static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        return arr;
    }

}
