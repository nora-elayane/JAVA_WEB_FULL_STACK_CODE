import java.util.Scanner  ;
public class Ex16 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;
        int somme = 0 ;
        int chiffres = 0 ;
        double moyenne = 0 ;
        do{
            System.out.println("saisire un nombre : ");
            int nb = input.nextInt() ;
            if(nb == 0) break ;
            somme += nb ;
            chiffres += 1 ;

            }while (true) ;
        System.out.println("le nombre de chffres donnée est : " + chiffres);
        System.out.println("le total de chiffres donnée est : " + somme );
        moyenne = (double) somme / chiffres ;
        System.out.println("la moyenne est : " +  moyenne );

    }
}
