//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat=new char[0][0];

	}

   public FancyWord(String s)
	{
	   String word=s;
	   for ( int i=0; i<word.length();i++)
	   {
		   mat[0][i]=word.charAt(i);
		   mat[i][i]=word.charAt(i);
		   mat[i][word.length()-1]=word.charAt(word.length()-i-1);
		   mat[word.length()][i]=word.charAt(i);
		   
	   }




	}

	public String toString()
	{
		String output = "";
		for(int j=0; j<mat.length; j++)
		{
			for(int k=0; k<mat[j].length; k++)
			{
				output += mat[j][k];
			}
		}



		return output+"\n\n";
	}
}