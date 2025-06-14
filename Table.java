package loop;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. u want table of n: ");
        int n=in.nextInt();
        System.out.println("Enter starting no.: ");
        int start=in.nextInt();
        System.out.println("Enter ending no.: ");
        int end=in.nextInt();
        System.out.println("======TABLE======");
        if(start>100 || end<start || end>100 ){
            System.out.println("please enter valid input");
        }
        
        for(int i=start; i<= end;i++){
            System.out.println(n+ "x"+i+"="+n*i);
        }

    }
    
}
