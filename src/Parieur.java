public class Parieur {

    // VARIABLES
    private String nom = "";
    private String prenom = "";
    private int age = 0;

    // GETTERS ET SETTERS
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // CONSTRUCTEURS
    public Parieur() {
    }

    public Parieur(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void parier(int numero, Double montant){

    }
}
