import java.util.Scanner ;
public class Ex9{
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in)  ;
        System.out.println("Donner un nombre : ");
        int nb = input.nextInt() ;
        System.out.println("===================================");
        System.out.println("Tableau de multiplication de " + nb);
        System.out.println("===================================");

        for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(nb + " * " + i + " = " + nb * i );
        }

    }
}