package chapter2;

import java.util.Scanner;

public class RandomTextGenerator {
    public static void main(String arg[]) {
        //a season of the year
        System.out.println("Write a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        // then a whole number
        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();

        // then an adjective.
        System.out.println("Write an adjective");
        String adjective = scanner.next();

        scanner.close();

        // And use the input to complete the sentence below.
        System.out.println("On a " + adjective + " " + season +" day, I drink a minimun of "+ number+ " cups of coffee.");
        // Output the result.
    }
}
