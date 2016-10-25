package A2;

import javax.swing.*;

/**
 * Created by jmarc on 25/10/2016.
 */
public class CardView extends JPanel {
    STCard card;
    JLabel cardName;

    public CardView(STCard card) {
        this.card = card;
        cardName = new JLabel(card.getName() + "_id" + card.getId());
        add(cardName);

    }
}
