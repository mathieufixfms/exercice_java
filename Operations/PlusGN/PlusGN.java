import java.util.Scanner;

public class PlusGN {
      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[6];

        System.out.println("Saisissez 6 nombres :");

        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        int plusGrand = Integer.MIN_VALUE;
        int deuxiemePlusGrand = Integer.MIN_VALUE;

        for (int nombre : tableau) {
            if (nombre > plusGrand) {
                deuxiemePlusGrand = plusGrand;
                plusGrand = nombre;
            } else if (nombre > deuxiemePlusGrand) {
                deuxiemePlusGrand = nombre;
            }
        }

        System.out.println("\nLes nombres saisis sont :");
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }

        System.out.println("\n\nLe plus grand nombre est : " + plusGrand);
        System.out.println("Le deuxième plus grand nombre est : " + deuxiemePlusGrand);
        System.out.println("La somme des deux plus grands nombres est : " + (plusGrand + deuxiemePlusGrand));

        scanner.close();
    }
}