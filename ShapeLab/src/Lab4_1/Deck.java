package Lab4_1;

import java.util.ArrayList;

public class Deck {
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;
	
	public Deck(String[] ranks, String[] suits, int[] pointValues)
	{
		 for (int i = 0; i < ranks.length; i++)
		 {
			 String rank = ranks[i];
			 int value = pointValues[i];
			 for (int j = 0; j < suits.length; j++)
			 {
				 Card card = new Card(rank, suits[j], value);
				 unDealt.add(card);
			 }
		 }
	}
	
	public boolean isEmpty()
	{
		if (unDealt.size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public int size()
	{
		return unDealt.size();
	}
	
	
}
