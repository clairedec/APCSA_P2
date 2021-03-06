//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);


	}
	
	public void setName(String name)
	{
		myName=name;


	}	
	
	public void setGrades(String gradeList)
	{
		Grades test= new Grades(gradeList);
		myGrades= test;

	
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);


	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		double average = (double) getSum() / (double) getNumGrades();
		return average;
	}

	public double getAverageMinusLow()
	{
		double averageWithout = (double) (getSum() - getLowGrade()) / (double) (getNumGrades() - 1);
		return averageWithout;
	}
	
	public int compareTo(Student s)
	{
		if ( getAverage() > s.getAverage())
		{
			return 1;
		}
		else if (getAverage()<s.getAverage())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	public boolean equal(Student s)
	{
		if(s.getAverage() == this.getAverage() && s.getName().equals(this.getName())){
			return true;
		}
		return false;
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		String output = myName + "=" + myGrades.toString();
		return output;
	}	
}