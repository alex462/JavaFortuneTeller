package com.company;

import java.util.Scanner;

public class RunGame {

    Scanner in = new Scanner(System.in);


    public void start() {
        System.out.print("Do you want to play a game? Y/N: ");
        String userPlays = in.nextLine();

        if (userPlays.equalsIgnoreCase("n") || userPlays.equalsIgnoreCase("no")) {
            System.out.print("Human forfeits. Computer wins by default.");
            System.exit(13);
        }
        else if (userPlays.equalsIgnoreCase("y") || userPlays.equalsIgnoreCase("yes")) {
            instructions();
            new playGame();
        } else {
            System.out.print("I didn't understand that. Please try again.");
            start();
        }
    }

    private void instructions(){
        System.out.print("ORIGAMI FORTUNE TELLER GAME\nPicture a four-sided paper fortune teller, labeled with colors on " +
                "the four outside squares\nand numbers on the 8 inside surfaces. Upon opening the " +
                "fortune teller even further, your super\nmagical personalized fortune is revealed.\nBegin.\n\n");
    }
}
