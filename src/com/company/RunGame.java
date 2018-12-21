package com.company;

import java.util.Scanner;

public class RunGame {

    Scanner in = new Scanner(System.in);

    public void start(RunGame runGame) {
        System.out.print("Do you want to play a game? Y/N");
        String userPlays = in.nextLine();

        if(userPlays.toUpperCase().equals("n")||userPlays.toUpperCase().equals("no")){
            System.out.print("Human forfeits. Computer wins by default.");
            System.exit(13);
        } else {
            playGame();
        }
    }

    private void playGame() {
        System.out.print("Rock / Paper / Scissors ?");
        String userChoice = in.nextLine();
        String computerChoice = 
    }
}
