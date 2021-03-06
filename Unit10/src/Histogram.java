//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;
	private String directory = System.getProperty("user.dir");

	public Histogram()
	{
		count= new ArrayList<Integer>();
		letters= new ArrayList<Character>();


	}

	public Histogram(char[] values, String fName)
	{
		count= new ArrayList<Integer>();
		letters= new ArrayList<Character>();
		
		for ( int i=0; i<values.length; i++)
		{
			letters.add(values[i]);
		}



		out.println("search letters = "+letters);
		
		fileName= directory + "\\src\\" + fName;
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner test= new Scanner(new File(fileName));

		for (int a=0; a<letters.size(); a++)
		{
			count.add(0);
		}
		while(test.hasNext())
		{
			String tester= test.next();
			for(int l=0; l< tester.length(); l++)
			{
				for (int m=0;m<letters.size(); m++)
				{
					if (letters.get(m) == tester.charAt(l))
					{
						count.set(m, count.get(m)+1);
					}
				}
			}
		}



	}

	public char mostFrequent()
	{
		int max=0;
		for(int j=0; j<count.size(); j++)
		{
			if ( count.get(j)> count.get(max))
			{
				max = j;
			}
		}

		return letters.get(max);
	}

	public char leastFrequent()
	{
		int min=0;
		for(int k=0; k<count.size(); k++)
		{
			if ( count.get(k)< count.get(min))
			{
				min = k;
			}
		}

		return letters.get(min);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}