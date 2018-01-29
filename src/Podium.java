import javax.swing.*;
import java.awt.*;

public class Podium {

    JButton retourMenu = new JButton("Menu");
    JButton exit = new JButton("Exit");

    public Podium() {
        fenetre();
    }

    public void fenetre() {

        // Création du panel
        JPanel podium = new JPanel();
        // couleur de fond du panel
        podium.setBackground(Color.DARK_GRAY);
        // Police et taille du titre
        Font f = new Font("Arial", Font.PLAIN, 36);
        // ??????
        podium.setForeground(Color.BLUE);
        // Definition de la police du panel
        podium.setFont(f);

        //Création d'une fenetre
        JWindow fenPodium = new JWindow();
        //On lui donne une taille pour qu'on puisse la voir
        fenPodium.setSize(500, 500);
        // Centre la fenetre au milieu de l'écran
        fenPodium.setLocationRelativeTo(null);
        // Définition du content pane
        fenPodium.setContentPane(podium);

        //Rendre podium visible
        fenPodium.setVisible(true);

        //Bouton lancerPartie
        podium.add(retourMenu);
        //retourMenu.addActionListener();

        //Bouton de sortie "Exit"
        podium.add(exit);

        exit.addActionListener(actionEvent -> {
            System.out.println("Click ! btn exit");
            System.exit(0);
        });

        retourMenu.addActionListener(actionEvent -> {
            System.out.println("Click ! btn Menu");
            // Ajouter methode menu.
        });

    }

    private void mettreEnOrdre() {

    }
}
