package applet;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class circle extends Applet{
 
	public void paint(Graphics g){
		
		//set color to red
		 g.setColor(Color.red);
		
		/*
		 * to draw an arc in an applet window use,
		 * void drawArc(int x1,int y1, int width, int height,int startAngle, int arcAngle)
		 * method.
		 * 
		 * This method draws an arc of specified width and
		 * height at (x1,y1)
		 */
		
		//this will draw an arc of width 50 & height 100 at (10,10)
		g.drawArc(10,10,100,100,0,360);
		g.setColor(Color.GREEN);
		g.fillOval(10,10,100,100);
		
		
		/*
		 * To draw a filled arc use
		 * fillArc(int x1,int y1, int width, int height,int startAngle, int arcAngle)
		 * method of Graphics class.
		 */
	}
}