public class Pilote {


    /**
     * Définition des variables
     */
    private String nom;
    private String prenom;
    private int age;
    private int experience;
    private Palmares palmares;
    private int numero;


    /**
     * Permet  de retourner le nom
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Permet de définir le nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Permet de retourner le nom
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Permet de définir le prenom
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Permet de retourner l'age
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Permet de définir l'age
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Permet de retourner l'Experience
     * @return
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Permet de définir l'Experience
     * @param experience
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Permet de retourner le Palmares
     * @return
     */
    public Palmares getPalmares() {
        return palmares;
    }

    /**
     * Permet de définir le Palmares
     * @param palmares
     */
    public void setPalmares(Palmares palmares) {
        this.palmares = palmares;
    }

    /**
     * Permet de retourner le Numero
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Permet de définir le Numero
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /*
     * Constructeur
     */

    /**
     * Constructeur de classe qui prend en parametres :
     *
     * @param nom
     * @param prenom
     * @param age
     * @param experience
     * @param palmares
     */
    public Pilote(String nom, String prenom, int age, int experience, Palmares palmares) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.experience = experience;
        this.palmares = palmares;
    }
}
