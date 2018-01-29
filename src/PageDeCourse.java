import javax.swing.*;
import java.awt.*;
import java.util.Timer;

public class PageDeCourse extends JFrame{
/*
   private int[] x = new int[20];
   private int[] y = new int[20];
   private int[] carSpeeds = new int[20];
   private int[] winners = new int[20];
   private int winnersIndex = 0;
   private int numWinners = 0;
   private int finish = 1400;
   private int keepGoing = 1;
   private static int amtLeft = 500;
   private static int car = 0;
   private static int bet = 0;
   private String[] labels = new String[20];
   protected String output = "";
   private Polygon[] tops = new Polygon[20];
   private Polygon[] windSheilds = new Polygon[20];
   private boolean tie = false;
   private boolean gameStarted;
   private boolean gameOver;
   private boolean winner = false;
   static Timer timer;




    //paint car
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        // initialize carSpeeds & move cars forward
        for (int i = 0; i < 15; i++){
            carSpeeds[i] = keepGoing * (int) (Math.round(Math.random()));
            x[i] = 0;
        }

        if (keepGoing == 1 && timer.isRunning() == false){ // make sure all cars start at 0 before start button is pressed
            for (int i = 0; i < 14; i++){
                x[i] = 0;
            }
        }

        for (int i = 0; i < 15; i++){
            if (x[i] > finish-100){
                keepGoing = 0; // stop cars
                timer.stop(); // stop timer
                for (int index = 0; index < 15; index++){
                    labels[index] = "LOSE";
                }
                winners[numWinners] = i+1;
                if (numWinners != 0){
                    for (int index2 = 0; index2 <= numWinners; index2++){
                        labels[winners[index2]+1] = "TIE";
                    }
                    tie = true;
                }
                if (numWinners == 0){
                    labels[i] = "WIN";
                }
                numWinners++;
                    //JOptionPane.showMessageDialog(null, "Winner: car " + winners[0], "Winner Output", JOptionPane.PLAIN_MESSAGE);
            }
        }

        if(keepGoing == 0 && tie == true){
            output = "TIE: Winners: Cars" + winners[0];
            for (int i = 1 ; i < winnersIndex; i++) {
                output += " & " + (winners[i]);
            }
        }

        if(keepGoing == 0 && timer.isRunning() == false){
            System.out.println(output);
            lStatus.setText(output);
            for (int i = 0 ; i < winnersIndex; i++) {
                if(winners[i] == car){
                    amtLeft += bet*2;
                    winner = true;
                }
            }
            if(!winner){
                amtLeft -= bet;
                Vehicule.lAmtLeft.setText("$" + amtLeft);
            }
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
    }*/
}
