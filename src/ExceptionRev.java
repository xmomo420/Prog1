public class ExceptionRev {

    public static int validerEntierAvecWhile(int min, int max) {
        int entier = min - 1;
        while (entier < min || entier > max) {
            try {
                System.out.print("Entrez un nombre entier : ");
                entier = Clavier.lireInt();
                if (entier < min || entier > max) {
                    System.out.println("Erreur, le nombre doit etre entre "
                            + min + " et " + max + "... recommencez!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur, la valeur doit etre un nombre "
                        + "entier... recommencez!");
            }
        }
        return entier;
    }

    public static int validerEntier(int min, int max) throws Exception {
        int entier = min - 1;
        if (min > max) {
            throw new Exception("Parametres invalides !");
        }
        do {
            try {
                System.out.print("Entrez un nombre entier : ");
                entier = Clavier.lireInt();
                if (entier < min || entier > max) {
                    System.out.println("Erreur, le nombre doit etre entre "
                            + min + " et " + max + "... recommencez!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur, la valeur doit etre un nombre "
                        + "entier... recommencez!");
            }
        } while (entier < min || entier > max);
        return entier;
    }


}



