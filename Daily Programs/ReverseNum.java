package Zgeneral;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        A a1 = new A();

        int result = a1.reverse(number);
        System.out.print("Reverse of Number : "+ result);
    sc.close();
    }
}


class A{
    public int reverse(int num){
        int rev = 0;
        // 123 = 321
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem; // rem = 3 -> rev = 30, rem = 2 -> rev = 30+2=32,  rem = 1 320+1= 321 
            num = num/10;
        }

        return rev;
    }
}