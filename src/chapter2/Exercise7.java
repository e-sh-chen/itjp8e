package chapter2;

import java.util.Scanner;

/**
 * Created by chens on 2015/7/8.
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int days = minutes / 60 / 24;

        System.out.println(minutes + " minutes is approximately " + days / 365 + " years and " + days % 365 + " days.");
    }
}
