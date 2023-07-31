package Zgeneral;
import java.util.Scanner;

public class SimpleInterest {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        float principle, interest, timePeriod, simpleInterest;

        System.out.print("Enter Priciple Amount : ");
        principle = sc.nextFloat();
        System.out.print("Enter Interest rate : ");
        interest = sc.nextFloat();
        System.out.print("Enter Time Period : ");
        timePeriod = sc.nextFloat();

        simpleInterest = (principle * interest * timePeriod ) / 100;
        System.out.println("Simple Interest Amount : "+simpleInterest);

        sc.close();
    }
}
