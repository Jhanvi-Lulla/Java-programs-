import java.util.Scanner;
public class even_no_if_else {
    public static void main(String[] args) {
        System.out.println("======== Checking Even or Odd ========");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. you want to check \n");
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    
}
