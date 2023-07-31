package Zgeneral;
import java.util.*;

public class BankSy {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number : ");
        int acc_no = sc.nextInt();
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Total Bank Balance : ");
        float amount = sc.nextFloat();

        while(true){
            System.out.println(" ");
            System.out.println("Provide your Choice");
            System.out.println("1 - Deposite Amount ");
            System.out.println("2 - Withdraw Amount");
            System.out.println("3 - Check Acc Balance");
            System.out.println("4 - Display all Info");
            System.out.println("5 - Exit");
            System.out.print("Select an Option : ");

            int uchoice = sc.nextInt();

            switch(uchoice){
                case 1:
                    System.out.print("Enter Deposite Amount : "); 
                    float a = sc.nextFloat();
                    amount = BankInfo.deposite(amount, a);
                    break;

                case 2:
                    System.out.print("Enter Amount to Withdraw : ");
                    float wd = sc.nextFloat();
                    amount = BankInfo.withdraw(amount, wd);
                    break;
                
                case 3:
                    BankInfo.checkAccBal(amount);
                    break;
                    
                case 4: 
                    BankInfo.display(acc_no, amount, name);
                    break;
                    
                case 5: 
                    break;
            }
            sc.close();
        }       
    }
}


class BankInfo {

    Scanner sc = new Scanner(System.in);

    static float deposite(float ttlAmt, float amt){
        float TotalAmt = ttlAmt + amt;
        System.out.println(" ");
        System.out.println("Deposite Amount : "+ amt);
        System.out.println("Total Balance after Deposite : "+TotalAmt);
        System.out.println(" ");
        return TotalAmt;
    }

    static float withdraw(float ttlAmt, float wid){
        if (ttlAmt < wid){
            float TotalAmt = ttlAmt;
            System.out.println(" ");
            System.out.println("Insufficient Balanace...!");
            System.out.println(" ");
            return TotalAmt;
        }
        else{
            float TotalAmt = ttlAmt;
            TotalAmt = TotalAmt - wid;
            System.out.println(" ");
            System.out.println("Amount Withdraw : "+wid);
            System.out.println("Now Total Balance is : "+TotalAmt);
            System.out.println(" ");
            return TotalAmt;
        }

    }

    static void checkAccBal(float amt){
        System.out.println(" ");
        System.out.println("Total Account Balance is : "+ amt);
        System.out.println(" ");
    }

    static void display(int acc, float amt, String nm){
        System.out.println(" ");
        System.out.println("AccNo \t\t Name \t\t Balance");
        System.out.println(acc+"\t\t"+nm+"\t\t"+amt);
        System.out.println(" ");
    }

}