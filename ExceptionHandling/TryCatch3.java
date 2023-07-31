package ExceptionHandling;
import java.util.Scanner;

public class TryCatch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;

        try{
            System.out.println("Enter 2 Numbers");
            a = sc.nextFloat();
            b = sc.nextFloat();

            if (a<0.5 || b<0.5){
                throw new NumberTooSmallException("Number is less than 0.5 ");
            }
            c = a*b;
            System.out.println("Multiplication Is : "+ c);
        }
        catch(NumberTooSmallException n){
            System.out.println("Message is : "+ n.getClass());
            System.out.println("Message : "+ n.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception : "+ e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}

class NumberTooSmallException extends RuntimeException{
    public NumberTooSmallException(){
        super("java.viren.NumberTooSmallException");
    }

    public NumberTooSmallException(String m){
        super(m);
    }
}
