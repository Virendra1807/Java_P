package ExceptionHandling;

import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {
        int a,b;
        float c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Starts");

        try{
            System.out.print("Enter 2 Values : ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            System.out.println(("Division Is : "+ c));
        }
        catch(ArithmeticException ae){
            System.out.println("Cant divide by Zero : "+ ae.getClass());
        }
        finally{
            System.out.println("Finally Block Executes Always either Try executes complete or not");
            sc.close();
        }
    }
}
