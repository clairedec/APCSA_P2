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
		maze= new int[0][0];

	}

	public Maze(int size, String line)
	{
		Scanner test= new Scanner(line);
		maze= new int[size][size];
		for(int r=0; r<maze.length; r++)
		{
			for (int c=0; c<maze[r].length; c++)
			{
				maze[r][c]=test.nextInt();
			}
		}

	}

	public boolean hasExitPath(int r, int c)
	{
		if (r>=0 && c>=0 && r<maze.length && c<maze[r].length && maze[r][c] ==1)
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
		String output= "";
		for(int r=0; r<maze.length; r++)
		{
			for(int c=0; c<maze.length; c++ )
			{
				output += maze[r][c];
			}
			if ( hasExitPath() ==true)
			{
				output += "exit found";
			}
			else
			{
				output += "exit not found";
			}
		}
		return output;
	}
}