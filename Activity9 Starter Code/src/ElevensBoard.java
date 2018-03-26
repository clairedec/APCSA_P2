import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 	System.out.print("Claire Lee" + "\n" +  "Period 2" + "\n" + "3/23/18" + "\n" +  "Computer #17");
	 	
	 	
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		/*if(selectedCards.size() == 2)
		{
			return containsPairSum11(selectedCards);
		}
		if(selectedCards.size() == 3)
		{
			return containsJQK(selectedCards);
		}
		return false;*/
		
		if(selectedCards.size() == 2)
		{
			return containsPairSum15(selectedCards);
		}
		else if(selectedCards.size() == 1)
		{
			return containsKing(selectedCards);
		}
		else
		{
		return false;
		}	
		
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		//return containsPairSum11(cardIndexes()) || containsJQK(cardIndexes());
		return containsPairSum15(cardIndexes()) || containsKing(cardIndexes());
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	//private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		/*for ( int i=0; i<selectedCards.size(); i++)
		{
			for (int j=i; j<selectedCards.size(); j++)
			{
				if (cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(j)).pointValue() ==11)
				{
					return true;
				}
				
			}
		}
		
		return false;
	}*/
	
	private boolean containsPairSum15(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		for ( int i=0; i<selectedCards.size(); i++)
		{
			for (int j=i+1; j<selectedCards.size(); j++)
			{
				if (cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(j)).pointValue() ==15)
				{
					return true;
				}
				
			}
		}
		
		return false;
	}


	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	//private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		/*boolean Queen = false;
		boolean King = false;
		boolean Jack = false;
		
			for ( int i=0; i<selectedCards.size(); i++)
			{
				if ( cardAt(selectedCards.get(i)).rank().equals("queen"))
				{
					Queen = true;
				}
				if ( cardAt(selectedCards.get(i)).rank().equals("king"))
				{
					King = true;
				}
				if ( cardAt(selectedCards.get(i)).rank().equals("jack"))
				{
					Jack = true;
				}
				
			}	
			
			return Queen && King && Jack;


		
	}*/
	
	private boolean containsKing(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */

		boolean King = false;

		
			for ( int i=0; i<selectedCards.size(); i++)
			{

				if ( cardAt(selectedCards.get(i)).rank().equals("king"))
				{
					King = true;
				}

				
			}	
			
			return  King ;


		
	}
}
