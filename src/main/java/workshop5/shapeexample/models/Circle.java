package workshop5.shapeexample.models;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author remcoruijsenaars
 */
public class Circle extends Shape{
    
    private int arc;
    
    public Circle(Color color, int xPos, int yPos, int straal){
        super(color, xPos, yPos);
        this.arc = straal;
        
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getxPos()-arc, getyPos() + arc, arc * 2, arc * 2);
    }


    public double getArc() {
        return arc;
    }

    public void setArc(int arc) {
        this.arc = arc;
    }

}
