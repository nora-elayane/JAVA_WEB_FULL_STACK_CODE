import java.util.Scanner ;
public class Ex5{
    public static void main(){
        Scanner input = new Scanner(System.in) ;
        System.out.println("Donner une année");
        int annee = input.nextInt() ;
        if((annee % 4 == 0 && annee % 100 != 0) || (annee % 4 == 0  && annee % 400 == 0) ){
            System.out.println("Bissextile");
        }else{
            System.out.println("Pas Bissextile");
        }
        input.close() ;
    }
}