package SelfPractice;

import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

     //   System.out.println("getDayName" day);
        {
         //   public static String getDayName(int day);
            {
                String dayName = "";
                switch (day)
                {
                    case 1 : dayName = "Monday"; break;
                    case 2 : dayName = "Monday"; break;
                    case 3 : dayName = "Monday"; break;
                    case 4 : dayName = "Monday"; break;
                    case 5 : dayName = "Monday"; break;
                    case 6 : dayName = "Monday"; break;
                    case 7 : dayName = "Monday"; break;
                    default: dayName = "Invalid day range";
                }
            }
        }
    }
}
