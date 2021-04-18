package chapter3;

/* Logical Operators
To qualify for a loan you have to earn at least $30000
and you should have worked for your current job for at least two years*/

import java.util.Scanner;

public class OperatorLoanQualifier {
    public static void main(String arg[]) {
        int requiredSalary = 30000;
        int requiredYearsWorked = 2;

        System.out.println("Enter your salary $:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextInt();

        System.out.println("Enter the number of years you have been working at your current job");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary && years >= requiredYearsWorked) {
            System.out.println("Congratulations, you have met the requirements for the loan");
        }
        else {
            System.out.println("Sorry, you did not meet the requirements for the loan. You have to earn at least $"+
                    requiredSalary + " and you have to worked for " + requiredYearsWorked + " at your current job.");
        }

    }
}
