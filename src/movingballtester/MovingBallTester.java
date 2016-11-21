/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingballtester;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
/**
 *
 * @author Akshay Bisht
 */
public class MovingBallTester 
{

private final int UPGAP_Y, LOWGAP_Y;
private MovingBallPanel mbp;
private JFrame movingBallFrame;

public MovingBallTester()
{
		
 LOWGAP_Y = 250;
 UPGAP_Y = 210;
 mbp = new MovingBallPanel(LOWGAP_Y, UPGAP_Y);
 movingBallFrame = new JFrame("Moving Ball");
 movingBallFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 movingBallFrame.addKeyListener(new KeypadListener());
 movingBallFrame.setResizable(false);
 movingBallFrame.getContentPane().add(mbp);
 displayFrame();
 runGame();
}
	
	
public void displayFrame()
 {
  movingBallFrame.pack();
  movingBallFrame.show();
 }
	
	
public void runGame()
{
 sleep(500);
 mbp.beginGame1();
 sleep(300);
 mbp.beginGame2();
 sleep(300);
 mbp.beginGame3();
 sleep(300);
 mbp.beginGame4();
 sleep(300);
 mbp.beginGame1(); 
 sleep(300);
 mbp.beginGame2();
 sleep(300);
 mbp.beginGame3();
 sleep(300);
 mbp.beginGame4();
 sleep(300);
 mbp.beginGame1();
 sleep(300);
 mbp.beginGame2();
 sleep(300);
 mbp.beginGame3();
 sleep(300);
 mbp.beginGame4();
 sleep(300);
while(true)
{
int lowerY = mbp.getLowerY();
int upperY = mbp.getUpperY();
mbp.callMoveBallMethod(lowerY,upperY);
if(mbp.checkBalls())
 {
  mbp.addAnotherBall();
 }
}
}
	
	
public void sleep(int i)
{
 try 
  {
   Thread.sleep(i);  
  }
 catch (Exception e) 
 { 
 }
}
	
	
private class KeypadListener implements KeyListener
{
    public void keyPressed(KeyEvent e)
     {
      int source = e.getKeyCode();
      if(source == KeyEvent.VK_UP)
	{
	  mbp.moveGapLocationUp();
	}
      else if(source == KeyEvent.VK_DOWN)
        {
	mbp.moveGapLocationDown();
	}
     }
		

    public void keyReleased(KeyEvent e)	
    {
    }
		
    public void keyTyped(KeyEvent e)
    {
    }
}
	
	
public static void main (String[] args)
{
 new MovingBallTester();
}
}
  