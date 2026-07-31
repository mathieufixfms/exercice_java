public class Eleve {
     String nom;
    String prenom;
    double[] notes;

    public Eleve(String nom, String prenom, double[] notes) {
        this.nom = nom;
        this.prenom = prenom;
        this.notes = notes;
    }

    public double moyenne() {
        return Note.moyenne(notes);
    }

    public void afficher() {

        System.out.println();
        System.out.println(nom + " " + prenom);

        System.out.print("Notes : ");

        for (double note : notes) {
            System.out.print(note + " ");
        }

        System.out.println();
        System.out.println("Moyenne : " + moyenne());
    }
}
