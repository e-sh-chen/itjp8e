package chapter2;

import java.util.Scanner;

/**
 * Created by chens on 2015/7/8.
 */
public class Exercise2 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        System.out.println("The area is " + radius * radius * PI);
        System.out.println("The volume is " + radius * radius * PI * length);
    }
}
