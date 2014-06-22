import java.util.ArrayList;

public class Blackjack {
    private Deck deck;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Blackjack() {
        deck = new Deck();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void round() {
        for (Player p : players) {
            if (p.call()) hand(p);
        }
    }

    public void hand(Player player) {
        player.hand(deck.deal());
    }

    public boolean query() {
        for (Player player : players) {
            if (player.win()) {
                System.out.println(player);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Player jaime = new Player("Jaime");

        Blackjack jack = new Blackjack();
        jack.addPlayer(jaime);
        while (true) {
            if (!jack.query()) {
                System.out.println(jaime);
                jack.round();
            } else {
                break;
            }
        }
    }
}
