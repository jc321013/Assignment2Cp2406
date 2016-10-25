package A2;

import java.util.ArrayList;

/**
 * Created by jmarc on 25/10/2016.
 */
public class STPlayer {
    private ArrayList<STCard> cards;
    private String playerID;

    public STPlayer(String playerId) {
        this.playerID = playerId;
    }


    public void setCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }

    public ArrayList<STCard> getCards(){
    return cards;}

    public String toString(){

        return " PlayerId= " + playerID + "\n" + playerID + " cards are: " + cards;
    }
}
