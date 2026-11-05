package ex02_s1_declaration_initialisation;

public class Declarer {
    public static void main (String[] args){
        // declaration et initialisation
        int[] tab = { 1 , 10 , 20 } ;

        String[] chaines ;
        chaines = new String[3] ;
        chaines[0] = "Nora" ;
        chaines[1] = "Elayane" ;
        chaines[2] = "22 ans" ;

        String name1 = "Ziad" ;
        String name2 = "Ziad" ;
        String name3 =  "نورة" ;

        int a = 10 ;
        int b = a++ ;
        System.out.println(a + " " + b);

        name2 = "Adam" ;
        System.out.println(name1  + " " + name2);
        System.out.println("le caractere de l'index 2 dans le variable name1 est : " + name1.charAt(2));
        System.out.println("the unicode of the first caractere in the variable name3 is : " + name3.codePointAt(0));

        for(int elem : tab){
            System.out.println(elem);
        }

        for( int i  = 0 ; i < chaines.length ; i++){
            System.out.println(chaines[i]);
        }

    }
}
