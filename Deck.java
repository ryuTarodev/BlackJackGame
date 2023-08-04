
import java.util.*;

public class Deck {
    // Fields
    private List<Card> deck = new ArrayList<>(52);

    // Constuctor
    public Deck() {
        deck = new ArrayList<>();
        initializeDeck();
    }

    // .value() hashtable hashmap
    private void initializeDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);

                deck.add(card);
            }
        }
    }

    // Method
    public List<Card> getCards() {
        return deck;
    }

    public int size() {
        return deck.size();
    }

    public Card draw() {
        Card firstCard = null;
        if (!deck.isEmpty()) {
            firstCard = deck.get(0);
            deck.remove(0);
        }
        return firstCard;
    }

    public Card draw(int count) {
        Card firstCard = null;
        if (!deck.isEmpty()) {
            firstCard = deck.get(0);
            deck.remove(0);
        }
        return firstCard;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> getCardByRank(Card card) {
        List<Card> getCardByRank = new ArrayList<>();
        for (int i = 0; i < deck.size(); i++) {
            if (card.getRank().equals(deck.get(i).getRank())) {
                getCardByRank.add(deck.get(i));
            }
        }
        return getCardByRank;
    }

    // draw multiple card // fix Later
    // public Card[] draw(int count) {
    // Card[] totalDrawCard = new Card[count];
    // if (!deck.isEmpty()) {
    // for (int i = 0; i < count; i++) {
    // totalDrawCard[i] = deck.get(0);
    // deck.remove(0);
    // }
    // }
    // return totalDrawCard;
    // }

    // public void add(Card card) {
    // deck.add(card);
    // }

    // getter setter
    // public List<Card> getDeck() {
    // return deck;
    // }

    // public void setDeck(List<Card> deck) {
    // this.deck = deck;
    // }

    @Override
    public String toString() {
        return "Deck [deck=" + deck + "]";
    }

}
