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
		if (Character.isUpperCase(theChar) == true)
		{
			return true;
		}


		return false;
	}

	public boolean isLower( )
	{
		if(Character.isLowerCase(theChar) == true)
		{
			return true;
		}

		return false;
	}
	
	public boolean isNumber( )
	{
		if(Character.isDigit(theChar) == true)
		{
			return true;
		}

		return false;
	}	

	public int getASCII( )
	{
		int result = (int) theChar;
		return result;
		
	}

	public String toString()
	{
		if (isUpper())
		{
			return ""+getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";	  
		}
		else if (isLower())
		{
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		}
		else
		{
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";	
		}

	}
}