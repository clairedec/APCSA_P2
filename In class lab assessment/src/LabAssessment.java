
public class LabAssessment 
{
	
	//12 - 2 and 1 is a digit divisor sum is 3 (odd) so return true

	
	public static boolean isGoofy(int num)
	{
		int sum=0;
	
				
		int[] test = {num.indexOf(0),num.indexOf(1), ..};

		
		for (int i=0; i<test.length; i++)
		{
			if (num % test[i] == 0)
			{
				sum=sum+ test[i];
			}
		}

		if (sum%2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int[] getSomeGoofyNumbers(int count)
	{
		int[] array;
		int[] array1 = new int[count];
		
		for(int j=0; j<count; j++)
		{
			array1[j]=isGoofy(num);
		}
		
		return array1;
	}
	
	
	public static void main(String[] args)
	{
		
		LabAssessment testing = new LabAssessment();
		testing.isGoofy(45);
		testing.getSomeGoofyNumbers(3);
	}

}

