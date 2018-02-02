import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
   private JTextField  NomEcurie = new JTextField("");
   private JTextField Nation = new JTextField("Nom du pilote");

   private JLabel Titre = new JLabel("Veuillez entrer les informations permettant de créer une écurie.");

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

        //Ajout des composant dans les containers
       containerTire.add(Titre);
       containerText.add(NomEcurie);
       containerText.add(Nation);
       containerButton.add(Validation);

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
           System.out.println(Nation);

           Ecurie Ecurie1 = new Ecurie(nomecurie,Nationalite);

       }
   }








}
