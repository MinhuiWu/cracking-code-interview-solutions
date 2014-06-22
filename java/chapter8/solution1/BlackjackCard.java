public class BlackjackCard extends Card {
    public BlackjackCard (int rank, Suit suit) {
        super(rank, suit);
    }

    public int rank() {
        return super.rank() > 10 ? 10 : super.rank();
    }
}
