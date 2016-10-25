package A2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jmarc on 25/10/2016.
 */
public class STMainGUI extends JFrame implements ActionListener {
    JLabel question = new JLabel("Number of Players?");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("New Game");
    JLabel greeting = new JLabel("");
    final int HEIGHT = 225;
    final int WIDTH = 275;
    private STGame game;

    public static void main(String[] args)
    {
        STMainGUI frame = new STMainGUI();
        frame.setVisible(true);
    }



    public STMainGUI()
    {
        super("Mineral Super Trumps Game");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);
        add(question, BorderLayout.NORTH);
        add(answer);
        add(pressMe);
        add(greeting, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pressMe.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        game = new STGame(5);
        game.selectDealer();
        game.dealRandomCardsToEachPlayer();

        game.selectYouAsPlayer();


        String players = answer.getText();
        String greet = players + " people will be playing ";
        greeting.setText(greet);


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
