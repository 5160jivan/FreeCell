
public class Cascade extends CardStack
{
	public Cascade() {}
	
	/**
	 * Given a card to be played to the top of this card stack, 
	 * either make the legal play and return true, or ignore 
	 * the illegal play and return false. For a Cascade, the play 
	 * is legal if either (1) the stack is empty, or (2) the top 
	 * card is the next higher rank with differing color.
	 * @param card to be played onto this card stack
	 * @return card to be played onto this card stack
	 */
	public boolean playTo(Card card)
	{
		// if legal play
		// play is legal if 
		//		1. the stack is empty
		//		2. the top card is the next higher rank with differing color
		int cardSuit = card.getSuit();
		int cardRank = card.getRank();
		
		if(isEmpty())
		{
			addCard(card);
			return true;
		}
		
		else
		{
			int topSuit = stack.peek().getSuit();
			int topRank = stack.peek().getRank();
			
			if(topRank == cardRank + 1  && Card.suitIsRed[cardSuit] != Card.suitIsRed[topSuit])
			{
				addCard(card);
				return true;
			}
			
			// illegal play
			else
			{
				return false;
			}
		}
	}
	
	public static void main(String[] args) 
	{

	}
}
