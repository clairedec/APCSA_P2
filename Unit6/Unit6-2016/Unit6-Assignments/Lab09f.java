//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover demo1 = new LetterRemover("I am Sam I am", 'a');
		System.out.println(demo1);
		
		LetterRemover demo2 = new LetterRemover("ssssssssxssssesssssesss", 's');
		System.out.println(demo2 +"\n");
		
		LetterRemover demo3 = new LetterRemover("qwertyqwertyqwerty", 'a');
		System.out.println(demo3 +"\n");
		
		LetterRemover demo4 = new LetterRemover("abababababa", 'b');
		System.out.println(demo4 +"\n");
		
		LetterRemover demo5 = new LetterRemover("abaababababa", 'x');
		System.out.println(demo5 +"\n");
		
		
											
	}
}