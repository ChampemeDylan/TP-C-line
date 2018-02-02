import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageParis extends JFrame implements ActionListener {

    public static String choixPilote;
    public static String nbreParieurs;

    Pilote piloteA = new Pilote("Elwert", "Aline", 24, "F",5,null, 28);
    Pilote piloteC = new Pilote("Aubry", "Camille", 25, "F",5,null, 19);
    Pilote piloteB = new Pilote("Bon", "Jean", 23, "H",5,null, 5);

    JLabel nbParieur = new JLabel("Il est temps de choisir votre pilote et de parier !");
    JButton annulePartie = new JButton("Retour accueil ");
    JButton okinfos = new JButton("Valider les infos ");

    String[] comboPilotes = {"Choisissez votre pilote :", piloteA.getNom()+ " "+piloteA.getPrenom(), piloteB.getNom()+" "+piloteB.getPrenom(), piloteC.getNom()+" "+piloteC.getPrenom()};
    JComboBox listeType = new JComboBox(comboPilotes);

    JLabel parieurSelect1 = new JLabel("Parieur 1");
    JLabel parieurSelect2 = new JLabel("Parieur 2");
    JLabel parieurSelect3 = new JLabel("Parieur 3");
    JLabel parieurSelect4 = new JLabel("Parieur 4");
    JLabel parieurSelect5 = new JLabel("Parieur 5");
    JLabel parieurSelect6 = new JLabel("Parieur 6");

    String[] tabChoix2 = {"Choisissez le nombre de parieurs :", "1", "2", "3", "4", "5", "6"};
    JComboBox nbPilote = new JComboBox(tabChoix2);

    String choixCombo = (String) nbPilote.getSelectedItem();



//Getter and Setter

    /**
     *
     *@return get
     * Modifier les valeurs des variables de la liste Type
     */
    public JComboBox getListeType() {
        return listeType;
    }

    /**
     *
     * @param listeType
     * tous les set = Accéder aux valeurs des variable du véhicule
     */

    public void setListeType(JComboBox listeType) {
        this.listeType = listeType;
    }

    /**
     *
     *@return get
     * Modifier les valeurs des variables du nombre de Pilote
     */
    public static String getNbreParieurs() {
        return nbreParieurs;
    }

    /**
     *
     * @param nbreParieurs
     * tous les set = Accéder aux valeurs des variable du véhicule
     */

    public static void setNbreParieurs(String nbreParieurs) {
        nbreParieurs = nbreParieurs;
    }

private void parieurs(){
 switch (choixCombo){
     case "1":
         parieurSelect1.setVisible(true);
         break;
     case "2":
         parieurSelect2.setVisible(true);
         break;
     case "3":
         parieurSelect3.setVisible(true);
         break;
     case "4":
         parieurSelect4.setVisible(true);
         break;
     case "5":
         parieurSelect5.setVisible(true);
         break;
     case "6":
         parieurSelect5.setVisible(true);
         break;
         default:
 }

}


    public  PageParis() {
        super();
        build();
        parieurs();
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
        nbParieur.setForeground(Color.blue);
        nbParieur.setBounds(20,50,420,30);
        nbParieur.setFont(f);
        center.add(nbParieur);
        nbParieur.setVisible(true);

        //infos client demandés
        final JLabel donnees = new JLabel();

        //Choix de liste des véhicules
        listeType.setBounds(20, 150, 400, 30);
        listeType.setBackground(Color.magenta);

        //Choix de liste du nombre de pilote
        nbPilote.setBounds(20, 200, 400, 30);
        nbPilote.setBackground(Color.magenta);

        //ajout des actions
        center.add(nbParieur);
        center.add(listeType);
        center.add(nbPilote);
        center.add(donnees);
        center.setSize(600, 600);
        center.setLayout(null);
        center.setVisible(true);

        //ajout des paris
        center.add(parieurSelect1);
        parieurSelect1.setVisible(false);
        center.add(parieurSelect1);
        parieurSelect2.setVisible(false);
        center.add(parieurSelect1);
        parieurSelect3.setVisible(false);
        center.add(parieurSelect1);
        parieurSelect4.setVisible(false);
        center.add(parieurSelect1);
        parieurSelect5.setVisible(false);
        center.add(parieurSelect1);
        parieurSelect6.setVisible(false);

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
               choixPilote = (String) listeType.getSelectedItem();
                nbreParieurs = (String) nbPilote.getSelectedItem();
            }

            //Validation des infos (amène sur la page d'infos pilote)
            if (e.getSource()== okinfos){
                PageDeCourse pageDeCourse = new PageDeCourse();
                pageDeCourse.setVisible(true);
                PageParis.this.dispose();
            }
            //Annulation de partie donc retour à la page d'accueil
            if(e.getSource()==annulePartie){
                Accueil accueil = new Accueil();
                accueil.setVisible(true);
                PageParis.this.dispose();
            }
        }
    }
}
