import java.util.Arrays;
import java.util.Scanner ;
public class Main{
    public void main(){
        Matrice mat = null ;
        int ligne ;
        int cols ;
        boolean rempli = false ;
        Scanner input = new Scanner(System.in) ;
        boolean stay = true ;
        while(stay){
            System.out.println("_______________________________");
            System.out.println("Creation Matrice  :");
            System.out.println("_______________________________");
            System.out.println("1-Creer matrice\n2-remplire la matrice créé\n3-Afficher la matrice\n4-afficher un élément\n5-Modifier un element\n6-rechercher les indices d'un element\n7-returner les valeurs pairs de la matrice\n8-quitter");
            System.out.println("Choisire une Operation : ");
            int choix = input.nextInt() ;
            switch(choix){
                case 1 :
                    System.out.println("Donner le nombre de lignes : ");
                    ligne = input.nextInt() ;
                    System.out.println("Donner le nombre de colummns : ");
                    cols = input.nextInt() ;
                    mat = new Matrice(ligne , cols) ;
                    rempli = true ;
                    System.out.println("Matrice vide créé ! ");

                    break ;
                case 2 : if(rempli){
                        mat.remplire() ;
                        System.out.println("la matrice est remplit !");
                    }else{
                        System.out.println("veuiller premiéerement creer la matrice ! ");
                    }

                    break ;
                case 3 : mat.afficher();
                    break ;
                case 4 :
                    System.out.println("Donner le nombre de lignes : ");
                    ligne = input.nextInt() ;
                    System.out.println("Donner le nombre de colummns : ");
                    cols = input.nextInt() ;
                    System.out.println( mat.getElement(ligne , cols));
                    break;
                case 5 : System.out.println("Donner le nombre de lignes : ");
                    ligne = input.nextInt() ;
                    System.out.println("Donner le nombre de colummns : ");
                    cols = input.nextInt() ;
                    System.out.println("Donner la nouveau valeur : ");
                    int val = input.nextInt() ;
                    mat.setEelement(ligne , cols , val);
                    break ;
                case 6 :
                    System.out.println("Donner la valeur  recherché : ");
                     val = input.nextInt() ;
                     int[][] indices = mat.findIndiceElements(val) ;
                    System.out.println(Arrays.deepToString(indices));
                    break ;
                case 7 : if(rempli){
                    int[] paires = mat.pairVal() ;
                    for(int i = 0 ; i < paires.length ; i++){
                        System.out.print(paires[i] + "-");
                    }
                    System.out.println(" ");
                }else{
                    System.out.println("veuiller premiéerement creer la matrice ! ");
                }
                    break ;
                case 8:
                    stay = false ;
                    System.out.println("Au revoir ! ");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choix);
            }


        }


    }
}