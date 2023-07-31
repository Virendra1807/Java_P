package Zgeneral;
import java.util.Scanner;

public class PrimeNum {

    public static void main(String args[]) {
        Check c1 = new Check();
        c1.primeCheck();
    }
}


class Check{
    public void primeCheck(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        // int num = 53;
        System.out.println("Enter a number To check Prime or Not : ");

        boolean flag = false;
        
        if(num==2){
            flag = true;
        }
        else{
            loop_name : for(int i=2; i<num/2; i++){  // num/2 is for Time Complexity, check for half only
                if(num%i != 0){
                    flag = true;
                }
                else{
                    System.out.println("Number Is Not a Prime");
                    break loop_name; // We can give loop name when nested loops are present break outer loop with this Naming Facility
                }       
            }
        }

        if(flag == true){
            System.out.println(num +" Number is Prime Number");
        }
        sc.close();
    }
}