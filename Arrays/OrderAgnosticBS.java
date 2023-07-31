
public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int array [] = {40,30,20,10,8,4};
        int array [] = {10,20,30,40,52};

        // int target = 330;
        int target = 30;
        
        int ans = agnosticBS(array, target);
        // Ternary Operator in Java
        String res = (ans==-1) ? "Element Not found" : "Element Found";
        System.out.println(res);
    }

    public static int agnosticBS(int arr[], int ele){
        int i = arr[0];
        int j = arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;

        // if condition is for checking Whether array is Sorted in Ascending or Descending order
        if(i<j){
            while(start<=end){
                int mid = (start+end)/2;

                if(arr[mid]==ele){
                    return 1;
                }
                else if (arr[mid]>ele){
                    // ele is smaller than mid
                    end = mid-1;
                }
                else{
                    // ele is greater than mid
                    start = mid+1;
                }
            }
        }
        
        else{
            while(start<=end){
                int mid = (start+end)/2;

                if(arr[mid]==ele){
                    return 1;
                }
                else if (arr[mid]<ele){
                    // ele is smaller than mid
                    end = mid-1;
                }
                else{
                    // ele is greater than mid
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
