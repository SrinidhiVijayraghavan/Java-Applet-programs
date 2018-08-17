package applet;
/*
<applet code="rec" width=200 height=200>
</applet>
*/
 
import java.awt.*;
import java.applet.*;
public class rect extends Applet
{
  public void paint(Graphics g)
  {
    
    g.setColor(Color.yellow);
    g.fillRect(230, 80, 150, 100);

  }
}


