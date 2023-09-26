package SelfPractice;

import java.util.Scanner;

public class practice9 {
    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
            System.out.print(" Enter the first number : ");
            double num1 = in.nextDouble();
            System.out.print(" Enter the Second number : ");
            double num2 = in.nextDouble();
            System.out.print(" Enter the Third number : ");
            double num3 = in.nextDouble();
            System.out.print(" Enter the fourth number : ");
            double num4 = in.nextDouble();
            System.out.print(" Enter the fifth number : ");
            double num5 = in.nextDouble();
            {
                System.out.print("Average of five numbers is : " + (num1 + num2 + num3 + num4 + num5 / 5));
            }
    }
}
