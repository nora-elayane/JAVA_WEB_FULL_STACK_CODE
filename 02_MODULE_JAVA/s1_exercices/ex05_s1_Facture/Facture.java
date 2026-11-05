package ex05_s1_Facture;

public class Facture {
    public static void main (String[] args){
        String nomClient = "Nora";
        int prixOrdinateur = 6500;
        int prixSouris = 150;
        int quantiteSouris = 2;
        double tauxTVA = 0.20;
        double remise = 0.10;
        double totalHt = (prixOrdinateur + (prixSouris * quantiteSouris)) ;
        double remiseVal = (totalHt  * remise) ;
        double tvaVal = ( totalHt * tauxTVA) ;


        System.out.println("===================================================");
        System.out.println("FACTURE CLIENT");
        System.out.println("===================================================");
        System.out.println("Client : " + nomClient) ;
        System.out.println("Ordinateur : " + prixOrdinateur + "DH");
        System.out.println("Souris : " + quantiteSouris +  " * " + prixSouris + "DH" );
        System.out.println("---------------------------------------------------");
        System.out.println("Total HT : " + totalHt);
        System.out.println("Remise : " + remiseVal );
        System.out.println("TVA : " +  tvaVal );


        System.out.println("---------------------------------------------------");
        System.out.println("Total TTC : " +  (totalHt - remiseVal + tvaVal));

        System.out.println("===================================================");

    }
}
