import java.util.InputMismatchException;
import java.util.Scanner ;
public class Ex1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;
        int num = 0  ;
        boolean saisi = false ;
        int chances = 3 ;
       do {
           try{
               System.out.println("Donner un nombre : ");
               num = input.nextInt() ;
               saisi = true ;
           }
           catch(InputMismatchException e){
               System.out.println("erreur : " + e.getMessage());
               input.next() ;
               chances-- ;

           }
       }while (!saisi && chances > 0) ;
if(chances == 0){
    return ;
}
        if(num > 0  ){
            System.out.println(num + " est positif.");
        }else if(num < 0){
            System.out.println(num + " est negatif.");
        }else{
            System.out.println( num + " est null.");
        }
        input.close() ;
    }
}