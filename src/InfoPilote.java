import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class InfoPilote extends JFrame implements ActionListener {

    //variables pour stocker les JTextfield
    String piloteNom;
    String pilotePrenom;
    Integer piloteAge;
    Integer piloteExperience;
    //panel bouton valider
    JButton boutonValide = new JButton("Valider");


    public InfoPilote() {
        super();
        build();//lance la fenetre
    }

    private void build() {
        setTitle("Pojet CGI - Info pilote");              //titre fenetre
        setSize(500, 500);                  //taille fenetre
        setLocationRelativeTo(null);                      //position fenetre
        setResizable(false);                              //pas de redimension
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //cloture de l'app en cliquant sur la croix

        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        //creation panel général
        JPanel panel = new JPanel();
        //combobox à utiliser
        JComboBox agePilote;
        JComboBox experiencePilote;
        //fond noir
        panel.setBackground(Color.BLACK);


        //choix de la police
        Font f = new Font("Serif", Font.PLAIN, 36);


        //1er panel composant le panel général
        JPanel nom = new JPanel();
        //creation zone de saisie texte
        JTextField nomPilote = new JTextField();
        //message devant la zone de saisie
        JLabel label1 = new JLabel("Nom du Pilote             ");
        //background de ce panel en noir
        nom.setBackground(Color.BLACK);
        //utilisation de la police
        nom.setFont(f);
        //label ecrit en bleu
        label1.setForeground(Color.BLUE);
        //ajout du label au panel nom
        nom.add(label1);
        //ajout saisie texte dans panel nom
        nom.add(nomPilote);
        //dimensions de la zone de saisie texte
        nomPilote.setPreferredSize(new Dimension(150, 30));


        //panel dans le panel general pour le prenom
        JPanel prenom = new JPanel();
        JTextField prenomPilote = new JTextField();
        JLabel label2 = new JLabel("Prenom du Pilote       ");
        prenom.setBackground(Color.BLACK);
        prenom.setFont(f);
        label2.setForeground(Color.BLUE);
        prenom.add(label2);
        prenom.add(prenomPilote);
        prenomPilote.setPreferredSize(new Dimension(150, 30));


        //panel dans le panel general pour l'age
        JPanel age = new JPanel();
        Object[] ageListe = new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41};
        agePilote = new JComboBox(ageListe);
        JLabel label3 = new JLabel("Age du Pilote               ");
        age.setBackground(Color.BLACK);
        age.setFont(f);
        label3.setForeground(Color.BLUE);
        age.add(label3);
        age.add(agePilote);


        //panel dans le panel general pour l'experience
        JPanel experience = new JPanel();
        Object[] experienceListe = new Object[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        experiencePilote = new JComboBox(experienceListe);
        JLabel label4 = new JLabel("Experience du Pilote en heures de jeu");
        experience.setBackground(Color.BLACK);
        experience.setFont(f);
        label4.setForeground(Color.BLUE);
        experience.add(label4);
        experience.add(experiencePilote);


        //panel dans le panel general pour le palmares
        /*JPanel palmares = new JPanel ();
        JTextField palmaresPilote = new JTextField ();
        JLabel label5 = new JLabel ("Palmares du Pilote    ");
        palmares.setBackground (Color.BLACK);
        palmares.setFont (f);
        label5.setForeground (Color.BLUE);
        palmares.add (label5);
        palmares.add (palmaresPilote);
        palmaresPilote.setPreferredSize (new Dimension(150, 30));*/





        //on rend le panel visiblr
        this.setVisible(true);
        //on centre les elements sur le panel general
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //ajout du panel nom au panel general
        panel.add(nom);
        //ajout du panel prenom
        panel.add(prenom);
        //ajout age
        panel.add(age);
        //ajout experience
        panel.add(experience);
        //ajout palmares
        //panel.add (palmares);
        //ajout bouton
        panel.add(boutonValide);
        boutonValide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //on stocke la saisie des Jtextfield dans des variables
                piloteNom = nomPilote.getText();
                pilotePrenom = prenomPilote.getText();
                piloteAge = (Integer) agePilote.getSelectedItem();
                piloteExperience = (Integer) experiencePilote.getSelectedItem();

                Pilote p1 = new Pilote(piloteNom, pilotePrenom, piloteAge, piloteExperience);


            }

        });

        //renvoie le panel general a l'utilisateur
        return panel;
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == boutonValide) {
            PageParis pageparis = new PageParis();
            pageparis.setVisible(true);
            this.dispose();
        }
    }

}