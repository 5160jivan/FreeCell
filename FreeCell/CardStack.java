import java.util.Stack;

public class CardStack 
{
	protected java.util.Stack<Card> stack = new Stack<>();
	// stack methods:
	// 		- push() ==> adds to the stack
	//		- pop() ==> takes off the stack
	//		- peek() ==> checks what is on top of the stack
	//		- size() ==> checks the size
	//		- empty() ==> checks if it is empty

	public CardStack() {}

	public void addCard(Card card)
	{
		if (card != null)
		{
			stack.push(card);
		}
	}

	public boolean canPlayFrom()
	{
		// checks if stack is not empty
		return !stack.empty();
	}

	public Card getTopCard()
	{
		return stack.empty() ? null : stack.peek();
	}

	public boolean isEmpty()
	{
		return stack.empty();
	}

	public boolean playTo(Card card)
	{	
		if (card == null)
		{
			return false;
		}
		else
		{
			addCard(card);
			return true;
		}
	}

	public boolean playTo(CardStack otherStack)
	{
		if(!otherStack.canPlayFrom())
		{
			return false;
		}
		else
		{
			boolean legalPlay = playTo(otherStack.getTopCard());
			if (legalPlay)
			{
				otherStack.removeTopCard();
			}
			return legalPlay;
		}
	}

	public Card removeTopCard()
	{
		// do nothing if there is no cards in stack
		// pop one off if there is!
		return stack.empty() ? null : stack.pop();
	}

	public int size()
	{
		return stack.size();
	}

	public java.lang.String toString()
	{
		String s = stack.toString();
		//System.out.println(s);
		return s.substring(1, s.length() - 1);
	}

	public Card[] toArray()
	{
		return stack.toArray(new Card[stack.size()]);
	}

	public static void main(String[] args) 
	{

	}
}

