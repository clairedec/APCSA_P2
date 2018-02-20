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
	private int percent;

	public GuessingGame(int stop)
	{
		upperBound=stop;
	}

	public void playGame()
	{
		int random = (int) Math.random()*(upperBound-1)+1;
		int guess = 0;
		
		System.out.println("Enter a number between 1 and " + upperBound);
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		if (num > upperBound)
		{
			System.out.print("Out of range! Try again.");
		}
		else
		{
			guess = guess+1;
		}
		
		double percent = (guess-1)/guess;

	}

	public String toString()
	{
		String output="It took " + guess + "guesses to guess "+ random + percent;
		return output;
	}
}