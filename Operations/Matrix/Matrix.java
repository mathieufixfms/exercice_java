public class Matrix {

    public static void main(String[] args) {

        // Matrice 1
        int[][] firstMatrix = {
                {5, 2, 4},
                {0, 1, 1},
                {6, 3, 1}
        };

        // Matrice 2
        int[][] secondMatrix = {
                {1, 1, 3},
                {2, 5, 6},
                {3, 0, 5}
        };

        // Matrice 3
        int[][] thirdMatrix = {
                {8, 7},
                {5, 4},
                {2, 1}
        };

        // Matrice 4
        int[][] fourthMatrix = {
                {0, 2},
                {1, 2},
                {1, 1}
        };

        System.out.println("firstMatrix :");
        afficher(firstMatrix);

        System.out.println("\nsecondMatrix :");
        afficher(secondMatrix);

        System.out.println("\nthirdMatrix :");
        afficher(thirdMatrix);

        System.out.println("\nfourthMatrix :");
        afficher(fourthMatrix);

        // M1 + M2
        System.out.println("\naddMatrix : firstMatrix + secondMatrix :");
        afficher(additionner(firstMatrix, secondMatrix));

        // M1 + M3
        System.out.println("\naddMatrix : fristMatrix + thirdMatrix :");
        afficher(additionner(firstMatrix, thirdMatrix));

        // M3 - M4
        System.out.println("\nsubMatrix : thirdMatrix - fourthMatrix :");
        afficher(soustraire(thirdMatrix, fourthMatrix));

        // M4 x 2
        System.out.println("\nmulScalMatrix : fourthMatrix x 2 :");
        afficher(multiplier(fourthMatrix, 2));
    }

    // Addition
    public static int[][] additionner(int[][] A, int[][] B) {

        if (A.length != B.length || A[0].length != B[0].length) {
            System.out.println("pour les additionner, les matrices doivent avoir le même nb de col/ligne");
            return null;
        }

        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    // Soustraction
    public static int[][] soustraire(int[][] A, int[][] B) {

        if (A.length != B.length || A[0].length != B[0].length) {
            System.out.println("Erreur : dimensions incompatibles.");
            return null;
        }

        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        return C;
    }

    // Multiplication par un scalaire
    public static int[][] multiplier(int[][] A, int scalaire) {

        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] * scalaire;
            }
        }

        return C;
    }

    // Affichage
    public static void afficher(int[][] matrice) {

        if (matrice == null)
            return;

        for (int i = 0; i < matrice.length; i++) {
            System.out.print("");

            for (int j = 0; j < matrice[i].length; j++) {
             System.out.print(matrice[i][j] + "\t");
            }

            System.out.println(" ");
        }
    }
}