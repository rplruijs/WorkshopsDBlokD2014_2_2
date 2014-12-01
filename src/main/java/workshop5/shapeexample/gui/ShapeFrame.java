package workshop5.shapeexample.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by remcoruijsenaars on 14/05/14.
 */
public class ShapeFrame extends JFrame {


    public ShapeFrame(){
        setSize(new Dimension(600, 800));
        setTitle("Shape frame");
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ShapeDrawPanel drawPanel = new ShapeDrawPanel();

        getContentPane().add(new ShapeButtonPanel(drawPanel), BorderLayout.NORTH);
        getContentPane().add(drawPanel, BorderLayout.CENTER);

        setVisible(true);


    }



}
