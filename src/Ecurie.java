public class Ecurie {
    /**
     * Definition des variables
     */
    private String nom ;
    private String nationalite;
    private Vehicule vehicule;
    private Pilote pilote;



    /**
     * Constructeur de classe qui prend en parametres :
     *  @param nom
     * @param vehicule
     * @param pilote
     * @param nationalite
     */

    public Ecurie(String nom, String nationalite , Vehicule vehicule, Pilote pilote) {
        this.nom = nom;
        this.nationalite = nationalite;
        this.vehicule = vehicule;
        this.pilote = pilote;
    }




    /**
     * Permet de retourner le nom
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *Permet de définir le nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    /**
     * Permet de retourner  le véhicule
     * @return
     */
    public Vehicule getVehicule() {
        return vehicule;
    }

    /**
     * Permet de définir le véhicule
     * @param vehicule
     */
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    /**
     * Permet de retourner le pilote
     * @return
     */
    public Pilote getPilote() {
        return pilote;
    }

    /**
     * Permet de définir le pilote
     * @param pilote
     */
    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }
}
