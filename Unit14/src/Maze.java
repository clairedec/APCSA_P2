//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		maze[size][size];
		for(int i=0; i<size; i++)
		{
			
		}

	}

	public boolean hasExitPath(int r, int c)
	{
		if (r>=0 && c>=0 && r<size && c<size && maze[r][c] ==1)
		{
			return hasExitPath(r, c);
		}
		else
		{
			hasExitPath(r-1, c);
			hasExitPath(r, c-1);
			hasExitPath(r+1, c);
			hasExitPath(r, c+1);
		}

		return false;
	}

	public String toString()
	{
		String output="";
		output = 



		return output;
	}
}