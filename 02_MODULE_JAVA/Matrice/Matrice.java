import java.util.Scanner ;
public class Matrice{
    public int columns ;
    public int rows ;
    public int[][] matrice ;
    public Matrice(int columns , int rows){
        this.columns = columns ;
        this.rows = rows ;
        this.matrice = new int[rows][columns] ;
    }

    public int[][] remplire(){
        Scanner nb = new Scanner(System.in) ;
        for(int i = 0 ; i < rows ; i++){
            for(int j= 0 ; j < columns ; j++){
                System.out.println("Donner l'element [" + i + "][" + j +"]");
                int element = nb.nextInt() ;
                matrice[i][j] = element ;
            }
        }
        return matrice ;
    }
    public void afficher(){
        for(int i = 0 ; i < rows ; i++){
            for(int j= 0 ; j < columns ; j++){
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    public int getElement(int ligne , int col){
        if(matrice[ligne][col] >= 0){
            return matrice[ligne][col] ;
        }else{
            return -1 ;
        }
    }
    public void setEelement(int ligne , int col , int val){
        matrice[ligne][col] = val ;
    }

    public int[][] findIndiceElements(int elem){
        int[][] indices = new int[this.columns * this.rows][2];
        int place = 0 ;
        for(int i = 0 ; i < rows ; i++){
            for(int j= 0 ; j < columns ; j++){
                if(matrice[i][j] == elem){
                    indices[place][0] = i;
                    indices[place][1] = i;
                }
            }
        }
        return indices ;
    }

    public int[] pairVal(){
        int[] paires = new int[rows*columns] ;
        int compt = 0 ;
        for(int i = 0 ; i <rows ; i++){
            for(int j = 0 ; j< columns ; j++){
                if(matrice[i][j] % 2 == 0){
                    paires[compt] = matrice[i][j] ;
                    compt ++ ;
                }
            }
        }
        return paires ;
    }
}