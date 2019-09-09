
public class Card 
{
	/**
	 * an array of all unique Card objects
	 */
	public static Card[] allCards;

	/**
	 * array of abbreviated card rank names in ascending order of rank
	 */
	public static java.lang.String[] rankNames = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

	/**
	 * array of abbreviated card suit names with lowercase red suits
	 */
	public static java.lang.String[] suitNames = {"C", "d", "h", "S"};

	/**
	 * parallel array to suitNames indicating whether or not the corresponding suit is red
	 */
	public static boolean[] suitIsRed = {false, true, true, false};

	// code run when the class is loaded!!!
	static
	{
		allCards = new Card[rankNames.length * suitNames.length];
		int i = 0;
		for( int suit = 0; suit < suitNames.length; suit++)
		{
			for( int rank = 0; rank < rankNames.length; rank++)
			{
				// places it at i and then adds one to i!!!!
				// post-increment operator 
				allCards[i++] = new Card(rank, suit);
			}
		}
	}

	// once the card object is made, the cards should not change
	private int rank, suit;

	/**
	 * Constructor to create a card object with the corresponding zero-based indices to rankNames and suitNames, respectively
	 * @param rank - rank of card (zero-based index to rankNames)
	 * @param suit - suit of card (zero-based index to suitNames)
	 */
	public Card(int rank, int suit)
	{
		//added by me
		if(rank< rankNames.length && suit< suitNames.length)
		{
			this.rank = rank;
			this.suit = suit;			
		}
	}

	/**
	 * Get rank of card (zero-based index to rankNames).
	 * @return rank of card (zero-based index to rankNames)
	 */
	public int getRank()
	{
		return rank;
	}

	/**
	 * Get suit of card (zero-based index to suitNames).
	 * @return suit of card (zero-based index to suitNames)
	 */
	public int getSuit()
	{
		return suit;
	}

	/**
	 * Return a String representation of a card as the rank name
	 * concatenated with the suit name
	 * @return String representation of a card as the rank name
	 * concatenated with the suit name
	 */
	public java.lang.String toString()
	{
		return rankNames[rank] + suitNames[suit];
	}
}
