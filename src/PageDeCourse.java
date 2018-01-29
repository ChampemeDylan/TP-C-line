import java.awt.*;

public class PageDeCourse {

    private int keepGoing, numWinners;
    private boolean tie;

    //paint car
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

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
    }
}
