import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfosCourse extends JFrame implements ActionListener {

    public static String TypeVehicule;
    public static String NbrePilote;
    public static String ChoixPays;

    JLabel infosJoueur = new JLabel("Bienvenue dans les informations de la Course !");
    JButton annulePartie = new JButton("Annuler partie ");
    JButton okinfos = new JButton("Valider les infos ");

    String[] tabChoix = {"Choisir le type de vehicule :", "Voiture", "Aéroglisseur"};
    JComboBox listeType = new JComboBox(tabChoix);

    String[] tabChoix2 = {"Choisir le nombre de pilote :", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
    JComboBox nbPilote = new JComboBox(tabChoix2);

    String[] tabChoix3 = {"Choisir le pays", "France", "Allemagne", "Espagne", "Russie", "Portugal", "Italie", "Suisse", "Belgique", "Hollande", "Grèce", "Norvège", "Suède", "Chine", "Japon", "Amérique"};
    JComboBox listePays = new JComboBox(tabChoix3);

//Getter and Setter
    public JComboBox getListeType() {
        return listeType;
    }

    public void setListeType(JComboBox listeType) {
        this.listeType = listeType;
    }

    public static String getNbrePilote() {
        return NbrePilote;
    }

    public static void setNbrePilote(String nbrePilote) {
        NbrePilote = nbrePilote;
    }

    public static String getChoixPays() {
        return ChoixPays;
    }

    public static void setChoixPays(String choixPays) {
        ChoixPays = choixPays;
    }


    public  InfosCourse() {
        super();
        build();
    }

    private void build() {
        setTitle("Projet CGI - course auto");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        JPanel center = new JPanel();
        center.setBackground(Color.black);


        // Demande infos Joueur
        //Police et taille du titre
        Font f = new Font("Arial Black", Font.PLAIN, 16);
        infosJoueur.setForeground(Color.blue);
        infosJoueur.setBounds(20,50,420,30);
        infosJoueur.setFont(f);
        center.add(infosJoueur);
        infosJoueur.setVisible(true);

        //infos client demandés
        final JLabel donnees = new JLabel();

        //Choix de liste des véhicules
        listeType.setBounds(20, 150, 400, 30);
        listeType.setBackground(Color.magenta);

        //Choix de liste du nombre de pilote
        nbPilote.setBounds(20, 200, 400, 30);
        nbPilote.setBackground(Color.magenta);

        //Choix de liste du pays
        listePays.setBounds(20, 250, 400, 30);
        listePays.setBackground(Color.magenta);

        //ajout des actions
        center.add(listeType);
        center.add(nbPilote);
        center.add(listePays);
        center.add(donnees);
        center.setSize(600, 600);
        center.setLayout(null);
        center.setVisible(true);

        //Validation des infos
        okinfos.setBounds(70, 320, 150, 30);

        //Annulation partie
        annulePartie.setBounds(240, 320, 150, 30);
        annulePartie.addActionListener(new ItemAction());
        okinfos.addActionListener((new ItemAction()));

        //Validation des actions
        center.add(okinfos);
        center.add(annulePartie);

        return center;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Action du retour à l'accueil en cas d'annulation de partie
    class ItemAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==okinfos){
                TypeVehicule = (String) listeType.getSelectedItem();
                NbrePilote = (String) nbPilote.getSelectedItem();
                ChoixPays = (String) listePays.getSelectedItem();
            }

            if(e.getSource()==annulePartie){
                Accueil accueil = new Accueil();
                accueil.setVisible(true);
                InfosCourse.this.dispose();
            }
        }
    }
}
