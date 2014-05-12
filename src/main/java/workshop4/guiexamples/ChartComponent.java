package workshop4.guiexamples;

import javax.swing.*;
import java.awt.*;

/**
 * Created by remcoruijsenaars on 12/05/14.
 */
public class ChartComponent extends JComponent {

    public void paintComponent(Graphics g){
        g.fillRect(0, 10, 200, 10);
        g.fillRect(0, 30, 300, 10);
        g.fillRect(0, 50, 100, 10);

        g.setColor(Color.BLUE);
        g.drawString("Pauze", 70, 100);


        System.out.println("REPAINT is CALLED!");


    }

}
