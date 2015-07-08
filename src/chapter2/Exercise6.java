package chapter2;

import java.util.Scanner;

/**
 * Created by chens on 2015/7/8.
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int sum = number % 10;
        number = number / 10;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        sum = sum + number / 10;

        System.out.println("The sum of the digits is " + sum);

    }
}
