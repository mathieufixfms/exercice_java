import java.util.Scanner;

public class Bulletin_4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de notes ? ");
        int nb = sc.nextInt();

        double[] notes = new double[nb];

        for (int i = 0; i < nb; i++) {
            System.out.print("Note " + (i + 1) + " : ");
            notes[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Note minimum : " + Note.minimum(notes));
        System.out.println("Note maximum : " + Note.maximum(notes));
        System.out.println("Moyenne : " + Note.moyenne(notes));

        sc.close();
    }
}
