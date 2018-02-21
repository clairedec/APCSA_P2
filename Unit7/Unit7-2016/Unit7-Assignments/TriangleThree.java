//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size=0;
		letter="";
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		size=sz;
		letter=let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int i=1; i<=size; i++)
		{
			
			for (int j=1; j<=size-i-1; j++)
			{
				output=output+ " ";
			}
			
			output=output + "\n";
			
			for (int k=1; k<=i; k++)
			{
				output=output+letter;
			}
		}
		
		return output+"\n";
	}
}