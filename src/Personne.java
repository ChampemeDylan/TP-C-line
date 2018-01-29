public class Personne {

    // Creation des variables de classe: nom, prenom, age, sexe
    private String nom;
    private String prenom;
    private int age = 0;
    private String sexe;

    // Creation des Getters/Setters
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
        prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    // Création des constructeurs
    public Personne(){

    }

    public Personne(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }
}