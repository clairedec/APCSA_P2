//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 1;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 1;
		ySpeed = 1;
		
	}
	
	public Ball(int x, int y, int wid, int ht)
	{
		super(x, y, wid, ht);
		xSpeed = 1;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int wid, int ht, Color col)
	{
		super(x, y, wid, ht, col);
		xSpeed = 1;
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
		/*Block rhs = (Block) obj;
		if(this.getX()<=rhs.getX()+rhs.getWidth()-this.getXSpeed() && this.getY()>=rhs.getY() && this.getY()<=rhs.getY()+rhs.getHeight())
		{
		return true;
		}
		return false;*/

		Block rhs = (Block) obj;
	
		if(this.getX()<=rhs.getX()+rhs.getWidth()-this.getXSpeed() && this.getX()>=rhs.getX()+rhs.getWidth()+this.getXSpeed()-5
		&& this.getY()+this.getHeight()>=rhs.getY()
		&& this.getY()<=rhs.getY()+rhs.getHeight()
		&& this.getXSpeed() < 0){
			return true;
		}
			return false;
	}
	
	public boolean didCollideRight(Object obj)
	{
		/*Block rhs = (Block) obj;
		if(this.getX()+this.getWidth()>=rhs.getX()-this.getXSpeed() && this.getY()>=rhs.getY() && this.getY()<=rhs.getY()+rhs.getHeight())
		{
		return true;
		}
		return false;*/
		Block rhs = (Block) obj;
			
		if(this.getX()+this.getWidth()>=rhs.getX()-this.getXSpeed() && this.getX()+this.getWidth()<=rhs.getX()+this.getXSpeed()+5
		&& this.getY()+this.getHeight()>=rhs.getY()
		&& this.getY()<=rhs.getY()+rhs.getHeight()
		&& this.getXSpeed() > 0){
			return true;
		}
		return false;
		
	}
	
	public boolean didCollideTop(Object obj)
	{
		/*Block rhs = (Block) obj;
		if((this.getY()<=rhs.getY()+this.getHeight()+rhs.getHeight() && this.getY()>=rhs.getY()+rhs.getHeight())
			&& this.getX()>=rhs.getX() && this.getX()<=rhs.getX()+rhs.getWidth())
		{
		return true;
		}
		return false;*/
		Block rhs = (Block) obj;
		

		
		if((this.getY()<=rhs.getY()+rhs.getHeight()-this.getYSpeed() && this.getY()>=rhs.getY()+this.getYSpeed())
				&& this.getX()>=rhs.getX() && this.getX()+this.getWidth()<=rhs.getX()+rhs.getWidth()
				&& this.getYSpeed() < 0){
			return true;
		}
		return false;

	}
	
	public boolean didCollideBottom(Object obj)
	{
		/*Block rhs = (Block) obj;
		if((this.getY()<=rhs.getY()+this.getHeight() && this.getY()>=rhs.getY())
			&& this.getX()>=rhs.getX() && this.getX()<=rhs.getX()+rhs.getWidth())
		{
		return true;
		}	
		return false;*/
		
		Block rhs = (Block) obj;
		

		
		if((this.getY()+this.getHeight()>=rhs.getY()-this.getYSpeed() && this.getY()+this.getHeight()<=rhs.getY()+this.getYSpeed()+5)
				&& this.getX()>=rhs.getX() && this.getX()+this.getWidth()<=rhs.getX()+rhs.getWidth()
				&& this.getYSpeed() > 0){
			return true;
		}
		return false;
	}
}