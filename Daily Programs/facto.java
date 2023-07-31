package Zgeneral;
import java.util.Scanner;

public class facto {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int fact_ttl = Factorial.fact(num);

        System.out.println("Factorial of "+ num +"! : "+fact_ttl);

        sc.close();
    }
}


class Factorial{
    public static int fact( int n) {
        if(n>0){
            int ttl = 1;
            while(n>0){
                ttl = ttl * n;
                // ttl *= n;
                n--;
            }
            return ttl;
        }
        else{
            return 0;
        }
    }
}