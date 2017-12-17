package Lab4_1;

public class DeckTester {
	public static void main(String[] args)
	{
		String[] ranks = new String[] {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
		String[] suits = new String[] {"diamond","club","heart","spade"};
		int[] pointValues = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck cards = new Deck(ranks, suits, pointValues);
		cards.shuffle();
		for (int i = 0; i < cards.size(); i++)
		{
			Card deal = cards.deal();
			System.out.println("[" + deal + "]");
		}
	}	
}
