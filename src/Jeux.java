/**
 * Ce programme permet de jouer à des jeux. La méthode main de cette classe ne
 * plantera jamais suite à une entrée faite par l'utilisateur,
 * Toutes les autres méthodes ont été conçues pour qu'elles ne puissent pas
 * planter non plus peu importe les paramètres envoyés lorsqu'une méthode
 * est executée individuellement. Le seul moyen de faire planter le programme
 * est d'envoyer certains paramètres spécifiques lorsque les méthodes sont
 * appelées dans la méthode main. C'est pour cela qu'il faut utiliser les
 * constantes déclarées au niveau de la classe.
 * Nom de l'élève : Mohamed Bendourou
 * Code permanent : BENM23109703
 * Version : 2021-03-28
 * Cours : INF1120
 * Courriel : hg991909@ens.uqam.ca
 */

public class Jeux
{

    public static final String MSG_ERR_MOTIF = "\nERREUR, le motif doit être" +
            " compose de 3 chiffres distincts entre 1 et 9... Recommencez !";
    public static final String ENTETE_PICO = "\n*********************\n* PICO" +
            " FERMI BAGELS *\n*********************\n";
    public static final int LNG_CHOIX_MENU = 1;
    public static final int LNG_MOTIF = 3;
    public static final String TERMINER_MOTIF = "0";
    public static final char CHOIX_MIN = '1';
    public static final char CHOIX_MAX = '3';
    public static final String CHOIX3 = "3";
    public static final String CHOIX2 = "2";
    public static final String CHOIX1 = "1";
    public static final String MENU = "\n----\nMENU\n----\n1. PICO FERMI BAGELS"
            + "\n2. TIC TAC TOE\n3. QUITTER\n";
    public static final String MSG_ERR_MENU = "\nERREUR, entrez un chiffre " +
            "entre 1 et 3... Recommencez !";
    public static final String MSG_SOLL_MENU = "Entrez votre choix : ";
    public static final String MSG_PRE = "Ce logiciel permet de jouer à PICO " +
            "FERMI BAGELS et au TIC TAC TOE.";
    public static final String MSG_FIN = "\nAUREVOIR !\n\n\n";
    public static final String TITRE_TABLEAU = "\nNO ESSAI | MOTIF | " +
            "RESULTATS\n-------------------------------------\n";
    public static final String PICO = "PICO";
    public static final String FERMI = "FERMI";
    public static final String BAGELS = "BAGELS";
    public static final String MSG_ABANDON = "\nLe motif caché était ";
    public static final String MSG_RECOMMENCER = "Voulez-vous jouer encore " +
            "(oui ou non) : ";
    public static final String OUI = "oui";
    public static final String NON = "non";
    public static final String RÉUSSI_FERMI = "FERMI FERMI FERMI";
    public static final String MSG_ERR_RECOMMENCER = "\nERREUR, vous devez " +
            "répondre par oui ou par non... Recommencez !\n";
    public static final String TITRE_TICTACTOE = "\n***************\n* TIC " +
            "TAC TOE *\n***************\n\n";
    public static final String MSG_ERREUR_NOM = "\nERREUR, le nom doit " +
            "contenir entre 3 et 10 caractères... Recommencez !";
    public static final String MSG_ERREUR_CASE = "\nERREUR, numero de case " +
            "invalide... Recommencez !";
    public static final String MSG_PARTIE_NULLE = "\nPartie nulle, aucun " +
            "gagnant !\n";
    public static final String JEU_VIERGE_TICTACTOE = "\n 1 | 2 | 3 " +
            "\n-----------\n 4 | 5 | 6 \n-----------\n 7 | 8 | 9\n";
    public static final String MSG_SOLL_NOM_J1 = "Joueur 1, entrez votre " +
            "nom : ";
    public static final String MSG_SOLL_NOM_J2 = "Joueur 2, entrez votre " +
            "nom : ";
    public static final int LONGUEUR_MAX_NOM = 10;
    public static final int LONGUEUR_MIN_NOM = 3;
    public static final int POSITION_1_TICTACTOE = JEU_VIERGE_TICTACTOE.
            indexOf('1');
    public static final int POSITION_2_TICTACTOE = JEU_VIERGE_TICTACTOE.
            indexOf('2');
    public static final int POSITION_3_TICTACTOE = JEU_VIERGE_TICTACTOE.
            indexOf('3');
    public static final int POSITION_4_TICTACTOE = JEU_VIERGE_TICTACTOE.
            indexOf('4');
    public static final int POSITION_5_TICTACTOE = JEU_VIERGE_TICTACTOE.
            indexOf('5');
    public static final int POSITION_6_TICTACTOE = JEU_VIERGE_TICTACTOE.
            indexOf('6');
    public static final int POSITION_7_TICTACTOE = JEU_VIERGE_TICTACTOE.
            indexOf('7');
    public static final int POSITION_8_TICTACTOE = JEU_VIERGE_TICTACTOE.
            indexOf('8');
    public static final int POSITION_9_TICTACTOE = JEU_VIERGE_TICTACTOE.
            indexOf('9');
    public static final int LNG_CHOIX_CASE = 1;

    /**
     * Affiche le message de présentaion du programme.
     * Si le paramètre envoyé est null, aucune instruction sera executée.
     * @param msgPre la chaîne contenant le message à afficher.
     */
    public static void presenterLogiciel (String msgPre) {
        if (msgPre != null) {
            System.out.println(msgPre);
        }
    }

    /**
     Affiche le message de fin du programme.
     * Si le paramètre envoyé est null, aucune instruction sera executée.
     * @param msgFin la chaîne contenant le message à afficher.
     */
    public static void finLogiciel (String msgFin) {
        if (msgFin != null) {
            System.out.print(msgFin);
        }
    }

    /**
     Affiche le menu du programme.
     * Si le paramètre envoyé est null, aucune instruction sera executée.
     * @param msgMenu la chaîne contenant le message à afficher.
     */
    public static void affichageMenu (String msgMenu) {
        if (msgMenu != null) {
            System.out.println(msgMenu);
        }
    }

    /**
     * Saisi et valide un motif selon des critères :
     * Si les paramètres envoyés sont null ou que longueurMotif est
     * inférieur à 0,
     * aucune instruction sera executée et la méthode retourne null.
     * Doit être égale à la chaine terminer ou doit respecter les 3 autres
     * critères suivant :
     * Doit être composé uniquement de chiffre,
     * Doit avoir une longueur égale à longueurMotif,
     * et les tous les caractères doivent être différents.
     * @param  msgSoll la chaine qui contient le message qui demande à
     *                 l'utilisateur de rentrer un motif au clavier.
     * @param msgErr la chaine qui contient le message qui s'affiche lorsque
     *               la saisie de l'utilisateur n'est pas valide.
     * @param terminer la chaine que l'utilisateur entre lorsqu'il veut
     *                 abandonner.
     * @param longueurMotif nombre entier qui correspond à la longueur de
     *                     la chaîne que l'utilisateur doit entrer pour qu'elle
     *                     soit valide (sauf terminer)
     * @return le motif valide.
     */
    public static String validerMotif (String msgSoll, String msgErr, String
            terminer, int longueurMotif) {
        if (msgSollErrNonNull(msgSoll, msgErr) && longueurMotif >= 0 && terminer
                != null) {
            String motifValide;
            System.out.print(msgSoll);
            motifValide = Clavier.lireString();

            while (!motifValide.equals(terminer) && (!estDeLaBonneLongueur
                    (motifValide, longueurMotif, longueurMotif) ||
                    !tousLesCaractèresSontDifférents(motifValide) ||
                    !estComposéUniquementdeChiffre1à9(motifValide))) {
                System.out.print(msgErr);
                System.out.print(msgSoll);
                motifValide = Clavier.lireString();
            }

            return motifValide;

        } else {
            return null;
        }
    }

