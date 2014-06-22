import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<BlackjackCard> cards = new ArrayList<BlackjackCard>();

    public Player(String name) {
        this.name = name;
    }

    public void hand(BlackjackCard card) {
        cards.add(card);
    }

    public boolean call() {
        return values() < 13;
    }

    public boolean win() {
        return values() > 20;
    }

    public void clear() {
        cards.clear();
    }

    public int values() {
        int sum = 0;
        for (BlackjackCard card : cards) sum += card.rank();
        return sum;
    }

    public boolean equalsTo(Object object) {
        Player other = (Player)object;
        return this.values() == other.values();
    }

    public int compareTo(Object object) {
        Player other = (Player)object;
        return this.values() - other.values();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (BlackjackCard card : cards) sb.append(card);
        return name + ": has " + cards.size() + " card(s) value is " + values() + sb.toString();
    }
}
