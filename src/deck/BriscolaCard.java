package deck;

import game.BriscolaGame;
import java_card.Card;

public class BriscolaCard extends Card
{	
	/*
	 * Return the card's value for totaling
	 */
	public int getValue()
	{
		int rank = this.getRank().ordinal();
		
		if( rank == BriscolaCardRank.BriscolaRank.ACE.ordinal() )
		{
			return 11;
		}
		if( rank == BriscolaCardRank.BriscolaRank.THREE.ordinal() )
		{
			return 10;
		}
		if( rank == BriscolaCardRank.BriscolaRank.KING.ordinal() )
		{
			return 4;
		}
		if( rank == BriscolaCardRank.BriscolaRank.KNIGHT.ordinal() )
		{
			return 3;
		}
		if( rank == BriscolaCardRank.BriscolaRank.KNAVE.ordinal() )
		{
			return 2;
		}
	
		return 0;
	}
	
	/*
	 * Whether this card's suit is the same as the briscola's
	 */
	public boolean isBriscola()
	{
		return ((BriscolaGame)this.getGame()).getBriscola() == this.getSuit();
	}
	
	/*
	 * Return true if this card is better than the given card.
	 * TODO: move into compareTo
	 */
	public boolean isBetter(BriscolaCard card)
	{
		/* if this isn't the briscola but the other card is */
		if( !this.isBriscola() && card.isBriscola() )
		{
			return false;
		}
		
		return false;
	}

	public int compareTo(Card card)
	{
		// TODO: implement
		return 0;
	}
}
