import java.util.Scanner;

public class Sq_root {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number you want square root of: ");
        int n=in.nextInt();
        System.out.println("Square root of " + n + " is " + Math.sqrt(n));

    }
    
}
