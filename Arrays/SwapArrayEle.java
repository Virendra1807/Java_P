
import java.util.Arrays;
import java.util.Scanner;
// import java.io.DataInputStream;
// import java.io.InputStreamReader;

public class SwapArrayEle {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int arr[] = new int[5];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Array Elements");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Your array : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nWhich index Element you Want to Swap");
        System.out.print("Give Index-1 : ");
        int index1 = sc.nextInt();
        System.out.print("Give Index-2 : ");
        int index2 = sc.nextInt();

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
        System.out.print("New Array : ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
