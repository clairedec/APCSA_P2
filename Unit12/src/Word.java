//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word=s;


	}
	
	public int getLength()
	{
		return word.length(); 
	}
	

	public int compareTo( Word rhs )
	{
		if ( getLength() > rhs.getLength())
		{
			return 1;
		}
		else if (getLength()<rhs.getLength())
		{
			return -1;
		}
		else
		{
			return toString().compareTo(rhs.toString());
		}
	}

	public String toString()
	{
		return word;
	}
}