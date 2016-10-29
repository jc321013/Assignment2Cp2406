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
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("New Game");
    JLabel greeting = new JLabel(" ");
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
        super("Mineral Super Trumps Game");
        mainUI = this;
        setSize(WIDTH, HEIGHT);
//        setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);
        JPanel panel1 = new JPanel();
        panel1.add(question);
        panel1.add(answer);
        panel1.add(greeting, BorderLayout.NORTH);
        add(panel1, BorderLayout.NORTH);

//        add(question, BorderLayout.NORTH);
//        add(answer, BorderLayout.WEST);

        add(pressMe, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pressMe.addActionListener(e -> {
            // todo; get number of players from text field

            game = new STGame(5);
            game.selectDealer();
            game.dealRandomCardsToEachPlayer();

            game.selectYouAsPlayer();

            reload();
//                todo; google how to tigger for repaint


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


//    final int SIZE = 180;
//    Container con = getContentPane();
//    JButton button = new JButton("Click");
//    public JHelloFrame()
//    {
//        super("Hello Frame");
//        con.setLayout(new FlowLayout());
//        setSize(SIZE, SIZE);
//        setVisible(true);
//        con.add(button);
//        button.addActionListener(this);
//    }
//    @Override
//    public void actionPerformed(ActionEvent e)
//    {
//        button.setEnabled(true);
