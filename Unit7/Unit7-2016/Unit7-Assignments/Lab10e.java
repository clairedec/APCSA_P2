//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int response;
		System.out.println("How many numbers?");
		response = keyboard.nextInt();
		GuessingGame test = new GuessingGame(response);
		test.playGame();
		System.out.println(test);
	/*	
		System.out.print("Do you want to play again? y=yes  n=no");
		Scanner keyboard1 = new Scanner(System.in);
		String response1 = keyboard1.nextLine();
		if (response1 == "y")
		{
			Scanner keyboard2 = new Scanner(System.in);
			System.out.println("How many numbers?");
			response = keyboard2.nextInt();
			GuessingGame test1 = new GuessingGame(response);
			test1.playGame();
			System.out.println(test1);
		}
		else if (response1 == "n")
		{
			System.out.println("Thanks for playing.");
		}
		else
		{
			
		}
*/

	}
}