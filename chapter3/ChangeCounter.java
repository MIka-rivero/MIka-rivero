package chapter3;
/*So, you're going to create a program that asks the user to enter the quantities for the following bills
What your program is going to do is count up the value of all of the change that they answered.*
How many pennies? - And they said 0.
How many nickels? - 0
How many dimes? - 0
How many quarters? - 4
Then my program would know that, okay quarters are worth 25 cents. There's 4 of these, let me multiply those and get the value.
Oh! that equals one hundred pesos, so I let them know that they win. So that's an example of the game./
 */

import java.util.Scanner;

public class ChangeCounter {
    public static void main(String arg[]) {
        double bill10 = 10;
        double bill20 = 20;
        double bill50 = 50;
        double winningNumber = 100;

        System.out.println("How many $10 bills?");
        Scanner scanner = new Scanner(System.in);
        double tenBill = scanner.nextDouble();

        System.out.println("How many $20 bills?");
        double twentyBills = scanner.nextDouble();

        System.out.println("How many $50 bills?");
        double fiftyBills = scanner.nextDouble();

        scanner.close();

        double totalQuantity = tenBill * bill10 + bill20 * twentyBills + bill50 * fiftyBills;

        if (totalQuantity > winningNumber) {
            double exceedAmount = totalQuantity - winningNumber;
            System.out.println("Sorry you lose! You exceed the amount of $100 by " + exceedAmount);
        }
        if (totalQuantity < winningNumber) {
            double shortAmount = winningNumber - totalQuantity;
            System.out.println("Sorry, You lose! You were short $" + shortAmount + " pesos.");
        } else {
            if (totalQuantity == winningNumber) {
                System.out.println("Congratulations! you WIN. You have entered exactly $" + winningNumber);
            }
        }
    }
}