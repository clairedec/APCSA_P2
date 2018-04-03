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
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
		
	}
	
	public Ball(int x, int y, int wid, int ht)
	{
		super(x, y, wid, ht);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int wid, int ht, Color col)
	{
		super(x, y, wid, ht, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int wid, int ht, Color col, int xSp, int ySp)
	{
		super(x, y, wid, ht, col);
		setXSpeed(xSp);
		setYSpeed(ySp);

	}
	
   //add the set methods
   
	public void setXSpeed(int x)
	{
		xSpeed=x;
	}
	
	public void setYSpeed(int y)
	{
		ySpeed=y;
	}
	

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location

	   draw(window, Color.WHITE);
      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);

		//draw the ball at its new location
      super.draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball rhs = (Ball) obj;
		if ( getXSpeed() == rhs.getXSpeed() && getYSpeed() == rhs.getYSpeed() )
		{
			return true;
		}
		else
		{
			return false;
		}

	}   

   //add the get methods
	
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}

   //add a toString() method
	public String toString()
	{
		String output = "";
		output= getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
		return output;
	}
	
	public boolean didCollideLeft(Object obj)
	{
		Ball rhs = (Ball) obj;
		if ( this.getHeight() >= rhs.getHeight() )
		{
			return false;
		}
		return true;
		
	}
	
	public boolean didCollideRight(Object obj)
	{
		Ball rhs = (Ball) obj;
		if ( this.getHeight() >= rhs.getHeight() )
		{
			return false;
		}
		return true;
		
	}
	
	public boolean didCollideTop(Object obj)
	{
		Ball rhs = (Ball) obj;
		if ( this.getY() >= rhs.getHeight() + rhs.getY() )
		{
			return false;
		}
		return true;
		
	}
	
	public boolean didCollideBottom(Object obj)
	{
		Ball rhs = (Ball) obj;
		if ( this.getY() >= rhs.getY() )
		{
			return false;
		}
		return true;
	}
}