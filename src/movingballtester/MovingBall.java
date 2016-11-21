/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingballtester;

/**
 *
 * @author Akshay Bisht
 */
import java.awt.*; 

public class MovingBall
{
private int ballSizeX, ballSizeY;
private int ballCX, ballCY;
private int ballPX, ballPY;
private int maxX, maxY;
Color color;

public MovingBall(int xsize, int ysize, int cX, int cY, int pX, int pY, int windowSizeX, int windowSizeY, Color c)
{
 ballSizeX = xsize; 
 ballSizeY = ysize; 
 ballCX = cX; 
 ballCY = cY; 
 ballPX = pX; 
 ballPY = pY; 
 maxX = windowSizeX; 
 maxY = windowSizeY; 
 color = c; 
}

	
public int getBallSizeX()
{
 return ballSizeX;
}
	
public int getBallSizeY()
{
 return ballSizeY;
}
	
	
public int getCX()
{
 return ballCX;
}
	
	
public int getCY()
{
 return ballCY;
}
	
	
public int getPX()
{
 return ballPX;
}
	
public int getPY()
{
 return ballPY;
}

public Color getBallColor()
{
 return color;
}
	
public void setCX(int i)
{
 ballCX = i;
}
	
public void setCY(int i)
{
 ballCY = i;
}
	
public void setPX(int i)
{
 ballPX = i;
}
	
public void setPY(int i)
{
 ballPY = i;
}
	
public void moveBall(int lowY, int upY)
{
 int cx = getCX();
 int cy = getCY();
 int px = getPX();
 int py = getPY();
 int x = 0;
 int y = 0;
 if( (cx>=325) && (cx<=330) && (cy<=5) && (cy<=upY || cy>=lowY) )
 {
  x = 5;
  y = 5;
  cx = 327;
  cy = 2;
 }
		
else if( (cx>=325) && (cx<=330) && (cy>=475-ballSizeY) && (cy<=upY || cy>=lowY) )
{
 x = 5;
 y = -5;
 cx = 327;
 cy = maxY-ballSizeY-2;
}
		
else if( (cx>=310-ballSizeX) && (cx<=315-ballSizeX) && (cy<=5) && (cy<=upY || cy>=lowY) )
{
 x = -5;
 y = 5;
 cx = 310-ballSizeX-2;
 cy = 2;
}
		
		
else if( (cx>=310-ballSizeX) && (cx<=315-ballSizeX) && (cy>=475-ballSizeY) && (cy<=upY || cy>=lowY) )
{
 x = -5;
 y = -5;
 cx = 315-ballSizeX-2; 
 cy = maxY-ballSizeY-2;
}
		
		
		
else if( ( (cx>=315-ballSizeX && cx<=325-ballSizeX) && (cy<=upY || cy>=lowY )) && (cx-px>=5) && (cy-py>=5) )
 {
  x-=5;
  y+=5;
 }
		
		
		
else if( ( (cx>=315-ballSizeX && cx<=325-ballSizeX) && (cy<=upY || cy>=lowY ) ) && (cx-px>=5) && (py-cy>=5) ) 
{
 x-=5;
 y-=5;
}
		
		
else if( ( (cx>=315 && cx<=325) && (cy<=upY || cy>=lowY ) ) && (px-cx>=5) && (cy-py>=5) )
{
 x+=5;
 y+=5;
}
		
		
else if( ( (cx>=315 && cx<=325) && (cy<=upY || cy>=lowY ) ) && (px-cx>=5) && (py-cy>=5) )
{
 x+=5;
 y-=5;
}
		
		
else if( !(cy>=maxY-ballSizeY) && !(cx>=maxX-ballSizeX) && !(cy<=0) && !(cx<=0) && (cx>=5) && (cy>=5) && (cx-px>=5) && (cy-py>=5) )
{
 x+=5;
 y+=5;
}
		
		
else if( !(cy>=maxY-ballSizeY) && !(cx>=maxX-ballSizeX) && !(cy<=0) && !(cx<=0) && (cx>=5)&& (cy>=5) && (cx-px>=5) && (py-cy>=5) )
{
 x+=5;
 y-=5;
}
		
else if( !(cy>=maxY-ballSizeY) && !(cx>=maxX-ballSizeX) && !(cy<=0) && !(cx<=0) && (cx>=5)&& (cy>=5) && (px-cx>=5) && (cy-py>=5) )
{
 x-=5;
 y+=5; 
}
		
else if( !(cy>=maxY-ballSizeY) && !(cx>=maxX-ballSizeX) && !(cy<=0) && !(cx<=0) && (cx>=5)&& (cy>=5) && (px-cx>=5) && (py-cy>=5) )
{
 x-=5;
 y-=5;		
}	
		
else if( (cx<=4) && (cy<=4) ) 
{
x = 5;
y = 5;
cx = 2;
cy = 2;
}
		
		
else if( (cx<=4) && (cy>=maxY-ballSizeY-4) )
{
x = 5;
y = -5;
cx = 2;
cy = maxY-ballSizeY-2;
}
		
		
else if( (cy<=4) && (cx>=maxX-ballSizeX-4) )
{
 x = -5;
 y = 5;
 cx = maxX-ballSizeX-2;
 cy = 2;
}
		
else if( (cy>=maxY-ballSizeY-4) && (cx>=maxX-ballSizeX-4) )
{
 x = -5;
 y = -5;
 cx = maxX-ballSizeX-2; 
 cy = maxY-ballSizeY-2;
}
		
		
else if( (cy >= 480-ballSizeY) && (cx-px>= 5) && (cy-py>=5) )
{	
 x+=5;
 y-=5;
}
		
		
else if( (cy>=480-ballSizeY) && (px-cx>=5) && (cy-py>=5) )
{
 x-=5;
 y-=5;
}
		
else if( (cy <= 4) && (cx-px >=5) && (py-cy>=5) )
{
 x+=5;
 y+=5;
}
		
else if( (cy<=4) &&  (px-cx>=5) && (py-cy>=5) )
{
 x-=5;
 y+=5;
}
		
else if( (cx>=640-ballSizeX) &&  (cx-px>=5) && (cy-py>=5) )
{
 x-=5;
 y+=5;
}
		
else if( (cx>=640-ballSizeX) && (cx-px>=5) && (py-cy>=5) )
{
 x-=5;
 y-=5;
}
		
		
else if( (cx<=4)  && (px-cx>=5) && (cy-py>=5) )
{	
 x+=5;
 y+=5;
}
		
		
else if( (cx<=4) &&  (px-cx>=5) && (py-cy>=5) )
{
 x+=5;
 y-=5;
}
		
setPX(cx);
setPY(cy);
setCX(cx+x);
setCY(cy+y);
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