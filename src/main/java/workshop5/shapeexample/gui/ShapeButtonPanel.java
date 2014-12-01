package workshop5.shapeexample.gui;

import workshop5.shapeexample.models.Circle;
import workshop5.shapeexample.models.Direction;
import workshop5.shapeexample.models.Rectangle;
import workshop5.shapeexample.models.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by remcoruijsenaars on 14/05/14.
 */
public class ShapeButtonPanel extends JPanel implements  ActionListener {

    private JButton startButton;
    private JButton resetButton;

    private final String START = "Start";
    private final String RESET = "Reset";

    private ShapeDrawPanel drawPanel;



    public ShapeButtonPanel(ShapeDrawPanel drawPanel){

        this.drawPanel = drawPanel;

        startButton = new JButton("Start");
        resetButton = new JButton("Reset");

        startButton.addActionListener(this);
        resetButton.addActionListener(this);

        add(startButton);
        add(resetButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(START)){
            startButton.setEnabled(false);
            drawPanel.init();
            drawPanel.requestFocus();
        }else if(e.getActionCommand().equals(RESET)){
            drawPanel.reset();
            drawPanel.requestFocus();
        }
    }
}
