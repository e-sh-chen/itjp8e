package chapter2;

import java.util.Scanner;

/**
 * Created by chens on 2015/7/8.
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        System.out.println(celsius + " Celsius is " + (9.0 / 5 * celsius + 32));
    }
}
