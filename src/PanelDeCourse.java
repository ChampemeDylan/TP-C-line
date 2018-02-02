import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class PanelDeCourse extends JPanel{

    private int[] x = new int[20]; // position de chaque voiture
    private int[] y = new int[20];
    private int[] carSpeeds = new int[20];
    private int[] winners = new int[20]; // tableau des numeros des voitures gagantes
    private List<Integer> classement = new ArrayList<>();
    private Map<Integer, Integer> arrivee = new HashMap();
    private int winnersIndex = 0;
    private int numWinners = 0; // numero de la voiture gagnante
    private int finish = 1400;
    private int keepGoing = 10;
    private static int amtLeft = 500;
    private static int car = 0;
    private static int bet = 0;
    private int place = 1;
    private String[] labels = new String[20];
    protected String output = "";
    private Polygon[] tops = new Polygon[20];
    private Polygon[] windSheilds = new Polygon[20];
    private boolean tie = false;
    private boolean gameStarted;
    private boolean gameOver;
    private boolean winner = false;
    static Timer timer;


    /*
     * crée la course
     */
    public void runCar(){
        /*
         * initialise les tableaux
         */
        x[0] = 0;
        y[0] = 200;
        for(int i = 0; i < 15; i++){
            x[i] = 0;
            y[i+1] = y[i]+50;
            labels[i] = ""+(i+1);
        }

        // crée le timer
        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        // démarre le timer
        timer.start();

    }


    //paint car
    public void paintComponent(Graphics g) {
        super.paintComponents(g);


        // initialize carSpeeds & move cars forward
        for (int i = 0; i < 15; i++){
            carSpeeds[i] = keepGoing * (int) (Math.round(Math.random()));
            x[i] += carSpeeds[i];
        }

        for (int i = 0; i < 15; i++){
            labels[i] = Integer.toString(i+1);
        }


        if (keepGoing == 1 && timer.isRunning() == false){ // make sure all cars start at 0 before start button is pressed
            for (int i = 0; i < 15; i++){
                x[i] = 0;
            }
        }

        // boucle de détection du ou des vainqueurs
        for (int i = 0; i < 15; i++){
            if (x[i] > finish-100){
                keepGoing = 0; // stop cars
                timer.stop(); // stop timer
                gameOver = true; // fin de la course
                for (int index = 0; index < 15; index++){
                    labels[index] = "PERDU";
                }
                winners[numWinners] = i+1;
                if (numWinners != 0){
                    for (int index2 = 0; index2 <= numWinners; index2++){
                        labels[winners[index2]+1] = "EGALITE";
                    }
                    tie = true;
                }
                if (numWinners == 0){
                    labels[i] = "GAGNE";
                }
                numWinners++;
                    //JOptionPane.showMessageDialog(null, "Winner: car " + winners[0], "Winner Output", JOptionPane.PLAIN_MESSAGE);
            }
        }

        // remplissage du tableau de vainqueurs
        for(int i = 0; i < 15; i++) {
            if (labels[i] == "GAGNE") {
                winners[winnersIndex] = i + 1;
                winnersIndex++;
                tie = false;
                output = "Winner: Car " + (i + 1);
            }
            if (labels[i] == "EGALITE") {
                winners[winnersIndex] = i + 1;
                winnersIndex++;
                tie = true;
            }
        }

        // création de la String gérant l'egalite
        if(keepGoing == 0 && tie == true){
            output = "TIE: Winners: Cars" + winners[0];
            for (int i = 1 ; i < winnersIndex; i++) {
                output += " & " + (winners[i]);
            }
        }

        if(keepGoing == 0 && timer.isRunning() == false){
            System.out.println(output);
            //lStatus.setText(output);
            for (int i = 0 ; i < winnersIndex; i++) {
                if(winners[i] == car){
                    amtLeft += bet*2;
                    winner = true;
                }
            }
            if(!winner){
                amtLeft -= bet;
                //Vehicule.lAmtLeft.setText("$" + amtLeft);
            }
        }
        // remplit map de classement
        if (gameOver){
            for (int i = 0; i < 15; i++) {
                arrivee.put((i+1), x[i]);
                //System.out.println(arrivee.get(i+1));
            }
        }

        // genere le classement des voitures par la distance parcourue
        Object[] a = arrivee.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<Integer, Integer>) o2).getValue().compareTo(
                        ((Map.Entry<Integer, Integer>) o1).getValue());
            }
        });
        for (Object e : a) {
            System.out.println(place+" - Voiture n°"+((Map.Entry<Integer, Integer>) e).getKey());
            classement.add(((Map.Entry<Integer, Integer>) e).getKey());
            place++;
        }

        // controle remplissage classement
        for (int i = 0; i < classement.size(); i++){
            System.out.println(classement.get(i));
        }



        //LANDSCAPE
        //herbe en fond de page
        int grassValue = Integer.parseInt("339933", 16);
        g.setColor(new Color(grassValue));
        g.fillRect(0,0,getWidth(),getHeight());
        // ciel
        int lightBlueValue = Integer.parseInt("66ffff",16);
        g.setColor(new Color(lightBlueValue));
        g.fillRect(0,0,getWidth(),getHeight()-(getHeight()-(y[0]-70)));
        // soleil
        g.setColor(Color.yellow);
        g.fillOval((int)(getWidth()*0.8),30,40,40);

        for(int i = 0; i < 15; i++){
            // draw roads
            g.setColor(Color.black);
            g.fillRect(0, y[i]-25, getWidth(), 30); // draw roads
            g.setColor(Color.white);
            for (int lineX=10; lineX<getWidth(); lineX+=100){
                g.fillRect(lineX, y[i]-13, 15, 5); // draw lines
            }
            g.setColor(Color.red);
            g.fillRect(finish, y[i]-25, 16, 30); // finish line
            g.setColor(Color.white);
            g.fillRect(finish, y[i]-25, 16, 30); // draw checkered line
            g.setColor(Color.black);
            g.fillRect(finish, y[i]-25, 8, 10);
            g.fillRect(finish+8, y[i]-15, 8, 10);
            g.fillRect(finish, y[i]-5, 8, 10);
            g.setColor(Color.yellow);
            g.drawString("TRACK " + (i+1), finish + 35, y[i] - 8); // label track
            // draw car bodies
            g.setColor(Color.green);
            g.fillArc(x[i], y[i]-30, 100, 50, 0, 180);
            // draw wheels
            g.setColor(Color.black);
            g.fillOval(x[i]+15, y[i]-20, 20, 20); // left tire
            g.fillOval(x[i]+65, y[i]-20, 20, 20); // right tire
            g.setColor(Color.white);
            g.fillOval(x[i]+21, y[i]-14, 8, 8); // left hub cap
            g.fillOval(x[i]+71, y[i]-14, 8, 8); // right hub cap
            // draw tops
            g.setColor(Color.blue);
            int[] xPoly1 = {x[i]+20, x[i]+42, x[i]+58, x[i]+75};
            int[] yPoly1 = {y[i]-24, y[i]-39, y[i]-39, y[i]-24};
            tops[i] = new Polygon(xPoly1, yPoly1, 4);
            g.fillPolygon(tops[i]);
            // draw windsheilds
            g.setColor(new Color(lightBlueValue));
            int[] xTri1 = {x[i]+58, x[i]+58, x[i]+75};
            int[] yTri1 = {y[i]-39, y[i]-24, y[i]-24};
            windSheilds[i] = new Polygon(xTri1, yTri1, 3);
            g.fillPolygon(windSheilds[i]);
            // draw labels
            g.setColor(Color.red);
            g.drawString(labels[i], x[i]+35, y[i]-12);
            // draw tail lights
            g.setColor(Color.red);
            g.fillArc(x[i], y[i]-15, 16, 20, 100, 80);
            // draw head lights
            g.setColor(Color.yellow);
            g.fillArc(x[i]+84, y[i]-15, 16, 20, 0, 80);
            // draw drivers
            g.setColor(Color.black);
            g.fillOval(x[i]+58, y[i]-35, 8, 8); // head
            g.drawLine(x[i]+62, y[i]-27, x[i]+62, y[i]-24); // body
            // draw spoilers
            g.setColor(Color.yellow);
            g.drawLine(x[i]+15, y[i]-27, x[i]+15, y[i]-18);
            g.fillRect(x[i]+10, y[i]-33, 10, 11);
        }
    }
}
