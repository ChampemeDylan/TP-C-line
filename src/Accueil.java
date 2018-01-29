package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

    public class Accueil extends JFrame implements ActionListener {

        JButton lancerPartie = new JButton("Lancer une partie");
        JButton exit = new JButton("Exit");
        JLabel accueil = new JLabel("Bienvenue dans le GAME !");
        ImageIcon icon = new ImageIcon("voiture.gif");
        JLabel img = new JLabel(icon);

        public  Accueil(){
            super();
            build();//On initialise notre fenêtre

        }

        private void build(){
            setTitle("Projet CGI - course auto"); //On donne un titre à l'application
            setSize(500,500); //On donne une taille à notre fenêtre
            setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
            setResizable(false); //On permet le redimensionnement
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
            setContentPane(buildContentPane());
        }

        private JPanel buildContentPane(){
            JPanel panel = new JPanel();
            panel.setBackground(Color.black);

            //Texte accueil

            //Police et taille du titre
            Font f = new Font("Arial", Font.PLAIN, 36);
            accueil.setForeground(Color.BLUE);

            accueil.setFont(f);
            panel.add(accueil);
            accueil.setVisible(true);

            //Insertion de l'image
            img.setVisible(true);
            panel.add(img);

            //Bouton lancerPartie
            panel.add(lancerPartie);

            //Bouton de sortie "Exit"
            panel.add(exit);

            //Pour pouvoir lancer l'action
            lancerPartie.addActionListener(this);
            exit.addActionListener(this);
            return panel;

        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (arg0.getSource()==lancerPartie) {
            }
            else if (arg0.getSource()==exit) {
            }
        }
    }
