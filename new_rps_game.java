package repo7;

import java.util.Random;
import java.util.Scanner;

public class new_rps_game {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            String[] rps = {"r", "p", "s"};
//            String computerMove = rps[new Random().nextInt(rps.length)];
//
//
//            String playerMove;
//
//            while(true) {
//                System.out.println("Please enter your move (r, p or s)");
//                playerMove = scanner.nextLine();
//                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
//                    break;
//                }
//                System.out.println(playerMove + " not valid move.");
//            }
//            System.out.println("Computer played: " + computerMove);
//
//            if (playerMove.equals(computerMove)) {
//                System.out.println("The game was a tie");
//            }
//            else if (playerMove.equals("p")) {
//                if (computerMove.equals("r")) {
//                    System.out.println("You win!");
//
//                } else if (computerMove.equals("s")) {
//                    System.out.println("You lose!");
//                }
//            }
//
//            else if (playerMove.equals("r")) {
//                if (computerMove.equals("p")) {
//                    System.out.println("You lose!");
//
//                } else if (computerMove.equals("s")) {
//                    System.out.println("You win!");
//                }
//            }
//            else if (playerMove.equals("s")) {
//                    if (computerMove.equals("p")) {
//                        System.out.println("You win!");
//
//                    }
//            }
//            else if (computerMove.equals("r")) {
//                System.out.println("You lose!");
//            }
//            System.out.println("Play again? (y/n)");
//            String playAgain = scanner.nextLine();
//
//            if (!playAgain.equals("y")) {
//                break;
//            }
//        }
        System.out.println("Welcome");
        System.out.println("Select\n r for Rock, p for Paper, s for Scissors");
        String playersChoice = new Scanner(System.in).nextLine();
        int computerChoice = new Random().nextInt(3);
        if ((playersChoice.equalsIgnoreCase("r") && computerChoice == 2) || (playersChoice.equalsIgnoreCase("P") && computerChoice == 0) || (playersChoice.equalsIgnoreCase("s") && computerChoice == 1)){
            System.out.println("You chose " + playersChoice);
            System.out.println("I chose " + switch (computerChoice){
                case 0 ->"Rock";
                case 1 ->"Paper";
                case 2 ->"Scissors";
                default -> "nothing";
            });
            System.out.println("You win");
        }
        else if ((playersChoice.equalsIgnoreCase("r") && computerChoice == 0) || (playersChoice.equalsIgnoreCase("s") && computerChoice == 2) || (playersChoice.equalsIgnoreCase("p") && computerChoice == 1)){
            System.out.println("You chose " + playersChoice);
            System.out.println("I chose " + switch (computerChoice){
                case 0 ->"Rock";
                case 1 ->"Paper";
                case 2 ->"Scissors";
                default -> "nothing";
            });
            System.out.println("It's a tie");
        }
        else if ((playersChoice.equalsIgnoreCase("r") && computerChoice == 1) || (playersChoice.equalsIgnoreCase("p") && computerChoice == 2) || (playersChoice.equalsIgnoreCase("s") && computerChoice == 0)) {
            System.out.println("You chose " + playersChoice);
            System.out.println("I chose " + switch (computerChoice){
                case 0 ->"Rock";
                case 1 ->"Paper";
                case 2 ->"Scissors";
                default ->"nothing";
            });
            System.out.println("You lose");
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}
