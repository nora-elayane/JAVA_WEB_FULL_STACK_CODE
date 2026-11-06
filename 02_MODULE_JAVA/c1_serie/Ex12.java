import java.util.Scanner ;
public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Donner un nombre : ");
        int nb = input.nextInt() ;
        boolean premier = true ;
        if(nb == 1 || nb == 0){
            premier = false ;
        }
        for(int i = 2 ; i < nb ; i++){
            if(nb % i == 0){
                premier = false ;
            }
        }
        if (premier) {
            System.out.println(nb + " est un nombre premier");
        } else {
            System.out.println("pas Premier ");
        }

        for(int i = 2 ; i < 100 ; i++) {
            boolean prem = true ;
            for(int j = 2 ; j < i ; j++) {
                if(i % j == 0){
                    prem = false ;
                }
            }
           if(prem){System.out.println(i);}
        }

    }
}