import java.util.Scanner;

public class Resto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] entrees = {"SALADE", "SOUPE", "QUICHE", "AUCUNE"};
        String[] plats = {"POULET", "BOEUF", "POISSON", "VEGETATIEN", "VEGAN", "AUCUN"};
        String[] accompagnements = {"RIZ", "PATES", "FRITES", "LEGUMES", "AUCUN"};
        String[] boissons = {"EAU PALTE", "EAU GAZEUSE", "SODA", "VIN", "AUCUNE"};
        String[] desserts = {"TARTE MAISON", "MOUSSE AU CHOCOLAT", "TIRAMISU", "AUCUNE"};

        System.out.println("\n|==== Bienvenu dans notre restaurant ====|\n");
        System.out.println("Bonjour, combien de menus souhaitez-vous ?");
        int nbMenus = sc.nextInt();

        for (int i = 1; i <= nbMenus; i++) {

            System.out.println("\n|= Commande numéro " + i+" =|\n");

            // Entrée
            System.out.println("Choix entrée :");
            System.out.println("[1 - SALADE] [2 - SOUPE] [3 - QUICHE] [4 - AUCUNE]\n");
            int entree = lireChoix(sc, 4);

            // Plat
            System.out.println("\nChoix plats :");
            System.out.println("[1 - POULET] [2 - BOEUF] [3 - POISSON] [4 - VÉGÉTARIEN] [5 - VEGAN] [6 - AUCUN]\n");
            int plat = lireChoix(sc, 6);

            // Accompagnement
            System.out.println("\nChoix accompagnements :");
            System.out.println("[1 - RIZ] [2 - PÂTES] [3 - FRITES] [4 - LÉGUMES] [5 - AUCUN]\n");
            int accompagnement = lireChoix(sc, 5);

            // Boisson
            System.out.println("\nChoix boissons :");
            System.out.println("[1 - EAU PLATE][2 - EAU GAZEUZE][3 - SODA] [4 - VIN] [ 5 - AUCUNE]\n");
            int boisson = lireChoix(sc, 5);

            // Dessert
            System.out.println("\nChoix desserts :");
            System.out.println("[1 - TARTE MAISON] [2 - MOUSSE AU CHOCOLAT] [3 - TIRAMISU] [4 - AUCUN]\n");
            int dessert = lireChoix(sc, 4);

            // Résumé
            System.out.println("\nRésumé de la commande " + i + " :");
            System.out.println(" " +
                    entrees[entree - 1].toLowerCase() + ", " +
                    plats[plat - 1].toLowerCase() + ", " +
                    accompagnements[accompagnement - 1].toLowerCase() + ", " +
                    boissons[boisson - 1].toLowerCase() + ", " +
                    desserts[dessert - 1].toLowerCase() + " ");
        }

        System.out.println("\nMerci pour votre commande !\n");
        sc.close();
    }

    public static int lireChoix(Scanner sc, int max) {

        int choix;

        do {
            System.out.print("Que souhaitez-vous ? [saisir le chiffre correspondant] : ");
            choix = sc.nextInt();

            if (choix < 1 || choix > max) {
                System.out.println("Choix invalide, recommencez.");
            }

        } while (choix < 1 || choix > max);

        return choix;
    }
}