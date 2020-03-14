package book.algorithms.design.deckofcards;

public class Card {
    public enum Suit {
        CLUBS (1), SPADES (2), HEARTS (3), DIAMONDS (4);
        int value;
        private Suit(int val) {  value = val; }
    }

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int value() { return this.value; }
    public Suit suit() { return this.suit; }
}
