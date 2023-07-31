package Zgeneral;
import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        int TOP = -1, i;
        int STACK[] = new int[10];
        do { 
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Select Option");
            System.out.println("1 - PUSH Operation");
            System.out.println("2 - POP Operation");
            System.out.println("3 - Display Operation");
            System.out.println("4 - Exit");
            System.out.print("Provide Your Choice : ");

            int uch = sc.nextInt();

            switch (uch) {
                case 1: // PUSH op
                    if (TOP == 9) {
                        System.out.println("STACK OverFlow");
                    } else {
                        System.out.print("Enter a Number to Push : ");
                        int num = sc.nextInt();

                        TOP++;
                        STACK[TOP] = num;
                        System.out.println("Number PUSHed Into STACK");
                    }
                    break;

                case 2: // POP op
                    if (TOP == -1) {
                        System.out.println("STACK UnderFlow");
                    } else {
                        int ele = STACK[TOP];
                        TOP--;
                        System.out.println("TOP POPed : " + ele);
                    }
                    break;

                case 3: // Display op
                    if (TOP == -1) {
                        System.out.println("STACK yet not Created, Nothing to Display");
                    } else {
                        for (i = 0; i <= TOP; i++) {
                            System.out.println("    " + STACK[i]);
                        }
                    }
                    break;

                case 4: // Exit op
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
            }
            sc.close();
        } while (true); 
        
    }
}
