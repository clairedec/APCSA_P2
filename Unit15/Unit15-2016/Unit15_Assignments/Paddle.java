//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;
   //private int yPos;

   public Paddle()
   {
	   super(10,10);
	   speed =5;
   }


   //add the other Paddle constructors
   
   public Paddle(int x, int y)
   {
	   super(x, y);
	   speed=5;
   }
   
   public Paddle(int x, int y, int wid)
   {
	   super(x, y, wid);
	   speed=5;
   }
   
   public Paddle(int x, int y, int wid, int ht, int sp)
   {
	   super(x, y, wid, ht);
	   speed=sp;
   }
   
   public Paddle(int x, int y, int wid, int ht, Color col,int sp)
   {
	   super(x, y, wid, ht, col);
	   speed=sp;
   }



   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()+speed);
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()-speed);
	   draw(window);

   }
   
   public void moveLeftAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setX(getX()-speed);
	   draw(window);

   }
   
   public void moveRightAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setX(getX()+speed);
	   draw(window);

   }

   //add get methods
   
   public int getSpeed()
   {
	   return speed;
   }
   
   
   //add a toString() method
   
   public String toString()
   {
	   String output = "";
	   output= getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor()+ " " + speed;
	   return output;
   }
}