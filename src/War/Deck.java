package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	protected List<Card>cards;
	final int TOP_CARD = 0;
	/**
	 * Deck constructor populates cards List with 52 cards.
	 */
	public Deck() {
		cards = new ArrayList<Card>();
		for(int cardName = 0; cardName<4;cardName++) {
			for(int cardValue = 2; cardValue<=14;cardValue++) {
				cards.add(new Card(cardName, cardValue));
			}
		}
	}
	public List<Card> getCards(){
		return cards;
	}
	/**
	 * Randomizes the order of the cards.
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}
	/**
	 * Removes and returns the top card of the Cards field
	 * @return
	 */
	public Card draw() {
		Card drawnCard = cards.get(TOP_CARD);
		cards.remove(TOP_CARD);
		return drawnCard;
	}

}
