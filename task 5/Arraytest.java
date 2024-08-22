import java.util.Scanner;

public class Arraytest {
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner (System.in);
         System.out.println("Enter the marks obtained=");
         int marks=Sc.nextInt();
         switch (marks/10) {
            case 10:
                System.out.println("Grade=S");
                break;
            case 9:
                System.out.println("Grade=A");
                break;
            case 8:
                System.out.println("Grade=B");
                break;
            case 7:
                System.out.println("Grade=C");
                break;
            case 6:
                System.out.println("Grade=D");
                break; 
            case 5:
                System.out.println("Grade=E");
                break;       
            case 4:
                
                break;
            default:
                System.out.println("fail you");

         }


    }
}
    

   