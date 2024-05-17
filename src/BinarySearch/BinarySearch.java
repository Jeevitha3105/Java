package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length-1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(array[mid] == target){
                return mid;
            }
            if(array[mid] < target){
                low = mid + 1;
            }
            if(array[mid] > target){
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = {1,2,5,6,9};
        int target = 1;
        int result = binarySearch(array,target);

        if(result == -1){
            System.out.println("Element not present in the array");
        }else{
            System.out.println("Element found at index " + result);
        }
    }
}
