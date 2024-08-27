package lk.ijse;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] arr={18,23,11,95,50};
        int[] sortedArray=selectionSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] selectionSort(int[] arr) {

        for(int i=0;i<arr.length-1;i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
