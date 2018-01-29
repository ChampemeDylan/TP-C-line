public class Palmares {


    /**
     * Definition des variables
     */
    private int polePosition;
    private int victoire;

    /**
     * Permet de retourner la Pole Position
     * @return
     */
    public int getPolePosition() {
        return polePosition;
    }

    /**
     * ¨Permet de définir la Pole Position
     * @param polePosition
     */
    public void setPolePosition(int polePosition) {
        this.polePosition = polePosition;
    }

    /**
     * Permet de retourner la Victoire
     * @return
     */
    public int getVictoire() {
        return victoire;
    }

    /**
     * Permet de définir la victoire
     * @param victoire
     */
    public void setVictoire(int victoire) {
        this.victoire = victoire;
    }

    /**
     * Constructeur de classe qui prend en parametres :
     *
     * @param polePosition
     * @param victoire
     */
    public Palmares(int polePosition, int victoire) {
        this.polePosition = polePosition;
        this.victoire = victoire;
    }
}