    /**
     * Si la chaine envoyé en paramètre est null, ou qu'elle est vide la méthode
     * retourne false.
     * Si aucun des caractères dans la chaîne est présent plus qu'une fois, la
     * méthode retourne true
     * sinon retourne false.
     * @param chaine est la chaine envoyée en paramètre.
     * @return true si tous les caractères sont différents, false sinon.
     */
    public static boolean tousLesCaractèresSontDifférents (String chaine) {
        if (chaine == null || chaine.isEmpty()) {
            return false;
        } else {
            int i = 0;
            int j = i + 1;
            boolean caractèresDiff = true;

            while (j < chaine.length() && i < chaine.length() && caractèresDiff
                    && i < j) {
                while (j < chaine.length() && caractèresDiff) {
                    if (chaine.charAt(i) != chaine.charAt(j)) {
                        caractèresDiff = true;
                    } else {
                        caractèresDiff = false;
                    }
                    j++;
                }
                i++;
                j = i + 1;
            }
            return caractèresDiff;
        }

    }

    /**
     * Retourne true si les bornes sont valides et ont du sens selon ces
     * critères :
     * les 2 bornes sont plus grandes ou égale à 0.
     * la borne supérieure est plus grande ou égale à la borne inférieure.
     * @param borneInf nombre entier correspondant à la borne inférieure.
     * @param borneSup nombre entier correspondant à la borne supérieure.
     * @return true si les bornes sont valides, false sinon.
     */
    public static boolean bornesValide (int borneInf, int borneSup) {
        if (borneInf <= borneSup && borneInf >= 0 && borneSup >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Vérifie si la chaine envoyée en paramètre est de la longueur souhaitée
     * selon les bornes envoyées en paramètre.
     * Si la chaine envoyée en paramètre est null ou si les bornes envoyées en
     * paramètre ne sont pas valides, la méthode retourne false.
     * @param chaine est la chaine envoyé en paramètre.
     * @param longueurMin nombre entier correspondant à la longueur minimale de
     *                   la chaine pour qu'elle soit valide.
     * @param longueurMax nombre entier correspondant à la longueur maximale de
     *                    la chaine pour qu'elle soit valide.
     * @return true si la longueur de la chaine envoyée en paramètre est entre
     * longueurMin et longueurMax
     * inclusivement, false sinon.
     */
    public static boolean estDeLaBonneLongueur (String chaine, int longueurMin,
                                                int longueurMax) {

        if (chaine != null && bornesValide(longueurMin, longueurMax)) {
            if (chaine.length() > longueurMax || chaine.length() < longueurMin)
            {
                return false;
            } else
                return true;
        } else {
            return false;
        }
    }

    /**
     * Affiche l'en-tête du jeu fermi-pico-bagels.
     * Si le paramètre envoyé est null, aucune instruction sera executée.
     * @param enTetePico la chaîne contenant le message à afficher.
     */
    public static void affichageEnTetePico (String enTetePico) {
        if (enTetePico == null) {
        } else {
            System.out.print(enTetePico);
        }
    }

    /**
     * *Affiche l'en-tête du jeu tic-tac-toe.
     * Si le paramètre envoyé est null, aucune instruction sera executée.
     * @param enTeteTic la chaîne contenant le message à afficher.
     */
    public static void affichageEnTeteTic (String enTeteTic) {
        if (enTeteTic == null) {
        } else {
            System.out.println(enTeteTic);
        }
    }

    /**
     * Saisi et valide un choix pour le menu selon des critères :
     * Si les paramètres envoyés sont null ou que longueurMotif est inférieur à
     * 0 ou que choixMin est plus grande que choixMax,
     * aucune instruction sera executé et la méthode retourne null.
     * Pour que la chaîne soit valide elle doit respecter les 2 autres critères
     * suivant :
     * Doit correspondre à un caractère entre choixMin et choixMax inclusivement
     * Doit avoir une longueur égale à longueurMotif,
     * @param  msgSoll le message qui demande à l'utilisateur de rentrer un
     *                 motif au clavier.
     * @param msgErr le message qui s'affiche lorsque la saisie de l'utilisateur
     *               n'est pas valide.
     * @param choixMin caractère qui correspond à la borne inférieure.
     * @param choixMax caractère qui correspond à la borne supérieure.
     * @return le choix valide pour le menu.
     */
    public static String choixMenu(String msgSoll, String msgErr, char choixMin,
                                   char choixMax, int longueurChoix) {
        if (msgSollErrNonNull(msgSoll, msgErr) && longueurChoix >= 0 && choixMin
                <= choixMax) {
            String choixValide;
            System.out.print(msgSoll);
            choixValide = Clavier.lireString();

            while (choixValide.length() != longueurChoix || (choixValide.charAt
                    (0) < choixMin || choixValide.charAt(0) > choixMax)) {
                System.out.println(msgErr);
                System.out.print(msgSoll);
                choixValide = Clavier.lireString();
            }
            return choixValide;

        } else {
            return null;
        }
    }

    /**
     * Retourne true si le caractère à la position donnée en paramètre dans la
     * chaine motifGénéré est égal au
     * caractère à la même position dans la chaine motifTentative.
     * Si la méthode nePlanteraPasFPG() retourne false, la méthode retourne
     * false et aucune autre instruction ne sera executée.
     * @param motifGénéré la chaine générée dans le jeu Fermi-Pico-Bagels
     * @param motifTentative la chaine valide que l'utilisateur a entrée au
     *                       clavier
     * @param position nombre entier qui correspond à l'indice pour lequel on
     *                 veut vérifier la méthode.
     * @return true si les 2 caractères sont égaux, false sinon.
     */
    public static boolean fermi (String motifGénéré, String motifTentative,
                                 int position) {
        if (nePlanteraPasFPG(motifGénéré, motifTentative, position)) {

            if (motifGénéré.charAt(position) == motifTentative.charAt(position))
            {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Retourne false si la valeur de position envoyée en paramètre est
     * inférieur à 0 ou si elle est supérieure à la longueur des chaines
     * motifGénéré ou motifTentative ou si une des 2 chaines est vide.
     * Si une des 2 chaines envoyées en paramètre sont null, la méthode retourne
     * false et aucune autre instructions sera executée.
     * @return true si les critères sont respectés, false, sinon.
     */
    public static boolean nestPasOutOfBoundsPosition (String motifGénéré,
                                                      String motifTentative,
                                                      int position) {
        if (motifGénéré == null || motifTentative == null) {
            return false;
        } else {
            if (position < 0 || position > motifGénéré.length() || position >
                    motifTentative.length() ||
                    motifGénéré.isEmpty() || motifTentative.isEmpty()) {
                return false;
            } else {
                return true;
            }
        }
    }

    /**
     * Vérifie si il y a dans la chaine motifTentative, un caractère semblable
     * dans la chaine motifGénéré, mais pas au même indice.
     * Si la méthode nePlanteraPasFPG() avec les paramètres envoyés retourne
     * false, la méthode retourne false et aucune autre instruction sera
     * executé.
     * @param motifGénéré la chaine générée dans le jeu Fermi-Pico-Bagels
     * @param motifTentative la chaine valide que l'utilisateur a entrée au
     *                       clavier
     * @param position nombre entier qui correspond à l'indice pour lequel on
     *                 veut vérifier la méthode.
     * @return true si il y a un caractère semblable mais pas au même indice
     * pour les 2 chaîne, false sinon.
     */
    public static boolean pico (String motifGénéré, String motifTentative,
                                int position) {
        if (nePlanteraPasFPG(motifGénéré, motifTentative, position)) {

            if (motifGénéré.contains(String.valueOf(motifTentative.charAt
                    (position))) && (!fermi(motifGénéré, motifTentative,
                    position))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Vérifie si les paramètres envoyés n'ont aucun risque de faire planter la
     * méthode avec un NullPointerException
     * ou OutOfBoundsException, cette méthode est utile pour le jeu
     * Fermi-Pico-Bagels quand on veut traiter des indices et des caractères.
     * @param motifGénéré la chaine générée dans le jeu Fermi-Pico-Bagels
     * @param motifTentative la chaine valide que l'utilisateur a entrée au
     *                       clavier
     * @param position nombre entier qui correspond à l'indice pour lequel on
     *                 veut vérifier la méthode.
     * @return true si les 2 chaines envoyées en paramètre ne sont pas null et
     * si la méthode nestPasOutOfBoundsPosition()
     * avec les paramètres envoyés retourne vrai, false sinon.
     */
    public static boolean nePlanteraPasFPG (String motifGénéré,
                                            String motifTentative, int position)
    {
        if (motifGénéré != null && motifTentative != null &&
                nestPasOutOfBoundsPosition(motifGénéré, motifTentative,
                        position)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Vérifie si les chaines  motifGénéré et motifTentative n'ont aucun
     * caractères commun peu importe leur indice.
     * Si une des chaines envoyées en paramètres est null ou vide, la méthode
     * retourne false et aucune autre instructions sera executée.
     * @param motifGénéré la chaine générée dans le jeu Fermi-Pico-Bagels
     * @param motifTentative la chaine valide que l'utilisateur a entrée au
     *                       clavier
     * @return true si aucun des caractères dans les 2 chaines sont égaux peu
     * importe leur indice, false sinon.
     */
    public static boolean bagels (String motifGénéré, String motifTentative) {
        int i = 0;
        boolean aucunBonChiffre = true;
        if (motifGénéré != null && motifTentative != null
                && !motifGénéré.isEmpty() && !motifTentative.isEmpty()) {
            while (aucunBonChiffre && i < motifGénéré.length() && i <
                    motifTentative.length()) {
                if (!motifGénéré.contains(String.valueOf(
                        motifTentative.charAt(i)))) {
                    aucunBonChiffre = true;
                } else {
                    aucunBonChiffre = false;
                }
                i++;
            }
            return aucunBonChiffre;
        } else {
            return false;
        }
    }

    /**
     * Cette méthode contient tous les cas de figure du jeu Fermi-Pico-Bagels.
     * Selon le contenu des chaines motifTentative et motifGénéré, la méthode
     * retourne une chaine qui correspond
     * au résultat d'une tentative faite par l'utilisateur en tenant compte des
     * règles du jeu.
     * Si une des chaines envoyées en paramètre est null ou si longueurMotif est
     * inférieur à 3
     * ou si une des chaines motifGénéré et motifTentative n'a pas la même
     * longueur que longueurMotif,
     * la méthode retourne null et aucune autre instruction sera executée.
     * @param motifGénéré la chaine générée dans le jeu Fermi-Pico-Bagels
     * @param motifTentative la chaine valide que l'utilisateur a entrée au
     *                       clavier
     * @param longueurMotif nombre entier qui correspond à la longueur de la
     *                     chaîne pour qu'elle soit valide.
     * @param fermi la chaine qui contient le message qui s'affiche quand au
     *              moins 1 chiffre est au bon endroit.
     * @param pico la chaine qui contient le message qui s'affiche quand au
     *             moins 1 chiffre est bon endroit, mais au mauvais endroit.
     * @param bagels a chaine qui contient le message qui s'affiche quand aucun
     *               chiffre est bon.
     * @return une chaine qui correspond au résultat d'une tentative en
     * supprimant les espaces blancs au début
     * et à la fin de la chaine.
     */
    public static String résultatFermiPicoBagels (String motifGénéré,
                                                  String motifTentative, int longueurMotif, String fermi, String pico,
                                                  String bagels) {
        if (motifGénéré != null && motifTentative != null && longueurMotif >= 0
                &&
                motifGénéré.length() == longueurMotif && motifTentative.length() ==
                longueurMotif &&
                fermi != null && pico != null && bagels != null ) {

            String résultat = "";
            int i = 0;
            if (bagels(motifGénéré, motifTentative)) {
                résultat = bagels;
                return résultat;
            } else {
                while (i < motifGénéré.length() && i < motifGénéré.length()) {
                    if (fermi(motifGénéré, motifTentative, i)) {
                        résultat = résultat + fermi + " ";
                    }
                    i++;
                }
                i = 0;
                while (i < motifGénéré.length() && i < motifGénéré.length()) {
                    if (pico(motifGénéré, motifTentative, i)) {
                        résultat = résultat + pico + " ";
                    }
                    i++;
                }

                return résultat.trim();
            }
        } else {
            return null;

        }
    }

    /**
     * Vérifie si la chaine msgSoll ou msgErr n'est pas null.
     * @param msgSoll est le message de sollicitation envoyé en paramètre.
     * @param msgErr est le message d'erreur envoyé en paramètre.
     * @return true si aucune des chaines est null, false sinon.
     */
    public static boolean msgSollErrNonNull (String msgSoll, String msgErr) {
        if (msgSoll != null && msgErr != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *  Retourne vrai si la chaine donnée représente un nombre entier positif
     *  entre 1 et 9 inclusivement, faux sinon.
     *  Si la chaine envoyées en paramètre est vide ou est null, la méthode
     *  retourne false et aucune autre instruction sera executée
     * @param chaine la chaine à verifier.
     * @return true si chaine represente un entier positif entre 1 et 9
     * inclusivement, false sinon.
     */
    public static boolean estComposéUniquementdeChiffre1à9 (String chaine) {
        boolean estUnChiffre = true;
        char c;
        int i = 0;
        if (chaine != null && !chaine.isEmpty()) {
            while (chaine.length() > i && estUnChiffre) {
                c = chaine.charAt(i);
                if (c < '1' || c > '9') {
                    estUnChiffre = false;
                } else {
                    estUnChiffre = true;
                }
                i++;
            }
            return estUnChiffre;
        } else {
            return false;
        }
    }

    /**
     * Saisie et valide une chaine qui correspond au choix de l'utilisateur pour
     * rejouer au jeu.
     * Si les chaînes envoyées en paramètre sont null, la méthode retourne null.
     * @param  msgSoll le message qui demande à l'utilisateur de rentrer quelque
     *                chose au clavier.
     * @param msgErr le message qui s'affiche lorsque la saisie de l'utilisateur
     *              n'est pas valide.
     * @param  oui une des chaine contenant ce que l'utilisateur doit entrer
     *             pour qu'elle soit valide en ignorant la casse.
     * @param  non une des chaine contenant ce que l'utilisateur doit entrer
     *             pour qu'elle soit valide en ignorant la casse.
     * @return le choix valide.
     */
    public static String validerConfirmationRejouer (String msgSoll,
                                                     String msgErr, String oui, String non) {

        if (msgSollErrNonNull(msgSoll, msgErr) && oui != null && non != null) {
            String msgValidé;
            System.out.print(msgSoll);
            msgValidé = Clavier.lireString();

            while (!msgValidé.equalsIgnoreCase(oui) &&
                    !msgValidé.equalsIgnoreCase(non)) {
                System.out.print(msgErr);
                System.out.print(msgSoll);
                msgValidé = Clavier.lireString();
            }
            return msgValidé;
        } else {
            return null;
        }

    }

    /**
     * Vérifie si le nombre d'essai pour le jeu Fermi-Pico-Bagels est supérieur
     * ou égal à un nombre donné en paramètre.
     * Si les nombre donnés en paramètre sont inférieur à 1, la méthode retourne
     * false et aucune autre instruction sera executée.
     * @param nbrEssai correspond au nombre d'essai dans le jeu
     * Fermi-Pico-Bagels
     * @param multiple10 correspond au nombre auquel on souhaite comparer le
     * nombre d'essai.
     * @return true si nbrEssai est supérieur ou égal à multiple10, false sinon.
     */
    public static boolean essaiSupÀ (int nbrEssai, int multiple10) {
        if (nbrEssai < 1 && multiple10 < 1) {
            return false;
        } else {
            if (nbrEssai >= multiple10) {
                return true;
            } else {
                return false;
            }

        }
    }

    /**
     * C'est la méthode qui contient l'entièreté du jeu Fermi-Pico-Bagels.
     * À chaque tentative faite par l'utilisateur pour trouver le motif caché,
     * une ligne supplémentaire s'ajoute au tableau qui montre
     * le résultat obtenu, le nombre d'essai effectué jusqu'à présent et le
     * motif qu'il a entré. Une partie se termine quand l'utilisateur abandonne
     * en entrant la chaine terminer ou en entrant le motif caché au clavier.
     * Lorsque l'utilisateur abandonne ou trouve le motif caché, le programme
     * lui demande s'il veut rejouer. La méthode tournera tant que l'utilisateur
     * indique qu'il veut jouer encore après chaque partie.
     * Si l'utilisateur indique qu'il ne veut pas rejouer, la méthode se termine
     * et ne retourne rien. (void)
     * Si une des chaines envoyées en paramètre est null ou si longueurMotif est
     * inférieur à 3, la méthode se termine et aucune instruction sera executée.
     * @param titreTableau la chaine contenant le titre du tableau avec les
     * différentes colonnes.
     * @param terminer la chaine qui contient ce que l'utilisateur doit entrer
     * au tableau pour abandonner la partie.
     * @param msgErrMotif la chaine contenant le message d'erreur si le motif
     * entré par l'utilisateur n'est pas valide.
     * @param longueurMotif nombre entier qui correspond à la longueur du motif
     * entré par l'utilisateur pour qu'il soit valide.
     * @param msgAbandon la chaine contenant le message qui s'affiche quand
     * l'utilisateur abandonne la partie.
     * @param msgRejouer la chaine contenant le message de sollicitation pour
     * savoir si l'utilisateur souhaite rejouer.
     * @param msgErrRejouer la chaine contenant le message d'erreur si la
     * réponse, pour rejouer, entrée par l'utilisateur n'est pas valide.
     * @param oui une des chaine contenant ce que l'utilisateur doit entrer
     * pour qu'elle soit valide en ignorant la casse. Si l'utilateur entre cette
     * chaine, ça indique à la méthode que l'utilisateur veut rejouer.
     * @param non une des chaine contenant ce que l'utilisateur doit entrer
     * pour qu'elle soit valide en ignorant la casse.  Si l'utilateur entre
     * cette chaine, ça indique à la méthode que l'utilisateur ne veut pas
     * rejouer.
     * @param fermi contient la chaine qui s'affiche quand il y a un cas de bon
     * caractère au bon endroit.
     * @param pico contient la chaine qui s'affiche quand il y a un cas de bon
     * caractère au mauvais endroit.
     * @param bagels contient la chaine qui s'affiche quand aucun des caractère
     * dans le motif entré par l'utilisateur se trouve dans la chaine générée.
     */
    public static void picoFermiBagels (String titreTableau, String terminer,
                                        String msgErrMotif, int longueurMotif, String msgAbandon,
                                        String msgRejouer, String msgErrRejouer, String oui, String non,
                                        String fermi, String pico, String bagels,
                                        String résultatPartieGagnée) {
        if (titreTableau != null && terminer != null && msgErrMotif != null &&
                longueurMotif >= 3 && msgAbandon != null && msgRejouer != null
                && msgErrRejouer != null &&
                oui != null && non != null && résultatPartieGagnée != null) {
            String confirmation = "";
            do {
                String msgRéussite;
                String motifGénéré;
                String motifValidé;
                int essai = 1;
                String résultat;
                String msgSollMotif = "\nESSAI NO " + essai + " => Entrez un " +
                        "motif (ou 0 pour abandonner): ";
                String tableau = "";

                motifGénéré = JeuxUtils.genererMotifPFB();
                motifValidé = validerMotif(msgSollMotif, msgErrMotif, terminer,
                        longueurMotif);

                if (motifValidé.equals(terminer)) {
                    System.out.println(msgAbandon + " " + motifGénéré + "\n");
                    confirmation = validerConfirmationRejouer(msgRejouer,
                            msgErrRejouer, oui, non);
                } else {

                    do {
                        System.out.print(titreTableau);
                        résultat = résultatFermiPicoBagels(motifGénéré,
                                motifValidé, longueurMotif, fermi, pico, bagels);
                        if (essaiSupÀ(essai, 10000000)) {
                            tableau = tableau + essai + ".| " + motifValidé +
                                    "   | " + résultat + "\n";

                        } else if (essaiSupÀ(essai, 1000000)) {
                            tableau = tableau + essai + ". | " + motifValidé +
                                    "   | " + résultat + "\n";

                        } else if (essaiSupÀ(essai, 100000)) {
                            tableau = tableau + essai + ".  | " + motifValidé +
                                    "   | " + résultat + "\n";

                        } else if (essaiSupÀ(essai, 10000)) {
                            tableau = tableau + essai + ".   | " + motifValidé +
                                    "   | " + résultat + "\n";

                        } else if (essaiSupÀ(essai, 1000)) {
                            tableau = tableau + essai + ".    | " + motifValidé
                                    + "   | " + résultat + "\n";

                        } else if (essaiSupÀ(essai, 100)) {
                            tableau = tableau + essai + ".     | " + motifValidé
                                    + "   | " + résultat + "\n";

                        } else if (essaiSupÀ(essai, 10)) {
                            tableau = tableau + essai + ".      | " +
                                    motifValidé + "   | " + résultat + "\n";
                        } else {
                            tableau = tableau + essai + ".       | " +
                                    motifValidé + "   | " + résultat + "\n";
                        }
                        msgRéussite = "\n\nBRAVO ! Vous avez réussi en " + essai
                                + " essais.\n\n";
                        System.out.print(tableau);
                        if (résultat.equals(résultatPartieGagnée)) {
                            System.out.print(msgRéussite);
                            confirmation = validerConfirmationRejouer(msgRejouer
                                    , msgErrRejouer, oui, non);
                        } else {
                            essai++;
                            msgSollMotif = "\nESSAI NO " + essai + " => " +
                                    "Entrez un motif (ou 0 pour abandonner): ";
                            motifValidé = validerMotif(msgSollMotif,
                                    msgErrMotif, terminer, longueurMotif);

                            if (motifValidé.equals(terminer)) {
                                System.out.println(msgAbandon + " " +
                                        motifGénéré + "\n");
                                confirmation =
                                        validerConfirmationRejouer(msgRejouer,
                                                msgErrRejouer, oui, non);
                            }

                        }
                    } while (!résultat.equals(résultatPartieGagnée) &&
                            !motifValidé.equals(terminer));

                }
            } while (confirmation.equalsIgnoreCase(oui));
        }

    }

    /**
     * Saisie et valide une chaine de caractère de longueur longueurMin à
     * longueurMax inclusivement. Le nom est une chaine qui est valide si elle
     * est sa longueur est entre longueurMin et longueurMax inclusivement
     * Un message d'erreur suivi d'un message de sollicitaion s'affichera tant
     * que la chaine entrée par l'utlisateur n'est pas valide.
     * Si les bornes envoyées en paramètre ne sont pas valides ou si une des
     * chaines envoyée en paramètre est null, la méthode retourne null et aucune
     * autre instrucion sera executée.
     * @param msgSoll le message qui demande à l'utilisateur de rentrer un nom
     * au clavier.
     * @param msgErr le message qui s'affiche lorsque la saisie de
     * l'utilisateur n'est pas valide.
     * @param longueurMin le nombre entier qui correspond à la borne inférieure
     * pour que le nom soit valide.
     * @param longueurMax le nombre entier qui correspond à la borne supérieure
     * pour que le nom soit valide.
     * @return le nom valide.
     */
    public static String validerNom (String msgSoll, String msgErr,
                                     int longueurMin, int longueurMax) {
        if (msgSollErrNonNull(msgSoll, msgErr) && bornesValide(longueurMin,
                longueurMax)) {
            String nomValidé;
            System.out.print(msgSoll);
            nomValidé = Clavier.lireString();

            while (nomValidé.length() < longueurMin || nomValidé.length() >
                    longueurMax) {
                System.out.println(msgErr);
                System.out.print(msgSoll);
                nomValidé = Clavier.lireString();
            }
            return nomValidé;
        } else {
            return null;
        }
    }

    /**
     * Cette méthode modifie le jeu tic tac toe, elle consiste à remplacer la
     * séquence de caractère choixCase par le caractère symboleAttribué.
     * Si une des chaines envoyées en paramètre est null ou que le caractère
     * symboleAttribué n'est pas un 'X' ou un 'O', la méthode retourne null et
     * aucune autre instruction sera executée.
     * @param jeu est la chaine de caractère qui correspond au jeu qu'il faut
     * modifier.
     * @param choixCase prend le rôle de la séquence de caractères qu'il faudra
     * modifier par le caractère symboleAttribué .
     * @param symboleAttribué est le caractère qui remplace la séquence de
     * caractère choixCase.
     * @return la chaine qui correspond au jeu modifié.
     */
    public static String modificationTicTacToe (String jeu, String choixCase,
                                                char symboleAttribué) {
        if (jeu != null && choixCase != null && (symboleAttribué == 'X' ||
                symboleAttribué == 'O')) {
            String nouveauJeu = jeu;
            nouveauJeu = jeu.replace(choixCase,String.valueOf(symboleAttribué));
            return nouveauJeu;

        } else {
            return null;
        }
    }

    /**
     * Saisi et valide un choix qui correspond au numéro de la case où
     * l'utilisateur souhaite placer son symbole. Le choix est une chaine qui
     * est valide si elle est sa longueur est égale à longueurChoixCase, si elle
     * est composée de chiffre de 1 à 9 et si elle est présente dans la chaine
     * jeu. Un message d'erreur suivi d'un message de sollicitaion s'affichera
     * tant que la chaine entrée par l'utlisateur n'est pas valide.
     * Si une des chaines envoyées en paramètre est null ou que le
     * longueurChoixCase est inférieur à 0, la méthode retourne null et aucune
     * autre instruction sera executée.
     * @param msgSoll le message qui demande à l'utilisateur de rentrer un
     * choix de case au clavier.
     * @param msgErr le message qui s'affiche lorsque la saisie de
     * l'utilisateur n'est pas valide.
     * @param jeu est la chaine qui contient le jeu de tic tac toe actuel.
     * @param longueurChoixCase est le nombre entier qui correspond à la
     * longueur de la chaine qui correspond au choix de l'utilisateur.
     * @return la chaine qui correspond au choix de la case validé.
     */
    public static String validerChoixCase (String msgSoll, String msgErr,
                                           String jeu, int longueurChoixCase) {
        if (msgSollErrNonNull(msgSoll, msgErr) && jeu != null &&
                longueurChoixCase >= 0) {
            String choixCase;
            System.out.print(msgSoll);
            choixCase = Clavier.lireString();

            while (!estDeLaBonneLongueur(choixCase, longueurChoixCase,
                    longueurChoixCase) ||
                    !estComposéUniquementdeChiffre1à9(choixCase) ||
                    !jeu.contains(choixCase)) {
                System.out.print(msgErr);
                System.out.print(msgSoll);
                choixCase = Clavier.lireString();
            }
            return choixCase;

        } else {
            return null;
        }
    }

    /**
     * Vérifie si la chaine envoyée en paramètre contient un chiffre de 1 à 9
     * inclusivement.
     * Si la chaine envoyée en paramètre est null, la méthode retourne false et
     * aucune autre instruction sera executée.
     * @param chaine est la chaine que l'on désire vérifier à cet effet.
     * @return true si la chaine contient au moins un chiffre de 1 à 9
     * inclusivement, false sinon.
     */
    public static boolean contientUnChiffre1À9 (String chaine) {
        if (chaine != null) {
            char c = '1';
            boolean estPasUnChiffre = true;
            while (estPasUnChiffre && c <= '9') {
                if (chaine.contains(String.valueOf(c))) {
                    estPasUnChiffre = false;
                } else {
                    estPasUnChiffre = true;
                }
                c++;
            }
            return !estPasUnChiffre;

        } else {
            return false;
        }
    }

    /**
     * Vérifie si toutes les positions envoyées en paramètre n'ont aucune chance
     * de créer une OutOfBoundsException.
     * Si la chaine jeu est null ou vide, la méthode retourne directement false.
     * @param jeu est la chaine sur laquelle on désire vérifier les positions.
     * @param position1 est un nombre qui correspond à une position dans la
     * chaine jeu.
     * @param position2 est un nombre qui correspond à une position dans la
     * chaine jeu.
     * @param position3 est un nombre qui correspond à une position dans la
     * chaine jeu.
     * @param position4 est un nombre qui correspond à une position dans la
     * chaine jeu.
     * @param position5 est un nombre qui correspond à une position dans la
     * chaine jeu.
     * @param position6 est un nombre qui correspond à une position dans la
     * chaine jeu.
     * @param position7 est un nombre qui correspond à une position dans la
     * chaine jeu.
     * @param position8 est un nombre qui correspond à une position dans la
     * chaine jeu.
     * @param position9 est un nombre qui correspond à une position dans la
     * chaine jeu.
     * @return true si toutes les positions envoyées en paramètres sont
     * supérieures ou égales à 0 et si elles ne sont pas supérieures
     * à la longueur de la chaine jeu, false sinon.
     */
    public static boolean toutesLesPositionsValides (String jeu, int position1,
                                                     int position2, int position3, int position4,
                                                     int position5, int position6, int position7, int position8, int position9) {
        if (jeu != null && !jeu.isEmpty() && position1 >= 0 && position2 >= 0 &&
                position3 >= 0 && position4 >= 0 && position5 >= 0 &&
                position6 >= 0 && position7 >= 0 && position8 >= 0 && position9 >= 0 &&
                position1 <= jeu.length()
                && position2 <= jeu.length() && position3 <= jeu.length() && position4
                <= jeu.length() &&
                position5<= jeu.length() && position6 <= jeu.length() && position7 <=
                jeu.length() &&
                position8 <= jeu.length() && position9 <= jeu.length()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Vérifie si le caractère envoyé en paramètre est un 'X' ou un 'O' pour le
     * jeu tic tac toe.
     * @param symboleAttribué est le caractère que la méthode analysera.
     * @return true si symboleAttribué est un 'X' ou est un 'O', false sinon.
     */
    public static boolean symboleValide (char symboleAttribué) {
        if (symboleAttribué == 'X' || symboleAttribué == 'O') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Vérifie s'il y a 3 caractères qui sont égaux au caractère symboleAttribué
     * dans 3 différentes positions dans la chaine jeu.
     * Si la chaine jeu est null ou si une des positions envoyées en paramètre
     * n'est pas supérieures ou égales à 0 ou supérieure à la longueur de la
     * chaine jeu, ou si symboleAttribué n'est pas un 'X' ou un 'O', la méthode
     * retourne directement false et aucune autre instruction sera executée.
     * @param jeu la chaine qui contient le jeu de tic tac toe.
     * @param symboleAttribué le caractère que l'on doit retrouver dans la
     * chaine jeu aux indices envoyés en paramètre.
     * @param position1 est un nombre qui correspond à la position sur laquelle
     * la méthode vérifie si le caractère est égal à symboleAttribué.
     * @param position2 est un nombre qui correspond à la position sur laquelle
     * la méthode vérifie si le caractère est égal à symboleAttribué.
     * @param position3 est un nombre qui correspond à la position sur laquelle
     * la méthode vérifie si le caractère est égal à symboleAttribué.
     * @return true si les 3 caractères aux positions (1,2,3) est le même que
     * symboleAttribué, false sinon.
     */
    public static boolean ligneQuelconqueVictoire (String jeu,
                                                   char symboleAttribué, int position1, int position2,
                                                   int position3) {
        if (jeu != null && position1 >= 0 && position2 >= 0 && position3 >= 0 &&
                position1 <= jeu.length() &&
                position2 <= jeu.length() && position3 <= jeu.length() &&
                symboleValide(symboleAttribué)) {
            if (jeu.charAt(position1) == symboleAttribué &&
                    jeu.charAt(position2) == symboleAttribué &&
                    jeu.charAt(position3) == symboleAttribué) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Vérifie s'il y a 3 caractères qui sont égaux au caractère symboleAttribué
     * dans 3 différentes positions dans la chaine jeu de 2 différentes façons :
     * Les 2 cas où il pourrait y avoir une ligne diagonale du symbole attribué
     * au joueur dans le jeu tic tac toe.
     * Si la chaine jeu est null ou si une des positions envoyées en paramètre
     * n'est pas supérieures ou égales à 0 ou supérieure à la longueur de la
     * chaine jeu, ou si symboleAttribué n'est pas un 'X' ou un 'O', la méthode
     * retourne directement false et aucune autre instruction sera executée.
     * @param jeu la chaine qui contient le jeu de tic tac toe.
     * @param symboleAttribué le caractère que l'on doit retrouver dans la
     * chaine jeu aux indices envoyés en paramètre.
     * @param position1 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne diagonale dans la chaine jeu pour
     * tic tac toe.
     * @param position3 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne diagonale dans la chaine jeu pour
     * tic tac toe.
     * @param position5 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne diagonale dans la chaine jeu pour
     * tic tac toe.
     * @param position7 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne diagonale dans la chaine jeu pour
     * tic tac toe.
     * @param position9 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne diagonale dans la chaine jeu pour
     * tic tac toe.
     * @return true si les caractères aux positions 1,5,9 sont égaux à
     * symboleAttribué ou si les caractères aux positions 3,5,7 sont égaux à
     * symboleAttribué, false sinon.
     */
    public static boolean ligneDiagonaleVictoire (String jeu,
                                                  char symboleAttribué, int position1, int position3,
                                                  int position5, int position7, int position9) {
        if (jeu != null && symboleValide(symboleAttribué) && position1 >= 0 &&
                position3 >= 0 && position5 >= 0 && position7 >= 0 && position9
                >= 0
                && position1 <= jeu.length() && position3 <= jeu.length() && position5
                <= jeu.length() && position7 <= jeu.length() && position9 <=
                jeu.length()) {
            if (ligneQuelconqueVictoire(jeu, symboleAttribué, position1,
                    position5 ,position9) ||
                    ligneQuelconqueVictoire(jeu, symboleAttribué, position7,
                            position5 ,position3)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Vérifie si les paramètres envoyés en paramètre ne risquent pas de causer
     * une OutOfBoundsException ou une NullPointerException.
     * chaque chiffre est entre 1 et 9 inclusivement.
     * @param jeu la chaine qui contient le jeu de tic tac toe.
     * @param symboleX un caractère attribué à un joueur pour jouer à
     * tic tac toe.
     * @param symboleO un caractère attribué à un joueur pour jouer à
     * tic tac toe.
     * @param position1 est un nombre qui correspond à la position d'un numéro
     * de case dans la chaine jeu.
     * @param position2 est un nombre qui correspond à la position d'un numéro
     * de case dans la chaine jeu.
     * @param position3 est un nombre qui correspond à la position d'un numéro
     * de case dans la chaine jeu.
     * @param position4 est un nombre qui correspond à la position d'un numéro
     * de case dans la chaine jeu.
     * @param position5 est un nombre qui correspond à la position d'un numéro
     * de case dans la chaine jeu.
     * @param position6 est un nombre qui correspond à la position d'un numéro
     * de case dans la chaine jeu.
     * @param position7 est un nombre qui correspond à la position d'un numéro
     * de case dans la chaine jeu.
     * @param position8 est un nombre qui correspond à la position d'un numéro
     * de case dans la chaine jeu.
     * @param position9 est un nombre qui correspond à la position d'un numéro
     * de case dans la chaine jeu.
     * @return le true si la chaine jeu n'est pas null, si que toutes les
     * positions envoyées en paramètre sont valides (via une autre méthode)
     * , si symboleX et symboleO sont valides (via une autre méthode) et ne sont
     * pas égaux, false sinon.
     */
    public static boolean nePlanteraPasTTT (String jeu, char symboleX,
                                            char symboleO, int position1, int position2,
                                            int position3, int position4,
                                            int position5, int position6, int position7, int position8, int position9) {
        if (jeu != null && symboleValide(symboleX) && symboleValide(symboleO) &&
                symboleX != symboleO && toutesLesPositionsValides(jeu, position1
                , position2, position3, position4,
                position5,  position6, position7, position8, position9)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Il s'agit de la même méthode que nePlanteraPasTTT, sauf qu'elle prend en
     * paramètre et analyse juste un seul symbole char.
     */
    public static boolean nePlanteraPasTTT1SeulSymbole (String jeu,
                                                        char symboleAttribué, int position1, int position2,
                                                        int position3, int position4,
                                                        int position5, int position6, int position7, int position8, int position9) {
        if (jeu != null && symboleValide(symboleAttribué) &&
                toutesLesPositionsValides(jeu, position1, position2, position3,
                        position4,
                        position5,  position6, position7, position8, position9)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Vérifie s'il y a 3 caractères qui sont égaux au caractère symboleAttribué
     * dans 3 différentes positions dans la chaine jeu de 3 différentes façons :
     * Les 3 cas où il pourrait y avoir une ligne verticale du symbole attribué
     * au joueur dans le jeu tic tac toe.
     * Si la chaine jeu est null ou si une des positions envoyées en paramètre
     * n'est pas supérieures ou égales à 0 ou supérieure à la longueur de la
     * chaine jeu,
     * ou si symboleAttribué n'est pas un 'X' ou un 'O', la méthode retourne
     * directement false et aucune autre instruction sera executée.
     * @param jeu la chaine qui contient le jeu de tic tac toe.
     * @param symboleAttribué le caractère que l'on doit retrouver dans la
     * chaine jeu aux indices envoyés en paramètre.
     * @param position1 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne verticale dans la chaine jeu pour
     * tic tac toe.
     * @param position3 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne verticale dans la chaine jeu pour
     * tic tac toe.
     * @param position5 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne verticale dans la chaine jeu pour
     * tic tac toe.
     * @param position7 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne verticale dans la chaine jeu pour
     * tic tac toe.
     * @param position9 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne verticale dans la chaine jeu pour
     * tic tac toe.
     * @return true si les caractères aux positions 1,3,7 sont égaux à
     * symboleAttribué ou si les caractères aux positions 2,5,8 sont égaux à
     * symboleAttribué,
     * ou si les caractères aux positions 3,6,9 sont égaux à symboleAttribué,
     * false sinon.
     */
    public static boolean ligneVerticaleVictoire (String jeu,
                                                  char symboleAttribué, int position1, int position2,
                                                  int position3, int position4,
                                                  int position5, int position6, int position7, int position8, int position9) {
        if (nePlanteraPasTTT1SeulSymbole(jeu, symboleAttribué, position1,
                position2, position3, position4, position5, position6, position7
                , position8, position9)) {
            if (ligneQuelconqueVictoire(jeu, symboleAttribué, position1,
                    position4 ,position7) ||
                    ligneQuelconqueVictoire(jeu, symboleAttribué, position2,
                            position5 ,position8) ||
                    ligneQuelconqueVictoire(jeu, symboleAttribué, position3, position6 ,
                            position9)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Vérifie s'il y a 3 caractères qui sont égaux au caractère symboleAttribué
     * dans 3 différentes positions dans la chaine jeu de 3 différentes façons :
     * Les 3 cas où il pourrait y avoir une ligne horizontale du symbole
     * attribué au joueur dans le jeu tic tac toe.
     * Si la chaine jeu est null ou si une des positions envoyées en paramètre
     * n'est pas supérieures ou égales à 0 ou supérieure à la longueur de la
     * chaine jeu, ou si symboleAttribué n'est pas un 'X' ou un 'O', la méthode
     * retourne directement false et aucune autre instruction sera executée.
     * @param jeu la chaine qui contient au jeu de tic tac toe.
     * @param symboleAttribué le caractère que l'on doit retrouver dans la
     * chaine jeu aux indices envoyés en paramètre.
     * @param position1 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne horizontale dans la chaine jeu pour
     * tic tac toe.
     * @param position3 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne horizontale dans la chaine jeu pour
     * tic tac toe.
     * @param position5 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne horizontale dans la chaine jeu pour
     * tic tac toe.
     * @param position7 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne horizontale dans la chaine jeu pour
     * tic tac toe.
     * @param position9 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne horizontale dans la chaine jeu pour
     * tic tac toe.
     * @return true si les caractères aux positions 1,2,3 sont égaux à
     * symboleAttribué ou si les caractères aux positions 4,5,6 sont égaux à
     * symboleAttribué, ou si les caractères aux positions 7,8,9 sont égaux à
     * symboleAttribué, false sinon.
     */
    public static boolean ligneHorizontaleVictoire (String jeu,
                                                    char symboleAttribué, int position1, int position2,
                                                    int position3, int position4,
                                                    int position5, int position6, int position7, int position8, int position9) {
        if (nePlanteraPasTTT1SeulSymbole(jeu, symboleAttribué, position1,
                position2, position3, position4, position5, position6, position7
                , position8, position9)) {

            if (ligneQuelconqueVictoire(jeu, symboleAttribué, position1,
                    position2 ,position3) ||
                    ligneQuelconqueVictoire(jeu, symboleAttribué, position4,
                            position5 ,position6) ||
                    ligneQuelconqueVictoire(jeu, symboleAttribué, position7, position8 ,
                            position9)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Vérifie s'il y a 3 caractères qui sont égaux au caractère symboleAttribué
     * dans 3 différentes positions dans la chaine jeu de 8 différentes façons :
     * Les 3 cas où il pourrait y avoir une ligne horizontale, les 3 cas où il
     * pourrait y avoir une ligne verticale et les 2 cas où il  pourrait y avoir
     * une ligne diagonale du symbole attribué au joueur dans le jeu tic tac toe
     * ce qui ferait que la partie soit gagnée par le joueur qui avait le
     * symbole attribué.
     * Si la chaine jeu est null ou si une des positions envoyées en paramètre
     * n'est pas supérieures ou égales à 0 ou supérieure à la longueur de la
     * chaine jeu, ou si symboleAttribué n'est pas un 'X' ou un 'O', la méthode
     * retourne directement false et aucune autre instruction sera executée.
     * @param jeu la chaine qui contient au jeu de tic tac toe.
     * @param symboleAttribué le caractère que l'on doit retrouver dans la
     * chaine jeu aux indices envoyés en paramètre.
     * @param position1 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne de caractères égaux dans la chaine
     * jeu pour tic tac toe.
     * @param position3 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne de caractères égaux dans la chaine
     * jeu pour tic tac toe.
     * @param position5 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne de caractères égaux dans la chaine
     * jeu pour tic tac toe.
     * @param position7 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne de caractères égaux dans la chaine
     * jeu pour tic tac toe.
     * @param position9 est un nombre qui correspond à la position d'une case
     * qui pourrait faire partie d'une ligne de caractères égaux dans la chaine
     * jeu pour tic tac toe.
     * @return true si il y a une ligne verticale ou une ligne horizontale ou
     * une ligne diagonale où les 3 caractères sont égaux à symboleAttribué,
     * false sinon.
     */
    public static boolean casVictoire1SeulSymbole (String jeu,
                                                   char symboleAttribué, int position1, int position2,
                                                   int position3, int position4,
                                                   int position5, int position6, int position7, int position8, int position9) {
        if (nePlanteraPasTTT1SeulSymbole(jeu, symboleAttribué, position1,
                position2, position3, position4, position5, position6, position7
                , position8, position9)) {

            if (ligneDiagonaleVictoire(jeu, symboleAttribué, position1,
                    position3, position5, position7, position9) ||
                    ligneVerticaleVictoire(jeu, symboleAttribué,position1, position2,
                            position3, position4, position5, position6, position7,
                            position8, position9) ||
                    ligneHorizontaleVictoire(jeu, symboleAttribué,position1, position2,
                            position3, position4, position5, position6, position7,
                            position8, position9)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Vérifie si il n'y a aucun cas où la partie est gagnée par un des joueurs
     * ayant chacun un symbole différent et si la chaine jeu ne contient pas
     * de chiffres entre 1 et 9. Cela signifierait que la partie est nulle
     * puisqu'aucun joueur a gagné et qu'il n'y a plus de case disponible.
     * Si les caractères symbolesX ou symboleO ne font pas de sens, ou si un des
     * paramètres risque de causer une OutOfBoundsException ou une
     * NullPointerException, (vérifié à l'aide de la méthode nePlanteraPasTTT())
     * la méthode retourne false et aucune autre instruction sera executée.
     * @param jeu la chaine qui contient au jeu de tic tac toe.
     * @param symboleX un caractère attribué à un des joueur.
     * @param symboleO un caractère attribué à un des joueur.
     * @param position1 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position2 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position3 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position4 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position5 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position6 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position7 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position8 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position9 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @return true s'il n'y a pas de cas victoire par au moins un des joueur
     * selon le symbole qui lui est attribué  et s'il reste encore des chiffre
     * de 1 à 9 dans la chaine jeu, false sinon.
     */
    public static boolean partieNulle (String jeu, char symboleX, char symboleO,
                                       int position1, int position2, int position3,
                                       int position4,
                                       int position5, int position6, int position7, int position8, int position9) {
        if (nePlanteraPasTTT(jeu, symboleX, symboleO, position1, position2,
                position3, position4, position5, position6, position7, position8
                , position9)) {

            if (!contientUnChiffre1À9(jeu) && !casVictoire1SeulSymbole(jeu,
                    symboleX, position1, position2, position3, position4,
                    position5, position6, position7,
                    position8, position9) && !casVictoire1SeulSymbole(jeu, symboleO,
                    position1, position2, position3, position4, position5,
                    position6, position7,
                    position8, position9)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Vérifie si la partie est terminée, c'est-à-dire s'il y a un cas de
     * victoire par un des 2 joueurs ou si la partie est nulle.
     * Si les caractères symbolesX ou symboleO ne font pas de sens, ou si un des
     * paramètres envoyés risque de causer une OutOfBoundsException ou une
     * NullPointerException, (vérifié à l'aide de la méthode nePlanteraPasTTT())
     * la méthode retourne false et aucune autre instruction sera executée.
     * @param jeu la chaine qui contient au jeu de tic tac toe.
     * @param symboleX un caractère attribué à un des joueur.
     * @param symboleO un caractère attribué à un des joueur.
     * @param position1 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position2 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position3 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position4 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position5 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position6 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position7 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position8 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position9 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @return true si il y a un cas de victoire par un des joueurs selon le
     * symbole qui lui est attribué ou si la partie est nulle, false sinon.
     */
    public static boolean partieTerminée (String jeu, char symboleX,
                                          char symboleO, int position1,
                                          int position2, int position3,
                                          int position4,
                                          int position5, int position6, int position7, int position8, int position9) {
        if (nePlanteraPasTTT(jeu, symboleX, symboleO, position1, position2,
                position3, position4, position5, position6, position7, position8
                , position9)) {

            if (partieNulle(jeu, symboleX,symboleO, position1, position2,
                    position3, position4, position5, position6, position7,
                    position8, position9) ||
                    casVictoire1SeulSymbole(jeu, symboleX,position1, position2,
                            position3, position4, position5, position6, position7,
                            position8, position9) ||
                    casVictoire1SeulSymbole(jeu, symboleO,position1, position2,
                            position3, position4, position5, position6, position7,
                            position8, position9)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Cette méthode contient l'entièreté du jeu tic tac toe, au début les 2
     * joueurs doivent rentrer leur nom et le symbole 'X' est attribué
     * au Joueur1 et 'O' pour le Joueur2, c'est toujours le joueur qui a le
     * symbole 'X' qui commence et après chaque partie, le symbole attribué aux
     * joueurs alternent. Quand une partie se termine un message différent
     * s'affiche dépendemment de quel joueur a gagné ou si c'est une partie
     * nulle et le programme demande s'il veut rejouer. La méthode tournera
     * tant que l'utilisateur indique qu'il veut jouer encore après chaque
     * partie. Si l'utilisateur indique qu'il ne veut pas rejouer, la méthode se
     * termine et ne retourne rien. (void) Si une des chaines envoyées en
     * paramètre est null ou si les nombres en paramètre qui correspondent à des
     * longueurs ou des bornes ne font pas de sens ou si les nombres envoyés en
     * paramètre qui correspondent à des positions sur une chaine ne sont pas
     * valides, la méthode n'execute aucune instrucions.
     * @param jeuViergeTTT la chaine qui contient le jeu de tic tac toe intact.
     * @param msgSollNomJ1 est la chaine qui contient le message de
     * sollicitation pour le nom du joueur1.
     * @param msgSollNomJ2 est la chaine qui contient le message de s
     * ollicitation pour le nom du joueur2.
     * @param msgErrNom est la chaine qui contient le message d'erreur qui
     * s'affiche quand le nom entré à l'utilisateur n'est pas valide.
     * @param longueurMinNom est un nombre entier qui correspond à la longueur
     * minimum de la chaine contenant le nom pour qu'il soit valide.
     * @param longueurMaxNom est un nombre entier qui correspond à la longueur
     * maximum de la chaine contenant le nom pour qu'il soit valide.
     * @param msgErrCase est la chaine qui contient le message d'erreur qui
     * s'affiche quand le choix de la case entrée par un joueur n'est pas valide
     * @param longueurChoixCase est un nombre entier qui correspond à la
     * longueur que doit être le choix de la case entré par un des joueurs.
     * @param msgPartieNulle est la chaine qui contient le message qui
     * s'affiche quand la partie est nulle.
     * @param msgRejouer la chaine contenant le message de sollicitation pour
     * savoir si l'utilisateur souhaite rejouer.
     * @param msgErrRejouer la chaine contenant le message d'erreur si la
     * réponse, pour rejouer, entrée par l'utilisateur n'est pas valide.
     * @param oui est la chaine qui contient le message que l'utilisateur doit
     * entrer, en ne prenant pas la casse en compte, s'il veut rejouer.
     * @param non est la chaine qui contient le message que l'utilisateur doit
     * entrer, en ne prenant pas la casse en compte, s'il ne veut pas rejouer.
     * @param position1 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position2 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position3 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position4 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position5 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position6 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position7 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position8 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     * @param position9 est un nombre qui correspond à la position d'une case
     * dans la chaine jeu pour tic tac toe.
     */
    public static void ticTacToe (String msgSollNomJ1, String msgSollNomJ2,
                                  String msgErrNom, int longueurMinNom, int longueurMaxNom,
                                  String jeuViergeTTT, String msgErrCase, int longueurChoixCase,
                                  String msgPartieNulle, String msgRejouer,
                                  String msgErrRejouer,
                                  String oui, String non, int position1, int position2, int position3,
                                  int position4,
                                  int position5, int position6, int position7, int position8, int position9) {

        if (msgSollNomJ1 != null && msgSollNomJ2 != null && msgErrNom != null &&
                jeuViergeTTT != null && msgErrCase != null &&
                msgPartieNulle != null && msgRejouer != null && msgErrRejouer != null &&
                oui != null && non != null &&
                bornesValide(longueurMinNom, longueurMaxNom) && longueurChoixCase >= 0
                && toutesLesPositionsValides(jeuViergeTTT, position1, position2,
                position3, position4, position5, position6, position7, position8
                , position9)) {
            String nomJoueur1 = validerNom(msgSollNomJ1, msgErrNom,
                    longueurMinNom, longueurMaxNom);
            String nomJoueur2 = validerNom(msgSollNomJ2, msgErrNom,
                    longueurMinNom, longueurMaxNom);
            int noPartie = 1;

            String msgSollPremier;
            String msgSollSecond;
            String jeu;
            String choixCase;
            String msgPartieGagnéePremier;
            String msgPartieGagnéeSecond;

            String confirmation = "";

            do { jeu = jeuViergeTTT;
                System.out.print(jeu);
                if (noPartie % 2 == 0) {
                    msgSollPremier = "\n" + nomJoueur2.toUpperCase() + ", " +
                            "entrez le numéro d'une case pour placer votre X " +
                            ": ";
                    msgSollSecond = "\n" + nomJoueur1.toUpperCase() + ", " +
                            "entrez le numéro d'une case pour placer votre O " +
                            ": ";
                    msgPartieGagnéePremier = "\nBRAVO " + nomJoueur2.
                            toUpperCase()  + ", vous remportez la victoire !\n";
                    msgPartieGagnéeSecond = "\nBRAVO " + nomJoueur1.
                            toUpperCase()  + ", vous remportez la victoire !\n";
                } else {
                    msgSollPremier = "\n" + nomJoueur1.toUpperCase() + ", " +
                            "entrez le numéro d'une case pour placer votre X " +
                            ": ";
                    msgSollSecond = "\n" + nomJoueur2.toUpperCase() + ", " +
                            "entrez le numéro d'une case pour placer votre O " +
                            ": ";
                    msgPartieGagnéePremier = "\nBRAVO " + nomJoueur1.
                            toUpperCase()  + ", vous remportez la victoire !\n";
                    msgPartieGagnéeSecond = "\nBRAVO " + nomJoueur2.
                            toUpperCase()  + ", vous remportez la victoire !\n";
                }
                do {
                    choixCase = validerChoixCase(msgSollPremier, msgErrCase, jeu
                            , longueurChoixCase);
                    jeu = modificationTicTacToe(jeu, choixCase, 'X'
                    );
                    if (!partieTerminée(jeu, 'X', 'O',
                            position1, position2, position3, position4,
                            position5, position6, position7, position8,
                            position9)) {
                        System.out.print("\n" + jeu);
                    } else {
                        System.out.print(jeu);
                    }
                    if (!partieTerminée(jeu, 'X', 'O',
                            position1, position2, position3, position4,
                            position5, position6, position7, position8,
                            position9)) {
                        choixCase = validerChoixCase(msgSollSecond, msgErrCase,
                                jeu, longueurChoixCase);
                        jeu = modificationTicTacToe(jeu, choixCase,
                                'O');
                        System.out.print("\n" + jeu);
                    }
                } while (!partieTerminée(jeu, 'X', 'O',
                        position1, position2, position3, position4, position5,
                        position6, position7, position8, position9));

                if (casVictoire1SeulSymbole(jeu, 'X', position1,
                        position2, position3, position4, position5, position6,
                        position7, position8, position9)) {
                    System.out.print(msgPartieGagnéePremier);
                } else if (casVictoire1SeulSymbole(jeu, 'O',
                        position1, position2, position3, position4, position5,
                        position6, position7, position8, position9)) {
                    System.out.print(msgPartieGagnéeSecond);
                } else {
                    System.out.print(msgPartieNulle);
                }
                confirmation = validerConfirmationRejouer(msgRejouer,
                        msgErrRejouer, oui, non);
                noPartie++;
            } while (confirmation.equalsIgnoreCase(oui));
        }
    }

    public static void main (String [] args) {
        String choixMenu;
        presenterLogiciel(MSG_PRE);
        affichageMenu(MENU);
        choixMenu = choixMenu(MSG_SOLL_MENU, MSG_ERR_MENU, CHOIX_MIN, CHOIX_MAX,
                LNG_CHOIX_MENU);

        while (!choixMenu.equals(CHOIX3)) {

            while (choixMenu.equals(CHOIX1)) {

                affichageEnTetePico(ENTETE_PICO);
                picoFermiBagels(TITRE_TABLEAU, TERMINER_MOTIF, MSG_ERR_MOTIF,
                        LNG_MOTIF, MSG_ABANDON,
                        MSG_RECOMMENCER, MSG_ERR_RECOMMENCER, OUI, NON, FERMI, PICO,
                        BAGELS, RÉUSSI_FERMI);
                affichageMenu(MENU);
                choixMenu = choixMenu(MSG_SOLL_MENU, MSG_ERR_MENU, CHOIX_MIN,
                        CHOIX_MAX, LNG_CHOIX_MENU);

            }

            while (choixMenu.equals(CHOIX2)) {
                affichageEnTetePico(TITRE_TICTACTOE);
                ticTacToe(MSG_SOLL_NOM_J1, MSG_SOLL_NOM_J2, MSG_ERREUR_NOM,
                        LONGUEUR_MIN_NOM, LONGUEUR_MAX_NOM,
                        JEU_VIERGE_TICTACTOE, MSG_ERREUR_CASE, LNG_CHOIX_CASE,
                        MSG_PARTIE_NULLE, MSG_RECOMMENCER, MSG_ERR_RECOMMENCER,
                        OUI, NON, POSITION_1_TICTACTOE, POSITION_2_TICTACTOE,
                        POSITION_3_TICTACTOE, POSITION_4_TICTACTOE,
                        POSITION_5_TICTACTOE, POSITION_6_TICTACTOE,
                        POSITION_7_TICTACTOE, POSITION_8_TICTACTOE,
                        POSITION_9_TICTACTOE);
                affichageMenu(MENU);
                choixMenu = choixMenu(MSG_SOLL_MENU, MSG_ERR_MENU, CHOIX_MIN,
                        CHOIX_MAX, LNG_CHOIX_MENU);
            }

        }

        finLogiciel(MSG_FIN);
    }
}

