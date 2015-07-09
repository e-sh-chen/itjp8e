package chapter2;

import javax.swing.*;

/**
 * Created by chens on 2015/7/9.
 */
public class Exercise12 {
    public static void main(String[] args) {
        String balanceString = JOptionPane.showInputDialog("Enter balance:");
        String rateString = JOptionPane.showInputDialog("Enter interest rate (e.g., 3 for 3%):");

        JOptionPane.showMessageDialog(null, "The interest is " +
                Double.parseDouble(balanceString) * Double.parseDouble(rateString) / 1200);
    }
}
