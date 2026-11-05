import java.util.Scanner ;
public class Ex6 {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in) ;
        System.out.println("Donner le premier nombre : ");
        double n1 = input.nextDouble() ;
        System.out.println("Donner le deuzieme nombre : ");
        double n2 = input.nextDouble() ;
        System.out.println("Donner l'operation : ");
        String op = input.next() ;
        double res = switch(op.trim()){
            case "+" -> n1 + n2 ;
            case "-" -> n1 - n2  ;
            case "*" -> n1 * n2 ;
            case "/" -> n2 != 0 ? 0 : n1 / n2 ;
            default -> 0 ;

        } ;
        System.out.println(res);
    }
}