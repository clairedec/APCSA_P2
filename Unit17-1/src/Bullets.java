//© A+ Computer Science  -  www.apluscompsci.com
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

public class Bullets
{
	private ArrayList<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for(int j=0; j<ammo.size(); j++)
		{
			ammo.get(j).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int i=0; i<ammo.size(); i++)
		{
			ammo.get(i).move("UP");
		}
	}

	/*public void cleanEmUp()
	{
		for(int j=0;j<ammo.size();j++)
		{
			for(int k =0; k<aliens.size(); k++)
			{
				
				if (ammo.get(j).getY() < aliens.get(k).getY()-aliens.get(k).getHeight() && (ammo.get(j).getX()+ ammo.get(j).getWidth() > aliens.get(k).getX()) && (ammo.get(j).getX()+ ammo.get(j).getWidth() > aliens.get(k).getX()) && shots.get(j).getX() < aliens.get(k).getX()+aliens.get(k).getWidth())
				{
					aliens.remove(k);
					ammo.remove(j);
					

				}
			}
			
		}
	}*/

	public List<Ammo> getList()
	{
		return null;
	}

	public String toString()
	{
		return "";
	}
}
