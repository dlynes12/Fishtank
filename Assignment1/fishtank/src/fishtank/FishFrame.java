package fishtank;
import java.awt.*;
import javax.swing.JFrame;

/**
 * Displays the fish tank.
 */
public class FishFrame extends JFrame {

  /** My Serializable id.  */
  private static final long serialVersionUID = 1409191926708912242L;

    /**
     * Paints this fish tank.
     *
     * @param  g  the graphics context to use for painting.
     */
    public void paint(Graphics g) {

        // Get my width and height.
        int w = getBounds().width;
        int h = getBounds().height;
        
        // Paint the window white.
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
 
			// Tell all the fishtank items to draw themselves.
            for (int a = 0; a != (int) (480 / 10); a++) {
            for (int b = 0; b != (int) (640 / 6); b++) {
              if (FishTank.myLittleFishies[a][b] != null)
                  if (FishTank.myLittleFishies[a][b] instanceof Fish) {
                      ((Fish) FishTank.myLittleFishies[a][b]).draw(g);
                  }else if (FishTank.myLittleFishies[a][b] instanceof Seaweed) {
                    ((Seaweed) FishTank.myLittleFishies[a][b]).draw(g);
                  }else if (FishTank.myLittleFishies[a][b] instanceof HungryFish) {
                    ((HungryFish) FishTank.myLittleFishies[a][b]).draw(g);
                  }if (FishTank.myLittleFishies[a][b] instanceof Bubble) {
                      ((Bubble) FishTank.myLittleFishies[a][b]).draw(g);
                  }
            }
            }

    }
}
