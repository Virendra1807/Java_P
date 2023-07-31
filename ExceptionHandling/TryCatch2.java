package ExceptionHandling;
import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int ind;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter Index Number to Fetch Element : ");
            ind = sc.nextInt();
            System.out.println("Number is : "+ arr[ind]);
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            // System.out.println("Array Index : "+ aiobe.getMessage());//Array Index : 9
            // System.out.println("Array Index : "+ aiobe.toString()); //Array Index : java.lang.ArrayIndexOutOfBoundsException: 8
            System.out.println("Array Index : "+ aiobe.hashCode()); //Array Index : 1442407170
        }
        finally{
            sc.close();
        }
    }
}
