import java.util.Scanner;
public class User_inp_calc {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String cond = "";
        System.out.println("========== CALCULATOR :) ===========");
        do{

        
        System.out.println("Enter 1st no. a : ");
        float a = in.nextFloat();
        System.out.println("Enter 2nd no. b : ");
        float b = in.nextFloat();
        float sum=a+b;
        float sub=a-b;
        float mul=a*b;
        float div=a/b;
        float rem=a%b;
        System.out.println("Sum of " +a+" and "+b+" is: " + sum);
        System.out.println("Subtraction of " +a+" and "+b+" is: " + sub);
        System.out.println("Multiplication of " +a+" and "+b+" is: " + mul);
        System.out.println("Division of " +a+" and "+b+" is: " + div);
        System.out.println("Remainder of " +a+" and "+b+" is: " + rem);
        System.out.println("===================");
        System.out.println("Do u want to continue !? Yes/no: ");
        cond=in.next();

        }
        while(cond.equalsIgnoreCase("yes"));
            System.out.println("Exiting!!");
        
        


   }
    
}
