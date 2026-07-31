import java.util.Scanner;

public class Bulletin_4_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre d'élèves : ");
        int nbEleves = sc.nextInt();
        sc.nextLine();

        Eleve[] classe = new Eleve[nbEleves];

        for (int i = 0; i < nbEleves; i++) {

            System.out.println();
            System.out.println("Élève " + (i + 1));

            System.out.print("Nom : ");
            String nom = sc.nextLine();

            System.out.print("Prénom : ");
            String prenom = sc.nextLine();

            System.out.print("Nombre de notes : ");
            int nbNotes = sc.nextInt();

            double[] notes = new double[nbNotes];

            for (int j = 0; j < nbNotes; j++) {

                System.out.print("Note " + (j + 1) + " : ");
                notes[j] = sc.nextDouble();
            }

            sc.nextLine();

            classe[i] = new Eleve(nom, prenom, notes);
        }

        System.out.println();
        System.out.print("Nom recherché : ");
        String nom = sc.nextLine();

        System.out.print("Prénom recherché : ");
        String prenom = sc.nextLine();

        boolean trouve = false;

        for (Eleve e : classe) {

            if (e.nom.equalsIgnoreCase(nom)
                    && e.prenom.equalsIgnoreCase(prenom)) {

                trouve = true;

                System.out.println();
                System.out.println("Élève trouvé !");
                e.afficher();
            }
        }

        if (!trouve) {
            System.out.println();
            System.out.println("Élève introuvable.");
        }

        sc.close();
    }
}
