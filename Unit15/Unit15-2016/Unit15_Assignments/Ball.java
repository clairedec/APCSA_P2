//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(200,200);
		setX(x);
		setY(y);
		
	}
	
	public Ball(int x, int y, )
	
   //add the set methods
   
	public void setX(int x)
	{
		xSpeed=x;
	}
	
	public void setY(int y)
	{
		ySpeed=y;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location


      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);

		//draw the ball at its new location
      super.draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball rhs = (Ball) obj;
		if ( getX() == rhs.getX() && getY() == rhs.getY() )
		{
			return true;
		}
		else
		{
			return false;
		}

	}   

   //add the get methods
	
	public int getX()
	{
		return xSpeed;
	}
	
	public int getY()
	{
		return ySpeed;
	}

   //add a toString() method
	public String toString()
	{
		String output = "";
		output= xSpeed + " " + ySpeed;
		return output;
	}
}