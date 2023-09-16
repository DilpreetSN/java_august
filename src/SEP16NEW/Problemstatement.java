package SEP16NEW;

import java.util.Scanner;

public class Problemstatement
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Rogers");
        System.out.println("Press 1 for Internet");
        System.out.println("Press 2 for Mobile");
        System.out.println("Press 3 for Cable");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input =scanner.nextInt();

        switch (input) {

            case 1:
                System.out.println("lost Internet");
                System.out.println("Need a new connection");
                break;
            case 2:
                System.out.println("Order a new phone");
                System.out.println("Talk to a representative");
                break;
            case 3:
                System.out.println("Need a new connection");
                System.out.println("Lost a Cable connection");
        }

    }
}
