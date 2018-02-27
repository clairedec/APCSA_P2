//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private int num;
	private double[] grade;
	

	//constructor
	public Grades(int nums, double[] grades)
	{
		setGrades(nums, grades);
	}

	//set method
	public void setGrades(int nums, double[] grades)
	{
		num=nums;
		grade=grades;
	}

	private double getSum()
	{
		double sum=0.0;
		for (int i=0; i<grade.length-1; i++)
		{
			sum= sum + i;
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = (double) getSum() / (double) grade.length-1;
		return average;
	}


	//toString method
	public String toString()
	{
		String output="";
		
		for (int k = 0; k<grade.length-1; k++)
		{
			output= output + "Grade " + k + " : : " + grade[k] + "\n";
		}
		
		output = output + "average = " + getAverage();
		
		return output;
	}



}