public class ex24 {
    public static void main(){
        final int MIN = 8 ;
        String res ;
        String[] mots = {"abc", "motdepasse", "MotDePasse", "Java2026ok"} ;
        for(String item : mots){
            boolean miniscule = false ;
            boolean majuscule = false ;
            boolean chiffre = false ;
            boolean longueure = false ;
            if(item.length() > MIN){
                longueure = true ;
            }else{
                longueure = false ;
            }
            char[] elems = item.toCharArray() ;
                for(char current : elems){
                    if(current >= '0' && current <= '9'){
                        chiffre = true ;
                    }
                    if(current >= 'a' && current <= 'z'){
                        miniscule = true ;
                    }
                    if(current >= 'A' && current <= 'Z'){
                        majuscule = true ;
                    }
                }
                if(majuscule && miniscule && longueure && chiffre){
                    res = "valide" ;
                }else {
                    res = "refuse" ;
                }
            System.out.println(item + "  -> " + res + "[longueur = " + longueure +" , chiffre = "+chiffre + ", majuscule = " + majuscule +" , miniscule = " + miniscule +"]");

        }
    }
}