import java.util.Random;

// Deck is a subset of CardStack
// but not every CardStack is a deck
public class Deck extends CardStack
{
	/**
	 * Create a shuffled deck of cards according to the 
	 * given random number seed.
	 * @param seed - random seed specifying FreeCell deal
	 */
	public Deck(long seed)
	{
		// fill the deck with all cards
		for (Card c : Card.allCards)
		{
			addCard(c);
		}
		
		// shuffle the cards - Knush / Fisher-Yates shuffle
		Random random = new Random(seed);
		for (int i = stack.size() - 1; i > 0; --i)
		{
			int j = random.nextInt(i + 1);
			
			// swapping cards at i and j
			// check by seeing they are in diagonal pairs in the set lines
			Card c = stack.get(i);
			stack.set(i, stack.get(j));
			stack.set(j, c);
		}
	}
	
	/** 
	 * Description copied from class: CardStack 
	 * Return whether or not a card may be removed 
	 * from this stack.
	 * @return whether or not a card may be removed from this stack
	 */
	public boolean canPlayFrom()
	{
		return false;
	}
	
	/** 
	 * Description copied from class: CardStack 
	 * Given a card to be played to the top of this 
	 * card stack, either make the legal play and 
	 * return true, or ignore the illegal play and return false.
	 * @param card - card to be played onto this card stack
	 * @return whether or not the card was played onto this card stack
	 */
	public boolean playTo(Card card)
	{
		return false;
	}
	
	public static void main(String[] args) 
	{
		
	}

}

