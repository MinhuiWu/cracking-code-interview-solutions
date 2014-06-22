import java.util.*;

public class Deck {
    private static final int CARDS_NUM = 12;

    private Stack<BlackjackCard> cards = new Stack<BlackjackCard>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (int i = 0; i < CARDS_NUM; i++) {
                cards.push(new BlackjackCard(i + 1, suit));
            }
        }
        Collections.shuffle(cards);
    }

    public BlackjackCard deal() {
        if (size() == 0) {
            throw new IllegalStateException("Deck is empty.");
        }
        return cards.pop();
    }

    public int size() {
        return cards.size();
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();

        for (Suit suit : Suit.values()) {
            for (int i = 0; i < CARDS_NUM; i++) {
                buffer.append(cards.pop() + " ");
            }
            buffer.append("\n");
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);

    }
}
