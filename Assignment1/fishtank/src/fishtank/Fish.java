package fishtank;
import java.awt.*;

/**
 * A fish.
 */
public class Fish {

    static Font FONT = new Font("Monospaced", Font.PLAIN, 10);
    Color colour;

    /** Indicates whether this fish is moving right. */
    boolean goingRight;
    /** This is the first coordinate. */
    public int x;
    /** This is the second coordinate. */
    public int y;
    /** How this object appears on screen appears on the screen. */
    String appearance;
    String backAppearance;


    /**
     * Constructs a new fish.
     */
    public Fish() {
        colour = Color.cyan.darker().darker().darker();
        appearance = "><>";
        backAppearance = "<><";
        goingRight = true;
    }



    /**
     * Set this item's location.
     * @param a the first coordinate.
     * @param b  the second coordinate.
     */
    public void setLocation(int a, int b) {
        // set x to a
        x = a;
        // set y to b
        y = b;
    }



    /**
     * Causes this fish to blow a bubble.
     */
    protected void blowBubble(int y, int x) {
		  Bubble b = new Bubble();
		  b.setLocation(y, x);
		  System.out.println(x + " " + y);
        System.out.println(b);
            if (FishTank.myLittleFishies[x][y] == null){ FishTank.myLittleFishies[x][y] = b;}
    }



    /**
     * Build and initialize this fish's forward and backward
     * appearances.
     */
    private String reverseAppearance() {
        String reverse;
        reverse = appearance;
        appearance = backAppearance;
        backAppearance = reverse;
        return appearance;

    }



    /**
     * Turns this fish around, causing it to reverse direction.
     */
    protected void turnAround() {
        goingRight = !goingRight;
        if (goingRight) {
            appearance = reverseAppearance();
        } else {
            appearance = reverseAppearance();
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
        g.setColor(colour);
        g.setFont(FONT);
        FontMetrics fm = g.getFontMetrics(FONT);
        g.drawString(s, y*fm.charWidth('W'), x*fm.getAscent());
    }




    /**
     * Draws this fish tank item.
     *
     * @param  g  the graphics context in which to draw this item.
    */
    public void draw(Graphics g) {
        drawString(g, appearance, x, y);
    }



    /**
     * Causes this item to take its turn in the fish-tank simulation.
     */
    public void move() {

        // Move one spot to the right or left.
        if (goingRight){if (y < 102) {
            y += 1;}//move right
            else {this.turnAround();}  // move left from right wall
        } else if (y >4) {
            y -= 1;//move left
        }

        // Figure out whether I blow a bubble.
        double d = Math.random();
        if (d < 0.1) { blowBubble(y,x); }

        // Figure out whether I turn around.
        d = Math.random();
        if (d < 0.1) { turnAround(); }

        // Figure out whether to move up or down, or neither.
		d = Math.random();
        if (d < 0.1){if (x < 42){x += 1;// down
            }else {x -=1;}//move up from bottom wall
        }else if (d < 0.2){if(x > 4) {
            x -= 1; // up
        }else{x +=1;}}//move down from top wall}}
    }
}
