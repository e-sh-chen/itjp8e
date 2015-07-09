package chapter3;

import java.util.Scanner;

/**
 * Created by chens on 2015/7/9.
 */
public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock(1), paper (2): ");
        int you = input.nextInt();
        String youString = "";
        if (you == 0)
            youString = "scissor";
        else if (you == 1)
            youString = "rock";
        else if (you == 2)
            youString = "paper";

        int computer = (int) (Math.random() * 10) % 3;
        String computerString = "";
        if (computer == 0)
            computerString = "scissor";
        else if (computer == 1)
            computerString = "rock";
        else if (computer == 2)
            computerString = "paper";

        String outputString;
        if (you == computer)
            outputString = "The computer is " + computerString + ". You are " + youString + " too. It is a draw.";
        else if (you == 0 && computer == 2)
            outputString = "The computer is " + computerString + ". You are " + youString + ". You won";
        else if (computer == 0 && you == 2)
            outputString = "The computer is " + computerString + ". You are " + youString + ". You lost";
        else if (you > computer)
            outputString = "The computer is " + computerString + ". You are " + youString + ". You won";
        else
            outputString = "The computer is " + computerString + ". You are " + youString + ". You lost";

        System.out.println(outputString);

    }
}
