//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));
		String  className = file.nextLine();
		int num = file.nextInt();
		file.nextLine();
		
		Class test = new Class ( className, num);
		for ( int i=0; i<num; i++)
		{
			String name= file.nextLine();
			String grades = file.nextLine();
			test.addStudent(i, new Student(name, grades));
		}
		
		out.println(test);
		
		test.sort();
		
		out.println(test);
		
		
		out.println("Failure List: "+ test.getFailureList(70));
		out.println("Highest Average: "+ test.getStudentWithHighestAverage());
		out.println("Lowest Average: "+ test.getStudentWithLowestAverage());
		out.println("Class Average: "+ test.getClassAverage());




	}		
}