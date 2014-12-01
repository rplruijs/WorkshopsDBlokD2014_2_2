

package workshop5.shapeexample.models;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author remcoruijsenaars
 */
public class Rectangle extends Shape{
    
    private int height;
    private int width;

    public Rectangle(Color color, int xPos, int yPos, int length, int width) {
        super(color, xPos, yPos);
        this.height = length;
        this.width = width;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getxPos(), getyPos(), width, height);
    }

    public int getLength() {
        return height;
    }

    public void setLength(int length) {
        this.height = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
