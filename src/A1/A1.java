package A1;

import java.util.Scanner;

/**
 * Created by jmarc on 25/10/2016.
 */
public class A1 {
    private static final int NEW_GAME = 1;
    private static final int END_GAME = 2;



    public static void main(String[] args) {


        showWelcome();
        showMenu();

        int opt = getUserMenuChoice();
        STGame game;
        if (opt == NEW_GAME) {
            game = startNewGame();
            game.playGame();

        }
        if (opt == END_GAME) {
            endGame();
        }


    }




    private static STGame startNewGame() {
//Starts game, controls most functions
        int numPlayers = getNumPlayers();
//        int dealerID  = A1.STGame.selectDealer(numPlayers);
        STGame game = new STGame(numPlayers);
        STGame.selectDealer(numPlayers);
        game.dealRandomCardsToEachPlayer();

        game.selectYouAsPlayer();

        STPlayer humanPlayer = game.getHumanPlayer();
        showPlayer(humanPlayer);


        return game;
    }



    private static void showPlayer(STPlayer humanPlayer) {
        System.out.println("human player is " + humanPlayer);
    }

    //Offers user input and error checking for number of players
    private static int getNumPlayers() {//
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("How many players will be playing?: ");
        choice = input.nextInt();
        while (choice < 3 || choice > 5){
            System.out.println("To play the game you need to have 3 - 5 players.");
            System.out.print("How many players will be playing?: ");
            choice = input.nextInt();
        }
        System.out.println("There are " + choice + " players playing ");
        return choice;
    }



    private static void endGame() {
        System.out.println("Thanks for playing, i hope you enjoyed the game :)");
    }



    private static int getUserMenuChoice() {
        //todo: see prac how to get integer value(Done)
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.print("Choose option: ");
        selection = input.nextInt();
        return selection;

    }
    // Menu choice, to start and end game
    private static void showMenu() {
        System.out.println("1. Start Game");
        System.out.println("2. Exit");
        switch (getUserMenuChoice()) {
            case 1: startNewGame();
                break;
            case 2: endGame();
                break;
        }

    }

    private static void showWelcome() {
        System.out.println("Welcome to Mineral SuperTrumps");
    }



}
