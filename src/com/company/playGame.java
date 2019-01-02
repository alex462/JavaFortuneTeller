package com.company;

public class playGame extends RunGame {

    public playGame() {
        rnd1Clr();
    }

    private void rnd1Clr() {
        System.out.print("Choose a color: \n1. RED\n2. GREEN \n3. YELLOW\n4. BLUE\n");
        int userRnd1Clr = in.nextInt();
        if (userRnd1Clr == 1 || userRnd1Clr == 2) {
            origamiPaperNoise();
            rnd2NumGp1();
        }
        if (userRnd1Clr == 3 || userRnd1Clr == 4) {
            origamiPaperNoise();
            rnd2NumGp2();
        } else {
            System.out.print("Invalid entry.");
            System.exit(13);
        }
    }

    //NUM GROUP 1
    //Includes smaller numbers 1, 2, 5, 6
    private void rnd2NumGp1() {
        System.out.print("Now choose a number: \n2      5\n\n1     6\n");
        int userRnd3NumGp1 = in.nextInt();
        switch (userRnd3NumGp1) {
            case 1:
                origamiPaperNoise();
                System.out.print("run.");
                break;
            case 2:
                origamiPaperNoise();
                System.out.print("No snowflake in an avalanche ever feels responsible.");
                break;
            case 5:
                origamiPaperNoise();
                System.out.print("If you eat something, and nobody sees you eat it, it has no calories.");
                break;
            case 6:
                origamiPaperNoise();
                System.out.print("If you think no one cares if you are alive, try missing a couple car payments.");
                break;
            default:
                System.out.print("");
                break;
        }
    }

    //NUM GROUP 2
    //Includes larger numbers 3, 4, 7, 8
    private void rnd2NumGp2() {
        System.out.print("Now choose a number: \n3      4\n\n8      7\n");
        int userRnd3NumGp2 = in.nextInt();
        switch (userRnd3NumGp2) {
            case 3:
                origamiPaperNoise();
                System.out.print("Your pet is planning to eat you.");
                break;
            case 4:
                origamiPaperNoise();
                System.out.print("Your resemblance to a muppet will prevent the world from taking you seriously.");
                break;
            case 7:
                origamiPaperNoise();
                System.out.print("A true patriot is the fellow who gets a parking ticket and rejoices that the system works. " +
                        "Are you a TRUE patriot?");
                break;
            case 8:
                origamiPaperNoise();
                System.out.print("Your friends secretly agree that your head is the wrong size for your body.");
                break;
            default:
                System.out.print("");
                break;
        }
    }

    private void origamiPaperNoise(){
        System.out.print("\"...flip..flip...swishing paper...quiet flip.. \"\n\n");
    }
}
