//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		




	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot]=grade;


	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i=0; i<grades.length; i++)
		{
			sum+= grades[i];
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int k=0; k<grades.length-1; k++)
		{
			if(grades[k] < grades[k+1] )
			{
				low = grades[k+1];
			}
		}





		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int j=0; j<grades.length-1; j++)
		{
			if(grades[j] > grades[j+1] )
			{
				high = grades[j+1];
			}
		}




		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";





		return output;
	}	
}