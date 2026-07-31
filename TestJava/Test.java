import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        System.out.println("donnez un chiffre entier :\n");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.next();
        try {
        int nombre_recu = Integer.parseInt(nombre);
        if (nombre_recu > 0) {
                    System.out.println(nombre_recu + " est positif");
                } else if (nombre_recu < 0) {
                    System.out.println(nombre_recu + " est négatif");
                } else {
                    System.out.println(nombre_recu + "  est zéro");
                }
        
                if (nombre_recu %2 == 0){
                    System.out.println(nombre_recu + " est pair");
                }
                else{
                    System.out.println(nombre_recu + " est impair");
                }
            
        } catch (NumberFormatException e) {
                   System.out.println("Erreur, donnez un chiffre entier :\n");
           
        } 
                
    }
           
}
        
    
