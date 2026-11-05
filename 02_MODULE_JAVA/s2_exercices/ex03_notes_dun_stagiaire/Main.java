public class Main{
    public static void main(String[] args){

        int[] notes = {12, 15, 9, 18 , 14} ;
        int[] tab ;
        tab = new int[4] ;
        tab[0] = 14 ;
        tab[1] = 20 ;
        int somme = 0 ;
        for(int n : notes){
            somme += n ;
        }
        System.out.println(somme);
        double moyenne = (double) somme / notes.length ;
        System.out.println(moyenne);
        System.out.println((int) moyenne);
        for(int current : tab){
            System.out.println(current);
        }
    }
}