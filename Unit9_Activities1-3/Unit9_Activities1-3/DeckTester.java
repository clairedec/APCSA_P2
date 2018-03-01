/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] ranks= {"one", "two", "three", "four", "five", "six"};
		String[] suits= {"spades", "hearts", "diamonds"};
		int[] values={1, 2, 3, 4, 5, 6};
		Deck test = new Deck(ranks, suits, values);
		System.out.println(test);
		System.out.println(test.isEmpty());
		System.out.println(test.deal());
		
	}
}
