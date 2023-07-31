import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray rvr = new ReverseArray();

        int arr[] = {10,20,30,40,50,60,56,4,5,8,54,5,5,45};
        int res[] = rvr.reverse(arr);
        System.out.println("Reverse Array : "+ Arrays.toString(res));
    }

    public int[] reverse(int array[]){
        int EndInd = array.length-1;
        int StartInd = 0;
        
        while(StartInd <= EndInd){
            int temp = array[StartInd];
            array[StartInd] = array[EndInd];
            array[EndInd] = temp;
            StartInd++;
            EndInd--;
        }
        return array;
    }
}
