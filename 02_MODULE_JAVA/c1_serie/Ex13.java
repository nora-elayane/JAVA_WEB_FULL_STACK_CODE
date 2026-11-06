import java.util.Scanner ;
public class Ex13 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;
        String mot = "nora&mama2026" ;
        int chances = 3 ;
        boolean correct = false ;
        do{
            System.out.println("Donner le mot de passe : ");
            String given = input.nextLine() ;
            if(mot.equals(given)) {
                correct = true ;
                System.out.println("BienVenue");
            }
            --chances ;
        }while(chances > 0 && !correct ) ;
        if(!correct) System.out.println("Oups !");
    }
}