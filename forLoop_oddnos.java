package loop;
import java.util.Scanner;
public class forLoop_oddnos {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter n: till you want to print odd nos.\n");
        int n = in.nextInt();
        for ( int i=0; i<=n;i++){
        //     if(i%2!=0){
                // System.out.println(i);// n=7, odd nos. till 7 will be printed!
        //     }
        // Method 2
            System.out.println(2*i+1);// if n=7, 7 odd nos. will be printed! 
        }
    }
}



