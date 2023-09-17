package Sep17;

import java.util.Scanner;

public class loop
{
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the input: ");
            int input = in.nextInt();
            if(input>0)
            {
                System.out.println("number is postive");
            }
            else if (input<0)
            {
                System.out.println("Number is negative");
            }
            else
            {
                System.out.println("Number is zero");
            }
        }
    }

