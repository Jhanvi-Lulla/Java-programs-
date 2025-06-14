package exceptions;
import java.util.Scanner;
import java.util.InputMismatchException;


public class DemoExceptions {
    public static void main(String[] args) {
        try {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a=in.nextInt();
        System.out.println("Enter 2nd no.");
        int b=in.nextInt();
        int division = a/b;
        System.out.println("Division is: "+division);
        
            
        } catch  (ArithmeticException ae) {
            // TODO: handle exception
            System.out.println("result is Infinity");
            System.out.println(ae.getMessage());
        } catch (InputMismatchException ime){
            System.out.println("enter nos. only");
            System.out.println(ime.getMessage());
        }
        
        


        
    }
    
}
