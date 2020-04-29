import java.util.ArrayList;
import java.util.List;

public class Player implements CardGameMethods {
    List<PlayingCard> playersHand = new ArrayList<>();

    @Override
    public void pickHand(Deck deck) {

    }

    @Override
    public int sumHand(List<PlayingCard> hand) {
        return 0;
    }
}
