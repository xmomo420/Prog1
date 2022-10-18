
/**
 * Exemples d'utilisation de la classe Date.
 * @author melanie lord
 * @version automne 2015
 */
public class TestDate {

    public static void main (String [] args) {
        Date d1 = null;

        //d1 = new Date(2000, 12, 7); //ne compile pas

        try {
            d1 = new Date(2013, 4, 12);
            System.out.println(d1);
        } catch (DateInvalideException die) {
            System.out.println(die.getMessage());
        }

        System.out.println("--------------------------------------");

        try {
            d1 = new Date(2013, 4, 32);
            System.out.println(d1);
        } catch (DateInvalideException die) {
            System.out.println(die.getMessage()); //le message donne a la creation
            //de l'objet DateInvalideException

            System.out.println(d1);  //d1 n'a pas ete modifie, elle est encore 2013, 3, 12
        }

        System.out.println("--------------------------------------");

        try {
            d1.setAnnee(1800);  //annee invalide
            System.out.println(d1);
        } catch (DateInvalideException die) {
            System.out.println(die.getMessage()); //le message donne a la creation
            //de l'objet DateInvalideException
        }

        System.out.println("--------------------------------------");

        try {
            d1.setMois(0);  //mois invalide
            System.out.println(d1);
        } catch (DateInvalideException die) {
            System.out.println(die.getMessage()); //le message donne a la creation
            //de l'objet DateInvalideException
        }

        System.out.println("--------------------------------------");

        try {
            d1.setJour(31);  //jour invalide pour le mois d'avril (4)
            System.out.println(d1);
        } catch (DateInvalideException die) {
            System.out.println(die.getMessage()); //le message donne a la creation
            //de l'objet DateInvalideException
        }

        System.out.println("--------------------------------------");

        try {
            d1.setMois(2);
            System.out.println(d1);
        } catch (DateInvalideException die) {
            System.out.println(die.getMessage()); //le message donne a la creation
            //de l'objet DateInvalideException
        }

        System.out.println("--------------------------------------");

        try {
            d1.setAnnee(2004);
            System.out.println(d1);
        } catch (DateInvalideException die) {
            System.out.println(die.getMessage()); //le message donne a la creation
            //de l'objet DateInvalideException
        }

        System.out.println("--------------------------------------");

        try {
            d1.setJour(29);
            System.out.println(d1);
        } catch (DateInvalideException die) {
            System.out.println(die.getMessage()); //le message donne a la creation
            //de l'objet DateInvalideException
        }

        System.out.println("--------------------------------------");

        try {
            d1.setAnnee(2003);
            System.out.println(d1);
        } catch (DateInvalideException die) {
            System.out.println(die.getMessage()); //le message donne a la creation
            //de l'objet DateInvalideException
        }
    }

}
