package TP_1;

import java.util.Random;
import java.util.Scanner;

public class ChiffreMystere {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.print("Bonjour souhaitez-vous jouer à mon jeu ? (o/n) : ");
            if (!scanner.next().equalsIgnoreCase("o")) {
                break;
            }

            int nombreMystere = random.nextInt(100) + 1;
            int proposition;
            int coups = 0;

            do {
                System.out.print("Saisissez une valeur entre 1 et 100 : ");
                proposition = scanner.nextInt();
                coups++;

                if (proposition < nombreMystere)
                    System.out.println("Saisissez une valeur plus grande !");
                else if (proposition > nombreMystere)
                    System.out.println("Saisissez une valeur plus petite !");

            } while (proposition != nombreMystere);

            System.out.println("Bravo ! Vous avez trouvé en " + coups + " coup(s).\n");
        }

        System.out.println("Merci d'avoir joué !");
        scanner.close();
    }

}
