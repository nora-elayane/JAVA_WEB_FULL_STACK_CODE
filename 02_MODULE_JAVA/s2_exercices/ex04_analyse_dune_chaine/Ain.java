import java.util.Locale;

public class Ain {
    public static void main(String[] args){
       String chaine = "Java Module M203 " ;
        System.out.println("Version sans espace extérieurs : " + chaine.trim());
        System.out.println("lalonguere du chaine " + chaine + " est : " + chaine.length());
        System.out.println("la version majiscule : " + chaine.toUpperCase());
        System.out.println("le premier caractére est : " + chaine.charAt(0));
        System.out.println("la position de module est : " + chaine.indexOf("Module"));
        String[] ch = chaine.split(" ") ;
        System.out.println("le nombre de mots est : " + ch.length);
        for(String current : ch){
            System.out.println(current);
        }

        if(chaine.equalsIgnoreCase("java module m203 ")){
            System.out.println("they are equal");
        }else{
            System.out.println("they are not equal");
        }
    }
}