public class ex07 {
    public static void main(String[] args){
        int[] stock ;
        stock = new int[3] ;
        System.out.println("longueur : " + stock.length);

        for(int i = 0 ; i < stock.length ; i++){
            System.out.println("stock["+i+"] = " + stock[i]);
        }
        stock[0] = 12 ;
        stock[1] = 5 ;
        stock[2] = 8 ;
        for(int item : stock){
            System.out.println(item);
        }
        int[] prix = {10 , 25 , 40} ;
        System.out.println("Dernier prix : " + prix[prix.length - 1]);
    }

}