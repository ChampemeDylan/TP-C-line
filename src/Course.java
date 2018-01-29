public class Course {

    // Déclaration variables de classe
    private String type;
    private int nbPilote;
    private String pays;


    // Getters/Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNbPilote() {
        return nbPilote;
    }

    public void setNbPilote(int nbPilote) {
        this.nbPilote = nbPilote;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    // Constructeur de classe
    public Course(){
        this.getNbPilote();
        this.getPays();
        this.getType();
    }
}