import java.util.Arrays;

public  class All{
    public static void  main(String[] args){
        int[] tab = {12 , 14 , 11 , 17 , 19 , 8 , 4} ;
        System.out.println(reduce(tab)) ;
        System.out.println(Arrays.toString(filter(tab, "!=", 11)));
        System.out.println(find(tab , 11));
    }
    public static int find(int[] tab , int val){
        int v  = -1 ;
        for (int j : tab) {
            if (j == val) {
                return  val;

            }
        }
        return v ;
    }
    public static int reduce(int[] tab ) {
        int total = 0;
        for (int item : tab) {
            total += item;
        }
        return total ;
    }
    public static int[] filter(int[] tab , String op , int val){
        int[] vals = new int[tab.length] ;
        int count = 0 ;
        switch(op){
            case "==" : for(int elem : tab){
                if(elem == val){
                    vals[count] = elem ;
                    count++ ;
                }
            }
            break ;
            case ">" : for(int elem : tab){
                if(elem > val){
                    vals[count] = elem ;
                    count++ ;
                }
            }
                break ;
            case "<" : for(int elem : tab){
                if(elem < val){
                    vals[count] = elem ;
                    count++ ;
                }
            }
                break ;
            case ">=" : for(int elem : tab){
                if(elem >= val){
                    vals[count] = elem ;
                    count++ ;
                }
            }
                break ;
            case "<=" : for(int elem : tab){
                if(elem <= val){
                    vals[count] = elem ;
                    count++ ;
                }
            }
                break ;
            case "!=" : for(int elem : tab){
                if(elem != val){
                    vals[count] = elem ;
                    count++ ;
                }
            }
                break ;
        }
        return Arrays.copyOf(vals , count);
    }
}