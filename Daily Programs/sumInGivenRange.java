package Zgeneral;
import java.util.Scanner;;
// Sum of Numbers Within Range
public class sumInGivenRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Stating Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Ending Number : ");
        int num2 = sc.nextInt();
        int sum = 0;
        if(num1>num2){
            System.out.println("Number 1 is Greater Than number 2");
        }
        else{
          
        for(int i = num1; i<=num2; i++)
            sum += i;
        }
        System.out.println("Sum is : "+sum);

        sc.close();
    }
}
