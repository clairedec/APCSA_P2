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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs= new ArrayList<String>();
		nouns= new ArrayList<String>();
		adjectives= new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		try{
			Scanner madlib = new Scanner(new File(fileName));
			while(madlib.hasNext())
			{
				String c = madlib.next();
				if ( c.equals("&"))
				{
					System.out.print(getRandomAdjective() + " ");
				}
				else if ( c.equals("#"))
				{
					System.out.print(getRandomNoun() + " ");
				}
				else if ( c.equals("@"))
				{
					System.out.print(getRandomVerb()+ " ");
				}
				else
				{
					System.out.print(c+" ");
				}
			}
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		Scanner myScanner = new Scanner(new File("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit10\\src\\nouns.dat"));
		while (myScanner.hasNext())
		{
			nouns.add(myScanner.next());
		}
		
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
		Scanner myScanner1 = new Scanner(new File("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit10\\src\\verbs.dat"));
		while (myScanner1.hasNext())
		{
			verbs.add(myScanner1.next());
		}
	
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
		
		Scanner myScanner2 = new Scanner(new File("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit10\\src\\adjectives.dat"));
		while (myScanner2.hasNext())
		{
			adjectives.add(myScanner2.next());
		}
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		int ver = (int) (Math.random() * verbs.size());
		return verbs.get(ver);
	}
	
	public String getRandomNoun()
	{
		int nou = (int) (Math.random() * nouns.size());
		return nouns.get(nou);
	}
	
	public String getRandomAdjective()
	{
		int adj = (int) (Math.random() * adjectives.size());
		return adjectives.get(adj);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}