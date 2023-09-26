package SelfPractice;

import java.util.Scanner;

public class practice7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int x = in.nextInt();
        System.out.println("Enter The Second Number: ");
        int y = in.nextInt();

        int sum;
        sum = x+y;
        System.out.println("Sum of x and y is : " +sum);

        int multi;
        multi = x*y;
        System.out.println("Multi of x and y is : " +multi);

        int div = x/y;
        System.out.println("Division of x and y is : " +div);

        int sub = x-y;
        System.out.println("Subtraction of x and y is : " + sub);

        int rem = x%y;
        System.out.println("Remender of x and y is :" +rem);
    }
}
