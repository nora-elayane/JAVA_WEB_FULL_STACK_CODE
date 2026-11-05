public class ex08 {
    public static void main(String[] args){
        final double TVA = 0.2 ;
        int quantite = 4 ;
        double prixUnitaire = 32.5 ;
        double totalHT = prixUnitaire * quantite ;
        double tvaV = totalHT * TVA ;
        double totalTTC = totalHT + tvaV ;
        totalTTC += 15 ;
        System.out.println("Total HT : " + totalHT + "\n TVA : " + tvaV + " \n Livraison : 15.0 \n Total a payer : " + totalTTC);
    }
}