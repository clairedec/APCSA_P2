//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		
		out.println("What is the name of the class?");
		String name = keyboard.nextLine();
		out.println("How many students are in the class?");
		int num = keyboard.nextInt();
		
		Class test = new Class(name, num);
		int number = 0; 
		
		do
		{
			Scanner keyboard1 = new Scanner(System.in);

			out.println("Enter the name of the student" + number + ":" );
			String stuName = keyboard1.nextLine();
			out.println("Enter the grades for " + stuName + ":");
			String inputs = keyboard1.nextLine();
			test.addStudent(number, new Student(stuName, inputs));
			number++;
		}while (number<num);
		
		out.println(test);
		
		test.sort();
		
		out.println(test);
		
		
		out.println("Failure List: "+ test.getFailureList(70));
		out.println("Highest Average: "+ test.getStudentWithHighestAverage());
		out.println("Lowest Average: "+ test.getStudentWithLowestAverage());
		out.println("Class Average: "+ test.getClassAverage());













	}		
}