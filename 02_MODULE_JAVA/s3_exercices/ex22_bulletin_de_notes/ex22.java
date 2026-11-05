public class ex22 {
    public static void main(String[] args){
        String[] noms = {"Sara", "Omar", "Lina", "Adam", "Hajar"} ;
        double[] notes = {14.5, 9, 16.25, 11, 12.75} ;
        double somme = 0 ;
        double moyenne ;
        int count = 0 ;
        double max = notes[0] ; 
        String  major = " ";
        String mentions ;
        for(int i = 0 ; i < noms.length ; i++){
            if(notes[i] >= 16){
                mentions = "Tres bien" ;
            }else if(notes[i] >= 14){
                mentions = "Bien" ;
            }else if(notes[i] >= 12){
                mentions = "Assez bien" ;
            }else if(notes[i] >= 10){
                mentions = "Passable" ;
            }else{
                mentions = "Insuffisant" ;
            }
            if(notes[i] > max){
                max = notes[i] ; 
                major = noms[i]  ; 
            }
            somme += notes[i]  ;
            System.out.println(noms[i] + "\t\t\t\t\t" + notes[i] + "\t\t\t" + mentions);


        }
        moyenne = somme / notes.length ;
        System.out.println( "Moyenne : " + moyenne);
        for(double item : notes){
            if(item > moyenne){
                count++ ;
            }
        }
        System.out.println("Au-dessus de la moyenne : " + count);
        System.out.println("Major : " + major);
    }
}