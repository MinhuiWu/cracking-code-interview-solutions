public class Card {
    private final static int MIN_RANK = 1;
    private final static int MAX_RANK = 13;

    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        if (rank > MAX_RANK || rank < MIN_RANK) {
            throw new IllegalArgumentException("Illegal card rank!");
        }
        this.rank = rank;
        this.suit = suit;
    }

    public int rank() {
        return rank;
    }

    public Suit suit() {
        return suit;
    }

    public boolean equalsTo(Object object) {
        if (object instanceof Card) {
            Card other = (Card)object;
            return this.rank() == other.rank();
        } else {
            return false;
        }
    }

    public int compareTo(Object object) {
        Card other = (Card)object;
        return this.rank() - other.rank();
    }

    public String toString() {
        String[] suitList = {"Spade", "Heart", "Diamond", "Club"};
        return "[" + String.valueOf(rank()) + " of " + suitList[suit().ordinal()] + "]";
    }
}
