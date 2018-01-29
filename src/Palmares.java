public class Palmares {

    /*
     * Définition des variables
     */
    private int polePosition;
    private int victoire;

    /*
     * Getter et Setter
     */
    public int getPolePosition() {
        return polePosition;
    }

    public void setPolePosition(int polePosition) {
        this.polePosition = polePosition;
    }

    public int getVictoire() {
        return victoire;
    }

    public void setVictoire(int victoire) {
        this.victoire = victoire;
    }

    /*
     * Constructeur
     */
    public Palmares(int polePosition, int victoire) {
        this.polePosition = polePosition;
        this.victoire = victoire;
    }
}
