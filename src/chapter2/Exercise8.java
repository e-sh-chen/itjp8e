package chapter2;

import java.util.Scanner;

/**
 * Created by chens on 2015/7/8.
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        short code = input.nextShort();

        System.out.println("The character for ASCII code " + code + " is " + (char) code);
    }
}
