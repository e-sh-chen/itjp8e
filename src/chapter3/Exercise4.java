package chapter3;

import java.util.Scanner;

/**
 * Created by chens on 2015/7/9.
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (System.currentTimeMillis() % 100);
        int number2 = (int) (System.currentTimeMillis() * 7 % 100);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
