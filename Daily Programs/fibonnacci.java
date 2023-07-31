package Zgeneral;
import java.util.Scanner;


public class fibonnacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        fibo(num); 
        
        sc.close(); 
    }
    
    public static void fibo(int num) {
        int a=0, b=1, c;
        System.out.print(a+" "+b);

        for(int i=2; i<num; i++){
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }    
    }
}
