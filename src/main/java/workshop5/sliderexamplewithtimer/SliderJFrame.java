

package workshop5.sliderexamplewithtimer;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author remcoruijsenaars
 */
public class SliderJFrame extends JFrame {
    public SliderJFrame(){
        this.setSize(new Dimension(1000, 400));
        this.add(new SliderJPanel());
        this.setVisible(true); 
    }

}
