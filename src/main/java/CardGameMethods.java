import java.util.List;

public interface CardGameMethods {

    void pickHand(Deck deck);

    int sumHand(List<PlayingCard> hand);
}
