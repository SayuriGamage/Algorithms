package lk.ijse;

public class LinearSearch {



    public static void main(String[] args) {

        int[] arr={3,2,5,8,7};
        int taget=5;
        int result=searchNUmber(arr,taget);

        if (result!=-1){
            System.out.println("Element found at index: "+result);
        }else {
            System.out.println("Element is not found");
        }
    }

    private static int searchNUmber(int[] arr, int taget) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == taget) {
                return i;
            }
        }
        return -1;
    }
}
