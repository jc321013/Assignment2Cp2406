package A1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jmarc on 25/10/2016.
 */
public class STDeck {
    private static final int NUM_CARDS_INIT = 60;
    private ArrayList<STCard> cards;
    private STDeckBuilder deckBuilder;

    //todo: list of all cards

    //    shuffles cards
    public STDeck() {
        cards = new ArrayList<STCard>();

        for (int i = 0; i < NUM_CARDS_INIT; i++) {
            cards.add(new STCard(i, "Quartz", new String[]{""}, "SiO_2", "tectosilicate", "hexagonal", new String[]{"igneous", "metamorphic", "sedimentary"}, "7.0", "2.65", "poor/none", "high", "moderate"));


        }
        deckBuilder = new STDeckBuilder();

    }
    public ArrayList<STCard> dealCards(int numCards) {
        ArrayList<STCard> ret = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            int idx = new Random().nextInt(cards.size());
            STCard card = cards.remove(idx);
            ret.add(card);
//            System.out.println("\n card" + card);
        }
        return ret;
    }






}
