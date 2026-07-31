import java.util.Arrays;
import java.util.Scanner;

public class Bulletin_4_4 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de prénoms : ");
        int nb = sc.nextInt();
        sc.nextLine();

        String[] prenoms = new String[nb];

        for (int i = 0; i < nb; i++) {

            System.out.print("Prénom " + (i + 1) + " : ");
            prenoms[i] = sc.nextLine();
        }

        Arrays.sort(prenoms);

        System.out.println();
        System.out.println("Ordre croissant :");

        for (String p : prenoms) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Ordre décroissant :");

        for (int i = prenoms.length - 1; i >= 0; i--) {
            System.out.println(prenoms[i]);
        }

        sc.close();
    }
}
