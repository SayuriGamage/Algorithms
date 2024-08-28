package lk.ijse;

public class TwoSumAlgorithm {

    public static void main(String[] args) {
        int[] ar={0,-1,2,-3,1};
        int target=-2;
        int[] arrs=twosum(ar,target);
        if(arrs.length==2 ){
            System.out.println(arrs[0]+""+","+arrs[1]);
        } else {
            System.out.println("not found");
        }
    }

    private static int[] twosum(int[] ar, int target) {
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]+ar[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
