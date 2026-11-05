public class Filter {
    int x = 5 ;

    public Filter(int x) {
        this.x = x;
    }

    void main(){
        int[] notes = {19 , 20 , 18 , 17, 16 , 8 , 11 , 14 } ;
        String[] noms = {"Nora" , "Adam" , "ziad" , "maryam"} ;
        System.out.println(x);

        int[] filtrednotes = new int[notes.length] ;
        String[] filtrednames = new String[noms.length] ;
        int placenum = 0 ;
        int placestr = 0 ;


        for( int i = 0 ; i < notes.length ; i++){
            if( notes[i] > 10 ){
                filtrednotes[placenum] = notes[i] ;
                placenum++ ;

            }
        }
        for(int current : filtrednotes){
            if(current != 0 ){
            System.out.println(current);
            }
        }

        for(int i = 0 ; i < noms.length ; i++){
            if(noms[i].contains("am")){
                filtrednames[placestr] = noms[i] ;
                placestr ++ ;
            }
        }

        for(String current : filtrednames){
            if(current != null){
                System.out.println(current);
            }
        }


    }
}