public class Vehicule {

    /*
     * Définition des variables
     */
    private Integer numero;
    private Integer puissance;
    private Pilote pilote;
    private String marque;
    private String categorie;

    /*
     * Getter et Setter
     */

    /**
     *
     * @return get
     * Modifier les valeurs des variables du numéro du véhicule
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     * tous les set = Accéder aux valeurs des variable du véhicule
     */

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     *
     * @return get
     * Modifier les valeurs des variables de la puissance du véhicule
     */
    public Integer getPuissance() {
        return puissance;
    }
    /**
     *
     * @param puissance
     * tous les set = Accéder aux valeurs des variable du véhicule
     */
    public void setPuissance(Integer puissance) {
        this.puissance = puissance;
    }

    /**
     *
     * @return get
     * Modifier les valeurs des variables des pilotes du véhicule
     */
    public Pilote getPilote() {
        return pilote;
    }
    /**
     *
     * @param pilote
     * tous les set = Accéder aux valeurs des variable du véhicule
     */
    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    /**
     *
     * @return get
     * Modifier les valeurs des variables des marques du véhicule
     */
    public String getMarque() {
        return marque;
    }

    /**
     *
     * @param marque
     * tous les set = Accéder aux valeurs des variable du véhicule
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }
    /**
     *
     * @return get
     * Modifier les valeurs des variables de la categorie du véhicule
     */
    public String getCategorie() {
        return categorie;
    }
    /**
     *
     * @param categorie
     * tous les set = Accéder aux valeurs des variable du véhicule
     */
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    /*
     * Méthode à déginir
     */
    public void dessiner(){

    }

    /*
     * Constructeur
     */
    public Vehicule(Integer numero, Integer puissance, Pilote pilote, String marque, String categorie) {
        this.numero = numero;
        this.puissance = puissance;
        this.pilote = pilote;
        this.marque = marque;
        this.categorie = categorie;
    }


}