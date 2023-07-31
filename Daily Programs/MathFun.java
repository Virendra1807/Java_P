package Zgeneral;
public class MathFun {
    public static void main(String args[]) {
        System.out.println("Max is : "+ Math.max(50, 66));

        System.out.println("Min is : "+ Math.min(50, 66));
        
        System.out.println("Absulute val is : "+ Math.abs(50.556));
        
        System.out.println("Sqrt is : "+ Math.sqrt(16));
        
        System.out.println("Power is : "+ Math.pow(2, 10));

        System.out.println("Add Exact is : "+ Math.addExact(10, 4));

        System.out.println("Exponent is : "+ Math.getExponent(52));
        
        System.err.println("Simple Error Message");  // ************************

        System.out.printf("Random is : "+ Math.random()*100); // *********************
        
        
    }
}
