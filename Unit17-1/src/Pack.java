//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Pack extends MovingThing
{
	private int speed;
	private Image image;

	public Pack()
	{
		this(500,300,30,30,3);
	}

	public Pack(int x, int y)
	{
		//add code here
		super(x,y);
		
	}

	public Pack(int x, int y, int s)
	{
		//add code here
		super(x,y);
		setSpeed(s);
	}

	public Pack(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		setSpeed(s);
		try
		{
			URL url = getClass().getResource("\\pack.png");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("fix");
		}
	}

	public void setSpeed(int s)
	{
	   //add code
		speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   //add code here
		if(direction.equals("LEFT"))
		{
			setX(getX()-speed);
		}
		if(direction.equals("RIGHT"))
		{
			setX(getX()+speed);
		}
		if(direction.equals("UP"))
		{
			setY(getY()-speed);
		}
		if(direction.equals("DOWN"))
		{
			setY(getY()+speed);
		}
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	
	public boolean collision(Ship ship){
		if(ship.getY() <= this.getY()+ this.getHeight() 
				&& (ship.getX() + ship.getWidth() > this.getX()) 
				&& ship.getX() < this.getX()+this.getWidth()
				&& ship.getY() > this.getY()-this.getHeight()){
			return true;
		}
		return false;
	}


	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
