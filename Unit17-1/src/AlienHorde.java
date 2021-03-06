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

		for(int i=0; i<aliens.size(); i++)
		{
			
			aliens.get(i).move("LEFT");
			if(aliens.get(i).getX() >= 700 || aliens.get(i).getX() <= 50)
			{
				aliens.get(i).setY(aliens.get(i).getY() + 50);
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
			} 

		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int j=0;j<shots.size();j++)
		{
			for(int k =0; k<aliens.size(); k++)
			{
				
				if(shots.get(j).getY() <= aliens.get(k).getY()+ aliens.get(k).getHeight() 
						&& (shots.get(j).getX() + shots.get(j).getWidth() > aliens.get(k).getX()) 
						&& shots.get(j).getX() < aliens.get(k).getX()+aliens.get(k).getWidth()
						&& shots.get(j).getY() > aliens.get(k).getY()-aliens.get(k).getHeight())				
				{
					aliens.remove(k);
					shots.remove(j);
					return;
				}
			}
			
		}
	}
	
	public void remove(Alien alien){
		aliens.remove(alien);
	}
	
	public List <Alien> getList(){
		return aliens;
	}

	public String toString()
	{
		return "";
	}
}
