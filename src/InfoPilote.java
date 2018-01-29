import javax.swing.*;
import java.awt.*;

public class InfoPilote extends JFrame {


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
        //fond noir
        panel.setBackground(Color.BLACK);

        //choix de la police
        Font f = new Font("Serif", Font.PLAIN, 36);


        //1er panel composant le panel général
        JPanel nom = new JPanel ();
        //creation zone de saisie texte
        JTextField nomPilote = new JTextField ();
        //message devant la zone de saisie
        JLabel label1 = new JLabel ("Nom du Pilote             ");
        //background de ce panel en noir
        nom.setBackground (Color.BLACK);
        //utilisation de la police
        nom.setFont (f);
        //label ecrit en bleu
        label1.setForeground (Color.BLUE);
        //ajout du label au panel nom
        nom.add (label1);
        //ajout saisie texte dans panel nom
        nom.add (nomPilote);
        //dimensions de la zone de saisie texte
        nomPilote.setPreferredSize(new Dimension (150, 30));


        //panel dans le panel general pour le prenom
        JPanel prenom = new JPanel ();
        JTextField prenomPilote = new JTextField ();
        JLabel label2 = new JLabel ("Prenom du Pilote       ");
        prenom.setBackground (Color.BLACK);
        prenom.setFont (f);
        label2.setForeground (Color.BLUE);
        prenom.add (label2);
        prenom.add (prenomPilote);
        prenomPilote.setPreferredSize (new Dimension (150, 30));


        //panel dans le panel general pour l'age
        JPanel age = new JPanel ();
        JTextField agePilote = new JTextField ();
        JLabel label3 = new JLabel ("Age du Pilote               ");
        age.setBackground (Color.BLACK);
        age.setFont (f);
        label3.setForeground (Color.BLUE);
        age.add (label3);
        age.add (agePilote);
        agePilote.setPreferredSize(new Dimension(150, 30));



        //panel dans le panel general pour l'experience
        JPanel experience = new JPanel ();
        JTextField experiencePilote = new JTextField ();
        JLabel label4 = new JLabel ("Experience du Pilote ");
        experience.setBackground (Color.BLACK);
        experience.setFont (f);
        label4.setForeground (Color.BLUE);
        experience.add (label4);
        experience.add (experiencePilote);
        experiencePilote.setPreferredSize (new Dimension(150, 30));



        //panel dans le panel general pour le palmares
        JPanel palmares = new JPanel ();
        JTextField palmaresPilote = new JTextField ();
        JLabel label5 = new JLabel ("Palmares du Pilote    ");
        palmares.setBackground (Color.BLACK);
        palmares.setFont (f);
        label5.setForeground (Color.BLUE);
        palmares.add (label5);
        palmares.add (palmaresPilote);
        palmaresPilote.setPreferredSize (new Dimension(150, 30));



        //on rend le panel visiblr
        this.setVisible (true);
        //on centre les elements sur le panel general
        panel.setLayout (new FlowLayout(FlowLayout.CENTER));
        //ajout du panel nom au panel general
        panel.add (nom);
        //ajout du panel prenom
        panel.add (prenom);
        //ajout age
        panel.add (age);
        //ajout experience
        panel.add (experience);
        //ajout palmares
        panel.add (palmares);
        //renvoie le panel general a l'utilisateur
        return panel;

    }
}