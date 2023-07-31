package Zgeneral;
import java.io.*;

public class datainp {
    public static void main(String[] args) throws IOException {
        
        int array [] = new int[5];
        DataInputStream dis = new DataInputStream(System.in);
        
        for(int i=0; i<array.length; i++){
            System.out.print("Enter a Number : ");
            array[i] = Integer.parseInt(dis.readLine()) ;
        }

        for(int j=(array.length)-1; j>=0; j-- ){
            System.out.println(array[j]);
        }


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter a Value Using ISR : ");
        int a = Integer.parseInt(br.readLine());
        System.out.println(a);
    }
}
