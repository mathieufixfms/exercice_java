public class Pyramide {
     public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("===PYRAMIDE===\n");
        int hauteur = 7;

        for (int i = 1; i <= hauteur; i++) {

            // Espaces
            for (int j = i; j < hauteur; j++) {
                System.out.print(" ");
            }

            // Etoiles
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
         System.out.println();
    }
}