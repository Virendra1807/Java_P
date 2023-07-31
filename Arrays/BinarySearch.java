import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {10,55,44,66,88,11,20,65,21,50,5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int target = 66;
        int ans = binary(array, target);
        if(ans>-1){
            System.out.println("Element Found at Index : "+ ans);
        }
        else{
            System.out.println("Element Not Found");
        }
        System.gc();
    }


    public static int binary(int[] arr, int ele){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid  = (start+end)/2;
            //if mid is equal to target element
            if(arr[mid]==ele){
                return mid;
                // break;
            }
            else if (arr[mid]>ele){
                // Target ele is less than mid then change the end = mid-1;
                end = mid-1;
            }
            else{
                // Target ele is greater than mid then start = mid +1 
                start = mid+1;
            }
        }
        return -1;
    }
}
