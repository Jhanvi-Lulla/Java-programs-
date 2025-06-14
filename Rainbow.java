import java.util.Scanner;
public class Rainbow {
    public static void main(String[]args)
    {

        Scanner in= new Scanner(System.in);
        System.out.print("Enter colour you want to check\n");
        String color=in.next();
        switch (color.toLowerCase()) {
            case "voilet":
                System.out.println("It's a Rainbow Color");
            break;
            case "indigo":
                System.out.println("It's a Rainbow Color");
            break;
            case "blue":
                System.out.println("It's a Rainbow Color");
            break;
            case "green":
                System.out.println("It's a Rainbow Color");
            break;
            case "yellow":
                System.out.println("It's a Rainbow Color");
            break;
            case "orange":
                System.out.println("It's a Rainbow Color");
            break;
            case "red":
                System.out.println("It's a Rainbow Color");
            break;
        
            default:
                System.out.println("not a Rainbow color");
                break;
        }
    }
    
}
