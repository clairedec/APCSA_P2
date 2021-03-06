//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private ArrayList<Ammo> ammos = new ArrayList<Ammo>();
	private ArrayList<Alien> aliens = new ArrayList<Alien>();
	private Pack pack = new Pack();
	private boolean packVisible =true;
	private long startTime=System.currentTimeMillis();
	private String[] directions = {"RIGHT", "LEFT", "UP", "DOWN"};
	private String direction = "UP";
	private int timer = 50;
	private AlienHorde horde;
	//private Bullets shots;
	//*/
   
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//back = new BufferedImage();
		aliens.add(new Alien(300,300,50,50,5));
		aliens.add(new Alien(200,200,50,50,5));
		ship= new Ship(100,100, 50, 50, 5);
		horde = new AlienHorde(10);
		
		//Ship, Alien

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		/*for(int l=0;l<aliens.size();l++)
		{
			aliens.get(l).draw(graphToBack);
		}*/
		horde.drawEmAll(graphToBack);
		
		horde.moveEmAll();
		horde.removeDeadOnes(ammos);
		
		if(packVisible){
			pack.draw(graphToBack);			
		}
		if(!packVisible){
			for(int i = 0; i<horde.getList().size(); i++){
				Alien alien = horde.getList().get(i);
				if(ship.getY() <= alien.getY()+ alien.getHeight() 
				&& (ship.getX() + ship.getWidth() > alien.getX()) 
				&& ship.getX() < alien.getX()+alien.getWidth()
				&& ship.getY() > alien.getY()-alien.getHeight()){
					horde.remove(alien);
				}
			}
		}
		
		
		if(pack.collision(ship)){
			packVisible=false;
		}
		
		long elapsedTime = (new Date()).getTime()-startTime;
		if(elapsedTime%timer >=-5 && elapsedTime%timer<=5){
			int random = (int) (Math.random()*directions.length);
			direction = directions[random];
		}
		pack.move(direction);
		
		for(int i=0; i<ammos.size(); i++)
		{
			ammos.get(i).draw(graphToBack);
			ammos.get(i).move("UP");
		}

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move Ship, Alien, etc.
		if(keys[1]==true)
		{
			ship.move("RIGHT");
		}
		if(keys[2]==true)
		{
			ship.move("UP");
		}
		if(keys[3]==true)
		{
			ship.move("DOWN");
		}
		if(keys[4]==true)
		{
			ammos.add(new Ammo(ship.getX()+20, ship.getY(), 5));
			keys[4]=false;
			//Ammo test = new Ammo(ship.getX()+20, ship.getY(), 5);
			//test.draw(graphToBack);
			//test.move("UP");
		}

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		
		/*for(int j=0;j<ammos.size();j++)
		{
			for(int k =0; k<aliens.size(); k++)
			{
				//check y
				if(ammos.get(j).getY() <= aliens.get(k).getY()+ aliens.get(k).getHeight() 
						&& (ammos.get(j).getX() + ammos.get(j).getWidth() > aliens.get(k).getX()) 
						&& ammos.get(j).getX() < aliens.get(k).getX()+aliens.get(k).getWidth()
						&& ammos.get(j).getY() > aliens.get(k).getY()-aliens.get(k).getHeight())	
				{
					
					aliens.remove(k);
					ammos.remove(j);
					System.out.print("hi"); 
				}
			}
			
		}*/

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

