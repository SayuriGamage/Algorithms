package lk.ijse;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr={11,17,18,45,50,71,95};
        int target=17;
        int result=searchNumber(arr,target);

        if(result!=-1){
            System.out.println("Element found at index "+result);
        }else {
            System.out.println("Element not found");
        }
    }

    private static int searchNumber(int[] arr, int target) {
         int left=0;
         int right= arr.length-1;
         while(left<=right){
             int mid=left+(right-left)/2;
             if(arr[mid]==target){
                 return mid;
             }
             if(arr[mid]<target){
                 left=mid+1;
             }
             else {
                 right=mid-1;
             }
         }
     return -1;
    }
}
