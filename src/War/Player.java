package War;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player in the game.
 * @author Kent Ma
 *
 */
public class Player {
	private List<Card>hand;
	private int score;
	private String name;
	final int TOP_CARD = 0;
	
	public Player(String name) {
		hand = new ArrayList<Card>();
		setScore(0);
		setName(name);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Prints out player name
	 */
	public void describe() {
		System.out.println("Player Name: "+getName());
//		for(Card card:hand) {
//			card.describe();
//		}
	}
	/**
	 * Removes and returns top card of the Hand List.
	 * @return
	 */
	public Card flip() {
		Card cardFlipped = hand.get(TOP_CARD);
		hand.remove(TOP_CARD);
		return cardFlipped;
	}
	/**
	 * Takes Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field.
	 * @param deck
	 */
	public void draw(Deck deck) {
		for(int index = 1; index<=26;index++) {
			Card card = deck.draw();
			hand.add(card);
		}
	}
	/**
	 * Adds 1 to the Player's score field
	 */
	public void incrementScore() {
		score++;
	}
}
