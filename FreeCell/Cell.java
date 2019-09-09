public class Cell extends CardStack
{
	Cell() {}
	
	/**
	 * Given a card to be played to the top of this card stack, either 
	 * make the legal play and return true, or ignore the illegal play 
	 * and return false. For a Cell, the play is legal if the stack is 
	 * empty (free).
	 * @param card - card to be played onto this card stack
	 * @return whether or not the card was played onto this card stack
	 */
	public boolean playTo(Card card)
	{
		// legal play
		if(isEmpty())
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
	
	public static void main(String[] args) 
	{

	}
}
