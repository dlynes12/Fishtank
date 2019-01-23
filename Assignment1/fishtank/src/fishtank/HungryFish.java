package fishtank;
import java.awt.*;

/**
 * A fish.
 */
public class HungryFish extends Fish{

    /** How this fish appears on the screen. */
    public String frontAp;
    public String backAp;

    /**
     * Constructs a new hungry fish.
     */
    public HungryFish() {
        colour = Color.cyan.darker().darker().darker();
        frontAp = "><MEHUNGRY>";
        backAp = "<MEHUNGRY><";
        goingRight = true;
    }


    /**
     * Set this item's location.
     * @param a the first coordinate.
     * @param b  the second coordinate.
     */
    public void setLocation(int a, int b) {
      super.setLocation(a,b);
    }



    /**
     * Causes this fish to blow a bubble.
     */
    public void blowBubble(int y, int x){
        super.blowBubble(y,x);

    }


    /**
     * Turns this fish around, causing it to reverse direction.
     */
    public String reverseAppearance() {
        String reverse;
        reverse = frontAp;
        frontAp = backAp;
        backAp = reverse;
        return frontAp;
    }


    /**
     * Build and initialize this fish's forward and backward
     * appearances.
     */
    protected void turnAround() {
        goingRight = !goingRight;
        if (goingRight) {
            frontAp = this.reverseAppearance();
        } else {
            frontAp = this.reverseAppearance();
        }
    }




    /**
     * Draws the given string in the given graphics context at
     * at the given cursor location.
     *
     * @param  g  the graphics context in which to draw the string.
     * @param  s  the string to draw.
     * @param  x  the x-coordinate of the string's cursor location.
     * @param  y  the y-coordinate of the string's cursor location.
     */
    void drawString(Graphics g, String s, int x, int y) {
        /*g.setColor(colour);
        g.setFont(FONT);
        FontMetrics fm = g.getFontMetrics(FONT);
        g.drawString(s, y*fm.charWidth('W'), x*fm.getAscent());*/
        super.drawString(g, s, x, y);
    }



    /**
     * Draws this fish tank item.
     *
     * @param  g  the graphics context in which to draw this item.
     */
    public void draw(Graphics g) {
        super.drawString(g, frontAp, x, y);
    }



    /**
     * Causes this item to take its turn in the fish-tank simulation.
     */
    public void move() {

        // Move one spot to the right or left.
        if (goingRight){ if(y < 94) {
            y += 1;//move right
        }else { y -= 1;}
        } else if (y >2) {
            y -= 1;
        }
        // Figure out whether I blow a bubble.
        double d = Math.random();
        // If it's less than 10%, blow a bubble.
        if (d < 0.1) { blowBubble(y,x); }
        // Figure out whether I turn around.
        d = Math.random();
        // If it's elss tahn 10%, turn around
        if (d < 0.1) { turnAround(); }

        // Figure out whether to move up or down, or neither.
        d = Math.random();
        // If it's elss tahn 10%, move up or down.
        if (d < 0.1){if (x < 42){x += 1;// down
        }else {x -=1;}//move up from bottom wall
        }else if (d < 0.2){if(x > 4) {
            x -= 1; // up
        }else{x +=1;}}//move down from top wall}}
    }
}
