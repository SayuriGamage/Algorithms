package lk.ijse;

import java.util.Arrays;

public class Reversearraywithtemp {
    public static void main(String[] args) {
        int[] ar={9,5,1,4,3};
        int[] after=reverseArray(ar);
        System.out.println(Arrays.toString(after));
    }

    private static int[] reverseArray(int[] ar) {
        for(int i=0;i<ar.length/2;i++) {
            int temp = ar[i];

            ar[i] = ar[ar.length-1 - i];
            ar[ar.length - 1 - i] = temp;
        }

      return ar;
    }
}
