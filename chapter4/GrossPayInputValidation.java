package chapter4;
/* WHILE LOOP
 We'll need to calculate the salary for employees based on how many hours they have worked.
 This one says our program cannot allow for overtime, which means we need to validate the input.
 We know that the rate is $15 an hour
and we'll go ahead and say that the max hours they can work is 40*/

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String arg[]) {
        int payRate = 15;
        int maxHoursWorked = 40;

        System.out.println("Enter the number of hours you have worked this week:");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHoursWorked || hoursWorked < 1) {
            System.out.println("Invalid input. Your hours worked has to be between 1 and 40. Try one more time: ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

    }
}
