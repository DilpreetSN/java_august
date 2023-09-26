package Sep19;

public class Dowhile {
    public static void main(String[] args)
    {
        int number = 2 ;
        int i = 1;
        int limit = 10;

            System.out.println("Multiplication table for 2 ");

            do {
                int result = number * i;
                System.out.println(number + " * " + i + " = " + result );
                i++;
            }while (i <= limit);
        }
        }

