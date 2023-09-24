package Assignments;

import SEP16NEW.SwitchCaseDemo;

import java.util.Scanner;

public class Rogers {
    public static void main(String[] args)
    {
        char choice;
        int input;
        int account = 0;
        do {
            System.out.println("Welcome to Rogers");
            System.out.println("Press 1 for English");
            System.out.println("Press 2 for French");
            System.out.println("Press 3 for Spanish");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            input = scanner.nextInt();

            if (input == 1)
            {
                System.out.println("Press 1 Account Balance");
                System.out.println("Press 2 Credit Card Payment");
                System.out.println("Press 3 Payment Arrangement");
                System.out.println("Press 4 Usage Details");
                System.out.println("Press 5 Copy of last payment");
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the number: ");

                    account = scanner.nextInt();
            }

                else if (input == 2) {
                System.out.println("Press 1 Account Balance");
                System.out.println("Press 2 Credit Card Payment");
                System.out.println("Press 3 Payment Arrangement");
                System.out.println("Press 4 Usage Details");
                System.out.println("Press 5 Copy of last payment");
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the number");

                account = scanner.nextInt();
            }
                 else if (input == 3) {
                System.out.println("Press 1 Account Balance");
                System.out.println("Press 2 Credit Card Payment");
                System.out.println("Press 3 Payment Arrangement");
                System.out.println("Press 4 Usage Details");
                System.out.println("Press 5 Copy of last payment");
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the number");
                account = scanner.nextInt();
            }

            else {
                System.out.println("Invalid number");
            }

            switch (account) {

                case 1:
                    System.out.println("Your Account balance is 0 ");
                    break;
                case 2:
                    System.out.println("Keep your credit card details ready ");
                    break;
                case 3:
                    System.out.println("Talk to a representative");
                    break;
                case 4:
                    System.out.println("You have used more than 50 GB of DATA this month");
                    break;
                case 5:
                    System.out.println("Copy of your last payment has sent to registered email");
                    break;
            }
            System.out.println("Do you want to continue? Press Y or N");
            choice = scanner.next().charAt(0);
        }while(choice != 'N');
}

}
