import java.util.Scanner;
public class GradingSyst {
    public static void main(String[]args){
        System.out.println("======== Grading System ========");
        Scanner S= new Scanner(System.in);
        String condition = "";
        do{
            System.out.println("Enter marks");
            int m= S.nextInt();
            if(m>100){
                System.out.println("Invalid input , enter between (0-100)");
            }
            else if(m>=80 && m<=100){
                System.out.println(" Grade : A+ :)");
            }
            else if(m>=60 && m<80){
                System.out.println(" Grade : A");
            }
            else if(m>=40 && m<60){
                System.out.println("Grade : B");
            }
            else if(m>=20 && m<40){
                System.out.println("Grade : C");
            }
            else{
                System.out.println("Invalid input :(");
            
        
        }
        System.out.print("Do u want to continue : Yes/No: \n");
        condition = S.next();
    }
        while(condition.equalsIgnoreCase("Yes"));
            System.out.println("Exiting!");
}}
        
        
    
    

