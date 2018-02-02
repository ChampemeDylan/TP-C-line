public class Paris {
    /*
    CONSTRUCTEURS
     */
    Paris() {
    }

    /*
    VARIABLES
      */
    //  CRÉATION DU TABLEAU DES 15 PILOTES AVEC UNE 2ÈME DIMENSION POUR Y STOCKER LES PARIEURS
    private Parieur[][] tabPilotes = new Parieur[14][0];
    private int gainTotal = 0;
    private int nbParieurs = 0;

    /*
    GETTERS ET SETTERS
     */
    public int getGainTotal() {
        return gainTotal;
    }

    private void setGainTotal() {
        this.gainTotal += 500;
    }

    public int getNbParieurs() {
        return nbParieurs;
    }

    private void setNbParieurs() {
        this.nbParieurs += 1;
    }

    /*
    MÉTHODES
    */
    public void placerParis(Parieur parieur, int pilote) {
        // nouveau paris : augmentation de la mise totale de 500 et incrémentation du nombre de parieurs
        setGainTotal();
        setNbParieurs();
        // récupération du nombre total de parieurs pour ce pilote
        int last = tabPilotes[pilote - 1].length;
        // s'il y a au moins 1 parieur, ajout de ce parieur à la suite
        if (last > 0) {
            tabPilotes[pilote - 1][last + 1] = parieur;
        }
        // s'il n'y a aucun parieur, ajout à la 1ère position
        else if (last == 0) {
            tabPilotes[pilote - 1][last] = parieur;
        }
    }

    public Parieur[] bilanParis(){

        // parcours du tableau de paris
        for (int i = 0; i <=14 ; i++){
            for (int j = 0; j <= tabPilotes[i].length; j++){
                tabPilotes[i][j].setGain();
            }
        }
    }
}
