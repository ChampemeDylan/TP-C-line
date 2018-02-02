import javax.swing.*;
import java.awt.*;

public class Podium {

    JButton retourMenu = new JButton("Menu");
    JButton exit = new JButton("Exit");

    public Podium() {

        fenetre();

    }

    public void fenetre() {

        // Création d'une fenetre
        JWindow fenPodium = new JWindow();
        // On lui donne une taille pour qu'on puisse la voir
        fenPodium.setSize(800, 800);
        // Centre la fenetre au milieu de l'écran
        fenPodium.setLocationRelativeTo(null);
        // Définition du content pane
        fenPodium.setContentPane(pane());
        // Garder au premier plan
        fenPodium.setAlwaysOnTop(true);
        //Rendre podium visible
        fenPodium.setVisible(true);
        //On définit le layout à utiliser sur le content pane
        fenPodium.setLayout(new BorderLayout());

        // Haut de Page
        fenPodium.getContentPane().add(new JLabel("Scores"), BorderLayout.NORTH);
        // Au centre
        fenPodium.getContentPane().add(new JTable(15, 3), BorderLayout.CENTER);

        // rendre la fenetre visible
        fenPodium.setVisible(true);

        // Event bouton exit
        exit.addActionListener(actionEvent -> {
            System.out.println("Click ! btn exit");
            // Quitter le programme
            System.exit(0);
        });

        // Event bouton retourMenu
        retourMenu.addActionListener(actionEvent -> {
            System.out.println("Click ! btn Menu");
            // Fermer la fenetre du podium
            fenPodium.dispose();

            // Fermer la fenetre de la course
        });

    }

    public void pane() {
        // Création du panel
        JPanel podium = new JPanel();
        // couleur de fond du panel
        podium.setBackground(Color.DARK_GRAY);
        // Police et taille du titre
        Font f = new Font("Arial", Font.PLAIN, 36);
        // Défini la couleur de la police
        podium.setForeground(Color.BLUE);
        // Definition de la police du panel
        podium.setFont(f);

        // Bouton lancerPartie
        podium.add(retourMenu, BorderLayout.SOUTH);
        // Bouton de sortie "Exit"
        podium.add(exit, BorderLayout.SOUTH);
    }

}
