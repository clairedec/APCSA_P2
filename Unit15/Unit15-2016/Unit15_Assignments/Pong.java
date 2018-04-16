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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightScore;
	private int leftScore;


	public Pong()
	{
		//set up all variables related to the game
		
		ball= new Ball();
		leftPaddle= new Paddle(100, 100 , 20, 80, 3);
		rightPaddle= new Paddle(600, 100, 20, 80, 3);


		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
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
		graphToBack.fillRect(400, 0, 200, 100);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString(" left score: " + leftScore, 200, 20);
		graphToBack.drawString(" right score: " + rightScore, 200, 40);
		Block top = new Block(0,0,800,1, Color.BLACK);
		Block bottom = new Block(0,500,800,1, Color.BLACK);
		top.draw(graphToBack);
		bottom.draw(graphToBack);
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		
		
		if(!(ball.getX()>=100 && ball.getX()<=600))
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
		}
		
		

		
		//see if the ball hits the top or bottom wall 
		/*if (!(ball.getY()>=10 && ball.getY()<=300))
		{
			ball.setY(-ball.getYSpeed());
		}*/
		
		if(ball.didCollideBottom(bottom))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.didCollideTop(top)){
			ball.setYSpeed(-ball.getYSpeed());
		}



		//see if the ball hits the left paddle
		if ( ball.didCollideLeft(leftPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		//see if the ball hits the right paddle
		if ( ball.didCollideRight(rightPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());	
		}
		
		


		//see if the paddles need to be moved
		
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		
		if(keys[0]==true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[1]==true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[2]==true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[3]==true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		

		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
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