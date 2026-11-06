public class Ex17 {
    public static void main (String[] args) {
        for(int i = 1 ; i  <= 50 ; i++) {
            if(i % 3 == 0 ) {
                continue;
            }else if(i % 5 == 0 ) {
                System.out.println("Buzz");
            }else{
                System.out.println( i );
            }
        }
    }
}