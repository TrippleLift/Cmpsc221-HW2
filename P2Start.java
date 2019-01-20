/** 
 * P2Start.java:
 * Draws two pads for drawing Avatars.
 * 
 * @author: Joseph Chang
 * @date: Sep 2nd, 2018
 */

import wheelsunh.users.*;
import java.awt.Color;

public class P2Start 
{
    //---------------- instance variables ------------------------------
    private Rectangle pad1, pad2;
    int x1 = 200, y1 = 200, 
        x2 = 400, y2 = 200;
    int padX = 105, padY = 123;
    
    // -----------------------------------------------------------------
    /** Constructor for the P2Start class.
     */
    public P2Start( )
    {
        pad1 = new Rectangle( x1, y1 );
        pad1.setFillColor( Color.WHITE );
        pad1.setFrameColor( Color.BLACK );
        pad1.setSize( padX, padY );
       
        pad2 = new Rectangle( x2, y2 );
        pad2.setFillColor( Color.WHITE );
        pad2.setFrameColor( Color.BLACK );
        pad2.setSize( padX, padY );
        
        //place a call to your method here to draw the avatar for pad 1
        buildFish( x1, y1 );
        //place a call to your method here to draw the avatar for pad 2
        buildFish( x2, y2 );
    }

    //build fish method, argument is the position of the fish
    void buildFish(int fishX, int fishY)
    {
        //the relative X & Y of the coordinate system
        int relativeX = 0;
        int relativeY = 0;

        fishX += relativeX;
        fishY += relativeY;

        //fish body
        Ellipse body = new Ellipse();
        body.setSize(70, 40);
        body.setLocation(27 + fishX, 45 + fishY);
        body.setColor(Color.orange);

        //fish tail
        Ellipse tail = new Ellipse();
        tail.setSize(20, 30);
        tail.setLocation(7 + fishX, 50 + fishY);
        tail.setColor(Color.orange);
        tail.setRotation(30);

        //tail lines
        Line line1 = new Line();
        line1.setSize(10, 1);
        line1.setLocation(12 + fishX, 57 + fishY);
        line1.setColor(Color.black);
        line1.setRotation(25);

        Rectangle line2 = new Rectangle();
        line2.setSize(13, 1);
        line2.setLocation(7 + fishX, 63 + fishY);
        line2.setColor(Color.black);
        line2.setRotation(13);

        Line line3 = new Line();
        line3.setSize(9, 1);
        line3.setLocation(5 + fishX, 70 + fishY);
        line3.setColor(Color.black);
        line3.setRotation(0);

        //fish upperFin
        Ellipse upperFin = new Ellipse();
        upperFin.setSize(18, 9);
        upperFin.setLocation(60 + fishX, 38 + fishY);
        upperFin.setColor(Color.orange);
        upperFin.setRotation(15);

        //fish upperFin2
        Ellipse upperFin2 = new Ellipse();
        upperFin2.setSize(14, 7);
        upperFin2.setLocation(42 + fishX, 41 + fishY);
        upperFin2.setColor(Color.orange);
        upperFin2.setRotation(-10);

        //fish lowwerFin
        Ellipse lowwerFin = new Ellipse();
        lowwerFin.setSize(18, 9);
        lowwerFin.setLocation(47 + fishX, 84 + fishY);
        lowwerFin.setColor(Color.orange);
        lowwerFin.setRotation(-10);

        //fish sideFin
        Ellipse sideFin = new Ellipse();
        sideFin.setSize(26, 13);
        sideFin.setLocation(47 + fishX, 65 + fishY);
        sideFin.setColor(Color.YELLOW);
        sideFin.setRotation(-10);

        //fish sclera
        Ellipse sclera = new Ellipse();
        sclera.setSize(15, 15);
        sclera.setLocation(77 + fishX, 55 + fishY);
        sclera.setColor(Color.white);

        //fish anatomy
        Ellipse anatomy = new Ellipse();
        anatomy.setSize(12, 12);
        anatomy.setLocation(81 + fishX, 58 + fishY);
        anatomy.setColor(Color.black);

        //fish pupil
        Ellipse pupil = new Ellipse();
        pupil.setSize(5, 5);
        pupil.setLocation(87 + fishX, 59 + fishY);
        pupil.setColor(Color.white);
    }
    
    // -----------------------------------------------------------------
    /** main program creates a frame and invokes the class constructor.
     */
    public static void main(String[] args)
    {
	    new Frame();
        P2Start app = new P2Start(); //This will draw the pads for you
    }
}
