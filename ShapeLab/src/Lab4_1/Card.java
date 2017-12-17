package Lab4_1;

public class Card {
	String rank;
	String suit;
	private int pointValue;
	
	public Card (String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	public String getRank()
	{
		return this.rank;
	}
	
	public String getSuit()
	{
		return this.suit;
	}
	
	public int getPointValue()
	{
		return this.pointValue;
	}

	public boolean equals(Card otherCard)
	{
		if (this.pointValue == otherCard.pointValue)
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		return ("Rank: " + rank + " |" + " Suit: " + suit + " |" + " PointValue: " + pointValue);
	}
}
