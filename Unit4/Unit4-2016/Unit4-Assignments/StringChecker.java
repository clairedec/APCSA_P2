//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word="";
	}

	public StringChecker(String s)
	{
		setString(s);
	}

   public void setString(String s)
   {
	   word=s;
   }

	public boolean findLetter(char c)
	{
		int check= word.indexOf(c);
		if (check >= 0)
		{
			return true;
		}

		return false;
	}

	public boolean findSubString(String s)
	{
		int check=word.indexOf(s);
		if (check >= 0)
		{
			return true;
		}

		return false;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}