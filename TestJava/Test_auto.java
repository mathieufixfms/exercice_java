public class Test_auto {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Aucun argument fourni.");
            return;
        }

        for (int i = 0; i < args.length; i++) {

            try {

                int nombre = Integer.parseInt(args[i]);

                System.out.println("----------------------");
                System.out.println("Nombre : " + nombre);

                if (nombre > 0) {
                    System.out.println("Positif");
                } else if (nombre < 0) {
                    System.out.println("Négatif");
                } else {
                    System.out.println("Zéro");
                }

                if (nombre % 2 == 0) {
                    System.out.println("Pair");
                } else {
                    System.out.println("Impair");
                }

            } catch (NumberFormatException e) {

                System.out.println("----------------------");
                System.out.println(args[i] + " n'est pas un entier valide.");

            }
        }
    }
}