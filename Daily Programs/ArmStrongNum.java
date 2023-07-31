package Zgeneral;
import java.util.Scanner;
// 153 ,370, 371, 1634
public class ArmStrongNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter Number To check ArmStrong or Not : ");
        int number = sc.nextInt();
        // ArmStrongCheck a1 = new ArmStrongCheck(); // We can Access Static By obj name 
        ArmStrongCheck.armStrongChecking(number);
        // a1.armStrongChecking(number);

        sc.close();
    }
}

class ArmStrongCheck{
    public static void armStrongChecking(int num){
        int temp = num;
        int sum = 0;

        int power = 0;
        while(num>0){
            power++;
            num = num/10;
        }
        System.out.println(power);

        num = temp;
        while(num>0){ 
            int digit = num%10;
            double ind = Math.pow(digit, power);
            
            sum = sum + (int)ind;
            num = num/10;
        }
        
        String result =(temp == sum)?"Yes..It is a ArmStrong Number":"No.. It is not a ArmStrong Number";
        System.out.println(result);

    }
}
