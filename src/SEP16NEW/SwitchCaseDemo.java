package SEP16NEW;
import java.util.Scanner;
public class SwitchCaseDemo {
    public static void main(String[] args)
    {
        System.out.println("Welcome to my calculator");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int input =scanner.nextInt();

         switch (input) {
             case 1:
                 System.out.println("Hello");
                 break;
             case 2:
                 System.out.println("Hello on 2");
                 break;
             case 3:
                 System.out.println("Hello on 3");
                 break;
             case 4:
                 System.out.println("Hello on 4");
                 break;
             case 5:
                 System.out.println("Hello on 5");
                 break;
         }
    }
}
