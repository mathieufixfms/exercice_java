public class Note {

    public static double moyenne(double[] notes) {
        double somme = 0;

        for (double note : notes) {
            somme += note;
        }

        return somme / notes.length;
    }

    public static double minimum(double[] notes) {
        double min = notes[0];

        for (double note : notes) {
            if (note < min) {
                min = note;
            }
        }

        return min;
    }

    public static double maximum(double[] notes) {
        double max = notes[0];

        for (double note : notes) {
            if (note > max) {
                max = note;
            }
        }

        return max;
    }
}
