import java.util.Scanner ;
public class Ex10 {
    public static void main (String[] args) {
        //Fibonacci
        Scanner input = new Scanner(System.in) ;
        System.out.println("Donner un nombre : ");
        int n = input.nextInt() ;
        int a = 0 ;
        int b  = 1;
        for(int i = 0 ; i<= n ; i++){
            if(i == 0){
                System.out.println(0);
            } else if (i == 1) {
                System.out.println(1);
            }else{
            System.out.println(a + b);
            int c = a;
            a = b ;
            b = c + b ;}
        }
    }
}