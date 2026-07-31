import java.util.Arrays;
import java.util.Scanner;

public class Bulletin_V_2 {

    // Calcul de la moyenne
    public static double moyenne(double[] notes) {
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }

    // Note minimum
    public static double minimum(double[] notes) {
        double min = notes[0];
        for (double note : notes) {
            if (note < min) {
                min = note;
            }
        }
        return min;
    }

    // Note maximum
    public static double maximum(double[] notes) {
        double max = notes[0];
        for (double note : notes) {
            if (note > max) {
                max = note;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===============================
        // 4.2 Saisie des élèves
        // ===============================

        System.out.print("Nombre d'élèves : ");
        int nbEleves = sc.nextInt();
        sc.nextLine();

        String[] noms = new String[nbEleves];
        String[] prenoms = new String[nbEleves];
        double[][] notes = new double[nbEleves][];

        for (int i = 0; i < nbEleves; i++) {

            System.out.println("\n===== Élève " + (i + 1) + " =====");

            System.out.print("Nom : ");
            noms[i] = sc.nextLine();

            System.out.print("Prénom : ");
            prenoms[i] = sc.nextLine();

            System.out.print("Nombre de notes : ");
            int nbNotes = sc.nextInt();

            notes[i] = new double[nbNotes];

            for (int j = 0; j < nbNotes; j++) {
                System.out.print("Note " + (j + 1) + " : ");
                notes[i][j] = sc.nextDouble();
            }

            sc.nextLine();
        }

        // ===============================
        // 4.1 Affichage min, max, moyenne
        // ===============================

        System.out.println("\n===== RÉSULTATS =====");

        for (int i = 0; i < nbEleves; i++) {

            System.out.println("\n" + noms[i] + " " + prenoms[i]);

            System.out.print("Notes : ");
            for (double note : notes[i]) {
                System.out.print(note + " ");
            }

            System.out.println("\nMinimum : " + minimum(notes[i]));
            System.out.println("Maximum : " + maximum(notes[i]));
            System.out.println("Moyenne : " + moyenne(notes[i]));
        }

        // ===============================
        // 4.3 Recherche d'un élève
        // ===============================

        System.out.println("\n===== RECHERCHE =====");

        System.out.print("Nom recherché : ");
        String nomRecherche = sc.nextLine();

        System.out.print("Prénom recherché : ");
        String prenomRecherche = sc.nextLine();

        boolean trouve = false;

        for (int i = 0; i < nbEleves; i++) {

            if (noms[i].equalsIgnoreCase(nomRecherche)
                    && prenoms[i].equalsIgnoreCase(prenomRecherche)) {

                trouve = true;

                System.out.println("\nÉlève trouvé.");

                System.out.print("Notes : ");
                for (double note : notes[i]) {
                    System.out.print(note + " ");
                }

                System.out.println("\nMoyenne : " + moyenne(notes[i]));
            }
        }

        if (!trouve) {
            System.out.println("Élève introuvable.");
        }

        // ===============================
        // 4.4 Tri des prénoms
        // ===============================

        String[] copiePrenoms = prenoms.clone();

        Arrays.sort(copiePrenoms);

        System.out.println("\n===== PRÉNOMS TRIÉS =====");

        System.out.println("\nOrdre croissant :");
        for (String p : copiePrenoms) {
            System.out.println(p);
        }

        System.out.println("\nOrdre décroissant :");
        for (int i = copiePrenoms.length - 1; i >= 0; i--) {
            System.out.println(copiePrenoms[i]);
        }

        sc.close();
    }
}