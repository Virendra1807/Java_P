package Zgeneral;
import java.util.Scanner;

public class funcInJava {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int a = sc.nextInt();
        System.out.print("Enter Number :");
        int b = sc.nextInt();
        
        int s = Add.calSum(a, b);

        System.out.println("Sum is : "+ s);
        
        sc.close();
    }
}


class Add{
    public static int calSum(int a, int b){
        return a+b;
    }
}