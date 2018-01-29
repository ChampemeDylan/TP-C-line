public class Parieur extends Personne {

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


    public Parieur(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void parier(int numero, Double montant){

    public Parieur(String nom, String prenom, int age, String sexe, String nom1, String prenom1, int age1) {
        super(nom, prenom, age, sexe);
        this.nom = nom1;
        this.prenom = prenom1;
        this.age = age1;
    }
}
