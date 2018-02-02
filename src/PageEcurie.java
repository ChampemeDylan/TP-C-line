import com.sun.beans.decoder.ValueObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JButton;


public class PageEcurie extends JFrame{
    private String nomecurie;
    private String Nationalite;
    //Creation des getter setter

    public String getNomecurie() {
        return nomecurie;
    }

    public void setNomecurie(String nomecurie) {
        this.nomecurie = nomecurie;
    }

    public String getNationalite() {
        return Nationalite;
    }

    public void setNationalite(String nationalite) {
        Nationalite = nationalite;
    }
    //Creation des differents containers utilise pour placés les éléments de la page

    private JPanel containerGéneral = new JPanel();
    JPanel containerTire = new JPanel();
    JPanel containerText = new JPanel();
    JPanel containerButton =new JPanel();
    private JButton Validation = new JButton("Validation");
    private JTextField  NomEcurie = new JTextField("Nom de l'écurie");
    private JTextField Nation = new JTextField("Nationalité de l'écurie");

    private JLabel Titre = new JLabel("Veuillez entrer les informations permettant de créer une écurie.");

    Pilote Pilote1 = new Pilote("Jacky","Bernard",35,"Homme",5,null,01);
    Pilote Pilote2 = new Pilote("Michel","Jojo",12,"Homme",5,null,02);
    Pilote Pilote3 = new Pilote("Vergne","Francçois",74,"Homme",5,null,03);
    Pilote Pilote4 = new Pilote("Dumas","Bernard",45,"Femme",5,null,04);
    ArrayList listepilote = new ArrayList();
    private JComboBox liste1;

    public PageEcurie(){

        //Initialisation de ma fenetre

        JFrame PageEcurie = new JFrame();
        setTitle("Creation d'une écurie");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        containerText.setPreferredSize(new Dimension(80,150));

        //Separation de la page sous forme de cellules de tableau

        containerGéneral.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //positionnement des elements du tableau grace a leurs coordonées
        gbc.gridx = 0;
        gbc.gridy= 0;

        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        containerGéneral.add(containerTire, gbc);


        gbc.gridx = 0;
        gbc.gridy= 1;

        gbc.gridheight =1 ;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        containerGéneral.add(containerText, gbc);

        gbc.gridx = 0;
        gbc.gridy= 3;

        gbc.gridheight =1 ;
        gbc.gridwidth = 1;

        containerGéneral.add(containerButton, gbc);

        Object[] elements = new Object[]{Pilote1,Pilote2,Pilote3,Pilote4};
        liste1 = new JComboBox();
        liste1.addItem(Pilote1.getNom());
        liste1.addItem(Pilote2.getNom());
        liste1.addItem(Pilote3.getNom());
        liste1.addItem(Pilote4.getNom());

        //Ajout des composant dans les containers
        containerTire.add(Titre);
        containerText.add(NomEcurie);
        containerText.add(Nation);
        containerButton.add(Validation);
        containerText.add(liste1);

        Validation.addActionListener(new BoutonListener());







        this.setContentPane(containerGéneral);
        this.setVisible(true);

    }
    class BoutonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            nomecurie = NomEcurie.getText();
            Nationalite= Nation.getText();
//Creer une super classe construisant pilote vehicule et ecurie !!

            System.out.println(nomecurie);
            System.out.println(Nationalite);
            Ecurie ecurie1 = new Ecurie(nomecurie,Nationalite,null,null);


        }
    }








}
