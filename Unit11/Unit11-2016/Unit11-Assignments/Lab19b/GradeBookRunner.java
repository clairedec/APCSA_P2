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
		int number = 1; 
		
		do
		{
			out.println("Enter the name of the student" + number + ":" );
			out.println("Enter the grades for " + name + ":");
			Scanner keyboard1 = new Scanner(System.in);
			String inputs = keyboard1.nextLine();
			test.addStudent(number-1, new Student(name, inputs));
		}while (number<=num);




















	}		
}