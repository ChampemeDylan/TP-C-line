import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Podium /* extends PageDeCourse */ {

    JButton retourMenu = new JButton("Menu");
    JButton exit = new JButton("Exit");

    public Podium() {
        fenetre();
    }

    public void fenetre() {

        // Création d'une fenetre
        JWindow fenPodium = new JWindow();
        // On lui donne une taille pour qu'on puisse la voir
        fenPodium.setSize(480, 490);
        // Centre la fenetre au milieu de l'écran
        fenPodium.setLocationRelativeTo(null);
        // Définition du content pane
        fenPodium.setContentPane(panelA());
        // Garder au premier plan
        fenPodium.setAlwaysOnTop(true);
        //Rendre podium visible
        fenPodium.setVisible(true);
        //On définit le layout à utiliser sur le content pane
        fenPodium.setLayout(new BorderLayout());
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

    public Container panelA() {

        JLabel labelScore = new JLabel("Scores", JLabel.CENTER);

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

        // Haut de Page
        podium.add(labelScore, BorderLayout.NORTH);

        // Au centre
        podium.add(tableauScore(), BorderLayout.CENTER);

        // Bouton lancerPartie
        podium.add(retourMenu, BorderLayout.SOUTH);
        // Bouton de sortie "Exit"
        podium.add(exit, BorderLayout.SOUTH);

        return podium;
    }

    public Container tableauScore() {
        // Boucle pour remplir la premiere colonne du tableau
        ArrayList voitureArrivee = new ArrayList();
        for (int i = 0; i < 15; i++) {
            voitureArrivee.add(1);
        }

        // Boucle pour remplir la deuxieme colonne du tableau
        ArrayList courreurArrivee = new ArrayList();
        for (int i = 0; i < 15; i++) {
            courreurArrivee.add(1);
        }

        // Boucle pour remplir la troisieme colonne du tableau
        ArrayList ecurieArrivee = new ArrayList();
        for (int i = 0; i < 15; i++) {
            ecurieArrivee.add(1);
        }

        Object rowData[][] = {
                {"1", voitureArrivee.get(0), courreurArrivee.get(0), ecurieArrivee.get(0)},
                {"2", voitureArrivee.get(1), courreurArrivee.get(1), ecurieArrivee.get(1)},
                {"3", voitureArrivee.get(2), courreurArrivee.get(2), ecurieArrivee.get(2)},
                {"4", voitureArrivee.get(3), courreurArrivee.get(3), ecurieArrivee.get(3)},
                {"5", voitureArrivee.get(4), courreurArrivee.get(4), ecurieArrivee.get(4)},

                {"6", voitureArrivee.get(5), courreurArrivee.get(5), ecurieArrivee.get(5)},
                {"7", voitureArrivee.get(6), courreurArrivee.get(6), ecurieArrivee.get(6)},
                {"8", voitureArrivee.get(7), courreurArrivee.get(7), ecurieArrivee.get(7)},
                {"9", voitureArrivee.get(8), courreurArrivee.get(8), ecurieArrivee.get(8)},
                {"10", voitureArrivee.get(9), courreurArrivee.get(9), ecurieArrivee.get(9)},

                {"11", voitureArrivee.get(10), courreurArrivee.get(10), ecurieArrivee.get(10)},
                {"12", voitureArrivee.get(11), courreurArrivee.get(11), ecurieArrivee.get(11)},
                {"13", voitureArrivee.get(12), courreurArrivee.get(12), ecurieArrivee.get(12)},
                {"14", voitureArrivee.get(13), courreurArrivee.get(13), ecurieArrivee.get(13)},
                {"15", voitureArrivee.get(14), courreurArrivee.get(14), ecurieArrivee.get(14)},
        };

        Object columnNames[] = {"Position", "N° Coureur", "Nom Coureur", "Ecurie"};
        JTable tableauScore = new JTable(rowData, columnNames);
        JScrollPane scrollPane = new JScrollPane(tableauScore);
        scrollPane.setSize(300, 300);

        //JTable tableauScore = new JTable(15, 3);

        // Definir la couleur de la grille du tableau
        tableauScore.setGridColor(Color.DARK_GRAY);
        // Definir la couleur de fond du tableau
        tableauScore.setBackground(Color.GRAY);

        return scrollPane;
    }
}
