package applet;


import java.awt.*;
import java.awt.event.*;

public class image extends Frame{
  Image img;
  public static void main(String[] args){
  image ai = new image();
  }

  public image(){
  super("Image Frame");
  MediaTracker mt = new MediaTracker(this);
  img = Toolkit.getDefaultToolkit().getImage("img.jpg");
  mt.addImage(img,0);
  setSize(100,100);
  setVisible(true);
  addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent we){
  dispose();
  }
  });
  }
  public void update(Graphics g){
  paint(g);
  }
  
  public void paint(Graphics g){
  if(img != null)
  g.drawImage(img,10,10, this);
  else
  g.clearRect(0, 0, getSize().width, getSize().height);
  }

}
