//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar=0;


	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);

	}

	public void setChar(char c)
	{
		theChar=c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar.isUpperCase() == true)
		{
			return true;
		}
		


		return false;
	}

	public boolean isLower( )
	{
		if()
		{
			return true;
		}



		return false;
	}
	
	public boolean isNumber( )
	{
		if()
		{
			return true;
		}



		return false;
	}	

	public int getASCII( )
	{
		return 0;
	}

	public String toString()
	{




		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
	}
}