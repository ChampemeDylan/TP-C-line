public class Palmares {

    /*
     * Définition des variables
     */
    private int nombreCourses;
    private int victoire;
    private int position2;
    private int position3;

    /*
     * Getter et Setter
     */

    public int getNombreCourses() {
        return nombreCourses;
    }

    public void setNombreCourses(int nombreCourses) {
        this.nombreCourses = nombreCourses;
    }

    public int getVictoire() {
        return victoire;
    }

    public void setVictoire(int victoire) {
        this.victoire = victoire;
    }

    public int getPosition2() {
        return position2;
    }

    public void setPosition2(int position2) {
        this.position2 = position2;
    }

    public int getPosition3() {
        return position3;
    }

    public void setPosition3(int position3) {
        this.position3 = position3;
    }

    /*
     * Constructeur
     */

    public Palmares(int nombreCourses, int victoire, int position2, int position3) {
        this.nombreCourses = nombreCourses;
        this.victoire = victoire;
        this.position2 = position2;
        this.position3 = position3;
    }
}
