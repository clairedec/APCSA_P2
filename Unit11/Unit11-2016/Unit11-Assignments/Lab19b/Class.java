//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;


public class Class
{
	private String name;
//	private Student[] studentList;
	private ArrayList<Student> studentList; 
	
	public Class()
	{
		name="";
		//studentList=new Student[0];
		studentList=new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		//studentList = new Student[stuCount];
		studentList = new ArrayList<Student>();
		this.name=name;

	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		//studentList[stuNum]=s;
		studentList.add(stuNum,s);


	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double hold = 0.0;
		/*for ( int i=0; i<studentList.length; i++)
		{
			hold= hold + getStudentAverage(i);
			
		}
		
		classAverage = hold / studentList.length;*/
		
		for ( int i=0; i<studentList.size(); i++)
		{
			hold= hold + getStudentAverage(i);
			
		}
		
		classAverage = hold / studentList.size();


		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		//return studentList[stuNum].getAverage();
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		/*for (int j=0; j<studentList.length; j++)
		{
			if ( getStudentName(j).equals(stuName))
			{
				return getStudentAverage(j);
			}
		}
		*/
		for (int j=0; j<studentList.size(); j++)
		{
			if ( getStudentName(j).equals(stuName))
			{
				return getStudentAverage(j);
			}
		}

		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		//return studentList[stuNum].getName();
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		/*double high = Double.MIN_VALUE;
		String hName ="";
		
		for (int k=0; k<studentList.size()-1; k++)
		{
			if(getStudentAverage(k) < getStudentAverage(k+1) )
			{
				hName = getStudentName(k+1);
				high = getStudentAverage(k+1);
			}
			
		}


		return hName;*/
		int index = 0;
		for(int i = 0; i < studentList.size() - 1; i++)
		{
			if(studentList.get(index).compareTo(studentList.get(i+1)) == -1)
			{
				index = i + 1;
			}
		}
		return studentList.get(index).getName();
	}

	public String getStudentWithLowestAverage()
	{
		/*double low = Double.MAX_VALUE;
		String hName ="";		

		for (int l=0; l<studentList.size()-1; l++)
		{
			if(getStudentAverage(l) > getStudentAverage(l+1) )
			{
				hName = getStudentName(l+1);
				low = getStudentAverage(l+1);
			}
			
		}


		return hName;*/
		
		int index = 0;
		for(int i = 0; i < studentList.size() - 1; i++)
		{
			if(studentList.get(index).compareTo(studentList.get(i+1)) == 1)
			{
				index = i + 1;
			}
		}
		return studentList.get(index).getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		/*for ( int x =0; x<studentList.length; x++)
		{
			if (getStudentAverage(x) <= failingGrade )
			{
				output += getStudentName(x);
			}
		}*/

		for ( int x =0; x<studentList.size(); x++)
		{
			if (getStudentAverage(x) <= failingGrade )
			{
				output += getStudentName(x);
			}
		}

		return output;
	}
	
	public void sort()
	{
		//Arrays.sort(studentList);
		Collections.sort(studentList);
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		/*for ( int j = 0; j<studentList.length; j++)
		{
			output += studentList[j].toString() + " " + getStudentAverage(j) + "\n";
		}
		*/
		for ( int j = 0; j<studentList.size(); j++)
		{
			output += studentList.get(j).toString() + " " + getStudentAverage(j) + "\n";
		}



		return output;
	}  	
}