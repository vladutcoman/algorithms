package book.algorithms.design.deckofcards;

public class BlackJack extends Card {
    public BlackJack(int value, Suit suit) {
        super(value, suit);
    }

    public int value() {
        int r = super.value();
        if (r == 1) {
            return 11;
        }
        if (r < 10) {
            return r;
        }
        return 10;
    }

    public boolean isAce() {
        return super.value() == 1;
    }
}
