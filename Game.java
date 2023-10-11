
/**
 * Aaron Kang
 * 1-2
 * Oct 10th
 */

import java.util.Scanner;
import java.lang.Math;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] moves = {"ROCK", "PAPER", "CROSSBLADES"};

        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades! ");
        System.out.print("You: ");
        String playerInput = scanner.nextLine().trim();
        int playerMove = GetPlayerMove(playerInput);

        if (playerMove == -1) {
            System.out.println("Computer: You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
            System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
        }
        else if (playerInput.length() < 50) {
            String computerMove = moves[(playerMove+1)%3];
            System.out.println("Computer: Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose " + computerMove + "!");
            System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
        }
        else {
            int computerMove = (int)(Math.random()*3);
            String computer = moves[computerMove];
            System.out.println("Computer: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course: ROCK!");
            if (computerMove == playerMove) {
                System.out.println("Result: Unbelievable! We have tied! *Eye twitches*");
            }
            else if ((playerMove+1)%3 == computerMove%3) {
                System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
            }
            else {
                System.out.println("What?! It cannot be! I have lost! *Eye twitches in anger*");
            }

        }

    }

    public static int GetPlayerMove(String input) {
        int playerMove; //0 -> Rock, 1 -> Paper, 2 -> Crossblades
        if (input.length() >= 4 && input.substring(input.length()-4, input.length()).equalsIgnoreCase("rock")) {
            playerMove = 0;
        }
        else if (input.length() >= 5 && input.substring(input.length()-5, input.length()).equalsIgnoreCase("paper")) {
            playerMove = 1;
        }
        else if (input.length() >= 11 && input.substring(input.length()-11, input.length()).equalsIgnoreCase("crossblades")) {
            playerMove = 2;
        }
        else {
            playerMove = -1; //invalid choice
        }
        return playerMove;
    }
}

