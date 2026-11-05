package s2_exercices.ex02_constante_et_recopie;

public class Main{
    public static void main(String[] args){
        int a = 1 ;
        int b = 2 ;
        a = b ;
        a = 5 ;
        final int MAX = 10 ;
        char x = 'x' ;
        String elem = "x" ;
        // MAX = 20 ;
        System.out.println(a);
        System.out.println(b);

    }

}