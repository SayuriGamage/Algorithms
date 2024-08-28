package lk.ijse;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar={9,5,1,4,3};
        int[] sortArrray=insertionsort(ar);
        System.out.println(Arrays.toString(sortArrray));
    }

    private static int[] insertionsort(int[] ar) {
        for(int i=1;i<ar.length;i++){
            int key=ar[i];
            int j=i-1;
            while (j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
        return ar;
    }
}
