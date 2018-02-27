import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		double [] array1 = {100, 90, 85, 72.5, 95.6};
		Grades test1 = new Grades(5, array1);
		test1.getAverage();
		System.out.println(test1.toString() +"\n");
		
		double [] array2 = {50, 100, 80};
		Grades test2 = new Grades(3, array2);
		test2.getAverage();
		System.out.println(test2.toString()+"\n");
		
		double [] array3 = {93.4, -90, 90};
		Grades test3 = new Grades(3, array3);
		test1.getAverage();
		System.out.println(test3.toString()+"\n");
		
		double [] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Grades test4 = new Grades(9, array4);
		test4.getAverage();
		System.out.println(test4.toString()+"\n");
		
		
		
	}
}