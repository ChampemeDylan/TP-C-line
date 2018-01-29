public class Ecurie {

    /*
    definition des variables
     */
    private String nom;
    private Vehicule vehicule;
    private Pilote pilote;

    /*
    definition constructeur
     */
    public Ecurie(String nom, Vehicule vehicule, Pilote pilote) {
        this.nom = nom;
        this.vehicule = vehicule;
        this.pilote = pilote;
    }


    /*
    getter and setter
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }
}
