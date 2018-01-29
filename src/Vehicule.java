public class Vehicule {

    /*
     * Définition des variables
     */
    Integer numero;
    Integer puissance;
    Pilote pilote;
    String marque;
    String categorie;


    /*
     * Getter et Setter
     */
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPuissance() {
        return puissance;
    }

    public void setPuissance(Integer puissance) {
        this.puissance = puissance;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
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