public class Pilote {

    /*
     * Définition des variables
     */
    private String nom;
    private String prenom;
    private int age;
    private int experience;
    private Palmares palmares;
    private int numero;

    /*
     * Getter et Setter
     */
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Palmares getPalmares() {
        return palmares;
    }

    public void setPalmares(Palmares palmares) {
        this.palmares = palmares;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /*
     * Constructeur
     */
    public Pilote(String nom, String prenom, int age, int experience, Palmares palmares) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.experience = experience;
        this.palmares = palmares;
    }
}
