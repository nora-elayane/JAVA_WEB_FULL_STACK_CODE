public class Reduce{
    void main(){
        int[] notes = {19 , 20 , 18 , 17, 16 , 8 , 11 , 14 } ;
        String[] noms = {"Nora" , "Adam" , "ziad" , "maryam"} ;

        int reduce = 0 ;

        for(int i = 0 ; i < notes.length ; i++){
            reduce += notes[i] ;
        }
        System.out.println(reduce);
    }
}