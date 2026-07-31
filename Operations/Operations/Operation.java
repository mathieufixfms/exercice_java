public class Operation {
    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Soustraction
    public static double sub(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double mul(double a, double b) {
        return a * b;
    }

    // Division
    public static double div(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Impossible de diviser par zéro !");
        }

        return a / b;
    }
     public static void main(String[] args) {

        System.out.println("Addition : " + Operation.add(5, 2));
        System.out.println("Soustraction : " + Operation.sub(5, 2));
        System.out.println("Multiplication : " + Operation.mul(5, 2));

        try {
            System.out.println("Division : " + Operation.div(10, 2));
            System.out.println("Division : " + Operation.div(3, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
