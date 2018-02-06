//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      Robot myRobot = new Robot();
      myRobot.head(window);
      
      //call other methods
      myRobot.upperBody(window);
      myRobot.lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(200, 150, 200, 150);


		//add more code here
      window.setColor(Color.BLACK);
      window.fillOval(250,200,20,20);
      window.fillOval(325,200,20,20);
      window.setColor(Color.GREEN);
      window.fillOval(287, 220, 20, 20);
      window.setColor(Color.RED);
      window.drawArc(270, 220, 50, 60, 0, -180);
				
   }
   
   
   
   
   public void upperBody( Graphics window )
   {

		//add more code here
	   
	   window.setColor(Color.BLUE);
	   window.fillRect(200, 300, 200, 200);
	   window.setColor(Color.BLACK);
	   window.drawLine(200, 300, 150, 250);
	   window.drawLine(400, 300, 450, 250);

   }

   public void lowerBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.BLACK);
	   window.fillRect(200, 500, 200, 200);
	   window.drawLine(200, 700, 150, 750);
	   window.drawLine(400, 700, 450, 750);

   }
}