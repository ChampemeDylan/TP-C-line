public class Pilote extends Personne{

    // Définition des variables
    private int experience;
    private Palmares palmares;
    private int numero;
    private Double montant;

    // Getters et Setters
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

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    //     Constructeurs
    public Pilote(int experience, Palmares palmares, int numero, Double montant) {
        this.experience = experience;
        this.palmares = palmares;
        this.numero = numero;
        this.montant = montant;
    }

    public Pilote(String nom, String prenom, int age, String sexe, int experience, Palmares palmares, int numero, Double montant) {
        super(nom, prenom, age, sexe);
        this.experience = experience;
        this.palmares = palmares;
        this.numero = numero;
        this.montant = montant;
    }
}
