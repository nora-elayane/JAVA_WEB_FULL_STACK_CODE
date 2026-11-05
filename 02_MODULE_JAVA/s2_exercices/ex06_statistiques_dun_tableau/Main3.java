import java.util.Arrays;
import java.util.OptionalInt;

public class Main3 {
    public static void main(String[] args){
        int[] notes = {7, 3, 12, 5, 9} ;
        int min = notes[0] ;
        int max = notes[0] ;
        double somme = 0 ;
        for(int elem : notes){
            somme += elem ;
            if(elem > max){
                max = elem ;
            }
            if(elem < min ){
                min = elem ;
            }

        }
        double moyenne = somme / notes.length ;
        System.out.println("la moyenne est : " + moyenne);
        System.out.println("la note maximal est : " + max );
        System.out.println("la note minimal est : " + min);
        int v = 0 ;
        for(int elem : notes){
            if(moyenne < elem){
                v++ ;
            }
        }
        System.out.println("le nombre des elements superieures a la moyenne est : " + v );
    }
        }
