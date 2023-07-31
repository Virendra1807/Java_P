public class StringRev {
    public static void main(String[] args) {
        
        String name = "Viren";
        String res = "";
        for(int i=0; i<name.length(); i++){
            char k = name.charAt(i);
            res = k+res; 
       }
       System.out.println("Reverse is : "+res);
     }
}
