package chapter2;

import javax.swing.*;

/**
 * Created by chens on 2015/7/8.
 */
public class Exercise10 {
    public static void main(String[] args) {
        String amountString = JOptionPane.showInputDialog("Enter an amount in integer, for example 1156:");

        int amount = Integer.parseInt(amountString);

        int numberOfOneDollars = amount / 100;
        amount = amount % 100;

        int numberOfQuarters = amount / 25;
        amount = amount % 25;

        int numberOfDimes = amount / 10;
        amount = amount % 10;

        int numberOfNickels = amount / 5;
        int numberOfPennies = amount % 5;

        JOptionPane.showMessageDialog(null, "Your amount " + amountString + " consists of \n" +
                "\t" + numberOfOneDollars + " dollars\n" +
                "\t" + numberOfQuarters + " quarters\n" +
                "\t" + numberOfDimes + " dimes\n" +
                "\t" + numberOfNickels + " nickels\n" +
                "\t" + numberOfPennies + " pennies");

    }
}
