import java.util.Scanner ;
public class Ex14 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in) ;
        System.out.println("donner un chiffre : ");
        int chiffre = input.nextInt() ;
        String chiff = "" + chiffre ;
        int somme = 0 ;
        int nbchiffres = chiff.length() ;
       int[] tab = new int[nbchiffres ] ;
       for(int i = 0 ; i < nbchiffres   ; i++) {
           if( i == (nbchiffres - 1) ){
               tab[i] = Integer.parseInt(chiff.substring(i)) ;
           }else {
           tab[i] = Integer.parseInt(chiff.substring(i , i+1)) ;}
       }
       for(int elem : tab) {
           somme += elem ;
       }

        System.out.println("le nombre de chiffres de " + chiffre + " est : " + nbchiffres);
        System.out.println(("la somme des nombres de chiffre " + chiffre + " est : " + somme));


    }
}