import java.util.Scanner;

/**
 * Hello
 */
public class hello {

    public static void main(String[]args){

        System.out.println("Bonjour et bienvenu dans mon programme java ! \n");
        System.out.println("quel est votre prénom ? :\n");
        Scanner scan = new Scanner(System.in);
        String prenom = scan.next();
        System.out.println("salut "+prenom);
        System.out.println("quel est votre nom ? :\n");
        Scanner scanNom = new Scanner(System.in);
        String nom = scanNom.next();
        System.out.println("salut "+nom+" "+prenom);
    }
    

}