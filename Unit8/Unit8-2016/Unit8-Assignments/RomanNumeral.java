//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		
		setRoman(str);
		number=0;
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
		roman="";
	}

	public void setNumber(Integer num)
	{
		number=num;

	}

	public void setRoman(String rom)
	{
		roman=rom;

	}

	public Integer getNumber()
	{
		
		number=0;

		for (int i=0; i<NUMBERS.length; i++)
		{
			while(roman.indexOf(LETTERS[i])==0)
			{
				number=number+NUMBERS[i];
				roman=roman.substring(LETTERS[i].length());
			}
			
		}
		return number;
		
		
		/*
		boolean b;
		b=false;
		int holder=0;
		String test= roman;
		
		while (test.length() > 0) 
		{
			
			for (int i=0; i<LETTERS.length; i++)
			{
				if (test.length()>=2)
				{
					if (test.substring(0,2).equals(LETTERS[i]))
					{
						b=true;
						holder=i;
					}
				}
			
			}
			
			if (b==true)
			{
				number=number+NUMBERS[holder];
				test= test.substring(2);
			}
			
			else
			{
				for (int k=0; k<LETTERS.length; k++)
				{
						if (Character.toString(test.charAt(0)).equals(LETTERS[k]))
						{
							
							number=number+NUMBERS[k];
							test = test.substring(1);
							
						}
				}
			
			}
			b=false;
		}
		return number;
	*/
	}
	
	public String getRoman()
	{
		roman="";
		for (int j=0; j<NUMBERS.length; j++)
		{
			if (number >= NUMBERS[j])
			{
				roman= roman + LETTERS[j];
				number=number-NUMBERS[j];
				j--;
			}
		}
		return roman;
	}

	public String toString()
	{

		return getRoman() + "\n";   
	}
	
}