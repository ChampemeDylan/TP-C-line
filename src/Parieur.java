public class Parieur extends Personne {
    // VARIABLES
    private int gain = 0;

    // GETTERS ET SETTERS
    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }

    // CONSTRUCTEURS
    public Parieur(String nom, String prenom, int age, String sexe) {
        super(nom, prenom, age, sexe);
    }

    // MÉTHODES
    public void parier(int numero){

    }
}