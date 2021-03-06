//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number=num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 1; i<=number; i++)
		{
			if (a%i == 0 && b%i==0 && c%i==0)
			{
				max = i;
				return max;
			}
		}

		return 1;
	}

	public String toString()
	{
		String output="";
		
		for (int a=1; a<=number; a++)
		{			
			for (int b=a; b<=number; b++)
			{				
				for (int c=b; c<=number; c++)
				{					
					if (a*a + b*b == c*c )
					{
						if (a%2 == 1 && b%2 == 0 && c%2==1 || b%2 == 1 && a%2 == 0 && c%2==1 )
						{
							if (greatestCommonFactor(a, b, c) <=1 )
							{
								output = output + a + " " + b + " "+ c + "\n";
							}
						}
					}
				}
			}
		}

		return output+"\n";
	}
}