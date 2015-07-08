package chapter2;

import java.util.Scanner;

/**
 * Created by chens on 2015/7/8.
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        System.out.print("The gratuity is " + subtotal * rate * 0.01 + " and total is " + (subtotal + subtotal * rate * 0.01));

    }
}
