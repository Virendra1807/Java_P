package Vectors;
import java.util.Vector;

public class First {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(20);
        v1.add(0, 30);
        System.out.println(v1); 

        System.out.println(v1.clone()); 
    }
}
