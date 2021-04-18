package chapter4;
/*For Loop
Program for a cashier that will scan a given number of items and tally the cost.
I've already asked the user how many items that they'd like to scan*/

import java.util.Scanner;

public class Cashier {
    public static void main(String arg[]) {
        System.out.println("How many items would you like to scan? ");
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();

        double totalQuantity = 0;

        for(int i= 0; i < items; i++){
            System.out.println("Enter the price of the item");
            double price = scanner.nextInt();
            totalQuantity = totalQuantity + price;
        }

        scanner.close();
        System.out.println("The total is: $" + totalQuantity);
    }
}
