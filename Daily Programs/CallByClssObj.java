package Zgeneral;
import java.util.Scanner;

public class CallByClssObj {
    public static void main(String args[]) {
        // Show s = new Display();
        // s.name(); // Call By Obj Bcoz Non-Static

        Display d = new Display();
        d.name(); // CAll By obj Bcoz Non-Static Method
        Display.age(); //Call by Class Name BCoz Static Method
    }
}

class Show {
    public void name() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String nm = sc.nextLine();
        System.out.println("Name : " + nm);
        System.out.println("CAll By Object Creating");
        
        sc.close();
    }
}

class Display extends Show {
    public static void age() {
        System.out.println("Age is : 22");
    }
}

