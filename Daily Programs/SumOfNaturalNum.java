package Zgeneral;
// import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String args[]) {
        A.sumOfNaturalNum();
    }
}

class A {
    public static void sumOfNaturalNum() {
        int num = 15;

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum is : "+sum);
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // if (num < 0) {
        //     System.out.println("You Entered Negative number, Plz Enter Natural Number");
        // } 
        // else if (num == 0) {
        //     System.out.println("You Entered Zero, plzz Natural Number ");
        // } 
        // else {
        //     int sum = 0;
        //     for (int i = 1; i <= num; i++) {
        //         sum += i;
        //     }
        //     System.out.println("Sum of " + num + "Natural numbers is = " + sum);
        // }
        // sc.close();
    }
}