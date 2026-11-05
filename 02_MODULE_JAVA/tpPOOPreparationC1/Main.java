import java.util.Scanner ;
public class Main{
    public static void main(String[] args){
      boolean stay = true ;
      int choix = 0 ;
      int n1 ;
      int n2 ;
      Calculatrice cal = new Calculatrice() ;
      Scanner scanner = new Scanner(System.in) ;
        System.out.println("=============================");
        System.out.println("Calculatrice  :");
        System.out.println("=============================");

      while(stay){
          System.out.println("1-Addition\n2-Soustraction\n3-Multiplication\n4-Division\n5-Quitter") ;
          System.out.println("chaisit une operation :  ");
          choix = scanner.nextInt() ;


          switch(choix){
              case 1 :
                  System.out.println("Donner le premier nombre : ");
                  n1 = scanner.nextInt() ;
                  System.out.println("Donner le deuxieme nombre : ") ;
                  n2 = scanner.nextInt() ;
                  System.out.println("addition de " + n1 + " et " + n2 + " = "  + cal.addition(n1 , n2));
                  break;
              case 2 :
                  break ;
              case 3 :
                  break ;
              case 4 :
                  break ;
              case 5 : stay = false ;
                  System.out.println("Au revoir !");
                  break ;
              default :
                  System.out.println("Erreur !!!!!!!!!!!!!!!!!!!!!!!");
          }


      }

    }
}