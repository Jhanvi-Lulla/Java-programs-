import java.util.Scanner;

public class userInp {
    public static void main(String[]args){

   
    Scanner in=new Scanner(System.in);
    System.out.println("=======CALCULATOR=======");
    System.out.print("Enter 1st no.:  ");
    int fn=in.nextInt();
    System.out.print("Enter 2nd no.:  ");
    int sn=in.nextInt();
    int sum= fn+sn;
    int sub=fn-sn;
    int multiply=fn*sn;
    int div=fn/sn;
    int rem=fn%sn;
    System.out.println("Sum is:  "+sum);
    System.out.println("Sub is:  "+sub);
    System.out.println("Multiplication is:  "+multiply);
    System.out.println("Division is:  "+div);
    System.out.println("Remainder is:  "+rem);
    }

    
}
