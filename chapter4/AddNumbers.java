package chapter4;
/* Do While Loop
Let's write a program that allows a user to calculate the sum of two numbers as many times as they like to.

For this, we'll use the Do While Loop.*/

import java.util.Scanner;

public class AddNumbers {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter the firts number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double secondNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber;

            System.out.println("The result is: " + sum);

            System.out.println("Would you like to do another sum?");
            again = scanner.nextBoolean();

        } while (again);

        scanner.close();
    }

}
