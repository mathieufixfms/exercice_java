import java.util.Scanner;

public class Factorielle {

    // Méthode récursive
    public static long fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
        } else {
            System.out.println(n + "! = " + fact(n));
        }

        scanner.close();
    }
}