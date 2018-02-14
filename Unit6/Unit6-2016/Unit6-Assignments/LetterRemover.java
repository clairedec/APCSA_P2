//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence="";
		lookFor=' ';
		//call set
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned="";
		int hold = sentence.indexOf(lookFor);
		while (hold >=0)
		{
			cleaned=sentence.charAt(hold);
		} 
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + removeLetters();
	}
}