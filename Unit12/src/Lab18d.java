//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	private static ArrayList<String> test;
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		test = new ArrayList<String>();
		while(file.hasNext())
		{
			test.add(file.next());
		}
		for ( int i=0; i<size; i++)
		{
			for ( int k = i; k<size; k++)
			{
				Word word1 = new Word(test.get(i));
				Word word2 = new Word(test.get(k));
				if (word1.compareTo(word2) > 0)
				{
					String word = test.get(i);
					test.set(i, test.get(k));
					test.set(k, word);
				}
			}
		}
		for (int l=0; l<test.size(); l++)
		{
			System.out.println(test.get(l));
		}



	}
}