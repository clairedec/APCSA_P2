//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos=0;
		yPos=0;
		width=0;
		height=0;
		color= Color.BLACK ; 

	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		setX(x);
		setY(y);
		width=0;
		height=0;
		color=Color.BLACK;
	}
	
	public Block(int x, int y, int wid, int ht)
	{
		setX(x);
		setY(y);
		setWidth(wid);
		setHeight(ht);
	}
	
	public Block(int x, int y, int wid, int ht, Color col)
	{
		setX(x);
		setY(y);
		setWidth(wid);
		setHeight(ht);
		setColor(col);
	}

   //add the other set methods

   public void setX(int x)
   {
	   xPos=x;
   }
   
   public void setY(int y)
   {
	   yPos=y;
   }
   
   public void setPos(int x, int y)
   {
	   xPos=x;
	   yPos=y;
   }
   
   public void setWidth(int wid)
   {
	   width=wid;
   }
   
   public void setHeight(int ht)
   {
	   height=ht;
   }
   
   public void setColor(Color col)
   {
	   color=col;

   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   
   }
   
	public boolean equals(Object obj)
	{
		Block rhs = (Block) obj;
		if ( getX() == rhs.getX() && getY() == rhs.getY() && getWidth() == rhs.getWidth() && getHeight() == rhs.getHeight() && getColor() == rhs.getColor())
		{
			return true;
		}
		else
		{
			return false;
		}

	}   

   //add the other get methods
	
	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Color getColor()
	{
		return color;
	}
    

   //add a toString() method  - x , y , width, height, color
	
	public String toString()
	{
		String output="";
		output = xPos + " " + yPos + " " + width + " " + height + " " + color;
		return output;
	} 
}