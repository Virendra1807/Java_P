public class AgnosticBS2 {
    public static void main(String args[]){
		int array[] = {10,20,30,40,50};
		int target = 30;
		int ans = agnosticBS2(array, target);
		String res = (ans==-1) ? "Element Not Found" : "Element Found";
        System.gc();
	}

	public static int agnosticBS2(int arr[], int ele){
		int i = arr[0];
		int j = arr[arr.length-1];
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end){
			int mid = (start+end)/2;
			
			if(arr[mid] == ele){
				return 1;
			}
			
			if(i<j){
				if(arr[mid]>ele){
					end = mid-1;
				}
				else{
					start = mid+1;
				}
			}
			else{
				if(arr[mid]>ele){
					start = mid+1;
				}
				else{
					end = mid-1;
				}
			}
		}
		return -1;
	}
}
