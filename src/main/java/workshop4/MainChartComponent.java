package workshop4;

import workshop4.guiexamples.ChartComponent;
import workshop4.guiexamples.ChartPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by remcoruijsenaars on 12/05/14.
 */
public class MainChartComponent {


    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(new Dimension(300, 400));
        ChartComponent chartComponent = new ChartComponent();
        ChartPanel chartPanel = new ChartPanel();

        frame.add(chartComponent);
        frame.setTitle("ChartComponent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
