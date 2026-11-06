import java.util.Scanner ;
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Donner un nombre : ");
        int nb = input.nextInt() ;

        for(int i = 1 ; i <= nb ; i ++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for( ; nb >= 1 ; nb-- ){
            for(int i = 1 ; i <= nb ; i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}