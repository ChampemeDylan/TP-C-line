import javax.swing.*;

public class Podium {

    public Podium() {
        fenetre();
    }

    public void fenetre() {
        JWindow podium = new JWindow();
        //On lui donne une taille pour qu'on puisse la voir
        podium.setSize(500, 500);
        //On la rend visible
        podium.setVisible(true);
        // Centre la fenetre au milieu de l'écran
        podium.setLocationRelativeTo(null);
    }

    private void mettreEnOrdre() {

    }
}
