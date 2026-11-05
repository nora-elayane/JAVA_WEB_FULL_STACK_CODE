public class Find{
   void main(){
       //find
        int[] notes = {19 , 20 , 18 , 17, 16 , 8 , 11 , 14 } ;
        String[] noms = {"Nora" , "Adam" , "ziad" , "maryam"} ;

        int num = 10 ;
        String nom = "ziad" ;
        for(int i = 0 ; i < notes.length ; i++){
            if(num == notes[i]){
                System.out.println("l'indice de l'element " + num + " est : " + i  ) ;
                break ;
            }

            if(i == (notes.length - 1)){
                System.out.println(-1);
            }
            }

        for(int i = 0 ; i < noms.length ; i++){
            if(nom == noms[i]){
                System.out.println("lindice de l'element " + nom + " est " + i);
                break ;
            }
            if(i == (noms.length - 1)){
                System.out.println(-1);
            }
        }
        }






    }
