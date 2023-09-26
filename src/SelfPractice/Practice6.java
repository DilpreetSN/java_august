package SelfPractice;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args)
    {
        int sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
                int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        sum = num1*num2;
        System.out.println(" Multiplication of "+ num1+ " and " + num2+ " is: "+ sum);
    }
}
