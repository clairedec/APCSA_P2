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
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	//private Paddle leftPaddle;
	//private Paddle rightPaddle;
	private Paddle newPaddle;
	private boolean[] keys;
	private BufferedImage back;
	//private int rightScore;
	//private int leftScore;
	private ArrayList<Block> blocks = new ArrayList<Block>();
	private ArrayList<Color> colors = new ArrayList<Color>();
	private int level =0;
	private int score = 0;


	public Pong()
	{
		//set up all variables related to the game
		
		ball= new Ball(300,300,10,10);
		//leftPaddle= new Paddle(100, 100 , 20, 80, 3);
		//rightPaddle= new Paddle(600, 100, 20, 80, 3);
		newPaddle = new Paddle(300,300,40,40,3);
		colors.add(Color.GREEN);
		colors.add(Color.RED);
		colors.add(Color.BLUE);
		colors.add(Color.YELLOW);	
		
		
		
		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }
   
   public void buildBlocks(int level)
   {
	   if(level ==1)
	   {
		    int x = 20;
			int y = 20;
			int color=0;
			
			for(int i=0; i<15; i++)
			{
				blocks.add(new Block(x, y, 50, 30, colors.get(color)));
				color++;
				if(color == 4)
				{
					color=0; 
				}
				x += 50;
			}
				
			x=x-55;
			
			y += 30;
			for(int i=0; i<16; i++)
			{
				blocks.add(new Block(x, y, 50, 31, colors.get(color)));
				color++;
				if(color == 4)
				{
					color=0; 
				}
				y+=31;
			}
			
			y=y-33;
			x  -= 50;
			for(int i = 0; i<14; i++)
			{
				blocks.add(new Block(x, y, 50, 30, colors.get(color)));
				color++;
				if(color == 4)
				{
					color=0; 
				}
				x -= 50;
			}
			
			y  -= 30;
			x=x+55;
			
			for(int i = 0; i<15; i++)
			{
				blocks.add(new Block(x, y, 50, 31, colors.get(color)));
				color++;
				if(color == 4)
				{
					color=0; 
				}
				y -= 31;
			}
	   }
	   
	   if(level==2)
	   {

				int x = 140;
				int y = 105;
				
				for(int i=0; i<10; i++)
				{
					blocks.add(new Block(x, y, 50, 30, new Color((int)(255.0*Math.random()), (int)(255.0*Math.random()), (int)(255.0*Math.random()))));
					x += 50;	
				}
					
				x=x-55;
				
				y += 30;
				for(int i=0; i<11; i++)
				{
					blocks.add(new Block(x, y, 50, 30, new Color((int)(255.0*Math.random()), (int)(255.0*Math.random()), (int)(255.0*Math.random()))));
					y+=31;
				}
				
				y=y-33;
				x  -= 50;
				for(int i = 0; i<9; i++)
				{
					blocks.add(new Block(x, y, 50, 30, new Color((int)(255.0*Math.random()), (int)(255.0*Math.random()), (int)(255.0*Math.random()))));
					x -= 50;
				}
				
				y  -= 30;
				x=x+55;
				
				for(int i = 0; i<10; i++)
				{
					blocks.add(new Block(x, y, 50, 30, new Color((int)(255.0*Math.random()), (int)(255.0*Math.random()), (int)(255.0*Math.random()))));
					y -= 31;
				}
				
			}
	   }
   

   public void paint(Graphics window)
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
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(600, 0, 200, 100);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Score: " + score, 630, 70);

		//graphToBack.setColor(Color.BLACK);
		//graphToBack.drawString(" left score: " + leftScore, 200, 20);
		//graphToBack.drawString(" right score: " + rightScore, 200, 40);
		Block top = new Block(0,0,800,20, Color.BLACK);
		Block bottom = new Block(0,542,800,20, Color.BLACK);
		Block left= new Block(0,0,20,800,Color.BLACK);
		Block right = new Block(765,0,20,800,Color.BLACK);
		top.draw(graphToBack);
		bottom.draw(graphToBack);
		left.draw(graphToBack);
		right.draw(graphToBack);
		ball.moveAndDraw(graphToBack);
		//leftPaddle.draw(graphToBack);
		//rightPaddle.draw(graphToBack);
		newPaddle.draw(graphToBack);
		
		for(int i=0; i<blocks.size(); i++)
	   	{
	   		blocks.get(i).draw(graphToBack);
	   		
	   	}
		
		if(blocks.size()==0)
		{
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("LEVEL: 1", 200, 200);
			level++;
			buildBlocks(level);
		}
		
		if(score==3)
		{
			graphToBack.setColor(Color.WHITE);
			graphToBack.fillRect(180, 180, 100, 50);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("LEVEL: 2", 200, 200);
			level++;
			buildBlocks(level);
		}
		//60
		   



				
		

		//see if ball hits left wall or right wall
		
		
		/*if(!(ball.getX()>=100 && ball.getX()<=600))
		{

			
			if(ball.getX()>=200)
			{
				leftScore++;
			}
			if(ball.getX()<=600)
			{
				rightScore++;
			}
			graphToBack.clearRect(0, 0, 800, 800);
			ball = new Ball();
			update(graphToBack);
		}*/
		
		

		
		//see if the ball hits the top or bottom wall 
		/*if (!(ball.getY()>=10 && ball.getY()<=300))
		{
			ball.setY(-ball.getYSpeed());
		}*/
		
		if(ball.didCollideBottom(bottom ))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if(ball.didCollideTop(top)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.didCollideLeft(left)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.didCollideRight(right)){
			ball.setXSpeed(-ball.getXSpeed());
		}




		if ( ball.didCollideLeft(newPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		if ( ball.didCollideRight(newPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());	
		}
		
		if ( ball.didCollideTop(newPaddle))
		{
			ball.setYSpeed(-ball.getYSpeed());	
		}
		
		if ( ball.didCollideBottom(newPaddle))
		{
			ball.setYSpeed(-ball.getYSpeed());	
		}
		
		
		
		for(int i=0; i<blocks.size(); i++)
		{
			if ( ball.didCollideLeft(blocks.get(i)))
			{
				blocks.get(i).setColor(Color.WHITE);
				blocks.get(i).draw(graphToBack);
				ball.setXSpeed(-ball.getXSpeed());
	
				
				blocks.remove(i);
				score++;
			}
			
			if ( ball.didCollideRight(blocks.get(i)))
			{
				blocks.get(i).setColor(Color.WHITE);
				blocks.get(i).draw(graphToBack);
				ball.setXSpeed(-ball.getXSpeed());	

				blocks.remove(i);
				score++;
			}
			
			if ( ball.didCollideTop(blocks.get(i)))
			{
				blocks.get(i).setColor(Color.WHITE);
				blocks.get(i).draw(graphToBack);
				ball.setYSpeed(-ball.getYSpeed());
				blocks.remove(i);
				score++;
			}
			
			if ( ball.didCollideBottom(blocks.get(i)))
			{
				blocks.get(i).setColor(Color.WHITE);
				blocks.get(i).draw(graphToBack);
				ball.setYSpeed(-ball.getYSpeed());	
				blocks.remove(i);
				score++;
			}
		}
		
		


		//see if the paddles need to be moved
		
		ball.moveAndDraw(graphToBack);
		newPaddle.draw(graphToBack);
		
		if(keys[0]==true)
		{
			newPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[1]==true)
		{
			newPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[2]==true)
		{
			newPaddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[3]==true)
		{
			newPaddle.moveRightAndDraw(graphToBack);
		}
		

		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=true; break;
			case 'K' : keys[1]=true; break;
			case 'J' : keys[2]=true; break;
			case 'L' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=false; break;
			case 'K' : keys[1]=false; break;
			case 'J' : keys[2]=false; break;
			case 'L' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}