package A2;

import javax.swing.*;

/**
 * Created by jmarc on 25/10/2016.
 */
public class PlayerView extends JPanel {
    STPlayer player;
    JLabel playerName = new JLabel("Not Set");

    public PlayerView(STPlayer player){
        this.player = player;
        add(playerName);
    }
}
