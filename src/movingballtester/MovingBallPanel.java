/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingballtester;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Akshay Bisht
 */
public class MovingBallPanel extends JPanel
{	
 private ArrayList<MovingBall> mb;
 private ArrayList<MovingBall> initials;
 private int gapLY, gapTY;
 private int level;
 private final int APPLET_WIDTH, APPLET_HEIGHT;
 public MovingBallPanel(int lowerGapY, int topGapY)
 {
  mb = new ArrayList<MovingBall>();
  initials = new ArrayList<MovingBall>();
  gapLY = lowerGapY;
  gapTY = topGapY;
  level = 1;
  APPLET_WIDTH = 640;
  APPLET_HEIGHT = 480;
  setPreferredSize(new Dimension(APPLET_WIDTH, APPLET_HEIGHT));
  setBackground(Color.black);
  mb.add(new MovingBall(20, 20, 136, 39,  131, 34,  APPLET_WIDTH, APPLET_HEIGHT, Color.cyan));
  mb.add(new MovingBall(20, 20, 200, 200, 205, 195, APPLET_WIDTH, APPLET_HEIGHT, Color.cyan));
  mb.add(new MovingBall(20, 20, 453, 282, 448, 277, APPLET_WIDTH, APPLET_HEIGHT, Color.yellow));
  mb.add(new MovingBall(20, 20, 97,  365, 92,  360, APPLET_WIDTH, APPLET_HEIGHT, Color.yellow));
  initials.add(new MovingBall(20, 20, 136, 39, 131,  34,  APPLET_WIDTH, APPLET_HEIGHT, Color.cyan)); 
  initials.add(new MovingBall(20, 20, 200, 200, 205, 195, APPLET_WIDTH, APPLET_HEIGHT, Color.cyan));
  initials.add(new MovingBall(20, 20, 453, 282, 448, 277, APPLET_WIDTH, APPLET_HEIGHT, Color.yellow));
  initials.add(new MovingBall(20, 20, 97,  365, 92,  360, APPLET_WIDTH, APPLET_HEIGHT, Color.yellow));
}
	
	
public void paintComponent(Graphics g)
{
 g.setColor(Color.black);
 g.fillRect(0,0,640,480);
 g.setColor(Color.white);
 g.fillRect(315,0,10,gapTY);
 g.fillRect(315,gapLY,10,(480-gapLY));
 g.setColor(Color.cyan);
 g.drawString("Blue", 145,20);
 g.setColor(Color.yellow);
 g.drawString("Yellow", 475,20); 
 g.setColor(Color.yellow);
 g.drawString("Directions", 541, 410);
 g.drawString("1.Use the up and down", 500,430);
 g.drawString("arrows to move", 510,442);
 g.drawString("2.Get the balls on their", 500, 457);
 g.drawString("proper sides", 510, 470);
 g.setColor(Color.cyan);
 g.drawString(("Level: " + level), 8, 472);
 g.drawString("C0d3r Cr3d|t5: M@5t3r_C0d3r",6,460);
 for(int x = 0; x < mb.size(); x++)
 {
  MovingBall t = mb.get(x);
  g.setColor(t.getBallColor());
  g.fillOval(t.getCX(), t.getCY(), t.getBallSizeX(),t.getBallSizeY());
 }	
}
	
	
public void beginGame1()
{
Graphics g = getGraphics();
g.setColor(Color.black);
g.fillRect(186,157,14,5);
g.fillRect(520,157,14,5);
g.setColor(Color.cyan);
g.drawString("Loading", 145,160);
g.setColor(Color.yellow);
g.drawString("Loading", 475,160);
}
	
	
	
public void beginGame2()
{
Graphics g = getGraphics();
g.setColor(Color.black);
g.fillRect(186,157,14,5);
g.fillRect(520,157,14,5);
g.setColor(Color.cyan);
g.drawString("Loading.", 145,160);
g.setColor(Color.yellow);
g.drawString("Loading.", 475,160);
}
	

	
public void beginGame3()
{
Graphics g = getGraphics();
g.setColor(Color.black);
g.fillRect(186,157,14,5);
g.fillRect(520,157,14,5);
g.setColor(Color.cyan);
g.drawString("Loading..", 145,160);
g.setColor(Color.yellow);
g.drawString("Loading..", 475,160);
}
	
	
	
public void beginGame4()
{
Graphics g = getGraphics();
g.setColor(Color.black);
g.fillRect(186,157,14,5);
g.fillRect(520,157,14,5);
g.setColor(Color.cyan);
g.drawString("Loading...", 145,160);
g.setColor(Color.yellow);
g.drawString("Loading...", 475,160);
}
	
	
	
public int getLowerY()
{
 return gapLY;
}
	
	
	
public int getUpperY()
{
 return gapTY;
}
	
	
	
public void callMoveBallMethod(int l, int u)
{
 for(int x = 0; x < mb.size(); x++)
  {
   MovingBall t = mb.get(x);
   t.moveBall(l,u);
   repaint();
  }
  sleep(20);
}
	
	
	
public boolean checkBalls()
{
 for(int x = 0; x < mb.size(); x++)
 {
  MovingBall temp = mb.get(x);
  Color c = temp.getBallColor();
  int currentXPosition = temp.getCX();
  if(c == Color.cyan)
  {
   if(!(currentXPosition<315))
    {
     return false;
    }
   }
  else
   {
    if( !(currentXPosition>325) )
      {
	return false;
      }
    }
 }
 return true;
}
	
	
public void addAnotherBall()
{
Random rm = new Random();
int cxValue = rm.nextInt(550) + 25;
int cyValue = rm.nextInt(435) + 25;
int xValue = -1;
int yValue = -1;
int n = rm.nextInt(4) + 1;
if(n == 1)
{
 xValue = 5;
 yValue = 5;
}
else if(n == 2)
{
 xValue = 5;
 yValue = -5;
}
else if(n == 3)
{
 xValue = -5;
 yValue = 5;
}
else if(n == 4)
{
 xValue = -5;
 yValue = -5;
}
int k = rm.nextInt(2) + 1;
Color g = Color.cyan;
if(k == 2)
 {
  g = Color.yellow;
 }
initials.add(new MovingBall(20, 20, cxValue, cyValue, (cxValue+xValue), (cyValue+yValue), APPLET_WIDTH, APPLET_HEIGHT, g));
mb.clear();
for(int y = 0; y < initials.size(); y++)
{
 mb.add(initials.get(y));
}
level++;
if(checkBalls())
{
 level--;
 initials.remove(initials.size()-1);
 addAnotherBall();
}
beginGame1();
sleep(300);
beginGame2();
sleep(300);
beginGame3();
sleep(300);
beginGame4();
sleep(300);
beginGame1();
sleep(300);
beginGame2();
sleep(300);
beginGame3();
sleep(300);
beginGame4();
sleep(300);
}
	
public void moveGapLocationUp()
{
 gapLY-=10;
 gapTY-=10;
}
	
	
public void moveGapLocationDown()
{
 gapLY+=10;
 gapTY+=10;
}
	
	
public void sleep(int i)
{
 try 
 {
  Thread.sleep (i); 
  }
catch (Exception e)
{
}
}
}
		
    

