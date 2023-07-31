package Zgeneral;
import java.util.*;

public class NonpreArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array : ");
        int size = sc.nextInt();
        int marks [] = new int [size];

        System.out.println("Enter Elements Of an Array ");
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }

        System.out.print("Enter Element Which you Want to Search : ");
        int ele = sc.nextInt();

        boolean flag = false;
        for(int i=0; i<marks.length; i++){
            if(ele == marks[i]){
                System.out.println("Element Found");
                System.out.print("Index Number of Element is : "+i);
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
