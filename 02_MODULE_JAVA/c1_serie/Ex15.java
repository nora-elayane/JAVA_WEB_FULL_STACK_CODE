import java.util.Scanner ;
public class Ex15 {
    public static void main (String[] args) {
        //Palindrome
        Scanner input = new Scanner(System.in) ;
        boolean palin = true ;
        int j = 0 ;
        System.out.println("Donner un nombre : ");
        String nb =  "" +  input.nextInt() ;
        int[] tab = new int[nb.length()] ;
        int[] rev = new int[nb.length()] ;
        for(int i = 0 ; i < nb.length() ; i ++) {
            tab[i] = Integer.parseInt(nb.substring(i , i+1));
        }
        for(int i = nb.length() - 1 ; i >= 0 ; i --) {
                rev[i] = Integer.parseInt(nb.substring(j , j + 1)) ;
                j++ ;

        }

        for(int i = 0 ; i < nb.length() ; i++) {
            if(rev[i] != tab[i]){
                System.out.println("Pas palindrome ! ");
               palin = false;
               break;}
            }

        if(palin) {
            System.out.println("Palindrome !!!");
        }


    }
}