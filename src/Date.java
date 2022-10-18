/**
 * Cette classe represente une date formee d'une annee (entre ANNEE_MIN et
 * ANNEE_MAX inclus.), d'un mois, et d'un jour.
 *
 * @author Melanie Lord
 * @version automne 2015
 */
public class Date {

    //CONSTANTES DE CLASSE

    public static final int ANNEE_MIN = 1900; //annee min valide
    public static final int ANNEE_MAX = 2015; //annee max valide
    public static final int MOIS_MIN = 1;     //mois min valide
    public static final int MOIS_MAX = 12;    //mois max valide
    public static final int JOUR_MIN = 1;     //jour min valide
    public static final int JOUR_MAX = 31;    //jour max valide

    //ATTRIBUTS (VARIABLES D'INSTANCE)

    private int annee = 2000;  //l'annee de cette date
    private int mois = 1;      //le mois de cette date
    private int jour = 1;      //le jour de cette date

    //CONSTRUCTEURS

    /**
     * Constructeur sans argument qui ne fait rien.
     */
    public Date() {
        //vide
    }

    /**
     * Constructeur qui initialise l'annee, le mois et le jour de cette date.
     *
     * @param annee l'annee de cette date.
     * @param mois le mois de cette date.
     * @param jour le jour de cette date.
     * @throws DateInvalideException si la date formee par l'annee, le mois
     *         et le jour donnee est invalide.
     */
    public Date (int annee, int mois, int jour) throws DateInvalideException {
        if (estDateValide(annee, mois, jour)) {
            this.annee = annee;
            this.mois = mois;
            this.jour = jour;

        } else {
            throw new DateInvalideException("Erreur... Tentative de construction "
                    + "d'une date invalide !");
        }
    }

    //GETTERS

    /**
     * Methode qui permet d'obtenir la valeur de l'attribut annee.
     * @return l'annee de cette date.
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * Methode qui permet d'obtenir la valeur de l'attribut mois.
     * @return le mois de cette date.
     */
    public int getMois() {
        return mois;
    }

    /**
     * Methode qui permet d'obtenir la valeur de l'attribut jour.
     * @return le jour de cette date.
     */
    public int getJour() {
        return jour;
    }

    //SETTERS

    /**
     * Cette methode permet de modifier la valeur de l'attribut annee.
     * @param annee la nouvelle valeur pour l'annee.
     * @throws DateInvalideException si l'annee donnee est plus petite que
     *         ANNEE_MIN ou plus grande que ANNEE_MAX.
     */
    public void setAnnee(int annee) throws DateInvalideException {
        if (estDateValide(annee, mois, jour)) {
            this.annee = annee;
        } else {
            throw new DateInvalideException
                    ("Erreur... Tentative de modification de l'annee "
                            + "qui rend la date invalide !");
        }
    }

    /**
     * Cette methode permet de modifier la valeur de l'attribut mois.
     * @param mois la nouvelle valeur pour le mois.
     * @throws DateInvalideException si la modification du mois a pour
     *         effet de rendre la date invalide.
     */
    public void setMois(int mois) throws DateInvalideException {
        if (estDateValide(annee, mois, jour)) {
            this.mois = mois;
        } else {
            throw new DateInvalideException
                    ("Erreur... Tentative de modification du mois "
                            + "qui rend la date invalide !");
        }
    }

    /**
     * Cette methode permet de modifier la valeur de l'attribut jour.
     * @param jour la nouvelle valeur pour le jour.
     * @throws DateInvalideException si la modification du jour a pour
     *         effet de rendre la date invalide.
     */
    public void setJour(int jour) throws DateInvalideException{
        if (estDateValide(annee, mois, jour)) {
            this.jour = jour;
        } else {
            throw new DateInvalideException
                    ("Erreur... Tentative de modification du jour "
                            + "qui rend la date invalide !");
        }
    }

    //AUTRES METHODES D'INSTANCE PUBLIQUES

    /**
     * Cette methode determine si l'annee de cette date est bissextile ou non.
     * @return true si l'annee est bissextile, false sinon.
     */
    public boolean estBissex() {
        return estBissex(annee);
    }



    /**
     * Cette methode retourne cette date sous forme de chaine de caracteres,
     * sous le format jj/mm/aaaa.
     *
     * @return une chaine de caracteres representant cette date.
     */
    public String toString() {
        String sJour = String.valueOf(jour);
        String sMois = String.valueOf(mois);

        if (jour > 0 && jour <= 9) {
            sJour = "0" + jour;
        }
        if (mois > 0 && mois <= 9) {
            sMois = "0" + mois;
        }
        return sJour + "/" + sMois + "/" + annee;
    }

    //METHODE D'INSTANCE PRIVEE

    /**
     * Cette methode determine si cette date est une date valide.
     * Une date valide est formee :
     *    - d'une annee entre ANNEE_MIN et ANNEE_MAX inclusivement.
     *    - d'un mois entre MOIS_MIN et MOIS_MAX
     *    - d'un jour entre JOUR_MIN et 28 ou 29 ou 30 ou JOUR_MAX selon le mois
     *      et selon que l'annee est bissextile ou non.
     *
     * @return true si cette date est valide, false sinon.
     */
    private boolean estDateValide(int annee, int mois, int jour) {
        return annee >= ANNEE_MIN && annee <= ANNEE_MAX
                && mois >= MOIS_MIN && mois <= MOIS_MAX
                && jourValide(jour, mois, annee);
    }

    /**
     * Determine si le jour de cette date est valide selon le mois de cette
     * date et selon que l'annee de cette date est bissextile ou non.
     * @return true si le jour de cette date est valide, false sinon.
     */
    private boolean jourValide(int jour, int mois, int annee) {
        boolean valide;

        if (jour < JOUR_MIN) {
            valide = false;

        } else {
            //mois de 31 jours
            if (mois == 1 || mois == 3 || mois == 5 || mois == 7
                    || mois == 8 || mois == 10 || mois == 12) {
                valide = jour <= JOUR_MAX;

                //mois de fevrier
            } else if (mois == 2) {
                valide = (estBissex(annee) && jour <= JOUR_MAX - 2) //29 jours
                        || (jour <= JOUR_MAX - 3);  //28 jours

                //mois de 30 jours
            } else {
                valide = jour <= JOUR_MAX - 1; //30 jours
            }
        }
        return valide;
    }

    /**
     * Cette methode determine si l'annee donne en parametre est bissextile ou non.
     * @return true si l'annee est bissextile, false sinon.
     */
    private boolean estBissex(int annee) {
        return (annee % 400 == 0)
                || (annee % 4 == 0 && annee % 100 != 0);
    }

}



