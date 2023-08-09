public class Demo {
    public static void main(String[] args) {
        Suit rank = Suit.DIAMONDS;
        System.out.println(rank);

        Card card = new Card(Rank.JACK, Suit.DIAMONDS);
        System.out.println(card);

        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("Shuffle deck = " + deck);
        System.out.println("---------------------------------------");
        System.out.println(deck.draw(2));
        System.out.println(deck);
        System.out.println(deck.size());

    }
}