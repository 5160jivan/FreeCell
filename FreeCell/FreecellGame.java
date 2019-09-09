import java.util.ArrayList;

public class FreecellGame 
{
	private CardStack[] stacks = new CardStack[17];

	/**
	 * Model of a Freecell game. Card stacks are numbered as follows: 
	 * 0: deck (not used by player), 1-4: cells, 5-8: foundations, 
	 * 9-16: cascades The toString method is implemented as shown in 
	 * text game transcript.
	 * Create a Freecell game with a random deal generated with a given seed.
	 * @param seed for random deal
	 */
	public FreecellGame(long seed)
	{
		stacks[0] = new Deck(seed);

		// creating 4 cells, 4 foundations, and 8 cascades
		for (int i = 1; i < stacks.length; i++)
		{
			if(i < 5)
			{
				// creates cells
				stacks[i] = new Cell();
			}
			else if (i >=5 && i < 9)
			{
				// creates foundations
				stacks[i] = new Foundation();
			}
			else
			{
				// creates the cascades
				stacks[i] = new Cascade();
			}
		}

		int i = 9;
		while(!stacks[0].isEmpty())
		{
			// adds card to stack after removing from the deck and then increases i for next (i++)
			stacks[i++].addCard(stacks[0].removeTopCard());
			if(i == 17)
			{
				i = 9;
			}
		}
	}

	/**
	 * Attempt to move a card from stack srcStackNum to stack destStackNum. 
	 * If the play is legal, the play is made and true is returned. If the 
	 * play is not legal, no change is made and false is returned.
	 * @param srcStackNum source stack number
	 * @param destStackNum destination stack number
	 * @return whether or not the play was legal and performed
	 */
	public boolean play(int srcStackNum, int destStackNum)
	{
		return stacks[destStackNum].playTo(stacks[srcStackNum]);			

	}

	/**
	 * Return an array with the Card in the given 
	 * stack number listed from bottom to top.
	 * @param stackNum - stack number
	 * @return an array with the Card in 
	 * the given stack number listed from bottom to top
	 */
	public Card[] getStack(int stackNum)
	{
		Card[] topBottom = stacks[stackNum].toArray();
		return topBottom;
	}

	/**
	 * Return whether or not the game has been won 
	 * (that is, all cards are on foundations).
	 * @return whether or not the game has been won 
	 * (that is, all cards are on foundations)
	 */
	public boolean isGameOver()
	{
		boolean win = false;
		for(int i = 5; i < 9; i++)
		{
			// if the foundation has all 13 cards present, win becomes true
			// if it does not, win becomes false
			// if all iterations are passed through with winning, then
			// all foundations are complete, and the Game is over
			if(stacks[i].size() == 13)
			{
				win = true;
			}
			else
			{
				win = false;
			}
		}
		return win;
	}

	/**
	 * @overrides toString in class java.lang.Object
	 */
	public java.lang.String toString()
	{
		StringBuilder result = new StringBuilder();
		for(int i = 1; i < 17; ++i)
		{
			if(i == 1)
			{
				result.append("Cells:\n");
			}
			if(i == 5)
			{
				result.append("Foundations:\n");
			}
			if(i == 9)
			{
				result.append("Cascades:\n");
			}
			if(i < 10)
			{
				result.append(" " + i + ": "  + stacks[i] + "\n");				
			}

			else
			{
				result.append (i + ": "  + stacks[i] + "\n");
			}
		}
		String strResult = result.toString();
		return strResult;
	}

	public static void main(String[] args) 
	{

	}
}
