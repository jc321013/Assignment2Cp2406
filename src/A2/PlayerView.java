package A2;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by jmarc on 25/10/2016.
 */
public class PlayerView extends JPanel {
    STPlayer player;
    JLabel playerName = new JLabel("Not Set");

    public PlayerView(STPlayer player){
        this.player = player;
        add(playerName);
        addAllCards();
    }

    private void addAllCards() {
//        ArrayList<STCard> cards = player.getCards();
        ArrayList<STCard> cards = new ArrayList<STCard>();

        cards.add(new STCard(11, "11"));
        cards.add(new STCard(12, "12"));
        cards.add(new STCard(13, "13"));
        cards.add(new STCard(14, "14"));
        cards.add(new STCard(15, "15"));
        cards.add(new STCard(16, "16"));

        for (int i = 0; i < cards.size(); i++) {
            STCard card = cards.get(i);
            CardView cardView = new CardView(card);
            System.out.println("new card i  =" + i);
            add(cardView);
        }
        repaint();

    }
}
