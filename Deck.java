
import java.util.*;

public class Deck {
    // Fields
    private List<Card> deck = new ArrayList<>(52);

    // Constuctor
    public Deck() {
        deck = new ArrayList<>();
        initializeDeck();
    }

    // .value() hashtable hashmap (like table in python [key, value]),loop in loop,
    private void initializeDeck() {
        for (Suit suit : Suit.values()) { // value of suit = Clubs,Diamonds,Hearts,Spades
            for (Rank rank : Rank.values()) { // value of rank = 1,2,3,4,5,6,7,8,9,10,j,q,k
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

    public List<Card> draw(int count) {
        List<Card> drawCard = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            drawCard.add(deck.get(i));
            deck.remove(0);
        }
        return drawCard;
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

    @Override
    public String toString() {
        return "Deck [deck=" + deck + "]";
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

}
