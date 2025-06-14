package loop;
import java.util.Scanner;


public class multiples_of_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no from where you want : ");
        int s=in.nextInt();
        for(int i=s; i>=0; i--){
            if(i%3==0){
                System.out.println(i);
            }
        }
        
    }
    
}
