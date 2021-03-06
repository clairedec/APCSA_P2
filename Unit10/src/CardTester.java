/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card test1 = new Card("king", "spades", 10);
		System.out.println(test1);
		System.out.println(test1.matches(test1) + "\n");
		
		Card test2 = new Card("eight", "clubs", 8);
		System.out.println(test2);
		System.out.println(test2.matches(test2)+ "\n");
		
		Card test3 = new Card("three", "hearts", 3);
		System.out.println(test3);
		System.out.println(test3.matches(test1)+ "\n");
		

	}
}
