package workshop5.shapeexample.gui;

import workshop5.shapeexample.models.*;
import workshop5.shapeexample.models.Rectangle;
import workshop5.shapeexample.models.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

/**
 * Created by remcoruijsenaars on 14/05/14.
 */
public class ShapeDrawPanel extends JPanel implements KeyListener {

    private List<Shape> shapes;


    public ShapeDrawPanel() {

        setBackground(Color.BLACK);
        shapes = new ArrayList();
        this.setFocusable(true);
        this.addKeyListener(this);

    }

    public void init(){

        Shape circleRed = new Circle(Color.RED, 50, 50, 40);
        Shape circleGreen = new Circle(Color.GREEN, 240, 60, 50);

        Shape rectangleYellow = new Rectangle(Color.YELLOW, 60, 300, 80, 80);
        Shape rectangleOrange = new Rectangle(Color.ORANGE, 240, 300, 120, 30);


        shapes.add(circleRed);
        shapes.add(circleGreen);
        shapes.add(rectangleYellow);
        shapes.add(rectangleOrange);

        repaint();
    }

    public void reset(){
        shapes.clear();
        init();

        repaint();
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g){
        for(Shape shape: shapes){
            shape.draw(g);
        }
    }


    private void changePositionShapes(){
        Random random = new Random();
        for(Shape shape: shapes){
            int randomX = random.nextInt(this.getWidth());
            int randomY = random.nextInt(this.getHeight());
            shape.setxPos(randomX);
            shape.setyPos(randomY);
        }

        repaint();
    }

    private void moveShapes(Direction direction){

        for(Shape shape : shapes){
            shape.move(direction);
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        switch (ke.getKeyCode())
        {
            case KeyEvent.VK_R:
                changePositionShapes();
                break;
            case KeyEvent.VK_DOWN:
                moveShapes(Direction.SOUTH);
                break;
            case KeyEvent.VK_UP:
                moveShapes(Direction.NORTH);
                break;
            case KeyEvent.VK_RIGHT:
                moveShapes(Direction.EAST);
                break;
            case KeyEvent.VK_LEFT:
                moveShapes(Direction.WEST);
                break;
        }
    }
}
