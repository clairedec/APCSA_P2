//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab21i.dat"));
		
		int size = file.nextInt();
		file.nextInt();  
		
		while(file.hasNext())
		{
			Maze test = new Maze(size, file.nextLine());
			System.out.print(test);
		}
	}
}