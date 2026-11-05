import org.w3c.dom.ls.LSOutput;

import java.util.Scanner ;
public class Ex8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Donner le nombre : ");
        int n = input.nextInt() ;
        int somme = 0 ;
        for(int i = 1 ; i <= n ; i++){
            somme += i ;
        }
        System.out.println(somme);

        // Factorielle :
        int factorielle = n;

        System.out.println("==============----Factorielle----==============");

        for(; n > 1 ; n-- ){
            factorielle *=  n -1 ;
        }
        System.out.println(factorielle);
    }



}