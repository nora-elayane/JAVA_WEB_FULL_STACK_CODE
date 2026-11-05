import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner ;
public class Ex3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        double note = 0 ;
        boolean saisi = false ;
        try{
            System.out.println("Donner une note: ");
            note = input.nextDouble() ;
            saisi = true ;
        }catch(InputMismatchException e){
            System.out.println("erreur : " + e.getMessage());
        }

        if(saisi){
            if(note >20 || note < 0) System.out.println("Valeur invalid ! note entre 0 et 20");
            else if(note >= 16) System.out.println("Tres Bien");
            else if(note >= 14) System.out.println("Bien");
            else if(note >= 12) System.out.println("Assez Bien");
            else if(note >= 10) System.out.println("Passable");
            else System.out.println("Ajourné");
        }


    }
}