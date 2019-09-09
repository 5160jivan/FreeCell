


public class Foundation extends CardStack
{
	public Foundation()	{}

	/**
	 * Description copied from class: CardStack
	 * Return whether or not a card may be removed from this stack.
	 * @return whether or not a card may be removed from this stack
	 */
	public boolean canPlayFrom()
	{
		// checks if stack is not empty
		return !stack.empty();
	}

	/**
	 * Given a card to be played to the top of this card stack, 
	 * either make the legal play and return true, or ignore the 
	 * illegal play and return false. For a Foundation, the play
	 * is legal if (1) it is empty and the card is an ace or (2) 
	 * it is not empty and the card is the same suit as the top card 
	 * with the next higher rank.
	 * @param card to be played onto this card stack
	 * @return whether or not the card was played onto this card stack
	 */
	public boolean playTo(Card card)
	{
		//TODO work on legal play

		boolean result = false;
		int cardSuit = card.getSuit();
		int cardRank = card.getRank();

		if(isEmpty())  
		{
			if(isEmpty())  
			{
				if(Card.rankNames[cardRank] == "A")
				{
					addCard(card);
					result = true;
				}
			}
		}

		else
		{

			int topSuit = stack.peek().getSuit();
			int topRank = stack.peek().getRank();
			if(cardSuit == topSuit && cardRank == topRank + 1)
			{
				addCard(card);
				result = true;
			}
			
			else
			{
				result = false;
			}
		}
	
		return result;
	}

	public static void main(String[] args) 
	{

	}
}
