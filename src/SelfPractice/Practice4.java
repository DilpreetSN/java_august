package SelfPractice;

import java.util.Scanner;

public class Practice4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int Number_of_DaysInMonth = 0;
        String NameOfMonth = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                NameOfMonth = "January";
                        Number_of_DaysInMonth = 31;
                break;
            case 2:
                NameOfMonth = "February";
                if((year % 400 == 0)||((year % 4 == 0) && (year % 100 != 0)))
                Number_of_DaysInMonth = 29;
                else {
                    Number_of_DaysInMonth = 28;
                }
                break;
            case 3:
                NameOfMonth = "March";
                Number_of_DaysInMonth = 31;
                break;
            case 4:
                NameOfMonth = "April";
                Number_of_DaysInMonth = 30;
                break;
            case 5:
                NameOfMonth = "May";
                Number_of_DaysInMonth = 31;
                break;
            case 6:
                NameOfMonth = "June";
                Number_of_DaysInMonth = 30;
                break;
            case 7:
                NameOfMonth = "July";
                Number_of_DaysInMonth = 31;
                break;
            case 8:
                NameOfMonth = "August";
                Number_of_DaysInMonth = 31;
                break;
            case 9:
                NameOfMonth = "September";
                Number_of_DaysInMonth = 30;
                break;
            case 10:
                NameOfMonth = "October";
                Number_of_DaysInMonth = 31;
                break;
            case 11:
                NameOfMonth = "November";
                Number_of_DaysInMonth = 30;
                break;
            case 12:
                NameOfMonth = "December";
                Number_of_DaysInMonth = 31;
                break;

        }

           System.out.print(NameOfMonth + " " + year + " has " + Number_of_DaysInMonth+" days ");

    }

}
