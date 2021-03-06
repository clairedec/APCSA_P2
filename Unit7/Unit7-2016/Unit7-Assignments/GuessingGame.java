//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int random;
	private int guess;
	private double percent;

	public GuessingGame(int stop)
	{
		upperBound=stop;
	}

	public void playGame()
	{
		
		random = (int) Math.round(Math.random()*(upperBound-1)+1);
		int num=0;
		
		while (random != num)
		{
			System.out.println("Enter a number between 1 and " + upperBound);
			Scanner keyboard = new Scanner(System.in);
			num = keyboard.nextInt();
			if (num > upperBound)
			{
				System.out.print("Out of range! Try again.");
			}
			else
			{
				guess = guess+1;
			}
		
			percent = ((double)(guess-1.0)/(double)guess)*100.0;
		}

	}

	public String toString()
	{
		String output= "It took " + guess + " guesses to guess "+ random + "\n" + "You guessed wrong " + percent + "% of the time.";
		return output;
	}
}