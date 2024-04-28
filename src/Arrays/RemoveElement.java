package Arrays;

public class RemoveElement {
    public static int removeElements(int[]arr,int val){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,2,4,5,1};
        int result = removeElements(nums,2);

        System.out.println(result);
    }
}
