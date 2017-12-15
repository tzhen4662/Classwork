package Lab4_1;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt = new ArrayList<Card>();
	private ArrayList<Card> Dealt = new ArrayList<Card>();
	
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
	
	public Card deal()
	{
		if (unDealt.size() == 0)
		{
			return null;
		}
		else
		{
			this.Dealt.add(this.unDealt.get(this.size()-1));
		}
		return this.unDealt.remove(this.size()-1);
	}
	
	public void shuffle()
	{
		for (int k = this.size()-1; k >= 0; k--)
		{
			int r = (int) (Math.random()*k)+1;
			swap(this.unDealt, k, r);
		}
	}
	
	public static void swap(ArrayList<Card> arr, int a, int b)
	{
		Card temp = arr.get(a);
		arr.set(a, arr.get(b));
		arr.set(b, temp);
	}
}
