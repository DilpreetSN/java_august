package SEP16NEW;

import java.util.Scanner;

public class Calculator
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int x = input.nextInt();

        System.out.print("Enter Second number: ");
        int y = input.nextInt();

        System.out.print("Press 1'-' for Subtraction");
        System.out.print("Press 2'+' for Addition");
        System.out.print("Press 3'*' for Multiplication");
        System.out.println("Press 4'/' for Division");

        System.out.print("Press a number: ");
        int number = input.nextInt();

        if (number == 1) {
            int sub = (x - y);
            System.out.println("Substration of  +X and +Y :" + sub);
        }else if (number == 2) {
            int sum = (x + y);
            System.out.println("Addition of X and Y is :" + sum);
        }      else if (number == 3) {
            int mul = (x - y);
            System.out.println("Muliplication of X and Y is :" + mul);
        }
        else if (number == 4) {
            int div = (x - y);
            System.out.println("Division of X and Y is :" + div);
        }else{
            System.out.println("Invalid");
            }
    }
}
