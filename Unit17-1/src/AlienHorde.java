//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private ArrayList<Alien> aliens = new ArrayList<Alien>();

	public AlienHorde(int size)
	{
		int x = 50;
		for(int i=0; i<size; i++)
		{
			aliens.add(new Alien(x, 50, 50, 50, 1));
			x += 50;
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int j=0; j<aliens.size(); j++)
		{
			aliens.get(j).draw(window);
		}
	}
       
	public void moveEmAll()
	{
		for(int j=0; j<aliens.size(); j++)
		{
			if(aliens.get(j).getX()>700)
			{
				aliens.get(j).move("RIGHT");
				//aliens.get(j).move("DOWN");
			}
			else if(aliens.get(j).getX()<100)
			{
				aliens.get(j).move("LEFT");
			}
			else
			{
				aliens.get(j).move("LEFT");
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		
	}

	public String toString()
	{
		return "";
	}
}
