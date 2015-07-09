package chapter2;

import javax.swing.*;

/**
 * Created by chens on 2015/7/9.
 */
public class Exercise15 {
    public static void main(String[] args) {
        String subAmountString = JOptionPane.showInputDialog("Enter monthly sub amount:");
        String rateString = JOptionPane.showInputDialog("Enter interest rate:");

        double subAmount=Double.parseDouble(subAmountString);
        double rate = Double.parseDouble(rateString) / 1200;
        double totalAmount = subAmount * (1 + rate);
        totalAmount = (totalAmount + subAmount) * (1 + rate);
        totalAmount = (totalAmount + subAmount) * (1 + rate);
        totalAmount = (totalAmount + subAmount) * (1 + rate);
        totalAmount = (totalAmount + subAmount) * (1 + rate);
        totalAmount = (totalAmount + subAmount) * (1 + rate);

        JOptionPane.showMessageDialog(null, "The total amount after six months is " + totalAmount);

    }
}
