//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word18e implements Comparable<Word18e>
{
	private String word;

	public Word18e( String s )
	{
		word=s;


	}
	
	private int numVowels()
	{
		String vowel = "aeiou";
		int counter=0;
		for ( int i = 0; i<word.length(); i++)
		{
			for ( int j=0; j<vowel.length(); j++)
			{
				if ( word.charAt(i) == vowel.charAt(j))
				{
					counter++;
				}
			}
		}
		
		return counter;
	}


	public int compareTo( Word18e rhs )
	{
		if ( numVowels() > rhs.numVowels())
		{
			return 1;
		}
		else if (numVowels()<rhs.numVowels())
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