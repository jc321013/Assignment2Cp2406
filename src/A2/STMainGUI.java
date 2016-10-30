package A2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jmarc on 25/10/2016.
 */
public class STMainGUI extends JFrame {
    public static STMainGUI mainUI;
    JLabel question = new JLabel("Number of Players?");
//    sets the font of the labels
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("New Game");
    JLabel greeting = new JLabel(" ");
    JLabel farewell = new JLabel("Thankyou for playing :) ");
//    Size of the GUI
    final int HEIGHT = 225;
    final int WIDTH = 275;

    private STGame game;
    PlayerView playerView;


    public static void main(String[] args)
    {
        STMainGUI frame = new STMainGUI();
        frame.setVisible(true);
    }



    public STMainGUI()
    {
//        GUI Heading
        super("Mineral Super Trumps Game");
        mainUI = this;
        setSize(WIDTH, HEIGHT);

        question.setFont(bigFont);
        greeting.setFont(bigFont);
        farewell.setFont(bigFont);
        JPanel panel1 = new JPanel();
//        groups up the panels so they exist in the same boarder setting
        panel1.add(question);
        panel1.add(answer);
        add(farewell, BorderLayout.CENTER);
//        Positioning of the labels and txt fields
        panel1.add(greeting, BorderLayout.NORTH);

        add(panel1, BorderLayout.NORTH);

//      press me works the function of the new game button when clicked
        add(pressMe, BorderLayout.SOUTH);
//        Exits the game
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        processes the action event
        pressMe.addActionListener(e -> {
            // todo; get number of players from text field

            game = new STGame(5);
            game.selectDealer();
            game.dealRandomCardsToEachPlayer();

            game.selectYouAsPlayer();

            reload();
//                todo; google how to tigger for repaint

//          recieves the text from the answer and displays next to the textfield
            String players = answer.getText();
            String greet = players + " Players will be playing";
            greeting.setText(greet);

        });


        }



    public void reload() {
        if (playerView != null) {
            remove(playerView);
        }
//        todo: add panel currentCardView
        STPlayer humanPlayer = game.getHumanPlayer();
        playerView = new PlayerView(humanPlayer);

        add(playerView, BorderLayout.CENTER);
    }
}


