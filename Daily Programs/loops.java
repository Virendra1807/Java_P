package Zgeneral;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        

        int i;
        for(i=0; i<=10; i++){
            System.out.println("Hello");
        }

        int j = 0;
        while(j<6){
            j++;
            System.out.println("Hii");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        

        int k = 1;
        do{
            System.out.println(num*k);
            k++;
        }while (k<11);


        sc.close();
    }
}