import java.util.*;
public class MaxNumArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter Array Elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int res = MaxNumArray.maxNum(arr);

        System.out.print("Max Number From Array : "+ res);
        sc.close();
    }

    public static int maxNum(int array[]){
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
