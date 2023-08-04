public class Card {
    // field
    private final Rank rank;
    private final Suit suit;

    // constructor
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // setter getter
    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return rank.getValue();
    }

    public boolean cardEquals(Card card) {
        return this.equals(card);
    }

    // toString
    // @Override
    // public String toString() {
    // return "Card [" + rank + " " + suit + "]";
    // }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

}
