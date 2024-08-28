package lk.ijse;


import java.util.Arrays;

public class Reversearraywithouttemp {
    public static void main(String[] args) {
        int[] ar={3,4,1,5,9};
        int[] reverse=reverseArrays(ar);
        System.out.println(Arrays.toString(reverse));
    }

    private static int[] reverseArrays(int[] ar) {
       for(int i=0;i<ar.length/2;i++){
           ar[i]=ar[i]+ar[ar.length-1-i];
           ar[ar.length-1-i]=ar[i]-ar[ar.length-1-i];
           ar[i]=ar[i]-ar[ar.length-1-i];
        }
       return ar;
    }
}
