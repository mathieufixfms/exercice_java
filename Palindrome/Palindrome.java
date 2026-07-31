import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ==========================
        // 5.1 Concaténation de String
        // ==========================
        System.out.println("===== Exercice 5.1 =====");

        String s1 = "Bonjour";
        String s2 = " tout le monde";

        // Méthode 1
        String concat1 = s1 + s2;

        // Méthode 2
        String concat2 = s1.concat(s2);

        // Méthode 3
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        String concat3 = sb.toString();

        System.out.println("Avec + : " + concat1);
        System.out.println("Avec concat() : " + concat2);
        System.out.println("Avec StringBuilder : " + concat3);

        // ==========================
        // 5.2 Recherche d'un mot
        // ==========================
        System.out.println("\n===== Exercice 5.2 =====");

        String phrase = "il fait beau aujourd'hui";

        System.out.println("Phrase : " + phrase);
        System.out.print("Mot à rechercher : ");
        String mot = sc.nextLine();

        if (phrase.toLowerCase().contains(mot.toLowerCase())) {
            System.out.println("Trouvé !");
        } else {
            System.out.println("Non trouvé.");
        }

        // ==========================
        // 5.3 Remplacement du mot
        // ==========================
        System.out.println("\n===== Exercice 5.3 =====");

        if (phrase.toLowerCase().contains(mot.toLowerCase())) {

            System.out.print("Nouveau mot : ");
            String nouveauMot = sc.nextLine();

            String nouvellePhrase = phrase.replaceAll("(?i)" + mot, nouveauMot);

            System.out.println("Nouvelle phrase :");
            System.out.println(nouvellePhrase);

        } else {
            System.out.println("Le mot n'existe pas dans la phrase.");
        }

        // ==========================
        // 5.4 Palindrome simple
        // ==========================
        System.out.println("\n===== Exercice 5.4 =====");

        System.out.print("Entrez une chaîne : ");
        String texte = sc.nextLine();

        String inverse = "";

        for (int i = texte.length() - 1; i >= 0; i--) {
            inverse += texte.charAt(i);
        }

        if (texte.equalsIgnoreCase(inverse)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }

        // ==========================
        // 5.5 Palindrome avec espaces
        // ==========================
        System.out.println("\n===== Exercice 5.5 =====");

        String phrasePalindrome = "Elu par cette crapule";

        // Suppression des espaces, accents éventuels et mise en minuscules
        String nettoyee = phrasePalindrome
                .replaceAll("[^a-zA-Z]", "")
                .toLowerCase();

        String inverse2 = "";

        for (int i = nettoyee.length() - 1; i >= 0; i--) {
            inverse2 += nettoyee.charAt(i);
        }

        System.out.println("Phrase : " + phrasePalindrome);

        if (nettoyee.equals(inverse2)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }

        sc.close();
    }
}