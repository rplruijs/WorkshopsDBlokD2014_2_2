

package workshop5.shapeexample.models;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author remcoruijsenaars
 */
public abstract class Shape {
    
    private Color color;
    private int xPos;
    private int yPos;
    
    private final static int MOVEMENT = 20;

    public Shape(Color color, int xPos, int yPos) {
        this.color = color;
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public void move(Direction direction){
        switch(direction){
            case NORTH:
                yPos-=MOVEMENT;
                break;
            case SOUTH:
                yPos+=MOVEMENT;
                break;
            case WEST:
                xPos-=MOVEMENT;
                break;
            case EAST:
                xPos+=MOVEMENT;
                break;
        }
    }
    
    

    public abstract void draw(Graphics g);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
    
    
    

}
