package A2;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by jmarc on 25/10/2016.
 */
public class CardView extends JPanel {
    STCard card;
    JLabel cardName;

    public CardView( STCard card) {
        this.card = card;
        cardName = new JLabel(card.getName() + "_id" + card.getId());
        add(cardName);

//        card.getImage();
//        addMouseListener(new MouseInputAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//
//                super.mouseClicked(e);
//                STGame.currentGame.validCardToPlay(card);
//                cardName.setText("I Was Clicked!");
//            }
//        });
//    }
        addMouseListener(new MyMouse());
    }

    class MyMouse extends MouseInputAdapter{
        public void mouseClicked(MouseEvent e) {

            super.mouseClicked(e);
            STGame game = STGame.currentGame;
            boolean ok = game.playCard(card);
            if (!ok) {
                cardName.setText("Not okay to play");
            }
            game.getHumanPlayer().getCards().remove(card);
//            game.setCurrentCard(card);

            STMainGUI.mainUI.reload();

//          place cardView to play-table-view shows what card is
//            remove card-view from player-view
            cardName.setText("I Was Clicked!");
        }

    }
}
