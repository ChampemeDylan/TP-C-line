import javax.swing.*;

public class PageDeCourse extends JFrame {

    PageDeCourse(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        PanelDeCourse panel = new PanelDeCourse();

        add(panel);
        panel.runCar();

        setSize(1600, 950);
        setVisible(true);
    }

}
