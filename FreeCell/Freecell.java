import java.util.Scanner;

public class Freecell 
{
	private static Scanner sc  =  new Scanner(System.in);
	public void play(long seed)
	{
		FreecellGame game = new FreecellGame(seed);
		boolean play = false; 
		while(play == false)
		{
			System.out.println(game.toString());
			// TODO Auto-generated method stub
			System.out.println("Please enter the source and destination");
			int valueA=Integer.parseInt(sc.next());

			if(valueA == -1)
			{
				System.out.println("Okay, you are out");
				break;
			}

			int valueB =Integer.parseInt(sc.next());
			{

				if((valueA < 1 || valueA > 16) || (valueB < 1 || valueB > 16))
				{
					System.out.println("Illegal stack number.");
					continue;
				}

				else
				{
					if(game.play(valueA, valueB) == false)
					{
						System.out.println("Illegal play. " + valueA +", " + valueB);
					}
				}

				play = game.isGameOver();
				if(play == true)
				{
					break;
				}

			}
		}
		if(play == true)
		{
			System.out.println(game.toString());
			System.out.println("You win");
		}
	}



	public void play()
	{
		long seed = (long) Math.random();
		FreecellGame game = new FreecellGame(seed);
		boolean play = false; 
		while(play == false)
		{
			System.out.println(game.toString());
			// TODO Auto-generated method stub
			System.out.println("Please enter the source and destination");
			int valueA=Integer.parseInt(sc.next());

			if(valueA == -1)
			{
				System.out.println("Okay, you are out");
				break;
			}

			int valueB =Integer.parseInt(sc.next());
			{

				if((valueA < 1 || valueA > 16) || (valueB < 1 || valueB > 16))
				{
					System.out.println("Illegal stack number.");
					continue;
				}

				else
				{
					if(game.play(valueA, valueB) == false)
					{
						System.out.println("Illegal play. " + valueA +", " + valueB);
					}
				}

				play = game.isGameOver();
				if(play == true)
				{
					break;
				}

			}
		}

		if(play == true)
		{
			System.out.println(game.toString());
			System.out.println("You win");
		}

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Freecell game = new Freecell();
		game.play(0);

	}

}
