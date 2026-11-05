import java.util.Locale;

public class Main4 {
    public static void main(String[] args){
        String nom = " amina benali " ;
        int[] notes = {14, 8, 16, 11, 13} ;
        final int SEUIL = 10 ;
        String propre = nom.trim().toUpperCase() ;
        double somme = 0 ;
        int compt = 0 ;
        int max = notes[0] ;
        for(int elem : notes){
            somme += elem ;
            if(elem >= SEUIL){
                compt += 1 ;
            }
            if(elem > max){
                max = elem ;
            }

        }
        double moyenne = somme / notes.length ;
        String m ;
        if(moyenne >= SEUIL && compt >= 3){
            m = "Admis" ;
        }else{
            m = "Non admis" ;
        }

        System.out.println("=======================================");
        System.out.println("Bulletin Stagiaire : ");
        System.out.println("=======================================");
        System.out.println("Le nom : " + propre);
        System.out.println("La moyenne : " + moyenne);
        System.out.println("La meilleure note : " + max);
        System.out.println(m);
        System.out.println("=======================================");


    }

}