package Sep23;

public class Nestedloop {
    public static void main(String[] args){
        for (int i = 0; i <=5 ; i++) {
            System.out.println();
            for (int j = 0; j<=i ; j++) {
               System.out.print(" * ");
                System.out.println();
            }
        }
    }
}
