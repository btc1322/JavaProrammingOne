package Chapter5;

import java.util.Scanner;

/**
 * Rock, Paper, Scissors program which allows user to play against the Computer
 *
 * @author Brian Charter
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int user, computer;
        int userScore = 0;
        int computerScore = 0;
        String userString = "";
        String computerString = "";
        while (userScore < 2 && computerScore < 2) {
            System.out.print("scissor(0), rock(1), paper(2): ");
            user = input.nextInt();
            computer = (int) (Math.random() * 3);

            switch (computer) {
                case 0:
                    computerString = "scissor";
                    break;
                case 1:
                    computerString = "rock";
                    break;
                case 2:
                    computerString = "paper";
                    break;
            }

            switch (user) {
                case 0:
                    userString = "scissor";
                    break;
                case 1:
                    userString = "rock";
                    break;
                case 2:
                    userString = "paper";
                    break;
            }
            if (user == 0 && computer == 2) {
                System.out.println("The computer is " + computerString + ". You are " + userString + ". You won");
                ++userScore;

            } else if (computer == 0 && user == 2) {
                System.out.println("The computer is " + computerString + ". You are " + userString + ". You lost");
                ++computerScore;
            } else if (user > computer) {
                System.out.println("The computer is " + computerString + ". You are " + userString + ". You won");
                ++userScore;
            } else if (computer > user) {
                System.out.println("The computer is " + computerString + ". You are " + userString + ". You lost");
                ++computerScore;
            } else {
                System.out.println("The computer is " + computerString + ". You are " + userString + ". It is a draw");
            }
        }
        if (userScore > computerScore) {
            System.out.println("You won more than two times");
        } else if (computerScore > userScore) {
            System.out.println("The computer won more than two times");
        }
    }
}
