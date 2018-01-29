import java.util.Date;

public class GrandPrix extends Course {

    // Déclaration variables de classe
    private String Meteo;
    private Date date;


    // Getters/Setters
    public String getMeteo() {
        return Meteo;
    }

    public void setMeteo(String meteo) {
        Meteo = meteo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Constructeur de classe
    public GrandPrix(){

        this.getMeteo();
        this.getDate();
    }
}