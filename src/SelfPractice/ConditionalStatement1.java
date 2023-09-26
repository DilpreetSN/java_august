package SelfPractice;

import java.util.Scanner;

public class ConditionalStatement1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        double num1 = in.nextDouble();

        System.out.print("Input the 2nd number: ");
        double num2 = in.nextDouble();

        System.out.println("Input the 3rd number: ");
        double num3 = in.nextDouble();

        if(num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest: "+ num1);
        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest number :" + num2);
        if (num3>num1)
            if(num3>num2)
                System.out.println("The greatest number :" + num3);
    }
}
