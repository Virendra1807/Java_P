package Zgeneral;
// import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RunWithChangeMain {
    // public static void main(String ... args) {
    //     System.out.println("Hello");
    // }  // <---- ... allow in java it is like spread Operator

    // We can take input using 4 methods
    // ==============================================================================
    public static void main(String[] args) throws IOException {
        
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter Number  : ");

    int age = Integer.parseInt(br.readLine());
    System.out.print("Age is : "+ age);
// ======================================================================== Both Throws IO Exception
    
    // DataInputStream dir = new DataInputStream(System.in);
    System.out.print("Enter Number  : ");
    // String stringInt = dir.readLine();
    // int a = Integer.parseInt(stringInt);
    // System.out.print("Age is : "+ a);
    int k = System.in.read();       // <-- java.io.*
    System.out.println((char)k);   // <--  read takes only one character at a time

    
    }

}
